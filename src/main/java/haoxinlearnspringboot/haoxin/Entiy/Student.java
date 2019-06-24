package haoxinlearnspringboot.haoxin.Entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Student
 * @Author: 郝鑫
 * @Data: 2019/6/18/18:17
 * @Descripition:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    private int age;
}
