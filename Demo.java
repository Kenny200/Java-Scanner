import java.util.Scanner;
public class Demo {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter username: ");
    String name = kb.nextLine();
    System.out.println("Hello " + name + ", this is my program!");
  }
}
