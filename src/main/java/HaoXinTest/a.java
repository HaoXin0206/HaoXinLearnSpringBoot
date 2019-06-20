package HaoXinTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * @ClassName: a
 * @Author: 郝鑫
 * @Data: 2019/6/20/5:20
 * @Descripition:
 */
@Configuration
@MapperScan
public class a {

    public void ss(){

    }

    @Bean(name = "test01")
    @Primary
    public String a1(){
        System.out.println("jjdflsdads");
        return "测试01";
    }

    @Bean(name="test02")
    @Primary
    public void a2(@Qualifier("test01") String name){
        System.out.println(name);
    }


}
