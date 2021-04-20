package ca.bcit.main.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalNotes {

    public static void main(String[] args) {

        // Optional is a class thatencapsulates an optional value
        // Optional is a single-value container that either contains a value
        // or doesn't (it is then said to be 'empty')

    }
}

// EXAMPLE GIVEN
// Below a class is defined as Computer
// what is there is no SoundCard for the object?
// what if the sound card does not have a USB object
// SEE BELOW FOR A BETTER SOLUTION TO THE COMPUTER CLASS
class Computer {

    SoundCard soundCard;

    public void NoSoundCardExample() {

        String version = "UNKNOWN";
        Computer computer = new Computer();

        // SOLUTION for checking for non-existent objects

        if (computer != null) {
            SoundCard soundcard = computer.getSoundCard();
            if (soundcard != null) {
                SoundCard.USB usb = soundcard.getUsb();
                if (usb != null) {
                    usb.getVersion();
                }
            }
        }
    }

    public void NoSoundCardExampleOptional() {

        // creating an empty optional
        Optional<SoundCard> sce = Optional.empty();

        // creating a non-empty optional
        SoundCard soundcard = new SoundCard();
        Optional<SoundCard> scne = Optional.of(soundcard);

        // do something if a value is present
        scne.ifPresent(System.out::println);

        // DEFAULT VALUES AND ACTIONS ==============
//        Using an Optional object, you can rewrite this code by using the
//        orElse() method, which provides a default value if
//        Optional is empty

        SoundCard sound = sce.orElseThrow(IllegalStateException::new);



    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    // ==================================

    class SoundCard {

        USB usb;

        public USB getUsb() {
            return usb;
        }

        // ==============================

        class USB {

            String version;

            public String getVersion() {
                return version;
            }
        }
    }
}
