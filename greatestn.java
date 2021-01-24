//WAP to find the largest of n natural numbers.
import java.util.Scanner;
public class greatestn
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lar=1;
        while (true){
            System.out.println("Enter numbers and to terminate enter a negative no. or zero: ");
            int num= scan.nextInt();

            if (lar<num){
                lar=num;
            }
            if (num<=0){
                System.out.println("Largest Number: "+lar);
                break;
            }
        }
    }
}
    
       