package com.zy.swagger3.swagger3.controller;

import com.zy.swagger3.swagger3.dto.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Api(tags = "Swagger3Api")
@RestController
@RequestMapping("/api/student")
public class Swagger3ApiTestController {

    @GetMapping("/getAllSutudent")
    @ApiOperation(value = "获取所有学生信息")
    public ResponseEntity<List<Student>> getAllSutudent(HttpServletRequest request) {

        List<Student> retList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge(10 + i);
            student.setHigh(150 + i * 3);
            student.setName("xiao li -" + i);
            student.setProvience("湖北");
            retList.add(student);
        }
        return  ResponseEntity.ok(retList);

    }

    @GetMapping("/getAllSutudentById")
    @ApiOperation(value = "获取所有学生信息")
    public ResponseEntity<Student> getAllSutudent(String id) {
        Student student = new Student();
        student.setAge(10 );
        student.setHigh(150 );
        student.setName("xiao li " );
        student.setProvience("湖北");
        return  ResponseEntity.ok(student);
    }
}
