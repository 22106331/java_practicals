import java.util.*;

public class mprac7 {

  // only valid for 2 digit numbers
  public static void Lottery(int rn, int myNum) {

    // converting the lottery number into array of two int
    int rnarr[] = new int[2];
    // capturing 1st digit
    rnarr[0] = rn / 10;
    // capturing 2nd digit
    rnarr[1] = rn % 10;

    // converting the my number into array of two int
    int myarr[] = new int[2];
    myarr[0] = myNum / 10;
    myarr[1] = myNum % 10;

    System.out.println("Lottery num is : " + rn);

    if (rn == myNum)
      System.out.println("you win $10,000");

    // checking 2nd case if the reverse 0f number is present.
    else if (rnarr[1] == myarr[0] && rnarr[0] == myarr[1])
      System.out.println("you win $3,000");

    // checking 3rd case
    else if (myarr[0] == rnarr[0] || myarr[1] == rnarr[0] || myarr[0] == rnarr[1] || myarr[1] == rnarr[1])
      System.out.println("you win $1,000");

    else
      System.out.println("Sorry you didn't win anything :( ");

  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("Enter your lottery number : ");
    int num = scan.nextInt();
    scan.close();

    // generating inclusive random number
    int rn = rand.nextInt(num + 1);

    if (num < 100)
      Lottery(rn, num);
    else
      System.out.println("invalid number(please enter a two digit number)");

    System.out.println("\nID:18DCS129 \nNAME:MADHAV ");
  }

}
