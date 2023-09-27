package marklist;
import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1,a2,a3,a4;
		int b1,b2,b3,b4;
		int c1,c2,c3,c4;
		int d1,d2,d3,d4;
		Scanner input=new Scanner(System.in);
		System.out.println("name");
		a1=input.next();
		a2=input.next();
		a3=input.next();
		a4=input.next();
		System.out.println("mark1");
		b1=input.nextInt();
		b2=input.nextInt();
		b3=input.nextInt();
		b4=input.nextInt();
		System.out.println("mark2");
		c1=input.nextInt();
		c2=input.nextInt();
		c3=input.nextInt();
		c4=input.nextInt();
		System.out.println("mark3");
		d1=input.nextInt();
		d2=input.nextInt();
		d3=input.nextInt();
		d4=input.nextInt();
		System.out.println("*******************************************************");
		System.out.println("                      STUDENT MARKLIST");
		System.out.println("*******************************************************");
		System.out.println("ROLL    NAME   MARK1 MARK2 MARK3 TOTAL RESULT Average GRADE");
		int x1=b1+c1+d1;
		double y1=x1/3;
		System.out.print("101");
		System.out.print("\t"+a1);
		System.out.print("\t "+b1);
		System.out.print("    "+c1);
		System.out.print("    "+d1);
		System.out.print("\t   "+x1);
		System.out.print("\t  P");
		System.out.print("    "+y1);
		if(y1>=80) {			
			System.out.println("\tA");
		}
		else if(y1>=75) {
			System.out.println("\tB+");
		}
		else if(y1>=65) {
			System.out.println("\tB");
		}
		else if(y1>=55) {
			System.out.println("\tC+");
		}
		else if(y1>=50) {
			System.out.println("\tC");
		}
		else if(y1>40) {
			System.out.println("\tD");
		}
		else {
			System.out.println("\tF");
		}
		int x2=b2+c2+d2;
		double y2=x2/3;
		System.out.print("102");
		System.out.print("\t"+a2);
		System.out.print("\t "+b2);
		System.out.print("    "+c2);
		System.out.print("    "+d2);
		System.out.print("\t   "+x2);
		System.out.print("\t  P");
		System.out.print("    "+y2);
		if(y2>=80) {			
			System.out.println("\tA");
		}
		else if(y2>=75) {
			System.out.println("\tB+");
		}
		else if(y2>=65) {
			System.out.println("\tB");
		}
		else if(y2>=55) {
			System.out.println("\tC+");
		}
		else if(y2>=50) {
			System.out.println("\tC");
		}
		else if(y2>40) {
			System.out.println("\tD");
		}
		else {
			System.out.println("\tF");
		}
		int x3=b3+c3+d3;
		double y3=x3/3;
		System.out.print("103");
		System.out.print("\t"+a3);
		System.out.print("\t "+b3);
		System.out.print("    "+c3);
		System.out.print("    "+d3);
		System.out.print("\t   "+x3);
		System.out.print("\t  P");
		System.out.print("    "+y3);
		if(y3>=80) {			
			System.out.println("\tA");
		}
		else if(y3>=75) {
			System.out.println("\tB+");
		}
		else if(y3>=65) {
			System.out.println("\tB");
		}
		else if(y3>=55) {
			System.out.println("\tC+");
		}
		else if(y3>=50) {
			System.out.println("\tC");
		}
		else if(y3>40) {
			System.out.println("\tD");
		}
		else {
			System.out.println("\tF");
		}
		int x4=b4+c4+d4;
		double y4=x4/3;
		System.out.print("104");
		System.out.print("\t"+a4);
		System.out.print("\t "+b4);
		System.out.print("    "+c4);
		System.out.print("    "+d4);
		System.out.print("\t   "+x4);
		System.out.print("\t  P");
		System.out.print("    "+y4);
		if(y4>=80) {			
			System.out.println("\tA");
		}
		else if(y4>=75) {
			System.out.println("\tB+");
		}
		else if(y4>=65) {
			System.out.println("\tB");
		}
		else if(y4>=55) {
			System.out.println("\tC+");
		}
		else if(y4>=50) {
			System.out.println("\tC");
		}
		else if(y4>40) {
			System.out.println("\tD");
		}
		else {
			System.out.println("\tF");
		}		
		
		
		
		
		

	}

}
