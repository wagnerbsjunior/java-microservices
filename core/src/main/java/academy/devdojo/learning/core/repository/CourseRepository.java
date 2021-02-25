package academy.devdojo.learning.core.repository;

import academy.devdojo.learning.core.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
    //foi necessário esse import para usar findAll em CourseService
    Page<Course> findAll(Pageable pageable);
}
