package bandinabox;

import java.util.ArrayList;

/** A class to represent a musical Instrument. */
public abstract class Instrument {
    private String instrumentName;

    public void setName(String iName) {
        instrumentName = iName;
    }

    public String getName() {
        return instrumentName;
    }

    /** Return a list of notes that this instrument should
     * play in the song.  For the instrument to be silent
     * at a certain point, put a null in the list at that point.
     */
    public abstract ArrayList<Note> play(ArrayList<Note> song);
}
