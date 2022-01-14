package ProgramMain;

import java.util.Random;

import PlotGen.Character.CharacterBuilder;
import PlotGen.Conflict.ConflictBuilder;

public class GeneratorPlot {
	public int numberCharacters;
	public int numberConflicts;
	public String typeWorld;
	public int numberScenarios;
	
	// Create arrays with all the characters, conflicts and scenarios.
	public CharacterBuilder[] charactersArray;
	public ConflictBuilder[] conflictsArray;
	
	
	public GeneratorPlot(int numberCharacters, int numberConflicts, String typeWorld, int numberScenarios) {
		this.numberCharacters = numberCharacters;
		this.numberConflicts = numberConflicts;
		this.typeWorld = typeWorld;
		this.numberScenarios = numberScenarios;
	}
	
	
	public void generateCharacters() {
		//CharacterBuilder[] charactersArray = new CharacterBuilder[numberCharacters];
		charactersArray = new CharacterBuilder[numberCharacters];
		for (int x = 0; x < numberCharacters; x++) {
			charactersArray[x] = new CharacterBuilder();
			//charactersArray[x].print();
		}
	}
	
	
	public void printCharacters() {
		for (int x = 0; x < numberCharacters; x++) {
			charactersArray[x].print();
			System.out.println("");
		}
	}
	
		
	public void generateConflicts() {
		conflictsArray = new ConflictBuilder[numberConflicts];
		
		for (int x = 0; x < numberConflicts; x++) {
			conflictsArray[x] = new ConflictBuilder("romance");
		}
		
	}
	
	
	public void printConflicts() {
		for (int x = 0; x < numberConflicts; x++) {
			conflictsArray[x].print();
			System.out.println("");
		}
	}
	
	
	public void matchConflictsCharacters() {
		
		// JUNTAR METER NOMBRES O ID DE CHARACTERS EN CONFLICTS
//		System.out.println("Matching conflicts and characters");
//		System.out.println(numberCharacters);
//		System.out.println(numberConflicts);
		
		//String[] typologyArray = {"hero","mentor","ally","herald","trickster","shapeshifter","guardian","shadow"};
		
;
		
		for (int x = 0; x < numberConflicts; x++) {
			//conflictsArray[x].print();
			
			Random randCharacter = new Random();
			int pickNumber = randCharacter.nextInt(numberCharacters);
			
//			charactersArray[pickNumber].print();
//			System.out.println("");
//			charactersArray[pickNumber].id();
//			charactersArray[pickNumber].attribute();
			
			conflictsArray[x].joinWithCharacters(
					charactersArray[pickNumber].id(), charactersArray[pickNumber].attribute(),
					charactersArray[pickNumber].background());
			
			System.out.println("");
			//this.typology = typologyArray[pickNumber]
		}
		
		
	}
	
}

