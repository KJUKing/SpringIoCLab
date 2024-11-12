package kr.or.ddit.lab03.objs;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Setter
@ToString
public class Hunter {

    private final Shotgun gun;
    private HuntingDog dog;

    public void init() {
      log.info("{}, {}, 정상적으로 주입됨, {} 사냥개시 가능", gun, dog, this.getClass().getSimpleName());
    }
}
