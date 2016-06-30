package col.archive.examples;

public class CSVFile {
	public CSVFile() {

	}

	public CSVFile(String firstColumn, String secondColumn, int thirdColumn, String fourthColumn) {
		this.column1 = firstColumn;
		this.column2 = secondColumn;
		this.column3 = thirdColumn;
		this.column4 = fourthColumn;

	}

	public CSVFile(String line) {
		String[] columns = line.split(",");
		this.column1 = columns[0];
		this.column2 = columns[1];
		this.column3 = Integer.parseInt(columns[2]);
		this.column4 = columns[3];

	}

	private String column1;
	private String column2;
	private int column3;
	private String column4;

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public int getColumn3() {
		return column3;
	}

	public void setColumn3(int column3) {
		this.column3 = column3;
	}

	public String getColumn4() {
		return column4;
	}

	public void setColumn4(String column4) {
		this.column4 = column4;
	}

}
