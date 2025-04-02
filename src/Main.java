import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Первая задача:
        // Пока меньше 100 считает сумму, после выводит сумму всех введенных чисел меньше 100
        /*
        int number=0;
        int sum=0;
        while (true) {
            System.out.println("Введи число");
            number = console.nextInt();
            if (number>100){
            break;
            }
            sum+=number;
        }
        System.out.print(sum);
         */
        // Вторая задача:
        // Запрашивает у пользователя числа и ищет максимум из них, программа завершается, когда пользователь введет "стоп".
        /*
        int number;
        int max=Integer.MIN_VALUE; // приравниваем макс к самому возможному мин числу в инт
        String vvod;
        while (true){
            System.out.println("Введи число или 'stop' для завершения программы");
            vvod = console.next();
            if (vvod.equalsIgnoreCase("stop")) { // сравнение строки(без разницы на регистр) с нужным значением
                break;
            }
            try { // проверка на ввод пользака
                number = Integer.parseInt(vvod); // перевод из текста в число
                if (number>max) {
                    max=number;
                }
            } catch (NumberFormatException e) { //выходит текст ниже если пользак ввел что-то не то
                System.out.println("Ошибка! Введи заново число или 'stop' для завершения программы");
            }
        }
        if (max != Integer.MIN_VALUE){
            System.out.print("Максимальное число:" + max);
        } else {
            System.out.print("Чисел не было введено");
        }
        */
        // Третья задача:
        // Вычисляет факториал числа, введенного пользователем
        /*int number;
        int i=1;
        int fact=1;
        System.out.println("Введи число");
        number = console.nextInt();
        while (true){
            if (number<0){
                System.out.println("Факториал можно вычислить только у положительного числа!");
                break;
            }
            if (number == 0 || number == 1){
                System.out.print("Факториал числа " + number + " = " + fact);
                break;
            }
            if (i<=number){
                fact=i*fact;
                i++;
            } else {
                System.out.print("Факториал числа " + number + " = " + fact);
                break;
            }
        }
        */
        String str;
        char check;
        int count=0;
        int i=0;
        int dlina;
        System.out.println("Введи строку");
        str = console.nextLine();
        dlina = str.length();
        while (i<dlina){
            check = str.charAt(i);
            if (check == ' '){
                count++;
            }
            i++;
        }
        System.out.print("В вашей строке " + count + " пробелов.");
    }
}