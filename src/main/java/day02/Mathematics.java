package day02;

public class Mathematics {

    public boolean isPrime(int number) {
        Boolean b = true;
         for (int i = 1; i<number; i++)
             if (number%i == 0) {
                 b=false;
             }
        return b;

    }

    public static void main(String[] args) {

        Mathematics maths = new Mathematics();
        System.out.println(maths.isPrime(10));
    }
}
