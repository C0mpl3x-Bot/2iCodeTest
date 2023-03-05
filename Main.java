import java.util.*;

public class Main {
    //task
    //“In a language of your choice, using all best practice principles you’re aware of, could you please provide code that reads a list of 10 numbers ranging between 1 to 100.
    //Assuming there are 4 duplicates in the list of numbers, the output should remove the duplicates and sort the remaining numbers in descending order. Please state any assumptions you’ve made.

    public static void main(String[] args) {
        System.out.println(Answer());
    }

    public static List<Integer> Answer(){
        //initialise arraylist called nums
        List<Integer> num = new ArrayList<>();
        //initialise scanner class with name scanner
        Scanner scanner = new Scanner(System.in);
        //0-9 is 10 digits
        //amount of numbers entered by user is going to be stored in i;
        int i = 0;
        //while the user has not entered 10 digits the while loop would be true once user enters 9 digits while loop is false and arraylist contains the 10 digits.
        while(num.size()<10){
            System.out.println("Please Enter Number For Index " + i + ": ");
            //if user entered a digit execute code in if block
            if(scanner.hasNextInt() == true){
                //allows user to enter the number of their choice and then stores it into the variable enteredNum
                int enteredNum = scanner.nextInt();
                //check if the number the user entered is between 1 and 100 if it is less than 1 or greater than 100 give user an error message
                if(enteredNum <1 || enteredNum >100){
                    System.out.println("Please enter a number between 1 and 100");
                }
                //if the number the user entered is between 1 and 100 then proceed to execute the code in else
                else{
                    //add the number the user wants into the arraylist with any dups the user has inputted
                    num.add(enteredNum);
                }
                //increment i as it stores number of digits user entered
                i++;
            }
            //if user did not enter a digit execute code in else block
            else{
                //output error message since user did not input a digit
                System.out.println("Invalid input. Please enter a number between 1 and 100");
                //allows user to enter a new input
                scanner.next();
            }
        }

        //using a hashset we can remove the duplicates in arraylist.
        //hashset is populated with the values from arraylist num
        HashSet<Integer> removeDups = new HashSet<>(num);
        //then make a new arraylist which would contain all the values from the hashset and the values are in ascending order
        List<Integer> arrListWithNoDups = new ArrayList<>(removeDups);
        //finally using collections.sort reverse the order of the arraylist which is the gives us the reuslt we wanted.
        Collections.sort(arrListWithNoDups, Collections.reverseOrder());

        //return the final result to the console
        return arrListWithNoDups;
        
    }
}
