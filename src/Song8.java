import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;;

public class Song8 {
	Song8()throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		File file = new File("One-Kiss.wav");
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();	
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S = stop, R = reset, Q = quit");
			System.out.println();
			System.out.print("Enter your choice: ");
			System.out.println();
			
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"):
					System.out.println("Playing the song :)");
					System.out.println();

					clip.start();
					break;
					
				case ("S"): 
					System.out.println("The song has stopped :(");
					System.out.println();

					clip.stop();
					break;
					
				case ("R"):
					System.out.println("Reset the song*");
					System.out.println();
					clip.setMicrosecondPosition(0);
					break;
					
				case ("Q"):
					clip.close();
					System.out.println("|Back to list of Songs|");
					Main mainfun = new Main();
					mainfun.main(null);
					
				   //Main main = new Main();
					break;
				    
				default: System.out.println("Invalid choice");
			}
		}
	}
	

}
