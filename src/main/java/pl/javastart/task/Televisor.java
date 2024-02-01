package pl.javastart.task;

public class Televisor {

    private boolean isTvOn; // domyślnie false

    void turnOn() {
        this.isTvOn = true;
    }

    void turnOff() {
        this.isTvOn = false;
    }

    void showStatus() {
        System.out.print("Telewizor jest ");
        if (this.isTvOn) {
            System.out.println("włączony.");
        } else {
            System.out.println("wyłączony.");
        }
    }
}
