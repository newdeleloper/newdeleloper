package Box;
import java.util.Scanner;

public class Develop {

	public static void main(String[] args) {
		double a,b,c;
		double D;
		System.out.println("Вирішення квадратного рівняння ax^2+bx+c=0");	
		Scanner in= new Scanner(System.in); //імпортуємо сканер для вводу в консоль
		System.out.println("Введіть 1 змінну для вводу");
		a = in.nextDouble(); 
		System.out.println("Введіть 2 змінну для вводу");
		b = in.nextDouble();
		System.out.println("Введіть 3 змінну для вводу");
		c = in.nextDouble();
		D = b*b-4*a*c;  //Формула дискрімінанту
		System.out.println(D);//Виводимо искрімінант
		if (D>0) {	//Умова розв'язку квадратного рівняння коли 2 корені
			double x1,x2;
			x1 = (-b - Math.sqrt(D)) / (2 * a);
		    x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("Корні квадратного рівняння:x1 = " + x1 + ", x2 = " + x2);
		}  
		//Умова розв'язку квадратного рівняння коли 1 корінь
		else if (D == 0) {
		    double x;
		    x = -b / (2 * a);
		    System.out.println("Квадратне рівняння має єдиний корінь: x = " + x);
		    //Умова  коли рівняння без коренів
		}
		else {
		    System.out.println("Квадратне рівняння немає коренів");
		}
}
}
