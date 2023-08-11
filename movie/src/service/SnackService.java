package service;

import model.Movie;
import model.Snack;

import java.util.ArrayList;

public class SnackService {
    private ArrayList<Snack> snacks;

    public SnackService(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }

    public Snack getSnack(String type) {
        Snack movie = null;
        for (Snack item : this.snacks) {
            if (item.getType().equals(type)) {
                movie = item;
            }
        }
        return movie;
    }

}
