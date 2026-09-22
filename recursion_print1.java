import java.util.Scanner;
public class recursion_print1 {
static void print(int N){
    if(N==0){
     return ;
    }
    System.out.println(N);
    print(N-1);
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int N=sc.nextInt();
       print(N);

    }
    
}
