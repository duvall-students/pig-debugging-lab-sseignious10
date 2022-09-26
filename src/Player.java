
public abstract class Player {

	protected String myName;
	// Buggy Code: protected int myScore;
	/* Cause of Error: Variable myScore is declared, but not assigned a value. So, when the game initially runs, 
		the hasWon() function compares an int to a null value, causing a nullPointerException. */
	protected int myScore = 0;
	private final int WIN_SCORE = 100;
	
	public Player(String myName){
		myScore = 0;
	}
	
	// Each player must provide logic for deciding to roll again
	public abstract boolean rollAgain(int totalSoFar);
	
	public String toString(){
		return myName+": "+myScore;
	}
	
	public boolean hasWon(){
		return myScore >= WIN_SCORE;
	}
	
	public void resetScore(){
		myScore = 0;
	}
	
	public void addToScore(int thisRound){
		myScore += thisRound;
	}
	
	public String getName(){
		return myName;
	}
}
