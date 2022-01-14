package ProgramMain;

//import java.util.Random;
import PlotGen.Character.CharacterBuilder;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import PlotGen.Character.Attributes;
import PlotGen.Conflict.ConflictDesire;

public class Runner {

	public static void main(String[] args) {
		
		// Generate a plot:
		GeneratorPlot plot1 = new GeneratorPlot(3,3,"real",3);
		
		
		// Generate characters
		plot1.generateCharacters();
		// Check access to characters individually. First character is number 0 at the array
		plot1.printCharacters();
		System.out.println("");
//		plot1.charactersArray[1].print();
//		System.out.println("");
		
		// Generate conflicts
		plot1.generateConflicts();
		// Check access to conflicts individually. First conflict is number 0 at the array
		plot1.printConflicts();
//		System.out.println("");
//		plot1.conflictsArray[1].print();
		
		
		plot1.matchConflictsCharacters();
		
	}

}
