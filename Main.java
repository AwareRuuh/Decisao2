import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Digite o primeiro valor: ");
  int num = in.nextInt();
    System.out.println("Digite o segundo valor: ");
      int num2 = in.nextInt();
      if (num > num2){
      System.out.println(num+ " É maior que " +num2);
      }
    else if (num < num2){
      System.out.println(num+ " É menor que " +num2);
    }
    else{
      System.out.println(num+ " São iguais" +num2);
    }
  }
}