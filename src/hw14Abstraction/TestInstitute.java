package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n---------------------Regular class ColumbiaUniversity----------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.morgue();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		University.library();
		columbiaUniversity.lawInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.hygiene();
		columbiaUniversity.caring();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistry();

		System.out.println("\n-----------------Interface University-----------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		College.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		Hospital.pharmacy();

		System.out.println("\n--------------abstract MedicalSchool---------------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistry();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();

	}

}
