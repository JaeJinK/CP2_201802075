package javaProject;
import java.util.Scanner;
public class Star1 {

	public static void main(String[] args) {
		int number;
		int limit=1;
		Scanner input=new Scanner(System.in);
		
		System.out.print("�� ���� �ٷ� ���� ����ұ��?");
		number=input.nextInt();
		if(number<=0)
			number=5;
		
		System.out.println("---[1��]---");
		for(int i=0;i<number;i++) {
			for(int j=0;j<limit;j++) 
				System.out.print("*");
			System.out.println();
			limit++;
		}	
	}

}
