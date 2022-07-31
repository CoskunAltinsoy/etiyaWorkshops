package educationSales.dataAccess.abstracts;

import java.util.List;

import educationSales.entities.concretes.Course;

public interface CourseRepository {

	void add(Course course);
	List<Course> getAll();
}
