/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itPat_mathGame;

/**
 *
 * @author paulk
 */
import javax.swing.*;

public class ITPat_mathGame
{

    /*Links to Images
     *Welcompg: https://bit.ly/3SAE8d9
     *lowScore: https://bit.ly/3dKg1tO
     *highScore: https://bit.ly/3fnXrbB
     */
    
    String username;
    boolean tOrF; //Stores boolean value of given equation.
    int num1;
    int num2;
    int answer; //Correct answer to computed expression.
    int input;  //Answer entered by player when equation is false.
    int playAgain; 
    String equation;
    int shownAnsw; //The true/false answer which will display in question.
    char tfChoice; //Store player's choice of whether they say the equation is true/false.

    String dir = System.getProperty("user.dir"); //directory of current working java file
    final ImageIcon welcomepg = new ImageIcon(dir +"\\src\\itPat_mathGame\\welcomepg.jpg");
    final ImageIcon lowScore = new ImageIcon(dir +"\\src\\itPat_mathGame\\lowScore.png");
    final ImageIcon highScore = new ImageIcon(dir +"\\src\\itPat_mathGame\\highScore.png");

    public void welcome()
    {
        int welcome = JOptionPane.showConfirmDialog(null, "welcome to wild mental maths".toUpperCase()
                + "\nwhere you can increase your mental maths abilities!"
                + "\ndo you want to play?", "***WELCOME***", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, welcomepg);
        if (welcome == 1)
        {
            System.exit(0);
        }
    }

    public String username(String hi)
    {       //Creates username with random number attached.
        hi = hi.toLowerCase();
        int id = (int) (Math.random() * (100 - 1 + 1) + 1);
        hi += id;
        return hi;
    }

    public int lvl1()
    {            //Beginner's number range.
        int a = (int) (Math.random() * (10 - 1 + 1) + 1);
        return a;
    }

    public int lvl2()
    {             //Intermediate's number range.
        int b = (int) (Math.random() * (100 - 10 + 1) + 10);
        return b;
    }

    public int lvl3()
            //Expert's number range.
    {
        int c = (int) (Math.random() * (1000 - 100 + 1) + 100);
        return c;
    }

    public void divide(int a, int b)
    {
        equation = "" + a + "/" + b + "=";
        answer = a / b;

    }

    public void multiply(int a, int b)
    {
        equation = "" + a + "x" + b + "=";
        answer = a * b;
    }

    public void add(int a, int b)
    {
        equation = "" + a + "+" + b + "=";
        answer = a + b;
    }

    public void minus(int a, int b)
    {
        equation = "" + a + "-" + b + "=";
        answer = a - b;
    }

    public void tOrF()
    {            //Randomly computes whether equation will be true or false.
        int choice = (int) (Math.random() * (1 - 0 + 1));
        if (choice == 1)
        {
            tOrF = true;
            shownAnsw = answer;

        } else
        {
            tOrF = false;
            do
            {
                shownAnsw = (int) (Math.random() * (1000 - (-1000) + 1) + (-1000));
            } while (shownAnsw == answer);//Generate random false answer not equal to correct answer.

        }
    }

    public ITPat_mathGame()
    {

        welcome();
        
        username = JOptionPane.showInputDialog(null, "Please Enter your Name:", "Username Login", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello! " + (username = username(username)), "Welcome Player", JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "In this Game, you will be given mathematical equations."
                + "\nIt is up to you to figure out whether the equation is"
                + "\ntrue or false by entering a 't' or 'f' into the input box."
                + "\nYou will gain 2 point for every question in which"
                + "\nyou answer the true and false correctly AND input the right answer when prompted.", "how to play".toUpperCase(), JOptionPane.INFORMATION_MESSAGE);

        do
        {
            int score = 0;

            Object[] levels =
            {
                "Beginner", "Intermediate", "Expert"
            };
            Object lvlMess = JOptionPane.showInputDialog(null, "Choose Your Level:", "LEVELS", JOptionPane.QUESTION_MESSAGE, null, levels, levels[0]);
            
            int operation;
            do
            {
                operation = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Which Operation You Prefer to Work With:".toUpperCase()
                        + "\n1.addition"
                        + "\n2.subtraction"
                        + "\n3.multiplication"
                        + "\n4.division", "*type in only the corresponding number*", JOptionPane.QUESTION_MESSAGE));

            } while (operation > 4 || operation < 1);
            
