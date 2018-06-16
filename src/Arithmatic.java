class add{
  void add1() {
    int a = 5, b = 6;
    int c = a + b;
    System.out.println("addition:" + c);
  }
  void add1(int a,int b)
  {

  }
}
class sub extends add{
  void add1()
  {
    int a = 10, b = 6;
    int c = a + b;
    System.out.println("addition:" + c);
  }

}

public class Arithmatic
{
  public static void main(String args[]) {
    add a = new add();
    a.add1();
    sub s = new sub();
    s.add1();
  }
}
