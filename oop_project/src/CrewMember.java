
public class CrewMember implements Crew {
	private String designation;
	public static final int MAX_CREW =10;
	private String name;
	
	CrewMember(String name, String designation){
		this.designation= designation;
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return type;
	}
	public String getDesignation() {
		return this.designation;
	}
	
}
