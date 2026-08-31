// July 27, 2025

public class Code34 {
    public static void main(String[] args) {

        // Varargs = accepts a variable number of arguments
        // make methods flexible, Java packs arguments into arrays

        System.out.println(add(1, 2, 3, 4)); // 3 arguments
        System.out.println(average(1, 2, 3, 4));
    }

    // Method with varargs
    static int add(int...numbers){

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Another example
    static double average(double...numbers2){
        double sum = 0;

        if (numbers2.length == 0) {
            return 0; // Avoid division by zero
        }

        for (double number : numbers2) {
            sum += number;
        }
        return sum / numbers2.length;
    }
}