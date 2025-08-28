# M-Java-programs
This repository contains basic java programs like even/odd, prime, palindrome, reversed, etc.
## 1) Palindrome.java
### Problem
Check whether a given number is palindrome or not.
### Logic
- Store the original number.
- Reverse the number using % and /.
- If reversed==original,then it is a palindrome.
### Code
```java
import java.util.Scanner;
public class Palindromenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original=n;
        int rev=0;    
        while(n!=0){       
            rev = rev*10+n%10;
            n=n/10;
        }
        if (original==rev) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
        sc.close();
    }
}
```
### Output
Enter a number: 121
121 is a palindrome

Enter a number: 123
123 is not a palindrome

## 2) EvenOdd.java
### Problem
Check whether a number is even or odd.
### Logic
- A number is **even** if divisible by 2(`n%2==0`).
- Otherwise, it is **odd**.
### Code
```java
import java.util.scanner;
public class Evenodd{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    if(n%2==0){
      System.out.println(n + " is an even number");
    }else{
      System.out.println(n + " is an odd number");
    }
    sc.close();
  }
}
```
### Output
Enter a number: 3
3 is an odd number

Enter a number: 6
6 is an even number

## 3) PrimeNumber
### Problem
Check whether a number is prime.
### Logic
- A number is Prime if it is greater than 1 and divisible only by 1 and itself.
- Check divisibility from 2 to n/2.
- if divisible, it is not prime. Otherwise, prime.
### Code
```
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n<=1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}
```
### Output
Enter a number: 6
6 is not a prime number

Enter a number: 5
5 is a prime number
