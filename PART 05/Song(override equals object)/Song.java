
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;
    private Song song;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Person object
        Song comparedSong = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedSong.name)
                && this.artist == comparedSong.artist
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
