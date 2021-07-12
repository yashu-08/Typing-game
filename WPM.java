import java.util.concurrent.TimeUnit;
import java.io.Console;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WPM {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*****************************************");
        System.out.println("               HELLO YOU!                 ");
        System.out.println("*****************************************");
        TimeUnit.SECONDS.sleep(5);  
        System.out.println("Let us beging your typing speed caluclator test");
        
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
        System.out.println("Your Words Per seconds: " + results);
        TimeUnit.SECONDS.sleep(3);

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
        TimeUnit.SECONDS.sleep(50);

        Scanner in = new Scanner(System.in); 
        System.out.println(" "); 

        long userStartPara;
        userStartPara = (long) System.currentTimeMillis(); 
        
        System.out.println("Your time begins in");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Start Typing here: ");  
        String str1 = in.nextLine();     

        long userEndPara;
        userEndPara = (long) System.currentTimeMillis();

        System.out.println("  ");
        double timeTakenPara = (userEndPara - userStartPara)/1000.0;
        System.out.println("Time taken to type this para is " + timeTakenPara);

        System.out.println("Total words in the paragrap are 100 words ");
        
        long resultsPara =  ((long) ((100 / 5) * 60)/(long) (timeTakenPara));

        System.out.println("Characters Per Minute: " + resultsPara);
    }   
}

