package day07;

public class Pizza {
	int size;
	String type;
	
	public Pizza() {
		size = 12;
		type = "���۽�����";
	}
	
	public Pizza(int s, String t) {
		size = s;
		type = t;
	}
	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+ " , "+obj1.size+")");
		
		Pizza obj2 = new Pizza(24, "��������");
		System.out.println("("+obj2.type+ " , "+obj2.size+")");
		
		Pizza obj3 = new Pizza(17, "����");
		System.out.println("("+obj3.type+ " , "+obj3.size+")");
	}

}
