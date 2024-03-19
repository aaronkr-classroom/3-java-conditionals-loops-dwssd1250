import java.util.Scanner;

public class ex404 {

	public static void main(String[] args) {
		System.out.println("당신의 나이가 뭐에요? ");
		System.out.println("\n당신의 키가 몇 센치인가요?");
		
		
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		/*if(age <= 15) {
			System.out.println("미안해요. 나이 때문에 못타요.");
			return;
		}*/
		int height = s.nextInt();
		
		
		if(age > 15) {
			if(height > 140) {
				System.out.println("T-익스프레스를 탈 수 있어요!");
			}
			else {
				System.out.println("미안해요. 키 때문에 못타요.");
			}
		}
		else {
			System.out.println("미안해요. 나이 때문에 못타요.");
		}
	}

}
