import java.util.Scanner;
class Student { 
	public Student(String name, String rollno, Double marks1, Double marks2, Double marks3) {
		String n = name;
		String r = rollno;
		Double sub1 = marks1;
		Double sub2 = marks2;
		Double sub3 = marks3;
		System.out.println("average is= "+((sub1+sub2+sub3)/3));
	}
}
public class studentdetials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		String numb = sc.nextLine();
		Double m1 = sc.nextDouble();
		Double m2 = sc.nextDouble();
		Double m3 = sc.nextDouble();
		Student stud = new Student(name, numb, m1, m2, m3);
		// Student stud = new Student("Sangay", "IT201985001", 7.5, 7.0, 8.0);
	}
}