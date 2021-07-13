

import java.util.concurrent.TimeUnit;
import java.io.Console;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WPS {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("***************");
        System.out.println("HELLO YOU!");
        System.out.println("***************");
        TimeUnit.SECONDS.sleep(5);  
        
        System.out.println("Let us begin your typing test");
        TimeUnit.SECONDS.sleep(2);
        
        System.out.println("You will be given a series of words in which you will have to type the given words based on which you will be judged");
        TimeUnit.SECONDS.sleep(7);
        System.out.println("Ready?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" ");

        System.out.println("Here are your words: ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("");

        List<String> list = new ArrayList<String>(); //I've created a list of strings
        //Adding the elements to the list of strings
        //You can change the set of words if you wanna
        list.add("DISINTRESTED");
        list.add("NONPLAUSED");
        list.add("PREPONDERANCE");
        list.add("MAWKISH");
        list.add("FORBEARENCE");
        list.add("FLAGRANT");
        list.add("ABBERATION");
        list.add("IRREGARDLESS");
        list.add("COLONEL");
        list.add("LOYAL");//The list has be decalred as list
        //I will now run through the list to print out random words

        System.out.println(list);

        //Instead of caluclating the time of the user typing. Let us considder the local time. (Given as follows)

        Scanner sc = new Scanner(System.in); 
        System.out.println(" "); 

        long userStart;
        userStart = (long) System.currentTimeMillis(); //I've stored the time the user starts typing in 'double'
        
        System.out.print("Type here: ");  
        String str = sc.nextLine();     

        long userEnd;
        userEnd = (long) System.currentTimeMillis();//I've stored the time the user stops typing in 'double' again.

        //I thought putting a if and else loop here to make sure the user has entered the right words
        //Not sure how to do it, i need help in this.

        System.out.println(" ");
       
        //Now all we have is the stored time from the starting to the ending of the user typing
        //We need to print it out. We do it as follows
        double timeTaken = (userEnd - userStart)/1000.0;
        System.out.println("Time taken to type the given words: " + timeTaken + " Seconds");//The seconds taken to complete 
        //the program isn't shown properly

        System.out.println(" ");
        int totalWords = list.size();
        System.out.println("Total number of words given: " + totalWords); 
        System.out.println(" ");
        System.out.print("Words you have typed: " + str);
        System.out.println(" ");
        
        //Formula part
        //We know that we have added a total of 10 words which are being printed out for the user to type it 
        //Therefore there are 10 words in the declared list so let us consider the number 10 directly

        //I googled the number of words per minute formula
        //It was given as X number of words divided by 5 divded by 1 minute (Since we have taken seconds 
        //let us consider 60 seconds)
        //Will give us Words per minute 
        //Simply count all typed entries and divide by five to get the number of words typed. 
        //To give an example, if you typed 200 characters in 1 minute, your net wpm typing speed would 
        //be (200 characters / 5) / 1 min = 40 WPM. 
        //If you typed 200 characters in 30 seconds your net speed would be (200/5) / 0.5 = 80 WPM.
        
        System.out.println("  ");
        long results =  ((long) ((totalWords / 5) * 60)/(long) (timeTaken)); 
        //Formula might be wrong, We have to tweak to our requirements
        //But this is just a basic formula onto which we can tweak or play around
        double timeTakenPara = (userEnd - userStart)/1000.0;
        System.out.println("Time taken to type this para is " + timeTakenPara);
        
        System.out.println("Your Words Per minute: " + results);
        TimeUnit.SECONDS.sleep(3);
        long resultsPara =  ((long) ((1000 / 5) * 60)/(long) (timeTaken));

        System.out.println("Characters Per Minute: " + resultsPara);
       //let us give them a bit more complex paragraph on which they will be judged
        TimeUnit.SECONDS.sleep(3);
        System.out.println(" ");

        System.out.println("Congragulations on completing your first test");
        TimeUnit.SECONDS.sleep(3);
        
        System.out.println("Let us go through a bit more complex paragraph this time");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("  ");
        
        System.out.println("Same rules, this time type the given paragraph based on which your accuracy will be determined");
        TimeUnit.SECONDS.sleep(5);
        
        System.out.println("You will be given 1 minute to read and analyse the paragraph");
        System.out.println(" ");
        System.out.println("Here is your paragraph");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" ");
        System.out.println("Ready?");
        TimeUnit.SECONDS.sleep(3);

        String para1 = "The animal I like most is the dog. The dog is a pet animal. It is a four-footed animal. It has two bright eyes. It has two ears, sharp teeth and a small tail. Dogs are of many kinds. Some dogs have fur on their bodies. The dogs are of different colours. They are of different sizes. The dog is a very useful and a faithful animal. The dog can swim in the water. It is found everywhere in the world. It loves its master very much. It guards the house from thieves with care. The policemen use dogs in tracing out thieves and criminals. ";
        System.out.println(para1);

        System.out.println("  ");
        TimeUnit.SECONDS.sleep(30);

        Scanner in = new Scanner(System.in); 
        System.out.println(" "); 

        long userStartPara;
        userStartPara = (long) System.currentTimeMillis(); 
        
        System.out.println("Your time begins in");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Start Typing here: ");  
        String str1 = in.nextLine();     

        long userEndPara;
        userEndPara = (long) System.currentTimeMillis();

        System.out.println("  ");
        double timeTakenPara1 = (userEndPara - userStartPara)/1000.0;
        System.out.println("Time taken to type this para is " + timeTakenPara1 + "Seconds");
        
        System.out.println("Your Words Per minute: " + results);
        TimeUnit.SECONDS.sleep(3);
        long resultsPara1 =  ((long) ((100 / 5) * 60)/(long) (timeTakenPara1));

        System.out.println("Total words in the paragrap are 100 words ");
        
        long resultsPara11 =  ((long) ((100 / 5) * 60)/(long) (timeTakenPara1));

        System.out.println("Characters Per Minute: " + resultsPara11);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Congragulations on completing this test");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" ");
        System.out.println("Let us determine your accuracy now");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("There are 'TITAN', 'GRANDMASTER', and the 'AMATURE' leagues");
        TimeUnit.SECONDS.sleep(1);
        
        if (timeTakenPara > 60) {
            System.out.println("Your accuracy is less than 40%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Keep trying and you will be better each time");
        } else if (timeTakenPara > 40) {
            System.out.println("You accuracy rate is 75%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Keep trying and you will be better");
        } else {
            System.out.println("You accuracy level is 100%");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("You can be still better each time you practise");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Congragulations");
        }



        if (timeTakenPara > 60) {
            System.out.println("OH! You are in the AMATURE league. It's every TITAN was once a amature");
        } else if (timeTakenPara > 40) {
            System.out.println("CONGRAGULATIONS! You are in the GRANDMASTER league. You could be better through practice");
        } else {
            System.out.println("CONGRAGULATIONS! You are in the TITAN league, there is no one better than you");
        }

        if (timeTakenPara > 60) {
            System.out.println("You are just a beginer. It always starts with something small. Now you know where you stand. Begin practising and typing out more and more things.");
            System.out.println("  ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("You will get better each and every time you try.");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("We will assit you in giving a few tips on how to type and some practise sessions");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Keep playing this game and you will surely be a TITAN in no time");
        } else if (timeTakenPara > 40) {
            System.out.println("You are better than before. Although the TITAN league isn't that far keep trying and you will surely reach TITAN in no time");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Keep going");
        } else {
            System.out.println("You are the master at this game. Congragulations. Although don't stop practising becuase you are in the TITAN league. There is nothing as perfect, keep practising");
        }
    }   
}