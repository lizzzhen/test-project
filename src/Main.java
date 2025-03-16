import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number1;
        int number2;
        double kurs;
        int action;
        System.out.println("Что я могу: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Деление");
        System.out.println("4. Умножение");
        System.out.println("5. Вычислить остаток от деления");
        System.out.println("6. Вычислить четное число или нет");
        System.out.println("7. Перевести температуру из градусов в фаренгейты");
        System.out.println("8. Перевести температуру из фаренгейтов в градусы");
        System.out.println("9. Перевести рубли в доллары");
        System.out.println("10. Перевести доллары в рубли");
        System.out.println("11. Выход из программы");
        do {
            System.out.print("Введите ваш выбор: ");
            action = console.nextInt();
            switch (action){
                case 1:
                    System.out.println("Введи первое число: ");
                    number1 = console.nextInt();
                    System.out.println("Введи второе число: ");
                    number2 = console.nextInt();
                    int a= number1 + number2;
                    System.out.println("Первое число плюс второе число равно " + a);
                    break;
                case 2:
                    System.out.println("Введи первое число: ");
                    number1 = console.nextInt();
                    System.out.println("Введи второе число: ");
                    number2 = console.nextInt();
                    int b= number1 - number2;
                    System.out.println("Первое число минус второе число равно " + b);
                    break;
                case 3:
                    System.out.println("Введи первое число: ");
                    number1 = console.nextInt();
                    System.out.println("Введи второе число: ");
                    number2 = console.nextInt();
                    double c= (double) number1 / number2;
                    System.out.println("Первое число разделить на второе число равно " + c);
                    break;
                case 4:
                    System.out.println("Введи первое число: ");
                    number1 = console.nextInt();
                    System.out.println("Введи второе число: ");
                    number2 = console.nextInt();
                    int d= number1 * number2;
                    System.out.println("Первое число умножить на второе число равно " + d);
                    break;
                case 5:
                    System.out.println("Введи первое число: ");
                    number1 = console.nextInt();
                    System.out.println("Введи второе число: ");
                    number2 = console.nextInt();
                    int e= number1 % number2;
                    System.out.println("Остаток от деления первого числа на второе число равно " + e);
                    break;
                case 6:
                    System.out.println("Введи число, которое необходимо проверить: ");
                    number1 = console.nextInt();
                    int f= number1 % 2;
                    if (f == 0) {
                        System.out.println("Число четное.");
                    } else {
                        System.out.println("Число нечетное.");
                    }
                    break;
                case 7:
                    System.out.println("Введи температуру в градусах: ");
                    number1 = console.nextInt();
                    double g = number1 *9/5+32;
                    System.out.println("Твоя температура в фаренгейтах равна " + g);
                    break;
                case 8:
                    System.out.println("Введи температуру в фаренгейтах: ");
                    number1 = console.nextInt();
                    double h = 5/9*(number1-32);
                    System.out.println("Твоя температура в фаренгейтах равна " + h);
                    break;
                case 9:
                    System.out.println("Введи сумму в рублях: ");
                    number1 = console.nextInt();
                    System.out.println("Введи курс доллара к рублю, а именно сколько рублей в одном долларе(через запятую): ");
                    kurs = console.nextDouble();
                    double i = (double) number1 / kurs;
                    System.out.println("Твоя сумма в долларах: " + i);
                    break;
                case 10:
                    System.out.println("Введи сумму в долларах: ");
                    number1 = console.nextInt();
                    System.out.println("Введи курс доллара к рублю, а именно сколько рублей в одном долларе(через запятую): ");
                    kurs = console.nextDouble();
                    double j = (double) number1 * kurs;
                    System.out.println("Твоя сумма в рублях: " + j);
                    break;
                case 11:
                    System.out.println("Выход из программы... ");
                    return;
                default:
                    System.out.print("Неверное число! ");
            }
        } while (action != 11);
    }
}