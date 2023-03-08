


//to write data into a file


package file;


import java.io.FileOutputStream;

public class FileOutputStreamExample{
	public static void main(String[] args) {
	try {
		String data="This is a line of text inside the file";

		//object for the output operation
		FileOutputStream fout=new FileOutputStream("D://testout.txt");
		//convert the string into bytes
		byte b[]=data.getBytes();
		fout.write(b);
		fout.close();
	}catch(Exception e){
		System.out.println(e);
	}
		
		
	}
}
