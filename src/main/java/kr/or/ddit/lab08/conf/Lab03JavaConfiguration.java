package kr.or.ddit.lab08.conf;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import kr.or.ddit.lab03.objs.Shotgun;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <!--    1. 세명의 헌터 생성-->
 *
 *     <bean class="kr.or.ddit.lab03.objs.Shotgun" id="shotgun" scope="prototype"/>
 *     <bean class="kr.or.ddit.lab03.objs.Hunter" id="hunter" scope="prototype">
 *         <constructor-arg ref="shotgun"/>
 *         <property name="dog" ref="huntingDog"/>
 *     </bean>
 * <!--    2. 세명의 헌터를 가진 List생성-->
 *     <util:list id="hunterList">
 *         <ref bean="hunter"/>
 *         <ref bean="hunter"/>
 *         <ref bean="hunter"/>
 *     </util:list>
 * <!--    3. 모든헌터가 공유할 수 있는 한마리의 사냥개 생성-->
 *     <bean class="kr.or.ddit.lab03.objs.HuntingDog" id="huntingDog"/>
 * <!--    4. 모든 헌터의 총을 보관할 수 있는 총기 보관함 생성-->
 *     <bean class="java.util.HashSet"/>
 * <!--    5. 해당 보관함에는 중복되지 않는 두자루의 총이 보관되어있음-->
 *     <util:set id="gunSet">
 *         <ref bean="shotgun"/>
 *         <ref bean="shotgun"/>
 *     </util:set>
 *
 * <!--    6. Playground_mission 엔트리 포인트에서 등록된 모든 객체를 주입받고, 상태를 확인 할 것-->
 *
 * <!--    단 hunter에서는 필요한 객체를 주입받은 직후에 내부의 콜백으로 콘솔에 주입여부 출력-->
 */

@Configuration
@ComponentScan(basePackages = "kr.or.ddit.lab03")
public class Lab03JavaConfiguration {


//    @Bean
//    @Scope("prototype")
//    public Shotgun shotgun() {
//        return new Shotgun();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Hunter hunter(HuntingDog huntingDog, Shotgun shotgun) {
//        Hunter hunter = new Hunter(shotgun);
//        hunter.setDog(huntingDog);
//        return hunter;
//    }

    @Bean
    public List<Hunter> hunterList(Hunter hunter1, Hunter hunter2, Hunter hunter3) {
        List<Hunter> hunters = new ArrayList<>();
        hunters.add(hunter1);
        hunters.add(hunter2);
        hunters.add(hunter3);
        return hunters;
    }

//    @Bean
//    public HuntingDog huntingDog() {
//        return new HuntingDog();
//    }

    @Bean
    public Set<Shotgun> gunSet(Shotgun gun1, Shotgun gun2) {
        Set<Shotgun> gunSet = new HashSet<>();
        gunSet.add(gun1);
        gunSet.add(gun2);

        return gunSet;
    }
}
