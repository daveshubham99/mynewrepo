package phase1Project;

import java.util.Scanner;

public class ClientApp 
{
	
		public static void main(String[] args) 
		{
			int ch;
			Scanner sc = new Scanner(System.in);
			do {
				
			
			LockedMe.displayMenu();
			System.out.println("\t\t\t\t   Enter your choise :");
			System.out.println("\t\t\t\t   1. Display ALl Files ");
			System.out.println("\t\t\t\t   2. Add File ");
			System.out.println("\t\t\t\t   3. Delete file");
			System.out.println("\t\t\t\t   4. Search file");
			System.out.println("\t\t\t\t   . Exit file");

			ch = Integer.parseInt(sc.nextLine());
			switch(ch)
			{
			case 1: LockedMe.getAllFiles();
				break;
			case 2: LockedMe.addFiles();
				break;
			case 3: LockedMe.delFiles();
			break;
			case 4: LockedMe.fileSearch();
			break;
			case 5: System.exit(0);
			break;
			default:
				System.out.println("Invalid option");
				break;
				
			}
		
		
		
			}while(ch>0);
			sc.next();
			sc.close();
		}
		
}


