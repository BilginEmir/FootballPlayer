
public class FootballPlayer 
{
	private int no;
	private String name;
	private int minute;
	private boolean inPlay;
	private int numberofGoals;

	public FootballPlayer() {

	}

	public FootballPlayer(int no, String name, int minute, boolean inPlay, int numberofGoals) {
		// super();
		this.no = no;
		this.name = name;
		this.minute = minute;
		this.inPlay = inPlay;
		this.numberofGoals = numberofGoals;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public boolean isInPlay() {
		return inPlay;
	}

	public void setInPlay(boolean inPlay) {
		this.inPlay = inPlay;
	}

	public int getNumberofGoals() {
		return numberofGoals;
	}

	public void setNumberofGoals(int numberofGoals) {
		this.numberofGoals = numberofGoals;
	}

	public void play(int minutesToPlay) {
		minute = minute + minutesToPlay;
	}

	public void score(int goals) {
		numberofGoals += goals;
	}

	@Override
	public String toString() {
		return "FootballPlayer [no=" + no + ", name=" + name + ", minute=" + minute + ", inPlay=" + inPlay
				+ ", numberofGoals=" + numberofGoals + "]";
	}
}