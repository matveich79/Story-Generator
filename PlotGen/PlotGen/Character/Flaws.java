package PlotGen.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaws {

	public static List<String> emotionalFlaw = Arrays.asList(
			"timid","coward");
	
	public static List<String> fisicalFlaw = Arrays.asList(
			"blind","deaf","lame","one-handed","too small","too big");
	
	public static List<String> personalityAtt = Arrays.asList(
			"chatty","stupid","smart");
	
	public static List<String> otherFlaw = Arrays.asList(
			"none","hamartia");
	
	// Here is the
	public static List<String> allFlaws = new ArrayList<>();
	
	
	public Flaws() { // This joins all attributes into one list (allAttributes)
		allFlaws.addAll(emotionalFlaw);
		allFlaws.addAll(fisicalFlaw);
		allFlaws.addAll(personalityAtt);
		allFlaws.addAll(otherFlaw);
		

	}	
	
}
