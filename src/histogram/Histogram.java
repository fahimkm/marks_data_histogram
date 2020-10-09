package histogram;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0 ; i<5 ; i++) {
			array[i] = sc.nextInt();
		}
		
		
		for(int j = 10 ; j >= 0 ;j--) {
		for(int i = 0 ; i < 5 ; i ++)
			 {
				if(array[i] > j*10) {
						System.out.print("*   ");
				}
				else {
					System.out.print("    ");
				}
				
			}
			System.out.print("\n");
			}
	}
}
