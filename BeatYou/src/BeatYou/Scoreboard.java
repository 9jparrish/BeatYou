package BeatYou;

import javax.swing.*;

public class Scoreboard {
	private JLabel JPScorelabel;
	private JLabel JakeScorelabel;
	private int JPScore = 0;
	private int JakeScore = 0;
	private String JPScoreString = "0";
	private String JakeScoreString = "0";
	
public Scoreboard() {
	
}


public void addtoJP() {
	JPScore++;
	JPScoreString = Integer.toString(JPScore);
}

public void addtoJake() {
	JakeScore++;
	JakeScoreString = Integer.toString(JakeScore);
}

public String getJPScore() {
	return JPScoreString;
}

public String getJakeScore() {
	return JakeScoreString;
}
}