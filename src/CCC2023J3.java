/*
Vivian Peng
15/02/2023
CCC 2023 Junior Q3 "Special Event"
 */

import java.util.Scanner;
import java.util.ArrayList;
public class CCC2023J3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numPpl = scanner.nextInt();
        int[] everyoneAble = new int[5];

        scanner.nextLine();

        for(int i = 0; i < numPpl; i++){
            String able = scanner.nextLine();

            for(int j = 0; j < 5; j++){
                if(able.charAt(j) == 'Y')
                    everyoneAble[j] += 1;
            }
        }

        //checking thru array
        ArrayList<Integer> largestDays = new ArrayList<> ();
        int largest = 0;
        int largestDay = 0;

        //look for largest
        for(int i = 0; i < everyoneAble.length; i++){
            if(everyoneAble[i] > largest) {
                largest = everyoneAble[i];
                largestDay = i + 1;
            }
        }

        largestDays.add(largestDay);


        //look for any that are = to largest
        for(int i = 0; i < everyoneAble.length; i++){
            if(everyoneAble[i] == largest && i != largestDay - 1) {
                largestDays.add(i+1);
            }
        }


        //printing array
        for(int i = 0; i < largestDays.size() - 1; i++) {
            System.out.print(largestDays.get(i) +  ",");
        }

        System.out.print(largestDays.get(largestDays.size()-1));
    }
}
