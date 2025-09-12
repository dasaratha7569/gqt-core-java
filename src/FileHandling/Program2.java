package FileHandling;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path1= "D:\\IOPrograms\\File1.txt";
		String path2= "D:\\IOPrograms\\File3.txt";
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(path1);
			fw=new FileWriter(path2);
			int x;
			while((x=fr.read())!=-1) {
				fw.write(x);
			}
		}
		finally {
			fr.close();
			fw.close();
		}
	}

}
