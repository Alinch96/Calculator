import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Enter two numbers for operation");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();
        boolean b = true;


        //       Програма не відпрацює поки користувач не введе один із зазначених операторів, який буде знов
//        перевірений перемикачем switch-case на наступній ітерації циклу while. У випадку, якщо він
//        співпаде з одним із постійних значень оператора case, умова циклу while зміниться на false і
//        робота циклу припиниться. У випадку ж якщо користувач не ввів жодний із зазначених операторів,
//        робота циклу піде на новий виток. И не только


        while (b) {
            System.out.print("\nEnter one of them (+; -; *; /; %)");
            String opeand = scanner.next();
            switch (opeand) {
                case "+":
                    System.out.println("\n" + number1 + " + " + number2 + "= " + (number1 + number2));
                    break;
                case "-":
                    System.out.println("\n" + number1 + " - " + number2 + "= " + (number1 - number2));
                    break;
                case "*":
                    System.out.println("\n" + number1 + " * " + number2 + "= " + (number1 * number2));
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("\nError");
                    }
                    System.out.println("\n" + number1 + " / " + number2 + "= " + (float)(number1 / number2));
                    break;
                case "leave":
                    b = false;
                    break;
                default:
                    System.out.print("\nOperation isn't initial. Try more");
                    break;
            }
        }
        System.out.println("Good night");
    }
}
