package PlotGen.Conflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ConflictState {
	public static List<String> stateVerb = Arrays.asList(
			"is loosing","is forgetting","is falling","wants","needs","is hidding","is studing", "is working as",
			"is investigating","has");
	
	public static List<String> stateObject = Arrays.asList("photo","treasure","secret");
	
	public static List<String> stateNuclear = Arrays.asList("is orphan","is a monster","is selfish","is a spy",
			"is sick", "is dead");

	
	public static List<String> allStates = new ArrayList<>();
	
	
	public ConflictState() {
		allStates.addAll(stateNuclear);
	}
	
	
	
	public void joinVerbObject() {
		
	
	}
	
	public String getRandomState() {
		Random randOne = new Random();
		int pickOne = randOne.nextInt(2);
		if (pickOne == 0) {
			Random randTwo = new Random();
			int pickNumber = randTwo.nextInt(allStates.size());
			return allStates.get(pickNumber);
		} else {
			String result;
			
			Random randVerb = new Random();
			int pickVerb = randVerb.nextInt(stateVerb.size());
			
			Random randObject = new Random();
			int pickObject = randObject.nextInt(stateObject.size());
			result = stateVerb.get(pickVerb) + " " + stateObject.get(pickObject);
			return result;
		}
		//return allDesires.get(pickNumber);
	}
	
}
 