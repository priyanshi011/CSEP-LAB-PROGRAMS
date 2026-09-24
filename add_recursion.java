import java.util.Scanner;
public class add_recursion {
static int add(int N,int sum){
if(N==0){
    return sum;
}
sum=sum+(N%10);
return add(N/10,sum);

}   
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:\n");
int N=sc.nextInt();
int sum=0;
System.out.println("Addition of given digit:"+" "+add(N,sum));
sc.close();
} 
}
