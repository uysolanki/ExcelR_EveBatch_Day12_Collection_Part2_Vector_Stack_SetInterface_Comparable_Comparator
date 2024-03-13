package day10.collection;

import java.util.Scanner;

public class Student {
		private int rno;//"DIRECTLY"
		private String sname;
		private double percentage;
		
		public Student() {}
		public Student(int rno, String sname, double percentage) {
			this.rno = rno;
			this.sname = sname;
			this.percentage = percentage;
		}
		public void acceptStudentDetails()  //YK book
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter rno"); //102
			rno=sc.nextInt();
			System.out.println("Please enter sname"); //Ben
			sname=sc.next();
			System.out.println("Please enter percentage"); //88.5
			percentage=sc.nextDouble();
		}
		public void displayStudentDetails()
		{
			System.out.println("Rno is "+rno);//Rno is 102
			System.out.println("Name is "+sname); //Name is Ben
			System.out.println("Percentage is "+percentage); //Percentage is 88.5	
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}
		
		@Override
		public String toString() {
			return "Student [rno=" + rno + ", sname=" + sname + ", percentage=" + percentage + "]";
		}
				
}
