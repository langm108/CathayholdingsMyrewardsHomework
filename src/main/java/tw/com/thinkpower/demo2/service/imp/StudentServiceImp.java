package tw.com.thinkpower.demo2.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tw.com.thinkpower.demo2.model.Student;
import tw.com.thinkpower.demo2.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	public StudentServiceImp() {
		// TODO Auto-generated constructor stub
	}

	Student mockStuden(){
		return new Student();
	}
	
	@Override
	public Student getStudentByNo(int no) {
		// TODO Auto-generated method stub
		return mockStuden();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return mockStuden();
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return new ArrayList<Student>();
	}

	@Override
	public void delStudent(int no) {
		// TODO Auto-generated method stub
		
	}

}
