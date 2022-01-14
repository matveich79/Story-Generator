package PlotGen.Character;

//import PlotGen.Character.Attributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backgrounds {
	
	public static List<String> typeBack = Arrays.asList(
			"past hero","past mentor","past ally","past herald","past trickster","past shapeshifter","past guardian","past shadow");

	public static List<String> professionBack = Arrays.asList(
			"driver","scientific","geologist","barman","monarch","engineer","teacher");
	
	public static List<String> fisicalBack = Arrays.asList(
			"blind","deaf","lame","one-handed","other gender");
	
	public static List<String> personalBack = Arrays.asList(
			"divorced","orphan","heart-broken");
	
	public static List<String> otherBack = Arrays.asList(
			"none","hamartia");
	
	// Here is the
	public static List<String> allBackgrounds = new ArrayList<>();
	
	
	
	public Backgrounds() { // This joins all backgrounds into one list
		
		allBackgrounds.addAll(professionBack); // Inherits professions from Attributes as backgrounds
		allBackgrounds.addAll(typeBack);
		allBackgrounds.addAll(fisicalBack);
		allBackgrounds.addAll(personalBack);
		allBackgrounds.addAll(otherBack);
		

	}
}
