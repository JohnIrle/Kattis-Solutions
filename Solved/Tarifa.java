import java.util.Scanner;

public class Tarifa{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();
    int months = input.nextInt();

    int count = x;

    for(int i = 0; i < months; i++) {
      count += (x - input.nextInt());
    }

    System.out.println(count);
  }
}