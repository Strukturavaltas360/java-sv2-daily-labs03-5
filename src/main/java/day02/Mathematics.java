package day02;

public class Mathematics {

    public boolean isPrime(int number) {

        if (number<2) return false;
         for (int i = 2; i<=number/2; i++)
             if (number%i == 0)  {
                 return false;
             }
        return true;
    }

    public static void main(String[] args) {
        int a = 230;
        Mathematics maths = new Mathematics();
        System.out.println("Prím szám a "+ a+"? "+ maths.isPrime(a));
    }
}
