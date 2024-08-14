package Jump_ControlStatements;

public class ContinueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}

		int i=0;
		while(i<10) {
			i++;
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
	

}
