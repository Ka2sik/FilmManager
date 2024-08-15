package ru.netology.films;

public class FilmManager {
    private String[] films = new String[0];
    private int filmLimit;

    public FilmManager() {
        this.filmLimit = 5;
    }

    public FilmManager(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < filmLimit) {
            resultLength = films.length;
        } else {
            resultLength = filmLimit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
