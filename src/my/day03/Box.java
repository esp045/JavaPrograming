package my.day03;
import java.util.*;

public class Box {

	public static void main(String[] args) {
			double w;
			double h;
			double area;
			double peri;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
			w = input.nextDouble();
			
			System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
			h = input.nextDouble();
			
			area = w * h;
			peri = 2*w + 2*h;
			
			System.out.println("�簢���� ���̴� " +area);
			System.out.println("�簢���� �ѷ��� " +peri);
			

	}
}
