import java.util.Scanner;

public class Filip {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num1 = input.nextInt();
    int num2 = input.nextInt();

    int winner = Math.max(reverse(num1), reverse(num2));


    System.out.println(winner);
  }

  public static int reverse(int num) {
    int reverseNum = 0;

    while(num != 0) {
      reverseNum *= 10;
      reverseNum += num % 10;
      num /= 10;
    }
    return reverseNum;
  }
}