package playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    //nested class, as i dont access any fields and methods from objects only throughout its reference "object name"
    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if (findSong(song.getTitle())==null){
                songs.add(song);
                return true;
            }
            return false;

        }

        private Song findSong(String title){
            for (Song checkedSong:songs) {
                if (checkedSong.getTitle().equalsIgnoreCase(title))return checkedSong;
            }
            return null;
        }

        private Song findSong(int trackNumber){
            for (Song checkedSong:songs){
                if (songs.indexOf(checkedSong)==(trackNumber-1))return checkedSong;
            }
            return null;
        }


    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }


    public boolean addSong(String title, double duration){
            return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= songs.songs.size())){
            playList.add(songs.songs.get(index));
            return true;
        }
        System.out.println("This album does not have track "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        if (songs.findSong(title)==null){
            System.out.println("The song "+ title + " is not in the Album");
            return false;
        }
        ListIterator<Song> playListIterator = playList.listIterator();
        while(playListIterator.hasNext()){
            if (playListIterator.next().getTitle().compareTo(title) == 0){
                return true;
            }
        }
        playList.add(songs.findSong(title));
        return true;
    }

}