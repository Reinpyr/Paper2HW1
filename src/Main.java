public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 12;
        int result;

        result = a;
        if (b > result)
        {
            result = b;
        }
        if (c > result)
        {
            result = c;
        }
        System.out.println(result);
    }
}

//The program solves the problem of not knowing which of the integers a, b and c is the largest by making it the result
//The truth table proves that the program solves the problem