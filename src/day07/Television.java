package day07;

public class Television {
private int channel;
private int volume;
private boolean onoff;

public Television(){}

public Television(int channel, int volume, boolean onoff){
	this.channel = channel;
	this.volume = volume;
	this.onoff = onoff;
}

public void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume +"�Դϴ�.");
	}
	public static void main(String[] args) {
		

	}

}
