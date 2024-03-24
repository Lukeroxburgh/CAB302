package footy;


public class FootyScore {

	/* Initially there is no score */
	private int goals = 0;
	private int behinds = 0;
	
	/**
	 * Returns the total number of points, based on the number
	 * of goals and behinds kicked, and the number of points
	 * earned for each.
	 * 
	 * @return the total number of points earned
	 */
	public int getPoints() {
		final int pointsPerGoal = 6;
		final int pointsPerBehind = 1;
		return (goals * pointsPerGoal) + (behinds * pointsPerBehind);
	}
	
	/**
	 * Increments the number of goals kicked.
	 */
	public void kickGoal() {
		goals += 1;
	}
	
	/**
	 * Increments the number of points kicked.
	 */
	public void kickBehind() {
		behinds += 1;
	}
	
	/**
	 * Returns a string representing goals kicked, behinds kicked, and points earned.
	 * 
	 * @return a "speakable" football score
	 */
	public String sayScore() {
		return Integer.toString(goals) + ", " + 
		Integer.toString(behinds) + ", " +
		getPoints();
	}
	
	/**
	 * Returns which team is ahead when compared.
	 * 
	 * @param otherTeam the opposing footy team
	 * @return true iff this team is winning
	 */
	public boolean inFrontOf(FootyScore otherTeam) {
		return (getPoints() > otherTeam.getPoints());
	}
	
}
