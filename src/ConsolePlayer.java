
public class ConsolePlayer extends Player{
	
	@Override
	public Roshambo generateRoshambo(String Input){
		
		if(Input.equalsIgnoreCase("rock")){
			return Roshambo.ROCK;
		} else if(Input.equalsIgnoreCase("paper")){
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
		
		
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
