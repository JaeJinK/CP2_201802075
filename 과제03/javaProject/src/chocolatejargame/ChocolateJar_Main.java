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
	    
	    System.out.println("������ �����մϴ�.");
	    System.out.println("�׾Ƹ����� 14���� �������� �ֽ��ϴ�.");
	    System.out.println("[�� �� �� �� �� �� �� �� �� �� �� �� �� ��]");
	    System.out.println("1~3���� �������� ���� �� ������ ĥ���� ������ �й��մϴ�. \n����!");
	    
	    while(true) {
	    	maxtake=Math.min(3, jar.getItem()-1);
			take=random.nextInt(1000)%maxtake%3+1;
	    	System.out.println("+------"+count+++"��° ��!"+"------+");
	    	System.out.print("�� ���� �������?(1~3)");
	    	userTake=input.nextInt();
	    	System.out.println("�÷��̾�� "+userTake+"���� ���ݸ��� ���½��ϴ�.");
	    	jar.takeItem(userTake);
	    	System.out.println(jar.status());
	    	if(jar.isEmpty()==true) {
	    		System.out.println("��ǻ�� �¸�!");
	    		break;
	    	}
	    	if(jar.getChocolate()==0&&jar.getChilli()==1) {
	    		System.out.println("�÷��̾� �¸�!");
	    		break;
	    	}
	    	System.out.println("��ǻ�ʹ� "+take+"���� ���ݸ��� ���½��ϴ�.");
	    	jar.takeItem(take);
	    	System.out.println(jar.status());
	    	if(jar.isEmpty()==true) {
	    		System.out.println("�÷��̾� �¸�!");
	    		break;
	    	}
	    	if(jar.getChocolate()==0&&jar.getChilli()==1) {
	    		System.out.println("��ǻ�� �¸�!");
	    		break;
	    	}
	    }
	}
}
