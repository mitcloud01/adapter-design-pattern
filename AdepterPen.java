package Adepter;

import a.PilotPen;

public class AdepterPen implements Pen {
    PilotPen Pen = new PilotPen();

    public void write(String str) {
        ParthPen.marks(str);
    }
}
