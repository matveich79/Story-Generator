package PlotGen.Conflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ConflictDesire {
	public static List<String> desireObject = Arrays.asList(
			"himself/herself","love","power","job","animal","tea cup");
	
	public static List<String> desireOther = Arrays.asList(
			"none");
	
	public static List<String> allDesires = new ArrayList<>();
	
	
	public ConflictDesire () {
		allDesires.addAll(desireObject);
		allDesires.addAll(desireOther);
	}

	public String getRandomDesire () {
		Random randDesire = new Random();
		int pickNumber = randDesire.nextInt(allDesires.size());
		return allDesires.get(pickNumber);
	}
}
