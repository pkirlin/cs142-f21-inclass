package bandinabox;

import java.util.ArrayList;

public class Guitar extends Instrument {

    public Guitar() {
        setName("Guitar");
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        return song;
    }
}
