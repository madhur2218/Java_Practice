import java.util.*;
public class ac_switch_calculator {
    public static void main(String[] args) {
        System.out.println("Enter value of a and b");
        Scanner sc= new Scanner (System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter 1 for add enter 2 dor sub and 3 for mult ");
        switch(n){

            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;

            default: System.out.println("Invalid input");
        }
    }
    
}
