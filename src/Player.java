
public abstract class Player {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Player() {
		
	}

	public Player(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	public abstract Roshambo generateRoshambo();
	
	public Roshambo generateRoshambo(String Input){
		return null;
		
	}
}
