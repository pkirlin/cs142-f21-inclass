package bandinabox;

import java.util.ArrayList;

public class Bass extends Instrument {
    public Bass() {
        setName("Bass");
    }

    @Override
    public ArrayList<Note> play(ArrayList<Note> song) {
        ArrayList<Note> basspart = new ArrayList<Note>();
        for (int i = 0; i < song.size(); i++)
        {
            if (i % 4 == 0) {
                //basspart.add(song.get(i));
                Note n = song.get(i);
                Note bassNote = new Note(n.getPitch(), n.getOctave()-1);
                basspart.add(bassNote);
            }
            else {
                basspart.add(null);
            }
        }
        return basspart;
    }
}
