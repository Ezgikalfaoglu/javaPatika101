import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args){
        int year;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a year: ");
        year= scanner.nextInt();

        if (year %4 == 0 && (year %400 ==0 || year%100!=0)){
            System.out.println( year +  "is a Leap Year.");
        }else {
            System.out.println(year +  "is not a Leap Year.");
        }
    }
}
