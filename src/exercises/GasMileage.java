package exercises;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven:");
        int miles = input.nextInt();
        System.out.println("Enter gas consumed.");
        int gas = input.nextInt();
        input.close();

        System.out.println("MPG: " + miles/gas);
    }
}
