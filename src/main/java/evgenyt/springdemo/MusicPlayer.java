package evgenyt.springdemo;

import org.springframework.stereotype.Component;

/**
 * Simple player
 */

@Component
class MusicPlayer {
    public void play(Music music) {
        System.out.println("Playing " + music.getName());
    }
}
