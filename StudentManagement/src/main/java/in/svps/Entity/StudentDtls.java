package in.svps.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Entity
@Data
public class StudentDtls {
	@Id
	@SequenceGenerator(name = "std_seq",sequenceName = "student_id_seq",allocationSize = 1)
	@GeneratedValue(generator = "std_seq", strategy = GenerationType.SEQUENCE)
	private Integer studentId;
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String dob;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updateDate;
	
	private Integer standard;
	
	private String address;
	
	
}
