import java.util.Scanner;
public class PrimeNumberCheck{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int i;
    int boolean isPrime=true;
    if(n<=1){
      isPrime=false;
    }else{
      for(i=2;i<=n/2;i++){
        if(n%i==0){
          isprime=false;
          break;
        }
      }
    }
    if(isPrime){
      System.out.println(n + " is a prime number");
    }else{
      System.out.println(n + " is not a prime number");
    }
    sc.close();
  }
}
  
