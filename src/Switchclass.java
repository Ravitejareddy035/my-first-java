import java.util.Scanner;

public class Switchclass {
  public static void  main(String[] args){
    int option;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter option");
    option = sc.nextInt();

    switch (option){
      case 1:
        System.out.println("Switch case 1");
        break;
      case 2:
        System.out.println("Switch case 2");
        break;
      case 3:
        System.out.println("Switch case 3");
        break;
      case 4:
        System.out.println("Switch case 4");
        break;
      case 5:
        System.out.println("Switch case 5");
        break;
      default:
        System.out.println("Switch case default");
        break;
    }
  }
}
