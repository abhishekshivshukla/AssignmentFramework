package office;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Abhishek Shukla", 9532116688L);
		Student s2 = new Student(102, "Ashutosh Pandey", 9415958468L);		
		Student s3 = new Student(103, "Alok Pandey", "alok@gmail.com");
		Student s4 = new Student(104, "Shashank Shukla", "shashank@gmail.com");
		
		System.out.println(s2.getStudent_Id());
		s2.setStudent_Address("Bangalore");
		System.out.println(s2.getStudent_Address());
		s1.setStudent_Address("Raebareli");
		s3.setStudent_Address("Raebareli");
		s4.setStudent_PhoneNumber(9455530580L);
	}
}
