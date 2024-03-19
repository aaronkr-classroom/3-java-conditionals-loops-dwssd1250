import java.util.Scanner;

public class ex407 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String choice = "q";
		
		 do {
			System.out.println("영화를 입력하세요. q는 종료." + choice);
			choice = s.next();
			
		}while(choice != "q");
	}

}
//This class    ex407 -> ex408     ???????
//System.out.println("");

//   ERRER