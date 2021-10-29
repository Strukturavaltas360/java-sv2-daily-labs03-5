package day04;

public class Prison {

    public Boolean[] cells = new Boolean[100];

    public void openFreeCells() {

        for (int i = 0; i < 100; i++) {
            cells[i] = (Math.sqrt(i+1) % 1 == 0)? true:false;
        }
    }

    public Boolean[] getCells() {
        return cells;
    }
}

// Az ajtókon annyiszor történik nyitási/zárási művelet, ahány egész osztója van az adott (ajtó)számnak.
// Ha az osztók száma páros, akkor a 100. napon az ajtó zárva lesz, ha páratlan, akkor nyitva.
// Páratlan számú osztója akkor van az adott számnak, ha a négyzetgyöke egész szám, ezért az algoritmusban ezt vizsgálom meg.



