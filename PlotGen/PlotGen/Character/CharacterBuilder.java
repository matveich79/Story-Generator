package PlotGen.Character;

import PlotGen.Character.Attributes;

import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Type or types (Joseph Campbell)
//Background
//Passion
//Flaw (dependent of one of the above)



public class CharacterBuilder {
	public String name;
	public String id;
	public String typology;
	public String passion;
	public String attribute;
	public String background;
	public String flaw;
	
	
	public CharacterBuilder() {
		randomID();
		randomTypology();
		randomAttribute();
		randomBackground();
		randomPassion();
	}
	
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Type: " + typology);
		System.out.println("Passion: " + passion);
		System.out.println("Attribute: " + attribute);
		System.out.println("Background: " + background);
		System.out.println("Flaw: " + flaw);
	}
	
	public void randomID() {
		// These are the different types of character in a story following Joseph Campbell
		String[] IDlogyArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		Random randID = new Random();
		int pickNumber = randID.nextInt(IDlogyArray.length);
		
		this.id = IDlogyArray[pickNumber];
	}
	
	public void randomTypology() {
		// These are the different types of character in a story following Joseph Campbell
		String[] typologyArray = {"hero","mentor","ally","herald","trickster","shapeshifter","guardian","shadow"};
		
		Random randTypology = new Random();
		int pickNumber = randTypology.nextInt(typologyArray.length);
		
		this.typology = typologyArray[pickNumber];
	}

	public void randomPassion() {
		String[] passionArray = {"love","hate","faith","disbelief","chastity","lust","temperance","gluttony",
				"charity","greed/envy","diligence","sloth","patience","wrath","humility","pride","revenge","forgiveness"};
		
		Random randPassion = new Random();
		int pickNumber = randPassion.nextInt(passionArray.length);
		
		this.passion = passionArray[pickNumber];
	}
	
	public void randomAttribute() {
		// Refer to Attributes
		Attributes att = new Attributes(); 
		
		Random randAttributes = new Random();
		int pickNumber = randAttributes.nextInt(Attributes.allAttributes.size());
		
		this.attribute = Attributes.allAttributes.get(pickNumber);
	}

	public void randomBackground() {
		// Refer to Backgrounds 
		Backgrounds back = new Backgrounds(); 
		
		Random randBackgrounds = new Random();
		int pickNumber = randBackgrounds.nextInt(back.allBackgrounds.size());
		
		this.background = Backgrounds.allBackgrounds.get(pickNumber);
	}
	
	
	
	public String id() {
		//System.out.println(id);
		return id;
	}
	
	public String attribute() {
		//System.out.println(attribute);
		return attribute;
	}

	public String background() {
		//System.out.println(attribute);
		return background;
	}

}
