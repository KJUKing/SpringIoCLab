package kr.or.ddit.lab08.conf;

import kr.or.ddit.lab02.objs.Bar;
import kr.or.ddit.lab02.objs.Baz;
import kr.or.ddit.lab02.objs.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
@ComponentScan(basePackages = "kr.or.ddit.lab02")
public class Lab02JavaConfiguration {
//
//
////    @Bean("bar")
//    public Bar bar() {
//        return new Bar();
//    }
//
////    @Bean
//    public Baz baz() {
//        return new Baz();
//    }
//
////    @Bean
//    public Foo foo(Baz baz, Bar bar) {
//        Foo foo = new Foo(baz);
////        foo.setBar(bar);
//        return foo;
//    }
}
