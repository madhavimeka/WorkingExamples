package Interfac;

	interface EmpDetails{
	 void CommonEmpDetails(String n);
	 void ConfEmpDetails(int s, String p);
	}
public class OExamplFace implements EmpDetails{
	int salary;
	String rating;
	String name;
	@Override
	public void CommonEmpDetails(String n) {
		this.name = n;
		System.out.println("Name of the Employee:"+n);
			
	}
	public void ConfEmpDetails(int s, String p) {
		this.salary=s;
		this.rating=p;
		System.out.println("salary :"+s);
		System.out.println("Rating :"+p);
	}

public static void main(String[] args) {
	OExamplFace obj = new OExamplFace();
	obj.CommonEmpDetails("sonu");
	obj.ConfEmpDetails(100000, "good");

}}