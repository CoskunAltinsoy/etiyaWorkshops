package kosgebWorkshop.entities;

public class Feature {

	private int id;
	private String featureName;
	
	
	public Feature() {
		super();
	}
	
	
	public Feature(int id, String featureName) {
		super();
		this.id = id;
		this.featureName = featureName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	
	
}
