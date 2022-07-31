package educationSales.business.concretes;

import java.util.List;

import educationSales.business.abstracts.CampaignService;
import educationSales.business.abstracts.CourseService;
import educationSales.dataAccess.abstracts.CourseRepository;
import educationSales.entities.concretes.Course;

public class CourseManager implements CourseService{

	CourseRepository courseRepository;
	CampaignService  campaignService;
	public CourseManager(CourseRepository courseRepository, CampaignService campaignService) {
		super();
		this.courseRepository = courseRepository;
		this.campaignService = campaignService;
	}
	
	@Override
	public void add(Course course) {
		this.courseRepository.add(course);
		
	}

	@Override
	public List<Course> getAll() {
		campaignService.discount(courseRepository.getAll());
		return this.courseRepository.getAll();
	}

}
