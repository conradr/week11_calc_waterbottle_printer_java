public class Printer {
    private int paperLeft;

    public Printer(int paperLeft) {
        this.paperLeft = paperLeft;

    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void print(int pages, int copies) {
        int paperUsed;
        paperUsed = pages * copies;
        this.paperLeft = this.paperLeft - paperUsed;

    }


}
