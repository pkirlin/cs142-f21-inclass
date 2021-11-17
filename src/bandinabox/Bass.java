package bandinabox;

import java.util.ArrayList;

public class Bass extends Instrument {

    public Bass() {
        setName("Bass");
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        ArrayList<Note> basspart = new ArrayList<Note>();
        for (int i = 0; i < song.size(); i+=4) {
            //basspart.add(song.get(i));
            Note guitarNote = song.get(i);
            Note bassNote = new Note(guitarNote.getPitch(), guitarNote.getOctave()-1);
            basspart.add(bassNote);
            basspart.add(null);
            basspart.add(null);
            basspart.add(null);
        }
        return basspart;
    }
}
