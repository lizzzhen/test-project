public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for (int n = 2; n <= 100; n++) {
            int count = 0;
            if (n>3 && (n%2==0 || n%3==0)){
                count++;
            }
            for (int i = 2; i*i<=(n+1); i++){
                if (n%i==0){
                   count ++;
                }
            }
            if (count==0){
                System.out.println(n);
            }
    }
    }
}