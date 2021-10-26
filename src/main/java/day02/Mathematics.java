package day02;

public class Mathematics {

    public boolean isPrime(int number) {
        Boolean b = true;
         for (int i = 3; i<number/2; i++)
             if (number%i == 0) {
                 b = false;
             }
        return b;
    }

    public static void main(String[] args) {
        int a = 13;
        Mathematics maths = new Mathematics();
        System.out.println("Prím szám a "+ a+"? "+ maths.isPrime(a));
    }
}
