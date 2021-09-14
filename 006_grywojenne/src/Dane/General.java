package Dane;

import java.io.Serializable;
import java.util.ArrayList;

public class General implements Serializable {

    private String name;
    private ArrayList<Zolnierz> armia = new ArrayList<>();
    private int worekZMonetami;

    public General(String name, int worekZMonetami) {
        this.name = name;
        this.worekZMonetami = worekZMonetami;
    }

    public int silaArmi(){
        int sila = 0;
        for (Zolnierz zolnierz : armia) {
            sila += zolnierz.getSilaAtaku();
        }
        return sila;
    }

    public ArrayList<Zolnierz> getArmia() {
        return armia;
    }

    public void setArmia(ArrayList<Zolnierz> armia) {
        this.armia = armia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorekZMonetami() {
        return worekZMonetami;
    }

    public void setWorekZMonetami(int worekZMonetami) {
        this.worekZMonetami = worekZMonetami;
    }

    @Override
    public String toString() {
        return "General: " + name + " " +
                ", armia: " + armia +
                ", moenty:" + worekZMonetami;
    }
}
