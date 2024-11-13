package kr.or.ddit.lab05.objs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@Scope("prototype")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Slf4j
public class DBInfoVO {
    @Value("#{dbInfo['dev.driverClassName']}")
    private String driverClassName;
    @Value("#{dbInfo['dev.url']}")
    private String url;
    @Value("${dev.user}")
    private String user;
    @Value("${dev.password}")
    private String password;

    private long maxWait;

    @PostConstruct
    public void init() {
        log.info("주입 완료 상태 : {}", this);
    }
}









