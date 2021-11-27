package threeHomework;

public class Main {

	public static void main(String[] args) {
		instructorUser engin= new instructorUser();
		engin.id=001;
		engin.firstName="Engin";
		engin.lastName="Demirog";
		engin.companyName="io kodlama";
		engin.wage="9999$";
		
		
				
				
		instructorUser X = new instructorUser();
		X.firstName = "Engin";
		
		studentUser Akif = new studentUser();
		Akif.firstName="Akif";
		
		guestStudent guest= new guestStudent();
		guest.firstName="GuestName";
		
		UserManager user= new UserManager();
		
		User[] users = {Akif, engin, guest};
		
		user.addMultiple(users);
		
		
		
	}

}
