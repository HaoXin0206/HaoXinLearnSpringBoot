package HaoXinTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;


/**
 * @ClassName: One
 * @Author: 郝鑫
 * @Data: 2019/6/20/5:41
 * @Descripition:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class One {
    private String name;
    private String address;
    private int age;
    private String email;
    private int phone;
}
