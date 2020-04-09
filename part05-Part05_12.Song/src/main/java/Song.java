
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        
        // objects in same position
        if (this == compared) {
            return true;
        }
        
        // different type not equal
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // typecast
        Song comparedSong = (Song) compared;
        
        // check attributes equal
        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
    
        
        return false;
    }
}
