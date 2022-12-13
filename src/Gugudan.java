import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		System.out.println("출력할 구구단을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number > 1 & number < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다....");
		}
		
	}
}





