import java.util.Scanner;

//In cooperation with Jasper Sands

public class Change{
  public static void main(String[] args){
    int[] distr={1,5,10,25};//distribution of
    Scanner in = new Scanner(System.in
    System.out.println("input cents");
    int cents = in.nextInt();
    in.nextLine();
    System.out.println(dist(distr, distr.length-1, cents));
  }
  // Count the number of ways to make change for a given amount of money.
  // Hardcoded to 1, 5, 10, 25 cent
  // Assume one way to make change for 0 cents
  // Assume cents is non-negative
  public static int dist(int[] distr, int coins, int cents){
    if(cents==0){return 1;}//good
    if(cents<0||coins<0){return 0;}//out of cents or coins

    int withCoin=dist(distr, coins, cents-distr[coins]);
    int minusCoin=dist(distr, coins-1, cents);

    return withCoin+minusCoin;
  }
}
