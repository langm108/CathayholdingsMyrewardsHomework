package tw.com.thinkpower.demo2.service;

import java.util.List;

import tw.com.thinkpower.demo2.model.Student;

public interface StudentService {

	Student getStudentByNo(int no);

	Student addStudent(Student student);

	List<Student> getAllStudent();

	void delStudent(int no);

}
