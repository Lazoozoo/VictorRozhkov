package net.site.trn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

//Create variables containing a set of characters from which the fields of Egar objects will be generated

    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    final String numbers = "0987654321";

//Method that generates fields of an Egar object

    public Egar generate() {

        return new Egar(
                getRandomString(alphabet, 2),
                getRandomString(numbers, 2),
                getRandomInt(1,3));
    }

//Methods for random filling fields

    private int getRandomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private String getRandomString(String characters, int length) {
        Random rnd = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rnd.nextInt(characters.length()));
        }
        return new String(text);
    }

    public List<Egar> generateCollection(int size) {
        ArrayList<Egar> egars = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            egars.add(generate());
        }
        return egars;
    }
}
