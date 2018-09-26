package chocolatejargame;

public class ChocolateJar implements Jar{
	private int chocolate;
	private int chilli;
	String list;
	
	public ChocolateJar() {
		chocolate=13;
		chilli=1;
	}
	public ChocolateJar(int chocolate) {
		this.chocolate=chocolate;
		chilli=1;
	}
	public int getItem() {
		return chocolate+chilli;
	}
	public int getChocolate() {
		return chocolate;
	}
	public int getChilli() {
		return chilli;
	}
	public void takeItem(int hand) {
		if(hand>chocolate) {
			chocolate=0;
			chilli=0;
		}
		else
			chocolate-=hand;
	}
	public String status() {
		list="бс";
		for(int i=0;i<chocolate;i++)
			list+=" бр";
		return "["+list+"]";
		
	}
	public boolean isEmpty() {
		if(chocolate==0&&chilli==0)
			return true;
		else
			return false;
	}

}
