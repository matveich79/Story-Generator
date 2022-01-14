package PlotGen.Conflict;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConflictsLibrary {

	public static List<String> professionalCon = Arrays.asList(
			"lose the job","do a job","get a job");
	
	public static List<String> fisicalFlawCon = Arrays.asList(
			"become blind","become deaf","become lame","become one-handed");
	
	public static List<String> personalCon = Arrays.asList(
			"divorce","break up","related passed on","abuse");
	
	public static List<String> otherCon = Arrays.asList(
			"none");
	
	// Here is the
	public static List<String> allConflicts = new ArrayList<>();
	
	
	public ConflictsLibrary() { // This joins all attributes into one list (allAttributes)
		allConflicts.addAll(professionalCon);
		allConflicts.addAll(fisicalFlawCon);
		allConflicts.addAll(personalCon);
		allConflicts.addAll(otherCon);
	
	}
	
}
