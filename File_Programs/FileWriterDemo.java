import java.io.*;
class FileWriterDemo{
	
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write(100); //adding a single character
		fw.write("urga\nSoftware Solutions");
		fw.write("\n");
		char[] ch1 = {'a','b','c'};
		fw.write(ch1);
		fw.flush();
		fw.close();
	}
	
}