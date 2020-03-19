package tw.com.thinkpower.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import tw.com.thinkpower.demo2.model.Student;
import tw.com.thinkpower.demo2.service.StudentService;

@RestController
public class SwaggerTest {

	public SwaggerTest() {
		// TODO Auto-generated constructor stub
	}
	

    @Autowired
    private StudentService studentService;

    @ApiOperation("查詢學生")
    @GetMapping(value = "/getStudent/{no}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student getStudent(@PathVariable int no) {
        return studentService.getStudentByNo(no);
    }


    @ApiOperation("新增學生")
    @PostMapping(value = "/addStudent",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @ApiOperation("取得所有學生")
    @GetMapping(value = "/getAllStudent",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @ApiOperation("刪除學生")
    @GetMapping(value = "/delStudent/{no}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public void delStudent(@PathVariable int no){
        studentService.delStudent(no);
    }
}
