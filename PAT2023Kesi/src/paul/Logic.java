/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paul;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulk
 */

public class Logic {
 private int numOfGuesses = 0; // number of words guessed, can be manually counted by the amount or rows used
 private String mysteryWord;//the "mystery" word which one has to guess
 private double timeTaken;  //time taken to complete game (in min), whether lost or won
 private ArrayList <String> words = new ArrayList<>(); //List of all 500 words saved in Project
 int arraySize = 0; //Size if arraylist mentioned above
    public Logic() {
        
        //populating 'words' arraylist with words in mentioned csv file, within this project folder
     try {
         Scanner wordDoc = new Scanner(new File("4_letter_mod.csv"));
          while(wordDoc.hasNext()){
              words.add(wordDoc.nextLine());
              arraySize++;
          }
         System.out.println(words);
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Logic.class.getName()).log(Level.SEVERE, null, ex);
     }
       
     
     
//        System.out.println(randNumID);
//        System.out.println(mysteryWord);
//        System.out.println(arraySize);
    }

    public int getNumOfGuesses() {
        return numOfGuesses;
    }

    public void setNumOfGuesses(int numOfGuesses) {
        this.numOfGuesses = numOfGuesses;
    }

    public String getMysteryWord() {
        return mysteryWord;
    }

    public void setMysteryWord() {
        int randNumID = (int) (Math.random() * (arraySize -1) - 0 + 1) + 0; // generating random word's ID using a random number
        mysteryWord = words.get(randNumID).toLowerCase(); //initialising variable
    }

    public double getTimeTaken() {
        return timeTaken;
    }

//    public void setTimeTaken(LocalTime endTime, LocalTime startTime) {
//        this.timeTaken = SECONDS.between();
//    }
//
// 
    public boolean checkLetterInPosition(char input, char letter){
        return (input == letter);
    }
    
    public boolean checkLetterInWord(char input){
        return mysteryWord.contains(""+input);
    }
    

     public static void main(String[] args) {
        new Logic();
        LocalTime l1 = LocalTime.parse("02:53:40");
        LocalTime l2 = LocalTime.parse("02:54:27");
//        System.out.println(l1.until(l2, MINUTES));
       // System.out.println(SECONDS.between(l1, l2));
     //   BigDecimal elapsedMinutes = Duration.between(l1, l2).to();
    }
}
