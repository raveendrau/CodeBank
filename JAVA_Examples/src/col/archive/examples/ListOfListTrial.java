package col.archive.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ListOfListTrial {
	public static void main(String[] args) {
		ListOfListTrial obj = new ListOfListTrial();
		String csvfile = args[0];
		String delimiter= args[1];
		obj.csvsort(csvfile,delimiter);
	}

	public void csvsort(String file,String delim) {
		String csvFile = file;
		String dlimiter= delim;
		BufferedReader br = null;
		String line = "";
		//String cvsSplitBy = "\\|";
		try{
			br = new BufferedReader(new FileReader(csvFile));
			while (( line = br.readLine()) != null){
				
				
				
				
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
