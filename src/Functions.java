/**
 * Created by andeski on 6/22/16.
 */
import java.util.Scanner;
public class Functions {


    public static void main(String[] args) {
        evenodd('w');
        matchingwords("Hello", "Hello");
        no_w_first_trial("Seawall");
        random_number();
        date_string_return(12, 04, 2014);
        date_string_return(28, 02, 800);
        date_string_return(31, 12, 204);
        date_string_return(12, 01, 14);
        date_string_return(30, 11, 2814);
        every_other_letter("Supercalifragilisticexpialidocious");
        number_larger_than_five(26);
        two_numbers(1,2);
        country();
        vowl_consonant();

    }

    /* Write a function that takes in a number and returns true if the number is even or false if the number is odd.
    You may use control flow and multiple conditionals.
     */

    public static double evenodd(double number) {


        if (((number % 2) == 0)) {
            System.out.println("The number is even.");
            return number;
        } else {
            System.out.println("The number is odd.");
            return number;
        }

    }

    /* Write a function that takes in a number and returns true if the number is even or false if the number is odd.
     You may use control flow and multiple conditionals.
      */

    public static String matchingwords(String word_a,String word_b) {
        if (word_a.equals(word_b)) {
            System.out.println(true);
            return "true";
        }
        else {
            System.out.println(false);
            return "false";
        }
    }

    /* Write a function that takes in a word and prints out its every letter on a new line before it
    sees the letter "w". If it encounters "w" the function should stop executing.
      */

    public static String no_w_first_trial(String word) {
        char[] deconstructed = word.toCharArray();
        for (char i = 0; i < deconstructed.length; i++) {
            if (deconstructed[i] == 'w') {
                System.out.printf("%n");
                System.out.print("You have hit W");
            } else {
                System.out.print(deconstructed[i]);
            }
        }
        return null;
    }

    /* Write a function that generates a random number. Print it out. If the number
     is greater that 50, return it, otherwise return -1.
      You may use control flow and multiple conditionals.
      */

    public static double random_number() {

        double random_num = Math.random() * 100;
        System.out.printf("%n");

        if(random_num > 50){
            System.out.println(((Math.round(random_num * 100)) / 100.0));
            return random_num;
        }
        else {
            System.out.println(-1);
            return -1;
        }
    }

    /* Write a function that takes in 3 integers: day, month, and year and computes day,
     month, and year of the next day.
     The function should return a string (e.g. day:12 month:11 year:1988)
      */

    public static int date_string_return(int day, int month, int year) {

        int day_next, month_next, year_next;
        int varname = month;
        switch(varname) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31 ) {
                    day_next = 1;
                    month_next = month + 1;
                    if (month == 12) {
                        year_next = year + 1;
                        month_next = 1;
                    }
                    else {
                        year_next = year;
                    }
                    System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
                }
                else {
                    day_next = day + 1;
                    month_next = month;
                    year_next = year;
                    System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
                }
                break;
            case 2: if (day == 28 && (( year % 400 == 0) || (( year % 100 != 0) && (year % 4 == 0)))) {
                day_next = 29;
                year_next = year;
                month_next = month;
                System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
            }
            else {
                day_next = 1;
                month_next = month + 1;
                year_next = year;
                System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
            }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day_next = 1;
                    month_next = month + 1;
                    year_next = year;
                    System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
                }
                else {
                    day_next = day + 1;
                    month_next = month;
                    year_next = year;
                    System.out.println("day: " + day_next + ", " + "month: " + month_next + ", " + "year: " + year_next);
                }

        }


        return 0;
    }

    /* Write a function that takes in a word, omits every other letter in that word and
    returns a new word. You can use control flow and multiple conditionals.
     */

    public static String every_other_letter(String word) {
        char[] split = word.toCharArray();
        for (int i = 0; i < split.length; i += 2) {
            System.out.print(split[i]);
        }
        return "done";
    }

    /* Write a function that takes in a number greater than 5 and prints out all
     the numbers from 1 to that number except number 4. Please use a while statement.
      */

    public static int number_larger_than_five(int number){
        if (number <= 5) {
            System.out.println("You need to choose something larger than 5");
            return 0;
        }
        else {
            System.out.printf("%n");
            for(int i = 0; i <= number; i ++) {
                if (i == 4) {
                    i = 5;
                }
                System.out.print(i + " ");
            }
        }
        return 0;
    }


    public static int two_numbers(int num_a, int num_b) {

        if (num_a == num_b) {
            num_a = num_a +2;
            num_b = num_b +2;
        }

        else {
            num_a = num_a + 1;
            num_b = num_b + 1;
        }
        return 0;
    }

    // Write a function that asks the user to enter a country domain.
    // If the user types in "us", the function prints out "United States",
    // if the user enters "de", the function prints out "Germany", if the
    // user types in "hu" the response should be "Hungary". In all other cases
    // the function should print out "Unknown". Please try to use a switch statement
    // and make sure the function works with a user's input of lower and upper case strings.

    public static String country() {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String varname = userInput.toLowerCase();
        String answer;
        switch(varname) {
            case "us": System.out.println("United States");
                break;
            case "de": System.out.println("Germany");
                break;
            case "hu": System.out.println("Hungry");
                break;
            default: System.out.println("United States");
                break;
        }
        return null;
    }

    public static char vowl_consonant() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String letter = userInput.toLowerCase();

        if ((letter == "a") || (letter == "e") || (letter == "i") || (letter == "o") || (letter == "u")) {
            System.out.println("The word is a vowl");
        }
        else if ((letter == "z") || (letter == "b") || (letter == "t") || (letter == "g") || (letter == "h")){
            System.out.println("The system is a consonant");
        }
        else {
            System.out.println("Neither are true");
        }
        return 0;

    }
}

