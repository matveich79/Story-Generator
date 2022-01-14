package PlotGen.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This is to store all the attributes together and make the conflict relate with the tape of attribute

public class Attributes {

	public static List<String> professionAtt = Arrays.asList(
			"driver","scientific","geologist","barman","monarch","engineer","teacher");
	
	public static List<String> fisicalFlawAtt = Arrays.asList(
			"blind","deaf","lame","one-handed");
	
	public static List<String> personalityAtt = Arrays.asList(
			"chatty","quiet","stupid","smart");
	
	public static List<String> otherAtt = Arrays.asList(
			"none","ilegal");
	
	// Here is the
	public static List<String> allAttributes = new ArrayList<>();
	
	
	public Attributes() { // This joins all attributes into one list (allAttributes)
		allAttributes.addAll(professionAtt);
		allAttributes.addAll(fisicalFlawAtt);
		allAttributes.addAll(personalityAtt);
		allAttributes.addAll(otherAtt);
		

	}
	
	
}
