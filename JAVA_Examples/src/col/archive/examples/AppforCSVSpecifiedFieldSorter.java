package col.archive.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import col.archive.examples.CSVFile;
import col.archive.examples.TemplateComparator;

public class AppforCSVSpecifiedFieldSorter {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		CSVFile csvfile;
		List<CSVFile> list = new ArrayList<CSVFile>();
		BufferedReader br = null;
		String line = "";
		String file = "D:\\Ravi\\JAVA_Workspace\\JAVA_Examples\\Resources\\test\\resources\\forSpecifiedfiledSorting.txt";
		br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {
			csvfile = new CSVFile(line);
			list.add(csvfile);
		}
		Collections.sort(list, new TemplateComparator());
		for (CSVFile sorted : list) {
			System.out.println(sorted.getColumn1() + "," + sorted.getColumn2() + "," + sorted.getColumn3() + ","
					+ sorted.getColumn4());
		}
	}
}
