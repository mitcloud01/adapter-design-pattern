package Adepter;

public class School {
    public static void main(String[] args) {
        Pen UsedPen = new AdepterPen();
        Assignment aw = new Assignment();
        aw.setMitPen(UsedPen);
        aw.writeAssignment("I don't know");
    }
}
