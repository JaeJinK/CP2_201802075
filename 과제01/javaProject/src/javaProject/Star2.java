package javaProject;
import java.util.Scanner;
public class Star2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int number;
		int limit=0;
		System.out.print("�� ���� �ٷ� ���� ����ұ��?");
		number=input.nextInt();
		if(number<=0)
			number=5;
		int starNum=number;
		System.out.println("---[2��]---");
		
		for(int i=0;i<number;i++) {
			for(int j=starNum;j>limit;j--) 
				System.out.print("*");
			System.out.println();
			starNum--;
		}

	}

}
