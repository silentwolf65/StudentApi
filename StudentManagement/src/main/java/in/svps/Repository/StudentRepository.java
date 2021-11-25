package in.svps.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.svps.Entity.StudentDtls;
@Repository
public interface StudentRepository extends JpaRepository<StudentDtls, Serializable>{

}
