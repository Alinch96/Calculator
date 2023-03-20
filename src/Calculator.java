import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int operand1= 128, operand2= 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n"+operand1+"__"+operand2);
        System.out.print("\nВведіть один із зазначених операторів (+; -; *; /; %): ");

        String sign= scanner.next();

        boolean b =true;
        //
        //       Програма не відпрацює поки користувач не введе один із зазначених операторів, який буде знов
//        перевірений перемикачем switch-case на наступній ітерації циклу while. У випадку, якщо він
//        співпаде з одним із постійних значень оператора case, умова циклу while зміниться на false і
//        робота циклу припиниться. У випадку ж якщо користувач не ввів жодний із зазначених операторів,
//        робота циклу піде на новий виток.

        while (b) {

            switch (sign) {
                case ("+"):
                    System.out.println("\n"+operand1 + " + " + operand2 + "= " + (operand1 + operand2));
                    b=false;
                    break;
                case ("-"):
                    System.out.println("\n"+operand1 + " - " + operand2 + "= " + (operand1 - operand2));
                    b=false;
                    break;
                case ("*"):
                    System.out.println("\n"+operand1 + " * " + operand2 + "= " + (operand1 * operand2));
                    b=false;
                    break;
                case ("/"):
                    if(operand2 ==0){
                        System.out.println("\nПомилка! \nСпроба ділення на 0");
                    }
                    b=false;
                    break;
                case ("%"):
                    if(operand2 ==0){
                        System.out.println("\nПомилка! \nСпроба ділення на 0");
                    }
                    b=false;
                    break;
                default:
                    System.out.print("\nВаш оператор не відповідає жодному вищезазначеному," +
                            "\nповторіть,будь ласка, спробу: ");
                    sign = scanner.next();
                    break;
            }
        }
    }
}
