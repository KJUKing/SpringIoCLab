package kr.or.ddit.lab03.objs;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Slf4j
@RequiredArgsConstructor
@Setter
@ToString
@Component
public class Hunter {

    private final Shotgun gun;
    @Inject
    private HuntingDog dog;

    @PostConstruct
    public void init() {
      log.info("{}, {}, 정상적으로 주입됨, {} 사냥개시 가능", gun, dog, this.getClass().getSimpleName());
    }
}
