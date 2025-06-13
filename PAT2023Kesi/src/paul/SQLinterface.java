package paul;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author clewis
 */
public class SQLinterface {
    // simple interface to link the DB from Java

    Connect db = new Connect();
    int result;

    SQLinterface() {
//        String out = "";
//        LocalDate dob = null;
        try {
            // String sql = "SELECT * from userInformation;";
            String sql = "SELECT * FROM userInformation;";
            System.out.println(sql);
            // query the database with the above sql string
            ResultSet rs = db.query(sql);
//            if(qORu == 'a'){
//                int check = 0;
            while (rs.next()) {
                
                    String user = rs.getString("username");
                    String pss = rs.getString("password");
//                if(userObj.getUsername().equalsIgnoreCase(user)){
//                          JOptionPane.showMessageDialog(null, "Username Taken","Error",JOptionPane.ERROR_MESSAGE);
//                        //  check++;
//                } else{
System.out.println(user + " "+ pss);

                 //   result = db.update("INSERT INTO userInformation(username, password) VALUES (\"" + userObj.getUsername() + "\", \"" + userObj.getPassword() + "\")");
//                    System.out.println(result);  
//                    check++;
//                }
//                
////                String passwrd = rs.getString("password");
////                String gamesPlayed = rs.getString("gamesPlayed");
////                String correctWords = rs.getString("correctWords");
////                String highScoreTimes = rs.getString("highScoreTimes");
////                String highScoreGuess = rs.getString("highScoreGuess");
//
//              //  out += user + "\t" + passwrd + "\t" + gamesPlayed + "\n";
//
//            }
//            } else if(qORu =='b'){
//                int check = 0;
//                while (rs.next() && (check == 0))
//            {
//                String user = rs.getString("username");
//                if(userObj.getUsername().equals(user)){
//                     String passwrd = rs.getString("password");
//                          if(userObj.getPassword().equals(passwrd)){
//                              check++;
//                              userObj.setUsername(user);
//                              userObj.setPassword(passwrd);
//                              result = 1;
//                          }else{
////                         JOptionPane.showMessageDialog(null, "Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
//
//                          }
//                }else{
//                           //  JOptionPane.showMessageDialog(null, "Username not found","Error",JOptionPane.ERROR_MESSAGE);
//
//                }
//               
////                String gamesPlayed = rs.getString("gamesPlayed");
////                String correctWords = rs.getString("correctWords");
////                String highScoreTimes = rs.getString("highScoreTimes");
////                String highScoreGuess = rs.getString("highScoreGuess");
//
//              //  out += user + "\t" + passwrd + "\t" + gamesPlayed + "\n";
//
//            }
//            
//            }else if(qORu == 'c'){
//                int result = db.update(sql); 
//            } else if(qORu == 'd'){
//                   int check = 5;
//                   String out = "";
//                while (rs.next() && (check >0))
//            {
                    // String user = rs.getString("username");

//                String passwrd = rs.getString("password");
//                String gamesPlayed = rs.getString("gamesPlayed");
//                String correctWords = rs.getString("correctWords");
//                String highScoreTimes = rs.getString("highScoreTimes");
                    // String highScoreGuess = rs.getString("highScoreGuess");
                    //out += highScoreGuess + user+ "\n";
                }
                System.out.println(out);

                // unpack the resultset returned
                // the value in "" is the fieldname in the database - must be correct
            }catch (SQLException ex)
        {
            System.out.println("error");
            Logger.getLogger(SQLinterface.class.getName()).log(Level.SEVERE, null, ex);
        }
            // System.out.println(out);
        
    
    

//    public int getResult() {
//        return result;
//
//    }
    }
    public static void main(String[] args)
    {
        new SQLinterface();
    }

    }
