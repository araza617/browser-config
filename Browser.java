/* The program will open pre-set windows on your preferred browser, based on 
various categories. */

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Browser {
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please indicate what you would like to do. Simply type \"quit\" if you would like to exit.\n");
		task_loop(keyboard);
	}

	/* Keeps looping to ask the user for another task until user indicates a quit */
	public static void task_loop(Scanner keyboard) {
		System.out.print("I want to open: ");
		String userInput = keyboard.nextLine();
	
		if(userInput.equals("quit"))
			System.exit(0);

		else if(userInput.equals("mail"))
			open_mail(keyboard);

		else if(userInput.equals("news")) 
			open_news(keyboard);

		else if(userInput.equals("social media"))
			open_social(keyboard);

		else {
			System.out.println("\nSorry, that category has not been specified. Please try again.");
			task_loop(keyboard);
		}
	}
				
	/* Method to check mail */
	public static void open_mail(Scanner keyboard) {
		String url1 = "https://mail.google.com/mail/u/0/";
		if (Desktop.isDesktopSupported()){
					Desktop desktop = Desktop.getDesktop();

					try{
						desktop.browse(new URI(url1));

				} catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
					
				}else{
					Runtime runtime = Runtime.getRuntime();
					try{
 	 				runtime.exec("xdg-open " + url1);
					}catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
				}

		task_loop(keyboard);
	}
				
	/* Method to check news */	
	public static void open_news(Scanner keyboard) {
		String url1 = "https://yahoo.com";
		String url2 = "https://cnbc.com";
		String url3 = "http://cnn.com";
		if (Desktop.isDesktopSupported()){
					Desktop desktop = Desktop.getDesktop();
				
					try{
						desktop.browse(new URI(url1));
						desktop.browse(new URI(url2));
						desktop.browse(new URI(url3));

				}catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
					
				}else{
					Runtime runtime = Runtime.getRuntime();
					try{
 	 				runtime.exec("xdg-open " + url1);
 	 				runtime.exec("xdg-open " + url2);
 	 				runtime.exec("xdg-open " + url3);

					}catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
				}
		task_loop(keyboard);
	}

	/* Method to open all social media */	
	public static void open_social(Scanner keyboard) {
		String url1 = "https://facebook.com";
		String url2 = "https://twitter.com";
		String url3 = "https://pinterest.com";
		String url4 = "https://reddit.com";
		String url5 = "https://tumblr.com";


		if (Desktop.isDesktopSupported()){
					Desktop desktop = Desktop.getDesktop();
				
					try{
						desktop.browse(new URI(url1));
						desktop.browse(new URI(url2));
						desktop.browse(new URI(url3));
						desktop.browse(new URI(url4));
						desktop.browse(new URI(url5));


				}catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
					
				}else{
					Runtime runtime = Runtime.getRuntime();
					try{
 	 				runtime.exec("xdg-open " + url1);
 	 				runtime.exec("xdg-open " + url2);
 	 				runtime.exec("xdg-open " + url3);
 	 				runtime.exec("xdg-open " + url4);
 	 				runtime.exec("xdg-open " + url5);

					}catch (Exception e){
						System.out.println("Oops! Looks like something went wrong.");
					}
				}
		task_loop(keyboard);
	}
}
