package LoopStatement;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		for(int i=0,j=0;i<10;i++,j--) {
			System.out.println(j);
		}
		int[] numbers= {1,2,3,4,5};
		for(int number:numbers) {
			System.out.println(number);
		}
		
//		for(;;) {
//			System.out.println("I will be looping forever");
//		}
	}

}
