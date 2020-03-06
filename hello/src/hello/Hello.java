package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,world!");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int i = 0;
		while(x>0){
			x = x/10;
			i++;
		}
		System.out.println("All is " + i);
//		int type;
//		type = in.nextInt();
//		switch( type ) {
//		case 1:
//			System.out.println("Case is 1");
//			break;
//		case 2:
//			System.out.println("Case is 2");
//			break;
//		case 3:
//			System.out.println("Case is 3");
//		default:
//			System.out.println("No that Case");
//			break;
//		}
//		int x,y,z,i;
//		System.out.print("Please Input x:");
//		x = in.nextInt();
//		System.out.print("Please Input y:");
//		y = in.nextInt();
//		System.out.print("Please Input z:");
//		z = in.nextInt();
//		i = x>y?x:y;
//		i = i>z?i:z;
//		System.out.println("Max is "+i);
//		if( x>y ) {
//			System.out.println(" X>Y ");
//		}else {
//			System.out.println(" X<Y ");
//		}

	}

}
