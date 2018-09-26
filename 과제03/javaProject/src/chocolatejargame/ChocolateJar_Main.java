package chocolatejargame;
import java.util.Scanner;
import java.util.Random;
public class ChocolateJar_Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		ChocolateJar jar=new ChocolateJar();
	    int userTake;
	    int count=1;
	    int maxtake, take;
	    
	    System.out.println("게임을 시작합니다.");
	    System.out.println("항아리에는 14개의 아이템이 있습니다.");
	    System.out.println("[■ □ □ □ □ □ □ □ □ □ □ □ □ □]");
	    System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다. \n시작!");
	    
	    while(true) {
	    	maxtake=Math.min(3, jar.getItem()-1);
			take=random.nextInt(1000)%maxtake%3+1;
	    	System.out.println("+------"+count+++"번째 턴!"+"------+");
	    	System.out.print("몇 개를 뽑을까요?(1~3)");
	    	userTake=input.nextInt();
	    	System.out.println("플레이어는 "+userTake+"개의 초콜릿을 꺼냈습니다.");
	    	jar.takeItem(userTake);
	    	System.out.println(jar.status());
	    	if(jar.isEmpty()==true) {
	    		System.out.println("컴퓨터 승리!");
	    		break;
	    	}
	    	if(jar.getChocolate()==0&&jar.getChilli()==1) {
	    		System.out.println("플레이어 승리!");
	    		break;
	    	}
	    	System.out.println("컴퓨터는 "+take+"개의 초콜릿을 꺼냈습니다.");
	    	jar.takeItem(take);
	    	System.out.println(jar.status());
	    	if(jar.isEmpty()==true) {
	    		System.out.println("플레이어 승리!");
	    		break;
	    	}
	    	if(jar.getChocolate()==0&&jar.getChilli()==1) {
	    		System.out.println("컴퓨터 승리!");
	    		break;
	    	}
	    }
	}
}
