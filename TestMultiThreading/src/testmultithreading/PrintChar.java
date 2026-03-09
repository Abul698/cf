package testmultithreading;

public class PrintChar implements Runnable {

    private String charToPrint;
    private int times;

    public PrintChar() {
    }

    public PrintChar(String charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {

        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint + " ");
        }

    }

}
