package Adepter;

public class Assignment {
    private Pen MitPen;

    public void setMitPen(Pen mitPen) {
        this.MitPen = mitPen;
    }

    public Pen getMitPen() {
        return MitPen;
    }

    public void writeAssignment(String str) {
        System.out.println(str);
    }
}
