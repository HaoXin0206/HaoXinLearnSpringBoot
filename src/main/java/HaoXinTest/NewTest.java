package HaoXinTest;

import org.junit.Test;
import scala.Tuple2;

import javax.annotation.security.RunAs;
import java.util.Arrays;

/**
 * @ClassName: NewTest
 * @Author: 郝鑫
 * @Data: 2019/6/24/22:05
 * @Descripition:
 */
public class NewTest {

    @Test
    public void tt(){
        int num=0;
        Arrays.stream("hjdkhfksdfs".split(""))
                .forEach(a->{
                    a.split("");
                })
                ;
    }

}
