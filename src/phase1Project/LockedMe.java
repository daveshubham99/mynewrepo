package phase1Project;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class LockedMe {
		public static final String  projectPath = "/Users/shubhamdave/eclipse-workspace/Simplilearnphase1project";
		
		
		public static void displayMenu()
		{
			System.out.println("\t\t******************************************************");
			System.out.println("\t\t\t\t**Welcome to Locked.me App**");
			System.out.println("\t\t\t\t**Developed by Shubham Dave**");
			System.out.println("\t\t******************************************************");
		
		}
		public static void getAllFiles()
		{
			File folder = new File (projectPath) ;
			File[] listofFiles = folder.listFiles();
			
			if (listofFiles.length>0)
			{
				System.out.println("File list is displayed below:\n");
				for (var l:listofFiles)
				{
				System.out.println(l.getName());	
				}
			}
			else 
			{
				System.out.println("Folder is empty");
			}
		}
		public static void addFiles()
		{
			try {
				
			
			Scanner sc = new Scanner(System.in);
			String filename;
			System.out.println("Enter the filename ");
			filename= sc.nextLine();
			int linescount;
			System.out.println("Enter the no of line");
			linescount = Integer.parseInt(sc.nextLine());
			FileWriter fw = new FileWriter(projectPath+"/"+filename);
			for (int i=0;i<=linescount;i++)
			   {
				System.out.println("Enter file line");
				fw.write(sc.nextLine()+"\n");
			   }
			fw.close();
			}
			catch (Exception e) 
			{
					System.out.println(e);
				
			}
		  }
		public static void delFiles()
		{
			Scanner sc = new Scanner(System.in);
			try 
			{
				
			
			String filename;
			System.out.println("Enter file to be deleted");
			filename = sc.nextLine();	
			File fw = new File(projectPath+"/"+filename);
			if (fw.exists())
			{
				fw.delete();
				System.out.println("file has been deleted");
			}
			else 
			{
				System.out.println("File is not found");
			}
			
		    }
			catch (Exception e) {
				// TODO: handle exception
			}
			
		
         }
		public static void fileSearch()
		{
		Scanner sc = new Scanner(System.in);
		try 
		{
			
		
		String filename;
		System.out.println("Enter file to be Search");
		filename = sc.nextLine();	
		File fw = new File(projectPath+"/"+filename);
		if (fw.exists())
		{
			
			System.out.println("File Found with name:" +fw.getName());
			
		}
		else 
		{
			System.out.println("File is not found");
		}
		
	    }
		catch (Exception e) {
			// TODO: handle exception
		}
}
}

		