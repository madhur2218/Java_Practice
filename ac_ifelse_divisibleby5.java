import java.util.*;
public class ac_ifelse_divisibleby5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println("divisible by five");

        }

        else{
            System.out.println("Not divisible by five");
        }
    }
}
