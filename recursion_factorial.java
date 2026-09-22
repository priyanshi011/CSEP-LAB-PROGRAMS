import java.util.Scanner;
public class recursion_factorial {
static int factorial(int N){
    if(N==1){
        return 1;
    }
    return (N*factorial(N-1));
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int N=sc.nextInt();
        System.out.println("Factorial of " + N + " is: " + factorial(N));
    }
    
}
