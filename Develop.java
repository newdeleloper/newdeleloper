package Box;
import java.util.Scanner;

public class Develop {

	public static void main(String[] args) {
		double a,b,c;
		double D;
		System.out.println("�������� ����������� ������� ax^2+bx+c=0");	
		Scanner in= new Scanner(System.in); //��������� ������ ��� ����� � �������
		System.out.println("������ 1 ����� ��� �����");
		a = in.nextDouble(); 
		System.out.println("������ 2 ����� ��� �����");
		b = in.nextDouble();
		System.out.println("������ 3 ����� ��� �����");
		c = in.nextDouble();
		D = b*b-4*a*c;  //������� �����������
		System.out.println(D);//�������� ���������
		if (D>0) {	//����� ����'���� ����������� ������� ���� 2 �����
			double x1,x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
		    x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("���� ����������� �������:x1 = " + x1 + ", x2 = " + x2);
		}  
		//����� ����'���� ����������� ������� ���� 1 �����
		else if (D == 0) {
		    double x;
		    x = -b / (2 * a);
		    System.out.println("��������� ������� �� ������ �����: x = " + x);
		    //�����  ���� ������� ��� ������
		}
		else {
		    System.out.println("��������� ������� ���� ������");
		}
}
}
