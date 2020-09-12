package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
//		boolean isWeekend;
//		// Write code to ask the user what day it is.
//        String answer = JOptionPane.showInputDialog(null, "What day is it?");
//		// Set the boolean isWeekend based on the value they enter
//        
//        if(answer.equalsIgnoreCase("Sunday")) {
//        	isWeekend = true;
//        JOptionPane.showMessageDialog(null, "Go to bed or play video games for the rest of the day.");
//        }
//		
//		if(answer.equalsIgnoreCase("Saturday")) {
//			isWeekend = true;
//			JOptionPane.showMessageDialog(null, "Go to bed or play video games for the rest of the day.");
//		}
//
//		else {
//			isWeekend = false;
//			JOptionPane.showMessageDialog(null, "GET OUT OF BED RIGHT NOW, AND GO STRAIGHT TO SCHOOL!");
//		}
//		// If it is the weekend, tell the user they get to sleep in.
//		
//		// If it is not the weekend, tell them to get out of bed and go to school!
//		
//		// comment the code above - highlight it and comment it
		/************************   STAR STUDENT  **************************/
//
//		boolean passedExam;
//		// Write code to ask the user what percentage they scored in their last exam
//		String percent = JOptionPane.showInputDialog(null, "What percentage did you get in your last exam?");
//		int lol = Integer.parseInt(percent);
//// If they scored more than 70, they passed the exam.
//		if(lol>=70){
//		passedExam = true;
//		JOptionPane.showMessageDialog(null,"You passed! Nice job!");
//		}
//		// Set the boolean passedExam based on their score.
//		if(lol<=70) {
//			passedExam= false;
//			JOptionPane.showMessageDialog(null, "Well... I hope you have good luck next time!");
//		}
//		
//		
//// I see		
//		// If the user passed the exam, congratulate them
//		
//		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/
//
//		boolean gameIsOver = false;
//		// This code will repeat until gameIsOver is changed to true
//		while (!gameIsOver) {
//			// Ask the user if the game is over. 
//			String gameOver = JOptionPane.showInputDialog("is game over");
//			if (gameOver.equalsIgnoreCase("yes"))
//				gameIsOver = true;
//			
//			// If they answer "yes", change gameIsOver to true
//
//		}
//		// Tell the user "game is over" 
//		JOptionPane.showMessageDialog(null,"The game is over!");
//		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog(null, "What color do you want to draw with?");
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
