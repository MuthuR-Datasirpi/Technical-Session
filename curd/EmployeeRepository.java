import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.Entity.Student;

@Repository
public interface Studentrepository extends CrudRepository<Student,Long> {
	
}