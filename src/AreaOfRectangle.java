import java.util.Scanner;

public class AreaOfRectangle {
  public static void main(String[] args){
    int length,breadth,area;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the length:");
    length =sc.nextInt();
    System.out.print("Enter the breadth");
    breadth=sc.nextInt();
    System.out.print("area is:");
    area=length*breadth;
    System.out.print(area);
  }
}

