public class Main {
    public static void main(String[] args) {
        String main;
        final int NUM = 8;
        String world = "world";
        main = "лююое слово";

        System.out.println(main + NUM + " " + " " + world);
        if (NUM < 0 ) {
            System.out.println("Вы сохронили отрицательное число");
        } if (NUM > 0){
            System.out.println("Вы сохронили положительное число");
        }else {
            System.out.println("Вы сохронили 0");
        }
    }
}