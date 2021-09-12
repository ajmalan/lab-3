import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner s = new Scanner(System.in);
  System.out.println("Enter a number to count down or up from: ");
  int userNum = s.nextInt();

  if(userNum > 0){
    for(int i=userNum; i>=0; i--){
      System.out.println(i);
    }
    System.out.println("Blast off!");
  }
  else if (userNum < 0) {
        for(int i=userNum; i<=-0; i++){
      System.out.println(i);
    }
    System.out.println("Blast off!");
  }
  else {
    System.out.println("Blast Off!");
  }  
  }
}