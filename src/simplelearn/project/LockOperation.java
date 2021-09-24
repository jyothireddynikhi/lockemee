package simplelearn.project;


//import com.locker.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class LockOperation {
	

		List<String> ret= new ArrayList<String>();
		File[] files = new File("C:\\Users\\hi\\eclipse-workspace\\Phase1Project").listFiles();
		public void showAllFiles() {
			
			for(File file : files) {
				if(file.isFile()) {
					
				}
			}
			ret.forEach(System.out::println);
			
		}

		public void addFile() {
			
			System.out.println("Enter the file which you want to add:");
			
			Scanner scan=new Scanner(System.in);
			String filename=scan.nextLine();
			File F= new File(filename);
			try {
				if(F.createNewFile()) {
					System.out.println(filename+" file is added to the directory");
					Desktop.getDesktop().edit(F);
				}
				else {
					System.out.println("This file is already there");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}	
			
		}

		public void deleteFile() {
			
			System.out.println("Enter the file which you want to delete:");
		
			Scanner scan=new Scanner(System.in);
			String filename=scan.nextLine();
			File F= new File(filename);
			if(F.delete())
				System.out.println(filename+" got Deleted");
			else
				System.out.println("File Not Found");
		}

		public void searchFile() {
			
			try {	
				Scanner scan= new Scanner(System.in);
				File directory = new File("C:\\Users\\hi\\eclipse-workspace\\Phase1Project");
				System.out.println("Enter the file name which you want to search:");
				String fileName=scan.nextLine();
	            File[] files=directory.listFiles();
	            int flag=0;
	            for (File file : files) {
	                String name = file.getName();
	                if (name.equals(fileName)) {
	                      
	        				File f= new File(fileName);
	        				Scanner sc1 = new Scanner(f);
	        				while(sc1.hasNextLine()) {
	        				System.out.println(sc1.nextLine());
	        				}
	        			flag=1;	
	                }
				}
	        if(flag==0) {
	        	System.out.println("File not found");
	        }
	        	
			}catch(FileNotFoundException ex) {
				System.out.println("file not found");
			}
			
		}


}
