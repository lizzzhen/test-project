import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.println("Введи число");
        number = console.nextInt();

        for (int i = 1; i <10; i++) {
            System.out.print(number * i + ", ");
        }
        System.out.print(number * 10 + ".");
        System.out.println();
        for (int i = 1; i <=number; i++) {
            for (int k =1; k <=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}