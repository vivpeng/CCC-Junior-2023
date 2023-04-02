/*
Vivian Peng
15/02/2023
CCC 2023 Junior Q1 "Deliv-e-droid"
 */

//started @ 8:55

import java.util.Scanner;

public class CCC2023J1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int delivered = scanner.nextInt();
        int collided = scanner.nextInt();

        int points = delivered*50 - collided*10;

        if(delivered > collided)
            points += 500;

        System.out.print(points);
    }
}