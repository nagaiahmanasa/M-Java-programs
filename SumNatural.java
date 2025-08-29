import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n terms");
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first " + n + " natural number= " + sum);
        sc.close();
    }
}
