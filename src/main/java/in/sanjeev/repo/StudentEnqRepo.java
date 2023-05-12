package in.sanjeev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sanjeev.entity.StudentEnqEntity;

public interface StudentEnqRepo extends JpaRepository<StudentEnqEntity, Integer> {

}
