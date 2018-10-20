package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		ArrayList<String> jokes = new ArrayList<>();
		jokes.add("Q: What did the farmer use to make crop circles?\n" + 
				"\n" + 
				"A: A Protractor");
		jokes.add("Q: What did the DNA say to the other DNA?\n" + 
				"\n" + 
				"A: Do these genes make my butt look fat.");
		jokes.add("Q. What's a writing utensil's favorite place to go on vacation?\n" + 
				"\n" + 
				"A. Pencil-vania!\n");
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener((e)->{
			int x = 0;
			int y = 0;
			Scanner keyboard = new Scanner(System.in);
			String xVal = JOptionPane.showInputDialog("Enter a number.");
			x = Integer.parseInt(xVal);
			String yVal = JOptionPane.showInputDialog("Enter another number.");
			y = Integer.parseInt(yVal);
			int total = x + y;
			JOptionPane.showMessageDialog(addNumbers, total);
		});
		
		randNumber.addActionListener((e)->{
			int x = 0;
			x = (int) (Math.random()*100);
			JOptionPane.showMessageDialog(randNumber, x);
		});
		
		tellAJoke.addActionListener((ActionEvent e)->{
			int joke = (int)(Math.random()*3);
			System.out.println("Joke number " + joke + ". Joke: " + jokes.get(joke));
			JOptionPane.showMessageDialog(tellAJoke, jokes.get(joke));
			
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
	
}
