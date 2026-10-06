import java.util.Scanner;
public class recursion_array {
static void print(int N,int i,int[] arr){
if(i==N){
    return;
}
System.out.println(arr[i]+"");

 print(N,i+1,arr);

}   
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array\n");
    int N=sc.nextInt();
    int []arr=new int[N];
    System.out.println("Enter"+" "+N+" "+"elements");
    for(int j=0;j<N;j++){
     arr[j]=sc.nextInt();
    }
    int i=0;
    System.out.println("Elements of array are:");
    print(N,i,arr);
    sc.close();
} 
}
