import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileProgram { 

	static Scanner in = new Scanner(System.in);
   public static void main(String[] args) throws IOException { 
	   
	   
	   System.out.println("Welcoom to LockedMe.com for filling System");
	   System.out.println("Developed by: Hessa Fahad ");
	   
	   System.out.println("========================================="); 
	   
	   System.out.println("\n This files in Program file  \n"
		   	 	         + "\t orderd asc:  \n");
	   
	   
	   /*
	    * 
	    List all files
	    * 
	    * 
	    */
	   
	File f = new File("c:");
		File FileList[]=f.listFiles();
		Arrays.sort(FileList);
	   for(int i=0; i<FileList.length; i++) {
			System.out.println("\t\t "+i+") "+ FileList[i].getName()+ "  >> \t" +FileList[i].getCanonicalPath());
		}
	   
	   Program();
	   
   }

   
   /*
    * 
    *  
    * Program functions 
    * Allow the user to choose one of these options    
    *
    * 
    */
   
   public static void Program() throws IOException {
		   
		
	
		   try{
			   System.out.println("========================================="); 
			   System.out.println(    "\n\n We do 3 function please Choose one : ");
				System.out.println( " \n \t Please press ' 1 '  to create a new file "
						          + " \n \t Please press ' 2 '  to delete a file "
						          + " \n \t Please press ' 3 '  to search a file ");
				   
				   System.out.print("====> "); int o = in.nextInt(); 
				    

				   System.out.println("========================================="); 

				if(o==1) {
					AddFile();
				}
						    
				else if(o==2){		
					DeleteFile();
				}
				else if (o==3) {
					SearchFile();
				}else {
					System.out.print("\t\t>>>> Your choise is ronge <<<< ");
				}
				
				} catch(Exception ex) {
						System.out.println(ex.getMessage());
					}
		   Back();
		}
   
		
			/*
			 * 
			 * AddFile function  
			 * to add new file 
			 * and checking if exists a file with same name , and print a message informing the user 
			 * 
			 */
   public static void AddFile() throws IOException {
	   
		System.out.println("Add new file Name: ");
		System.out.print("====> ");
		String FileName = in.next();
		File f1 = new File(FileName);
		boolean result;  
		result = f1.createNewFile();  //creates a new file  
		if(result) {      // test if successfully created a new file  
			
		System.out.print("Result : \t");
		System.out.println("successful  ===>' " + f1.getName() + " ' created "+ f1.getCanonicalPath()); //returns the path string  
		System.out.println("========================================="); 
		} else{  
			
		System.out.print("Result : \t");
		System.out.println("Failed ===> ' " + f1.getName() + " ' This file is already exist at location: "+ f1.getCanonicalPath());  
		System.out.println("========================================="); 
		}  
}
   
	/*
	 * 
	 * DeletFile function  
	 * to delete a file 
	 * and checking if exists a file with same name , and print a message informing the user 
	 * 
	 */
   
   public static void DeleteFile() {
	   
	   System.out.println("File name to delete:");
	   System.out.print("====> ");
		String FileDel = in.next();
		File f2 = new File(FileDel);
		
		
		if(f2.delete()){  // checking if exists or not then delete it  
		System.out.print("Result : \t");
		System.out.println("successful   ===>  ' "+ f2.getName() + " ' Deleted");   //getting and printing the file name  
		System.out.println("========================================="); 
		}else{ 
		System.out.print("Result : \t");
		System.out.println("Failed ===> ' " + f2.getName() + " ' There is no file with this name'");  
		System.out.println("========================================="); 
		
		   }
	   
   }
   
	/*
	 * 
	 * AddFile function  
	 * to searching for file
	 * and checking if not exists a file with same name , and print a message informing the user 
	 * 
	 */
  
   public static void SearchFile() throws IOException {
   System.out.println("File name to search and give you a full path:");
   System.out.print("====> ");
	String FileSer = in.next();
	  File f3 = new File(FileSer);
	  
	  boolean result2;  
		result2 = f3.exists();
		if(result2) {      // checking if exists or not  
		System.out.print("Result : \t");
		System.out.println("Here is it  ===> "+f3.getCanonicalPath());
		System.out.println("========================================="); 
			} else{  
		System.out.print("Result : \t");
		System.out.println("Failed ===>' " + f3.getName() + " ''Ther is no file with this name'");
		System.out.println("========================================="); 
			}
   }
   
   
   /*
	 * 
	 * Back function  
	 * to go back again to the options  OR  close the program 
	 * 
	 */
 
   
   
   public static void Back() throws IOException {
	   

		  System.out.println("\n\t Press 1 to back"
				      + "\n\t Prees 2 to close the program \n\n");
		 System.out.print("====> ");
		 int o2 = in.nextInt();
		 if(o2==1) {
			 System.out.println("========================================="); 
			 Program();
		 }else if(o2==2) {
			  System.out.println("\t\t=================-============================"); 
			 System.out.println("\t\t\t  ... Thank you, good bye ...");
		    }else {
		    System.out.println("========================================="); 
		    System.out.println("\t\t>>>> Your choise is ronge <<<< "
		                     +"\n\t\t>>>> Please choose again <<<< ");
		    Back();
		    }
   }
   }
