/*
Vivian Peng
15/02/2023
CCC 2022 Junior Q2 "Chili Peppers"
 */

import java.util.Scanner;

public class CCC2023J2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numChilis = scanner.nextInt();
        int shu = 0;

        for(int i = 0; i < numChilis+1; i++){
            String chili = scanner.nextLine();

            if(chili.equals("Poblano"))
                shu += 1500;

            else if(chili.equals("Mirasol"))
                shu += 6000;

            else if (chili.equals("Serrano"))
                shu += 15500;

            else if (chili.equals("Cayenne"))
                shu += 40000;

            else if(chili.equals("Thai"))
                shu += 75000;

            else if(chili.equals("Habanero"))
                shu += 125000;
        }

        System.out.print(shu);
    }
}