            for (int i = 1; i <= 10; i++)//Generate 10 Questions.
            {                                       
                if (lvlMess == levels[0])//Generate rand nums w/in chosen levels range.
                {                        
                    num1 = lvl1();
                    num2 = lvl1();

                } else
                {
                    if (lvlMess == levels[1])
                    {
                        num1 = lvl2();
                        num2 = lvl2();

                    } else
                    {
                        if (lvlMess == levels[2])
                        {
                            num1 = lvl3();
                            num2 = lvl3();

                        }
                    }
                }
                
                
                while (operation == 4 && ((num1 % num2) != 0))
                {
                    if (lvlMess == levels[0]) //If division was chosen, continuously generate numbers...                           
                    {                         //...until the quotient is a whole number(no rems).
                        num1 = lvl1();
                        num2 = lvl1();

                    } else
                    {
                        if (lvlMess == levels[1])
                        {
                            num1 = lvl2();
                            num2 = lvl2();

                        } else
                        {
                            if (lvlMess == levels[2])
                            {
                                num1 = lvl3();
                                num2 = lvl3();

                            }
                        }
                    }
                }

                switch (operation)
                {
                    case 1:
                        add(num1, num2);
                        break;
                    case 2:
                        minus(num1, num2);
                        break;
                    case 3:
                        multiply(num1, num2);
                        break;
                    case 4:
                        divide(num1, num2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Input", "Invalid", JOptionPane.ERROR_MESSAGE);
                        break;
                }

                tOrF();

                tfChoice = JOptionPane.showInputDialog(null, "Q"+i+") Is the following equation True or False?"
                        + "\n(input only 't' or 'f'.)"
                        + "\n" + equation + " " + shownAnsw, "SCORE: " + score +" || TRUE or FALSE",
                        JOptionPane.QUESTION_MESSAGE).toLowerCase().charAt(0);

                if (tfChoice == Boolean.toString(tOrF).charAt(0))
                {                                //If correct boolean value answered, +1pt.
                    score += 1;
                    if (tOrF == false)
                    {
                        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Input The Correct Answer".toUpperCase() + "\n" + equation + " ?").replaceAll("\\s+", ""));
                        //If inputted correctly chosen value is false...
                        if (input == answer)
                        {//...AND if the input number corrects the equation, +1pt.
                            score += 1;
                        } else
                        {
                            JOptionPane.showMessageDialog(null,"The Correct Answer is: "+equation+" *"+ answer+"*");
                        }
                    } else
                    {//if equation was true and boolean value was chosen... 
                     //...correctly, +1pt (max pts for all questions is 2)
                        score += 1;
                    }
                } else
                {   //If false boolean is answered incorrectly as true,... 
                    //...player has chance to gain 1pt by inputting...
                    //...correct answer for equation.
                    if (tOrF == false)
                    {
                        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Q"+i+") **The equation was 'FALSE', not 'TRUE'.**"
                                + "\n"
                                + "\nInput The Correct Answer".toUpperCase()
                                + "\n" + equation + " ?").replaceAll("\\s+", ""));//Spaces taken out before string is parsed to integer...
                        if (input == answer)                                      //...in order to reduce errors.
                        {
                            score += 1;
                        } else
                        {
                            JOptionPane.showMessageDialog(null,"The Correct Answer is: "+equation+" *"+ answer+"*");
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null,"The equation: " + equation+ " " + answer+ " is *TRUE*");
                    }
                }

            }
            
            if (score >= 10)
            {
                JOptionPane.showMessageDialog(null, "You Scored: " + score + "!"
                        + "\nThis is a High Score. Good Job, " + username + "!", "WELL DONE!", JOptionPane.PLAIN_MESSAGE, highScore);
            } else
            {
                JOptionPane.showMessageDialog(null, "You Scored: " + score + "..."
                        + "\nThis is a very Low Score. You should Practice More, " + username + "...", "OH NO!", JOptionPane.WARNING_MESSAGE, lowScore);
            }

            playAgain = JOptionPane.showConfirmDialog(null, "Would You Like to Play Again?", "PLAY AGAIN ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (playAgain == 0);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        new ITPat_mathGame();

    }

}
