package haoxinlearnspringboot.haoxin.Mapper;

import haoxinlearnspringboot.haoxin.Entiy.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface StudentMapper {

    @Select("select name,age from student where name=#{name}")
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    Student getStudentByName(@Param("name") String name);


    @Select({
            "<script>" ,
                    "select " ,
                    "name,age " ,
                    "from student " ,
                    "where name in " ,
                    "<foreach item='item' index='index' collection='names' open='(' separator=',' close=')'>",
                    "#{item}",
                    "</foreach>",
            "</script>"
    })
    List<Student> getStudent(@Param("names") List<String> names);

}
