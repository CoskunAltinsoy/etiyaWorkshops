package educationSales.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import educationSales.dataAccess.abstracts.CourseRepository;
import educationSales.entities.concretes.Course;

public class HibernateCourseRepository implements CourseRepository{

	List<Course> courses;
	
	public HibernateCourseRepository() {
		super();
		this.courses = new ArrayList<Course>();
	}

	
	@Override
	public void add(Course course) {
		courses.add(course);
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

	
}
