package educationSales.business.concretes;

import java.util.List;

import educationSales.business.abstracts.CampaignService;
import educationSales.entities.concretes.Course;

public class ConstantCampaignManager implements CampaignService{

	@Override
	public void discount(List<Course> courses) {
		for (Course course : courses) {
			course.setPrice(200);
		}
		
	}

}
