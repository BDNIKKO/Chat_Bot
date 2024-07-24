import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser();
        System.out.println("");
        String name = askForName(scanner);
        System.out.println("");
        guessAge(scanner);
        System.out.println("");
        countToNumber(scanner);
        System.out.println("");
        testProgrammingKnowledge(scanner);
        System.out.println("");
        tellStory(name);
        System.out.println("");
        dayOfWeekPhrase(scanner);
        System.out.println("");

        scanner.close();
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome to the best ChatBot in the world!");
    }

    public static String askForName(Scanner scanner) {
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("");
        System.out.println("Pleasure to meet you, " + name + "!");
        return name;
    }

    public static void guessAge(Scanner scanner) {
        System.out.println("I can guess your age by asking a few questions.");
        System.out.println("");
        System.out.println("1. What year were you born?");
        int birthYear = scanner.nextInt();
        System.out.println("");
        System.out.println("2. What month were you born in? (Enter the number 1-12)");
        int birthMonth = scanner.nextInt();
        System.out.println("");

        int currentYear = 2024;
        int currentMonth = 7;

        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;
        if (ageMonths < 0) {
            ageYears--;
            ageMonths += 12;
        }

        System.out.println("Based on your answers, I guess you are " + ageYears + " years and " + ageMonths + " months old!");
    }
    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter a number and I will count to it:");
        int number = scanner.nextInt();
        System.out.println("");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);

        }
    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which data type is used to create a variable that should store text?");
        System.out.println("(Answer by entering the corresponding number!)");
        System.out.println("");
        System.out.println("1. String");
        System.out.println("2. int");
        System.out.println("3. boolean");
        System.out.println("4. char");

        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("Incorrect. Try again.");
            }
        } while (answer != 1);
        System.out.println("");
        System.out.println("Correct! The answer is String.");
    }

    public static void tellStory(String name) {
        System.out.println("There once was a person named " + name + " who loved tinkering with all things tech.");
        System.out.println(name + " spent their days solving problems and learning new things.");
        System.out.println("One day, " + name + " created the best ChatBot in the whole wide world...you're welcome.");
    }

    public static void dayOfWeekPhrase(Scanner scanner) {
        System.out.println("Enter a number (1-7) to hear what I think about that day of the week:");
        int day = scanner.nextInt();
        System.out.println("");
        switch (day) {
            case 1:
                System.out.println("Monday's are a little rough!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 2:
                System.out.println("Tuesdays are for training!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 3:
                System.out.println("Wednesdays are the hump day!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 4:
                System.out.println("Thursdays are date night!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 5:
                System.out.println("Fridays are the best day of the work week!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 6:
                System.out.println("Saturdays are for letting loose!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            case 7:
                System.out.println("Sundays are for relaxing!");
                System.out.println("");
                System.out.println("Goodbye!!!!");
                break;
            default:
                System.out.println("That's not a valid day");
                System.out.println("");
                System.out.println("Good bye!!!!");
                break;
        }
    }
}