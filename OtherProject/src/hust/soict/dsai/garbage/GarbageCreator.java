package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
		String filename = "C:\\Users\\DELL\\Desktop\\git_lab\\OOP.DSAI.20202.20194447.NguyenDucPhu\\OtherProject\\src\\test.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b: inputBytes) {
			outputString += (char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}

