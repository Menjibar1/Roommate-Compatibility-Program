import java.io.FileNotFoundException;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Match {

	Student[] slist = new Student[100];
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Student[] slist = new Student[100];
		
		Scanner kdb = new Scanner(System.in);
		System.out.print("Enter the file name: "); 
		// D:/Students.txt
		// D:/FullRoster.txt
	
		Scanner scan = new Scanner(System.in);
		String File = scan.next();
		
	try {	
		int i = 0;
		Scanner file = new Scanner (new FileReader(File));
		
		while(file.hasNext()) {
				Scanner line = new Scanner(file.nextLine());
				line.useDelimiter("[\t\r]");
				String name = line.next();
				String gender = line.next();
				String date = line.next();
				
				
				Scanner Bday = new Scanner(date);
				Bday.useDelimiter("[-]");
				int day = Bday.nextInt();
				int month = Bday.nextInt();
				int year = Bday.nextInt();
				
				
				int quiet = line.nextInt();
				int music = line.nextInt();
				int reading = line.nextInt();
				int chatting = line.nextInt();
				
				Date bday = new Date (year, month, day);
				
				Preference pref = new Preference(quiet, music, reading, chatting);
				Student Smarty = new Student(name, gender.charAt(0), bday, pref);
				
				slist[i] = Smarty;
				++i;	
			
		}
		
		
	
		int allStu = i;
		for (i = 0; i < allStu; i++){
			if (!slist[i].getMatched()){
				int highestScore = 0; int highestMatch = 0;
				for (int j=i+1; j< allStu; j++){
					if(!slist[j].getMatched()){
						int current = slist[i].compare(slist[j]);
						if (current > highestMatch){
							highestScore = current;
							highestMatch = j;
						}
					}
				}
				if (highestScore != 0){
					slist[i].setMatched(true);
					slist[highestMatch].setMatched(true);
					System.out.println(slist[i].getName() + " matches with " + slist[highestMatch].getName() + " with the score " + highestScore);
				}else
					if (!slist[i].getMatched())
						System.out.println(slist[i].getName() + " has no matches.");
			}
			
		}

		
		scan.close();
	}
		 catch (NoSuchElementException e){
				System.out.println(e);
			} catch (FileNotFoundException e){
				System.out.println(e);
			}
			
	}
}
		
		



