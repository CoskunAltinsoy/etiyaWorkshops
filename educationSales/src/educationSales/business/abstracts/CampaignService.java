package educationSales.business.abstracts;

import java.util.List;

import educationSales.entities.concretes.Course;

public interface CampaignService {

	public void discount(List<Course> courses);
}
