import java.util.Scanner;

public class ex406_REAL {

	public static void main(String[] args) {
		
		int sum = 0;
		System.out.println("");
		int num[] = new int[5];
		
		for (int n = 0; n<5; n++) {
			Scanner s = new Scanner(System.in);
			num[n] = s.nextInt();
		}
		
		for(int i:num) {
			sum += i;
		}
		
		System.out.println("합계: " + sum);
	}

}
//This class   ex406 -> ex407   ????