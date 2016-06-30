package col.archive.examples;
import java.util.Comparator;
import col.archive.examples.CSVFile;

public class TemplateComparator implements Comparator<CSVFile> {
 
	/**Implementation model for integral values compare method*/

//	@Override
//	public int compare(CSVFile a1, CSVFile a2) {
//		if(a1 == null || a2 == null){
//			throw new NullPointerException("compareTo: Argument passed is null");
//		}
//		else if (a1.getColumn3()>a2.getColumn3()){
//			return 1;
//		}
//		else if (a1.getColumn3()==a2.getColumn3()){
//			return 0;
//		}
//		else {
//			return -1;
//		}
//	}
	/**Implementation model for String values compare method*/
	@Override
	 public int compare(CSVFile e1, CSVFile e2) {
	  if(e1 == null || e2 == null){
	   throw new NullPointerException("compareTo: Argument passed is null");
	  }
	   return e1.getColumn1().compareTo(e2.getColumn1());
	 }
	

}
