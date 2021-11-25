package in.svps.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.svps.Entity.StudentDtls;
import in.svps.Repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository repository;
	
	public StudentService(StudentRepository repo) {
		this.repository = repo;
	}
	
	//get the details of student based on id
	public ResponseEntity<StudentDtls> getStudent(Integer id){
		Optional<StudentDtls> findById = repository.findById(id);
		if(findById.isPresent()) {
			StudentDtls student = findById.get();
			return new ResponseEntity<>(student,HttpStatus.OK);
		}
		
		return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
	}
	
	
	// saved new record
	public StudentDtls saveStdentDtls(StudentDtls student) {
		StudentDtls save = repository.save(student);
		return save;
	}
}
