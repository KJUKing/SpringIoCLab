package kr.or.ddit.lab04;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.WritableResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 스프링에서 자원을 핸들링하는 방법
 * 1. Resource : 자원의 객체화시킬때 사용되는 추상 인터페이스
 * 2. ResourceLoader : 자원을 검색할때 사용되는 추상 인터페이스
 *
 */
@Slf4j
public class ResourceDesc {
    public static void main(String[] args) throws IOException {
        ResourceLoader loader = new GenericXmlApplicationContext();
//        1. file system resource D:/00.medias/movies/sample-mp4-file.mp4
        Resource fsr = loader.getResource("file:D:/00.medias/movies/sample-mp4-file.mp4");
        log.info("파일크기 : {}", fsr.contentLength());
//        2. classpath resource : kr/or/ddit/db/DBInfo.properties
        Resource cpr = loader.getResource("classpath:kr/or/ddit/db/DBInfo.properties");
//        3. web resource https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png
        log.info("파일크기 : {}", cpr.contentLength());
        Resource wr = loader.getResource("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        log.info("파일크기 : {}", wr.contentLength());

        Resource folderRes = loader.getResource("file:D:/00.medias/");
        Resource imgRes = folderRes.createRelative("googlelogo_color_272x92dp.png");
        if (!imgRes.exists()) {
            WritableResource writableImgRes = new FileSystemResource(imgRes.getFile());
                try(
                        InputStream in = wr.getInputStream();
                        OutputStream out = writableImgRes.getOutputStream()
                ){
                    IOUtils.copy(in, out);
                }
        }
    }
}
