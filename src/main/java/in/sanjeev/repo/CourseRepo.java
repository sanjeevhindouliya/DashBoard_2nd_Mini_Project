package in.sanjeev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sanjeev.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
