package entities;

public class Service {

	private int id;
	private String serviceName;
	
	public Service() {
		super();
	}

	public Service(int id, String serviceName) {
		super();
		this.id = id;
		this.serviceName = serviceName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
