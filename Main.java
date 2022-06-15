import java.util.*;
class Main    //Needs capital letter.
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    Die d =new Die();
    Die d1 =new Die();

    boolean ans = d.equals(d1);
    System.out.println("Are d and d1 equal ?" + ans);
    System.out.println(d);
    System.out.println(d.roll());
    System.out.println(d);
    System.out.println("Are d and d1 equal? " + d.equals(d1)); //different way

    Die d20 = new Die(1,20);
    d20.roll();
    System.out.println("d20 " + d20);
    d20.roll();
    System.out.println("d20 " + d20);
    System.out.println("Are d and d20 equal? " + d.equals(d20)); 

    System.out.println("How many rolls of the die?");
    int num = scan.nextInt();
    TwoDieGames g = new TwoDieGames(num);
    g.snakeEyes();

  }
}