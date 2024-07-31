package nexxvali.jenkinsDemo;

import java.util.Scanner;

public class SCloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print("Marks for subject"+i+" :");
			int sub=sc.nextInt();
			sum=sum+sub;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/5);
	}

}
