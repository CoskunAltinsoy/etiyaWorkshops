package kosgebWorkshop.entities;

import java.util.ArrayList;
import java.util.List;

public class ApplicationPriority {

	private int id;
	private String applicationPriorityName;
	private final List<Application> applications = new ArrayList<>();
	
	public ApplicationPriority() {
		super();
	}

	public ApplicationPriority(int id, String applicationPriorityName) {
		super();
		this.id = id;
		this.applicationPriorityName = applicationPriorityName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicationPriorityName() {
		return applicationPriorityName;
	}

	public void setApplicationPriorityName(String applicationPriorityName) {
		this.applicationPriorityName = applicationPriorityName;
	}
	
}
