import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String otvet = AGE(generateRandomAge(), 0)
                + AGE(generateRandomAge(), 15)
                + AGE(generateRandomAge(), 20)
                + AGE(generateRandomAge(), 40)
                + AGE(generateRandomAge(), 1);

        System.out.println(otvet);

        System.out.println(generateRandomAge());

    }

    public static String AGE(int age, int temperature) {

        if ((age > 20 && age <= 45) && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else
            System.out.println("Оставайся дома");

        return null;
    }

    public static int generateRandomAge() {


        int a = 1;
        int b = 100;

        int age = a + (int) (Math.random() * b);
        return age;
    }
}