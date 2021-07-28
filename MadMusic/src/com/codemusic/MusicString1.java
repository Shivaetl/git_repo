package com.codemusic;

import org.jfugue.player.Player;

public class MusicString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
	    player.play(
	        // "Itsy, bitsy spider, climbed up the water spout."
	        "F5q F5i F5q G5i A5q. A5q A5i G5q F5i G5q A5i F5q. Rq. " +
	            // "Down came the rain and washed the spider out."
	            "A5q. A5q Bb5i C6q. C6q. Bb5q A5i Bb5q C6i A5q. Rq. " +
	            // "Out came the sun and dried up all the rain, so the"
	            "F5q. F5q G5i A5q. A5q. G5q F5i G5q A5i F5q. C5q C5i " +
	            // "itsy, bitsy spider went up the spout again."
	            "F5q F5i F5q G5i A5q. A5q A5i G5q F5i G5q A5i F5q. Rq."
	    );

	}

}
