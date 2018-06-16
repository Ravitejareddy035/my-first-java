import java.util.Scanner;

public class Arhematic {
  void add(int x, int y){
   // int a = 5,b= 6;
    int d=(x+y);
    System.out.println("Addition:"+d);

  }
  void sub(int x, int y){
   // int a=6,b=5;
    int e=0;
    if(x>y) {
       e =x-y;
    }
    else{
       e=y-x;
    }
    System.out.println("Substraction:"+e);

  }
  void mul(int x, int y){
    int f=x*y;
    System.out.println("multiplication:"+f);
  }
  void div(int x,int y){
    float g=x/y;
    System.out.println("Division:"+g);
  }
  public static void main(String[] args)
  {

    Arhematic o = new Arhematic();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the x value");
    int a= sc.nextInt();

    System.out.println("Enter the y value");
    int b= sc.nextInt();

    o.add(a,b);
    o.sub(a,b);
    o.mul(a,b);
    o.div(a,b);

  }
}
