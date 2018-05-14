package f2.spw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ShowScore{
	private long score;
	public ShowScore(long score){
		this.score = score;
		JOptionPane.showMessageDialog(null,  "Score : " + score, "Game Over", JOptionPane.ERROR_MESSAGE);
	}
	
 }