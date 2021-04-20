package midterm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;


public class genSnippet {

	public static void main(String[] args)

			throws ParserConfigurationException, IOException, TransformerException, SAXException {
		// TODO Auto-generated method stub

		System.out.println(args.length);
		

		if (args.length == 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			if (args[0].equals("-q")) {
				@SuppressWarnings("unused")
				Scanner scan = new Scanner(System.in);
				 dogensnippet(scan);
			}

		}
	}
 static void dogensnippet(Scanner scan) {
	 
	 File file = new File("src/input.txt");
	 String[] array = new String[5];
	 
	 StringBuffer sb = new StringBuffer();
	 ArrayList<String> word = new ArrayList<String>();
	 String[] sp, sp2 = {};

		for (int i = 0; i < 5; i++) {
			sp = array[i].split(" ");
			for (int z = 0; z < sp.length; z++) {
				if (sp[z].length() >= 1) {
					sp2 = sp[z].split(":");
					word.add(sp2[0]);
					int cnt = Integer.parseInt(sp2[1]);
					
				}
			}
	 
	 
		
	}
	
	
 }
}

	
