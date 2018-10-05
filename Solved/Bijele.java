import java.util.Scanner;

public class Bijele {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] pieces = new int[6];

    for(int i = 0; i < 6; i++) {
      pieces[i] = input.nextInt();
    }

    int[] addPieces = new int[6];
    for (int k = 0; k < 6; k++) {
      if(k < 2) {
        if(pieces[k] == 1) {
          addPieces[k] = 0;
        } else if(pieces[k] > 1) {
          addPieces[k] = 1 - pieces[k];
        } else if(pieces[k] < 1) {
          addPieces[k] = -(pieces[k] - 1);
        } 
      }

      if(k > 1 && k < 5) {
        if(pieces[k] == 2) {
          addPieces[k] = 0;
        } else if(pieces[k] > 2) {
          addPieces[k] = 2 - pieces[k];
        } else if(pieces[k] < 2) {
          addPieces[k] = -(pieces[k] - 2);
        }
      }

      if(k == 5) {
        if(pieces[k] > 8) {
          addPieces[k] = 8 - pieces[k];
        } else if(pieces[k] < 8) {
          addPieces[k] = -(pieces[k] - 8);
        }
      }
    }

    String result = "";
    for(int j = 0; j < 6; j++) {
      result+= Integer.toString(addPieces[j]) + " ";
    }

    System.out.println(result);
  }
}