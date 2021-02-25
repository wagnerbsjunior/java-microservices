package academy.devdojo.learning.endpoint.service;

import academy.devdojo.learning.core.model.Course;
import academy.devdojo.learning.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    /*@Autowired
    public CourseService( CourseRepository courseRepository ){
        this.courseRepository = courseRepository;
    }*/

    public Iterable<Course> list(Pageable pageable) {
        log.info("Listando todos os cursos");
        return courseRepository.findAll(pageable);

    }


}
