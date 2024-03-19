import java.util.Scanner;

public class ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 압력하세요: ");
		
		Scanner z = new Scanner(System.in);
		int grade = z.nextInt();
		
		if(grade >=90) {
			System.out.println("A!! 당신은 천재다!!~~~");
		}
		else if(grade >=80) {
			System.out.println("B - 괜찮아 괜찮아~");
		}
		else if(grade >=70) {
			System.out.println("C - 어차피 졸업할 수 있겠네");
		}
		else if(grade >=60) {
			System.out.println("D - 게임을 많이 했지?");
		}
		else {
			System.out.println("F - ㅠㅠ");
		}
	}

}
