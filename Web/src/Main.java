import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	
public static void main(String[] args) {
		String s ="<html> <head> <title>Webovka!</title> <\\head> <body> <p>Tohle je moje webovka.</p> <p> Tohle je moje webovka</p> </body> </html>";
		
		
		
			Pattern p1 = Pattern.compile(".*(<title>)(.*)(</title>).*");
			Pattern p2 = Pattern.compile(".*(<p>)(.*)(</p>).*");
			

			

			Matcher m1 = p1.matcher(s); 
			Matcher m2 = p2.matcher(s); 
			

			if (m1.find()) { 
			System.out.println("Úvod: " + m1.group(2));
			}
			if (m2.find()) {
			System.out.println("Paragraf: " + m2.group(2));
			} else {
				System.err.println("chyba!! ");
				}

}
			
	

}