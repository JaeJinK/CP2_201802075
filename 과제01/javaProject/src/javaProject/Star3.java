package javaProject;
import java.util.Scanner;
public class Star3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		int space;
		int limit=1;
		int k;
		System.out.print("몇 개의 줄로 별을 출력할까요?");
		number=input.nextInt();
		while(number%2==1||number<=0) {
		if(number<=0)
			number=9;
		space=number/2;
		System.out.println("---[3번]---");
		for(int i=0;i<number/2+1;i++) {
			for(int j=0;j<space;j++)
				System.out.print(" ");
			space--;
			for(k=0;k<limit;k++)
				System.out.print("*");
			k+=2;
			limit+=2;
			System.out.println();
			}
		limit=0;
		space=1;
		for(int i=0;i<number/2;i++) {
			for(int j=0;j<space;j++)
				System.out.print(" ");
			space++;
			for(k=number-2;k>limit;k--)
				System.out.print("*");
			limit+=2;
			System.out.println();
		}
			break;
	}
		if(number%2==0)
			System.out.println("홀수만 입력해 주십시오");
	}
}
