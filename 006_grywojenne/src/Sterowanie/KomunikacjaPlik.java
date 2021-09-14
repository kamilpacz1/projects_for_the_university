package Sterowanie;

import Dane.General;

import java.io.*;

public interface KomunikacjaPlik {

    static void zapisDoPliku(General general, String nazwaPliku){

        try(
                var fs = new FileOutputStream(nazwaPliku);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(general);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static General odczytZPliku(String nazwaPliku){

        General g1 = null;

        try (
                var fis = new FileInputStream(nazwaPliku);
                var ois = new ObjectInputStream(fis);
        ) {
            g1 = (General) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return g1;
    }

}
