package FileHandling;

import java.io.*;

public class FileBuiltInClasses {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		File f= new File("D:\\IOPrograms\\Sample1.txt");
		boolean b1=f.createNewFile();
		//createNewFile - it will create a new file at the given location in object creation 
		if(b1==true) {
			System.out.println("File Created");
		}else{
			System.out.println("File Already Exists");
		}
		System.out.println("----------");
		b1=f.canExecute();
		//canExecute- it will check that the give file will execute or not it will check and then it will return boolean value
		System.out.println(b1);
		System.out.println("----------");
		b1=f.canRead();
		//canRead- it will check for the give file will have access to read the data and it will return the boolean value
		System.out.println(b1);
		System.out.println("----------");
		b1=f.canWrite();
		//canWrite- it will check for we are having access to write the data into given file and it will also return boolean value
		System.out.println(b1);
		System.out.println("----------");
		//delete- it will delete the file from the location and returns boolean value
//		boolean  b2= f.delete();
//		System.out.println(b2);
		
		//deleteOnExit- deletes the file when JVM  will terminates the program
		f.deleteOnExit();
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("Dasaratha");
//			Thread.sleep(1000);
//		}
		//exists- checks whether the given file is exist or not
		b1=f.exists();
		System.out.println(b1);
		System.out.println("----------");
		//getAbsolutePath()- returns the file path
		System.out.println(f.getAbsolutePath());
		//getCanonicalPath()- returns the file path 
		System.out.println(f.getCanonicalPath());
		//getFreeSpace()- returns the unused space(in  bytes) in the file
		System.out.println(f.getFreeSpace());
		//getTotalSpace()- returns the total space(in bytes)
		System.out.println(f.getTotalSpace());
		//getName()- returns the name of the file
		System.out.println(f.getName());
		//getParent()- returns the folder name 
		System.out.println(f.getParent());
		//getPath() - returns the file path 
		System.out.println(f.getPath());
		//getUsableSpace()- return the space that is usable in bytes
		System.out.println(f.getUsableSpace());
		//getClass()- return the class where that is exists like package name
		System.out.println(f.getClass());
		
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());
		System.out.println(f.hashCode());
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		File f2= new File("D:\\IOPrograms\\Input.txt");
		System.out.println(f2.isHidden());
		System.out.println(f.lastModified());
		System.out.println(f2.length());
		
	}

}
