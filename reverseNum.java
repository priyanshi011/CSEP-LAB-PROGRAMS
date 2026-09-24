import java.util.Scanner;
public class reverseNum {
    static int reverse(int N,int sum){
    if(N==0)
        return sum;
    sum=sum*10+N%10;
    return reverse(N/10,sum);
    }
    

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:\n");
    int N=sc.nextInt();
    int sum=0;
    System.out.println("Reverse of " + N + " is: " + reverse(N, sum));
    sc.close();
}
}
