package haoxinlearnspringboot.haoxin.Web;

import haoxinlearnspringboot.haoxin.Entiy.Student;
import haoxinlearnspringboot.haoxin.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: StudentCollect
 * @Author: 郝鑫
 * @Data: 2019/6/18/18:23
 * @Descripition:
 */
@Controller
public class StudentCollect {

    @Autowired
    private StudentMapper studentMapper;

    @Value("${haoxin.data}")
    String data;

    @ResponseBody
    @RequestMapping("/getStudent/{name}")
    public Student FindStudentByName(@PathVariable("name") String name){
        Student studentByName = studentMapper.getStudentByName(name);
        return studentByName;
    }

    @ResponseBody
    @RequestMapping("/getStudents/{name}")
    public List<Student> FindStudent(@PathVariable("name") String name){
        List<String> collect = Arrays.stream(name.split(",")).collect(Collectors.toList());
        return studentMapper.getStudent(collect);
    }

    @ResponseBody
    @RequestMapping("")
    public String Welcome(){
        return data;
    }
}
