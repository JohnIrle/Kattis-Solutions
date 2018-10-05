import java.util.Scanner;

public class Zamka {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int l = input.nextInt();
    int d = input.nextInt();
    int x = input.nextInt();
    int n = 0;
    int m = 0;

    input.close();

    for(int i = l; i <= d; i++) {
      
      if(sumDigits(i) == x){
        n = i; 
      };
    }

    for(int i = d; i >=l ; i--) {
      if(sumDigits(i) == x) {
        m = i;
      }
    }

    System.out.println(m);
    System.out.println(n);
  }

  public static int sumDigits(int num) {
    int sum = 0;

    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }
    
    return sum;
  }
}