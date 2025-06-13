/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paul;

/**
 *
 * @author paulk
 */
public class User {
 private String password;
 private String username;
 private int gamesPlayed;
 private int correctWords;
 private double highScoreTime;
 private int highScoreGuess;
 
    public User() {
        
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getCorrectWords() {
        return correctWords;
    }

    public double getHighScoreTime() {
        return highScoreTime;
    }

    public int getHighScoreGuess() {
        return highScoreGuess;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGamesPlayed() {
        this.gamesPlayed++;
    }

    public void setCorrectWords() {
        this.correctWords++;
    }

    public void setHighScoreTime(double highScoreTime) {
        this.highScoreTime += highScoreTime;
    }

    public void setHighScoreGuess(int highScoreGuess) {
        if(this.highScoreGuess >= highScoreGuess){
            this.highScoreGuess = highScoreGuess;
        }else{ 
        }
        
    }


    
}
