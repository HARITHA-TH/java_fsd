package file;
import java.util.*;

public class ReadFileExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String filePath= sc.nextLine();
		System.out.println("Enter the text to write the file");
		String textToWrite = Scanner.nextLine();
        try(Buffered Writer writer=new Buffered Writer (new File Writer (filePath))){
        
        }
	}

}
