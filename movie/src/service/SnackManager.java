package service;

import model.Snack;

import java.util.ArrayList;

public class SnackManager {
    private ArrayList<Snack> snacks;

    public SnackManager(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }

    public Snack getSnack(String name) {
        Snack movie = null;
        for (Snack item : this.snacks) {
            if (item.getName().equals(name)) {
                movie = item;
            }
        }
        return movie;
    }

}
