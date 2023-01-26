import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main{
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---Chris Music Player---");
		System.out.println("|||List of Songs|||");
		System.out.println();
		System.out.println("|1.Right Now by Akon");
		System.out.println();
		System.out.println("|2.Moral of the Story by Ashe");
		System.out.println();
		System.out.println("|3.Perfect by Ed sheeran");
		System.out.println();
		System.out.println("|4.Mockingbird by Eminem");
		System.out.println();
		System.out.println("|5.Into Your Arms by Witt Lowry");
		System.out.println();
		System.out.println("|6.Like My Father by Jax");
		System.out.println();
		System.out.println("|7.Let Me Down Slowly by Alec Benjamin");
		System.out.println();
		System.out.println("|8.One Kiss by Dua lip");
		System.out.println();
		System.out.println("|9.Starboy by Weekend");
		System.out.println();
		System.out.println("|10.Until I Found You by Stephen Sanchez");
		System.out.println();
		
		System.out.println("^^^Click The Song^^^");
		int ch = scanner.nextInt();
		if (ch == 1) {
			Song1 song1 = new Song1();
		}
		else if (ch == 2) {
			Song2 song2 = new Song2();
		}
		else if (ch == 3) {
			Song3 song3 = new Song3();
		}
		else if (ch == 4) {
			Song4 song4 = new Song4();
		}
		else if (ch == 5) {
			Song5 song5 = new Song5();
		}
		else if (ch == 6) {
			Song6 song6 = new Song6();
		}
		else if (ch == 7) {
			Song7 song7 = new Song7();
		}
		else if (ch == 8) {
			Song8 song8 = new Song8();
		}
		else if (ch == 9) {
			Song9 song9 = new Song9();
		}
		else if (ch == 10) {
			Song10 song10 = new Song10();
		}
		else {
			System.out.println("The song is not available");
		}
		
		}
	}
