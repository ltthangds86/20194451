package hust.soict.dsai.garbage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ConcatenationInLoops {
	public static void main(String[] args) {

	long startTime = System.currentTimeMillis();
	String str = new String("hust");
	for (int i = 0;i<100000;i++){
		str += "hust";
	}
	System.out.println("Time String: "+(System.currentTimeMillis() - startTime)+" ms");

	startTime = System.currentTimeMillis();
	StringBuffer str2 = new StringBuffer("hust");
	for (int i = 0;i<100000;i++){
		str2.append("hust");
	}
	System.out.println("Time StringBuffer: "+(System.currentTimeMillis() - startTime)+" ms");

	startTime = System.currentTimeMillis();
	StringBuilder str3 = new StringBuilder("hust");
	for (int i = 0;i<100000;i++){
		str3.append("hust");
	}
	System.out.println("Time StringBuilder: "+(System.currentTimeMillis() - startTime)+" ms");
	}
}


