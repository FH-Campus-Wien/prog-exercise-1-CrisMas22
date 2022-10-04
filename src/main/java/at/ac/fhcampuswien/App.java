package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
    System.out.println("Hello World!");

    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
    System.out.println("0123456789012345678901");
    System.out.println("         __");
    System.out.println(" _(\\    |@@|");
    System.out.println("(__/\\__ \\--/ __");
    System.out.println("   \\___|----|  |   __");
    System.out.println("       \\ }{ /\\ )_ / _\\");
    System.out.println("       /\\__/\\ \\__O (__");
    System.out.println("      (--/\\--)    \\__/");
    System.out.println("      _)(  )(_");
    System.out.println("     `---''---`");


    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
    char uno = 'Z';
    int dos = 0xface;
    int tres = 012;
    long cuatro = 80L;
    float cinco = 44e-1f;
    int five = (int)cinco; //44
    float seis = 5.5f;
    int six = (int)seis; //5
    double siete = 8.88e1;
    int seven = (int)siete; //8
    double ocho = 99.9;
    int eight = (int)ocho; //99
    System.out.println(uno+dos+tres+cuatro+five+six+seven+eight);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner (System.in);

        int one = 0;
        int two = 0;
        one = scanner.nextInt();
        two = scanner.nextInt();
        scanner.close();
        System.out.println(one+two);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        int one = 0;
        int two = 0;
        one = scanner.nextInt();
        two = scanner.nextInt();
        scanner.close();
        System.out.println("x: " +"y: "+"After Swap:");
        System.out.println("x: " + two);
        System.out.println("y: " + one);




    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        if (n1>n2) {
            System.out.println("n1: " + "n2:" + " n1 > n2");
        } else if (n2>n1) {
            System.out.println("n1: " + "n2:" + " n2 > n1");
        } else {
            System.out.println("n1: " + "n2:" + " n1 == n2");
        }
            scanner.close();







    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here

            Scanner scanner = new Scanner(System.in);
            int revenue = 0;
            revenue = scanner.nextInt();
            if (revenue < 0 || revenue >= 100000) {
                System.out.println("Enter annual Revenue: " + "Invalid Revenue");
            }
            else if (0 <= revenue && revenue < 20000) {
                System.out.println("Enter annual Revenue: " + "Poor Sales Revenue");}
            else if (20000 <= revenue && revenue < 50000){
                System.out.println("Enter annual Revenue: " + "Average Sales Revenue");
            } else if (50000 <= revenue && revenue < 80000) {
                System.out.println("Enter annual Revenue: " + "Good Sales Revenue");
                } else if (80000 <= revenue && revenue < 100000) {
                System.out.println("Enter annual Revenue: " + "Excellent Sales Revenue");
            } scanner.close();


    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        int commission;
        commission = scanner.nextInt();

        switch (commission){
            case 1:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Enter CommissionClass: " + "Your Commission Rate was set to 0.0");
                break;

                }
        scanner.close();

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
        if (year % 400 == 0){
            System.out.println("Year: " + "Leapyear");
        }
        else if ((year % 100 != 0) && (year % 4 == 0)){
            System.out.println("Year: " + "Leapyear" );
        }
        else {
            System.out.println("Year: " + "Not a Leapyear");
        }
        }


    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int result = number % 10;
            reversed = reversed * 10 + result;
            number /= 10;
        }

        System.out.println("Number: " + reversed);
        scanner.close();

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}