package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
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
        StringBuffer outputStringBuffer = new StringBuffer();
        for (byte b: inputBytes){
			outputStringBuffer.append((char)b);
		}
		System.out.println("String Buffer: "+(System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b: inputBytes){
			outputStringBuilder.append((char)b);
		}
		System.out.println("String Builder: "+(System.currentTimeMillis() - startTime));
    }
}
