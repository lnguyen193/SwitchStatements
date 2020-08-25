import java.util.Scanner;

public class TestingSwitch {

public static void main(String[] args) {
    /*Syntax for switch statement/:

    if () {
        blocks of code
        }

        switch( <expression> ){
            case <value2>
                block of code;
                break;
            default:
                block of code;
                break;

        }
     */
    int day = 7; // 0 = Sunday, 1 = Monday, 2 = Tuesday;
    switch (day){
        case 0:
            System.out.println("It is Sunday");
            System.out.println("It is the day before Sunday");
            System.out.println("It is the day after Sunday");
            break;
        case 1:
            System.out.println("It is Monday");
           break;
        case 2:
            System.out.println("It is Tuesday");
            break;
        case 3:
            System.out.println("It is Wednesday");
            break;
        case 4:
            System.out.println("It is Thursday");
            break;
        case 5:
            System.out.println("It is Friday");
            break;
        case 6:
            System.out.println("It is Saturday");
            break;
        default:
            System.out.println("It is Sunday-Thursday");
            break;
    }
    //when you add the 'final' keyword before a variable declaration, it make it a CONSTANT.
    final String guessMyName = "Lynn";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please guess my name: ");

    String useGuess = scanner.nextLine();

    switch (useGuess){
        case "Sue":
            System.out.println("That's the other instructor!");
            break;
        case guessMyName:
            System.out.println("That is correct!");
            break;
    }
}
}