import java.util.*;
public class ac_greated_between_three_nos {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter value of a ,b andc ");

        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is largest");
        }

        else if(b>a && b>c){
            System.out.println("B is largest");
        }

        else if(c>a && c>b){
            System.out.println("C is largest");

        }

        else{
            System.out.println("All are equal");
        }
    }
    
}
