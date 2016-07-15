/**
 @Author:Shirley
 Assignment #:Extra Credit
 Description: This program flips a coin 50 times. It will display how many heads 
 and tails there are. There are 10 trials. Then it will print out the average
 number of tails generated in the 10 trials.
*/
import apcslib.*;
import chn.util.*;

public class Flipcoins
{
  public static void main (String args[])
  
  {  //Variable used
     double averageHeads;  //Average percentage of Heads.
     double averageTails;  //Average percentage of Tails.
     double totalTails=0;  //Add up all the numbers generated for tails in the 10 trials.
     double totalHeads=0;  //Add up all the numbers generated for heads in the 10 trials.
     //Repeat the loop 10 times. 
     
     for (int trials = 1; trials<= 10; trials++)
       {
        int countHeads = 0; //Count how many times was heads.
        int countTails = 0; //Count how many times was tails.
        double r;           //Generate random numbers.
       
       
       
        //Repeat the for loop for 50 times.
        for (int i = 1; i<= 50; i++)
         {
         
         //Generate random numbers.
         r = Math.random();
         //If the random number is less than 0.5 than count as heads.
         if (r < .5)
         {
           countHeads ++;
         }
         //Else count as tails.
         else
           countTails ++;
         
         } 
     
        //Print out "# of heads  # of tails".
        System.out.println("             # of heads    # of tails");
        //Print out the the number of generated in 10 trials. And format it 
        //with field width.
        System.out.println("Trial # " +trials + Format.right(countHeads,7) + 
        Format.right(countTails, 15));
        //Add up all the numbers heads generated in the 10 trials and set it 
        //equal to totalHeads.
        totalHeads+=countHeads;
        //Add up all the numbers of tails generated in the 10 trials and set 
        //it equal to totalTails.
        totalTails+=countTails;
        } 
     
     //Divide the total number of heads by 10 to get the percentage and set
     //it equal to averageHeads.
     averageHeads = totalHeads/10;
     //Divide the total number of tails by 10 to get the percentage and set
     //it equal to averageTails.
     averageTails = totalTails/10; 
     //Print out the average number of heads in percentage.
     System.out.println("The average number of heads are: " 
                          + averageHeads+"%");
     //Print out the average number of tails in percentage.
     System.out.println("The average number of tails are: "
                          + averageTails +"%");
  }
}

/*======================================================================================
             # of heads    # of tails
Trial # 1     27             23
             # of heads    # of tails
Trial # 2     28             22
             # of heads    # of tails
Trial # 3     22             28
             # of heads    # of tails
Trial # 4     24             26
             # of heads    # of tails
Trial # 5     26             24
             # of heads    # of tails
Trial # 6     24             26
             # of heads    # of tails
Trial # 7     24             26
             # of heads    # of tails
Trial # 8     25             25
             # of heads    # of tails
Trial # 9     26             24
             # of heads    # of tails
Trial # 10     22             28
The average number of heads are: 24.8%
The average number of tails are: 25.2%

========================================================================================
             # of heads    # of tails
Trial # 1     14             36
             # of heads    # of tails
Trial # 2     21             29
             # of heads    # of tails
Trial # 3     22             28
             # of heads    # of tails
Trial # 4     21             29
             # of heads    # of tails
Trial # 5     22             28
             # of heads    # of tails
Trial # 6     25             25
             # of heads    # of tails
Trial # 7     24             26
             # of heads    # of tails
Trial # 8     29             21
             # of heads    # of tails
Trial # 9     24             26
             # of heads    # of tails
Trial # 10     24             26
The average number of heads are: 22.6%
The average number of tails are: 27.4%
*/
