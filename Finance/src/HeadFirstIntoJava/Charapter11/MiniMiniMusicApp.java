package HeadFirstIntoJava.Charapter11; /**
 * Created by axotn_000 on 4/9/2016.
 */

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1 ,102,0);
            MidiEvent firstNote = new MidiEvent(first, 1);
            track.add(firstNote);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 56, 99);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

            Thread.sleep(1000);
            player.close();
            System.exit(0);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
