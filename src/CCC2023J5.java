/*
Vivian Peng
02/15/2023
CCC 2023 Junior Q5 "CCC Word Hunt"
 */

import java.util.Scanner;
public class CCC2023J5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        //System.out.println("your word search has " + rows + " rows and " + cols + " cols");

        char[][] wordSearch = new char[rows][cols];

        for (int r = 0; r < rows; r++) { //inputting word search into my array
            for (int c = 0; c < cols; c++) {
                wordSearch[r][c] = scanner.next().charAt(0);
            }
        }

        String found;
        int h = 0;

        //checking for the first letter of the word
        for (int r = 0; r < rows; r++) { //inputting word search into my array
            for (int c = 0; c < cols; c++) {

                if (wordSearch[r][c] == word.charAt(0)) { //if equals first letter
                    //System.out.println("i have found the first letter " + word.charAt(0) + " at row " + r + " col " + c);
                    //checking LEFT & RIGHT!

                    //LEFT
                    //System.out.println("the col is " + c);
                    //System.out.println("the world length is " + word.length());
                    if (c - word.length() >= -1) { //making sure it's not on the left edge or too long
                        //System.out.println("i am going to check left now");
                        found = "";
                        //checking LEFT
                        for (int i = c; i > c - word.length(); i--) {  //going thru the left letters up till length of word
                            found += wordSearch[r][i];
                            //System.out.println(found);
                        }


                        if (found.equals(word))  //if the word we found is equal to the word
                            h++;

                    }

                    //RIGHT
                    //System.out.println(wordSearch[0].length);
                    if (c + word.length() <= wordSearch[0].length) {//making sure it's not on the right edge or too long
                        //System.out.println("i am going to check right now");

                        found = "";
                        //checking RIGHT
                        for (int i = c; i < c + word.length(); i++) //going thru the right letters up till length of word
                            found += wordSearch[r][i];

                        if (found.equals(word))
                            h++;
                    }



                    //checking UP & DOWN! (VERTICAL)
                    //DOWN!
                    //System.out.println(wordSearch.length);
                    if(r + word.length() <= wordSearch.length){ //making sure it won't go over
                        //System.out.println("im going to check down now");

                        found = "";
                        //System.out.println(found);

                        for(int i = r; i < r + word.length(); i++) {
                            found += wordSearch[i][c];
                            //System.out.println(found);
                        }

                        if(found.equals(word)) {
                            //System.out.println("found a word down");
                            h++;
                        }


                    }

                    //UP!
                    if(r - wordSearch.length >= -1){
                        //System.out.println("i'm going to check up now");

                        found = "";

                        for(int i = r; i >= 0; i--)
                            found += wordSearch[i][c];

                        if(found.equals(word)) {
                            //System.out.println("found a word up");
                            h++;
                        }
                    }

                    //DIAGONALS
                    //diagonal left down
                    /*
                    if(c - word.length() >= 0 && r + word.length() <= wordSearch.length){
                        System.out.println("i'm checking diagonal left down");
                        found = "";
                        for(int i = 0; i < word.length(); i++)
                            found += wordSearch[r-i][c-i];

                        if(found.equals(word))
                            h++;
                    }

                     */

                    //diagonal right up
                    /*
                    System.out.println("row " + r);
                    System.out.println("lenfth of word search " + wordSearch.length);
                    System.out.println("col " + c);
                    System.out.println("length of world search 0 " + wordSearch[0].length);
                    if(r + word.length() <= wordSearch.length-1 && c + word.length() <= wordSearch[0].length){
                        System.out.println("i'm checking diagonal right up");
                        found = "";
                        for(int i = 0; i < word.length(); i++) {
                            System.out.print(found);
                            found += wordSearch[r + i][c + i];
                        }

                        if(found.equals(word))
                            h++;
                    }

                     */


                }
            }

        }

        System.out.print(h);

    }
}
