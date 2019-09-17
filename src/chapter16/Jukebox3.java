package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    class ArtistCompare implements Comparator<Song> {

        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    class RatingCompare implements Comparator<Song> {

        @Override
        public int compare(Song one, Song two) {
            return one.getRating().compareTo(two.getRating());
        }
    }

    private void go() {
        getSongs();
        System.out.println("Before sort - " + songList);
        Collections.sort(songList);
        System.out.println("After sort - " + songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);

        System.out.println("Sort by Artist - " + songList);

        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(songList, ratingCompare);

        System.out.println("Sort by rating - " + songList);

    }

    void getSongs() {

        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
