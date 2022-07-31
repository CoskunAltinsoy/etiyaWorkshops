package educationSales;

import educationSales.business.abstracts.CourseService;
import educationSales.business.concretes.CampaignManager;
import educationSales.business.concretes.ConstantCampaignManager;
import educationSales.business.concretes.CourseManager;
import educationSales.dataAccess.concretes.hibernateImpls.HibernateCourseRepository;
import educationSales.entities.concretes.Course;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Java", 1000);
		Course course2 = new Course(1, "C#", 900);
		Course course3 = new Course(3,"C++", 1100);
		
		CourseService courseService = new CourseManager(new HibernateCourseRepository(), new ConstantCampaignManager());
		courseService.add(course1);
		courseService.add(course2);
		courseService.add(course3);
		
		for (Course course : courseService.getAll()) {
			System.out.println(course.getName()+" "+course.getPrice());
		}
	}

}
