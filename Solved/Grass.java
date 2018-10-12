import java.util.Scanner;

public class Grass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double c = in.nextDouble();

    int l = in.nextInt();

    double[][] lawns = new double[l][2];

    for(int i = 0; i < l; i++) {
      for(int j = 0; j < 2; j++) {
        lawns[i][j] = in.nextDouble();
      }
    }

    double area = 0;
    for(double[] e : lawns) {
      area += (e[0] * e[1]);
    }

    double total = area * c;

    System.out.printf("%.7f" ,total);


  }
}