package office;

public class Student {
	private int Student_Id;
	private String Student_name;
	private long Student_PhoneNumber;
	private String Student_MailId;
	private String Student_Address;
	private String degree;
	private int YOP;
	
	public Student(int student_Id, String student_name, long student_PhoneNumber) 
	{
		this.Student_Id=student_Id;
		this.Student_name=student_name;
		this.Student_PhoneNumber=student_PhoneNumber;
	}
	public Student(int student_Id, String student_name, String student_MailId) 
	
	{
		this.Student_Id=student_Id;
		this.Student_name=student_name;
		this.Student_MailId=student_MailId;
	}
	public int getStudent_Id() {
		return Student_Id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public long getStudent_PhoneNumber() {
		return Student_PhoneNumber;
	}
	public void setStudent_PhoneNumber(long student_PhoneNumber) {
		Student_PhoneNumber = student_PhoneNumber;
	}
	public String getStudent_MailId() {
		return Student_MailId;
	}
	public void setStudent_MailId(String student_MailId) {
		Student_MailId = student_MailId;
	}
	public String getStudent_Address() {
		return Student_Address;
	}
	public void setStudent_Address(String student_Address) {
		Student_Address = student_Address;
	}
	public String getDegree() {
		return degree;
	}
	
	public int getYOP() {
		return YOP;
	}
}
