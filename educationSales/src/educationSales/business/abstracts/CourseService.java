package educationSales.business.abstracts;

import java.util.List;

import educationSales.entities.concretes.Course;

public interface CourseService {

	void add(Course course);
	List<Course> getAll();
}
