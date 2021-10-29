package day04;

public class Sultan {

    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.openFreeCells();

        for (int i = 0; i < 100; i++) {
            System.out.print((prison.getCells()[i] == true) ? i + 1 + " " : "");
        }
    }
}
