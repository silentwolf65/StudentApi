package in.svps.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.svps.Entity.StudentDtls;
import in.svps.Service.StudentService;

@RestController
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping(value = "/getDetails{id}", produces = "application/json")
	public ResponseEntity<StudentDtls> getStudentDetails(@PathVariable Integer id) {
		ResponseEntity<StudentDtls> student = service.getStudent(id);
		return student;
	}
	
	@PostMapping(value="/addStudent", consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<StudentDtls> addStudentDtls(@RequestBody StudentDtls student){
		
		StudentDtls saveStdentDtls = service.saveStdentDtls(student);
		
		return new ResponseEntity<>(saveStdentDtls,HttpStatus.OK);
		
	}
}
