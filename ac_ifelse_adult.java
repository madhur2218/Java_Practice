import java.util.*;
public class ac_ifelse_adult {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value of age");
        int age=sc.nextInt();

        if(age>=18){

            System.out.println("ADULT");
        }

        else {

            System.out.println("NOT ADULT");
        }

    }
    
}
