public class FootballPlayerTest {

	public static void main(String[] args) {
		FootballPlayer messi = new FootballPlayer();
		/*messi.no = 10;
		messi.name = "Alex";
		messi.minute = 0;
		messi.inPlay = true;
		messi.numberofGoals = 0;

		System.out.println("Number of goals messi : " + messi.numberofGoals);
		System.out.println("messi played totally : " + messi.minute + " minutes");
		*/
		
		messi.setNo(10);
		messi.setName("Messi");
		messi.setMinute(60);
		messi.setInPlay(true);
		messi.setNumberofGoals(3);
		
		System.out.println("No : " + messi.getNo());
		System.out.println("Name : " + messi.getName());
		System.out.println("Minute : " + messi.getMinute());
		System.out.println("Number of Goals : " + messi.getNumberofGoals());
		
		System.out.println("*******************");
		
		messi.play(80);
		messi.score(1);
		messi.setNo(15);
		System.out.println("Messi set No : " + messi.getNo());
		
		/*
		
		FootballPlayer Hagi = new FootballPlayer();
		Hagi.no = 10;
		Hagi.name = "Hagi";
		Hagi.minute = 70;
		Hagi.inPlay = true;
		Hagi.numberofGoals = 10;

		System.out.println("Number of goals Hagi : " + Hagi.numberofGoals);
		System.out.println("Hagi played totally : " + Hagi.minute + " minutes");
		
		System.out.println("*******************");
		
		Hagi.play(60);
		Hagi.score(4);
		
		System.out.println("Number of goals Hagi : " + Hagi.numberofGoals);
		System.out.println("Hagi played totally : " + Hagi.minute + " minutes");
		*/
	}
}