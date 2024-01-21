package hw14Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public void dorm();

	public static void studyRoom() {

		System.out.println(" This is studyRoom from College Interface");
	}

}
