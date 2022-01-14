package PlotGen.Conflict;

import PlotGen.Conflict.ConflictsLibrary;
import PlotGen.Conflict.ConflictDesire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Dependent of passion, flaw and/or background

// Conflicts: internal, personal, extra-personal
// Subconflictos: el abismo

// Circumstantial, character-related (inherited or )


//Story types:
//	The Romance
//	The Unrecognised virtue
//	The Fatal flaw
//	The Debt that must be repaid
//	The Spider and the fly
//	The Gift taken away
//	The Quest
//	The Rites of Passage
//	The Wanderer
//	The Character Who Cannot Be Put Down

public class ConflictBuilder {
	public String type;
	public String trigger;
	public String goal;
	public String antagonist;
	
	//public String mainConflict;
	//public String[] subConflicts;

	static String[] conflictTypeArray = {
			"romance","unrecognised","flaw","debt","spider","gift","quest","rites","wanderer","noPutDown"};
	
	
	
	
	public ConflictBuilder() {
		randomType();
		randomTrigger();
		
	}
	
	
	
	public ConflictBuilder(String conflictType) {
		this.type = conflictType;
		randomTrigger();
		
	}
	
	
	
	public void print() {
		System.out.println("Conflict type: " + type);
		System.out.println("Conflict trigger: " + trigger);
		System.out.println("Conflict goal: " + goal);
	}
	
	public void joinWithCharacters(String id, String attribute, String background) {
		
		if (type == "romance") {
			romance(id, attribute, background);
		}else if (type == "unrecognised") {
			unrecognised();
		}else if (type == "flaw") {
			flaw();
		}else if (type == "debt") {
			debt();
		}else if (type == "spider") {
			spider();
		}else if (type == "gift") {
			gift();
		}else if (type == "quest") {
			quest();
		}else if (type == "rites") {
			rites();
		}else if (type == "wanderer") {
			wanderer();
		}else if (type == "noPutDown") {
			noPutDown();
		}else {
			System.out.println("No method exists for this conflict type");
		}
	}
	
	public void randomType() {
		// These are the different types of character in a story following Joseph Campbell
		
		Random randConflict = new Random();
		int pickNumber = randConflict.nextInt(conflictTypeArray.length);
		
		this.type = conflictTypeArray[pickNumber];
	}
	
	
	
	public void randomTrigger() {
		ConflictsLibrary allConflicts = new ConflictsLibrary();
		
		Random randTrigger = new Random();
		int pickNumber = randTrigger.nextInt(ConflictsLibrary.allConflicts.size());
		
		this.trigger = ConflictsLibrary.allConflicts.get(pickNumber);
	}
	
	
	
	public void romance(String id, String attribute, String background) { // The romance
		
//		A character is seen to be emotionally lacking
//		or missing something or someone.
//		Something/someone – the object of desire –
//		is seen as a potential solution. The character
//		struggles to overcome barriers between
//		himself and the object of desire and
//		succeeds in overcoming some, if not all, of
//		them. The resolution comes when the
//		character unites with the object of desire
		
		System.out.println("This is Romance method");
		
		ConflictDesire allDesires = new ConflictDesire();
		ConflictState allStates = new ConflictState();
		
		
		// Beginning
		// Character wants/needs person/object
		System.out.println(background  + " " + attribute + " wants/needs " + allDesires.getRandomDesire() + " because " + allStates.getRandomState());
		System.out.println("First conflict: ");
		System.out.println();
	}
	
	
	
	public void unrecognised() { // The Unrecognised Virtue
		
//		The character with a virtue becomes part of
//		someone else’s world and falls in love with a
//		powerful character in this world. The
//		character seeks to prove that she is
//		desirable to the powerful character but the
//		power relationship undermines this. The
//		character attempts to solve a problem for
//		the powerful character and, in doing so, her
//		virtue is finally recognised
		
		System.out.println("This is Unrecognised method");
		
		// Beginning
		System.out.println("Character" + " becomes part of " + "person/object" + " world, by " + "action/conflict");
	}
	
	
	
	public void flaw() { // The Fatal Flaw

//		The character has a quality that brings
//		success and enables him to gain
//		opportunities denied to other characters. He
//		uses opportunities for his own gain at the
//		expense of others, but when he recognises
//		the damage he has done he sets himmself a
//		new challenge. However, the quality which
//		brought him success leads to failure in the
//		new challenge
		
		System.out.println("This is Flaw method");
	}
	
	
	
	public void debt() { // The Debt That Must Be Repaid
		
//		The character wants something or someone
//		and becomes aware that something or
//		someone is available which will possibly give
//		her what she wants – at a price. The
//		character agrees to pay the price later and
//		pursues her original desire. The character
//		attempts to avoid settling the debt but is
//		finally confronted by the debtor and the debt
//		is repaid
		
		System.out.println("This is Debt method");
	}
	
	
	
	public void spider() { // The Spider and the Fly
		
//		The character wants to make another
//		character do his bidding but, having no
//		power to force her, devises a plan to trap her
//		into doing it. The character successfully
//		executes the plan, achieves his initial goal
//		and then faces a new future
		
		System.out.println("This is Spider method");	
	}
	
	
	
	public void gift() { // The Gift Taken Away
		
//		The character has a gift which she loses and
//		seeks to regain. The pursuit of the gift leads
//		her into a new situation to which she becomes
//		reconciled
		
		System.out.println("This is Gift method");
	}
	
	
	
	public void quest() { // The Quest
		
//		The character is set a task to find someone
//		or something. He accepts the challenge,
//		searches for and finds the someone or
//		something. He is then rewarded, or not, for
//		his success in the quest
		
		System.out.println("This is Quest method");
	}
	
	
	
	public void rites() { // The Rites of Passage
		
//		The character recognises that she has
//		reached the next ‘age’ in her life and attempts
//		to learn what she needs to know to adapt to
//		this new age. She tries to act as if she has
//		already acquired the necessary knowledge
//		and fails. She then encounters a challenge
//		which requires her to reach beyond what she
//		has already achieved. Her success reflects
//		her maturation into the new phase of her life
		
		System.out.println("This is Rites method");
	}
	
	
	
	public void wanderer() { // The Wanderer
		
//		The character arrives in a new place and
//		discovers a problem associated with it. In
//		facing the problem she reveals why she left
//		the last place, then attempts to move on
//		again
		
		System.out.println("This is Wanderer method");
	}
	
	
	
	public void noPutDown() { // The Character Who Cannot Be Put Down
		
//		The character demonstrates his prowess in a
//		certain situation but then faces a bigger
//		challenge, which he accepts. He succeeds
//		by triumphing over a range of antagonistic
//		forces
		
		System.out.println("This is NoPutDown method");
	}
	
}
