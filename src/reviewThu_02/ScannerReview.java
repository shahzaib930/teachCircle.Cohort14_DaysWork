package reviewThu_02;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("Enter your num...");
		int num = scan.nextInt();
		if (num >=90 && num<= 100) {
			System.out.println("A");
		}else if  (num >=80 && num< 90) {
			System.out.println("B");
		}else if (num >=70 && num< 80) {
			System.out.println("C");
		}else if(num >=65 && num< 70) {
			System.out.println("D");
		}else {System.out.println("F");}
		
		
		
		scan.close();
		
	}

}
