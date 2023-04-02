/*
Vivian Peng
15/02/2023
CCC 2023 Junior Q4 "Trianglane"
 */

import java.util.Scanner;
public class CCC2023J4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numCol = scanner.nextInt();

        int[][] painted = new int[2][numCol];

        //putting into array
        for(int i = 0; i < numCol; i++)
            painted[0][i] = scanner.nextInt();

        for(int i = 0; i < numCol; i++)
            painted[1][i] = scanner.nextInt();

        //printing array for checking
        /*
        for(int i = 0; i < 2; i++){
            for(int j = 0; j<painted[0].length; j++)
                System.out.print(painted[i][j] + " ");
            System.out.print("\n");
        }

         */

        int total = 0;

        for(int i = 0; i < painted[0].length; i++){
            if(painted[0][i] == 1) {

                if (i == 0) { //if it's on the very left edge
                    if(painted[0][i+1] != 1) { //it's a solo block
                        total += 3;
                        System.out.println("block col " + i + " is solo");
                    }

                    else{
                        System.out.println("block to right of col " + i + " is black");
                        int j = i+1;
                        while(j < painted[0].length && painted[0][j] == 1) {
                            total++;
                            j++;
                        }

                    }
                }

                else if(i == numCol-1) { //if it's on the very right edge
                    if (painted[0][i - 1] != 1) { //it's a solo block{
                        System.out.println("block col " + i + " is solo");
                        total += 3;
                    } else {
                        System.out.println("block to left of col " + i + " is black");
                        int j = i + 1;
                        while (j >= 0 && painted[0][j] == 1) {
                            total++;
                            j--;
                        }
                    }
                }


                else{ //it's somewhere in the middle
                    if (painted[0][i - 1] != 1 && painted[1][i + 1] != 1) {
                        total += 3;
                        System.out.println("block with col " + i + " is solo");
                    } else if (painted[0][i - 1] == 1) {
                        System.out.println("block to left of col " + i + " is black");
                        int j = i + 1;
                        while (j >= 0 && painted[0][j] == 1) {
                            total++;
                            j--;
                        }
                    } else if (painted[0][i + 1] == 1) {
                        System.out.println("block to right of col " + i + " is black");
                        int j = i + 1;
                        while (j < painted[0].length && painted[0][j] == 1) {
                            total++;
                            j++;
                        }
                    }
                }
                }


            }


        System.out.print(total);


    }

}
