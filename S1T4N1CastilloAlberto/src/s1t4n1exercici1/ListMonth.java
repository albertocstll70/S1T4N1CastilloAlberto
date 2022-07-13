package s1t4n1exercici1;

import java.util.ArrayList;

public class ListMonth {

	private ArrayList<String> month;

	public ListMonth() {

	}

	public void lista() {
		this.month = new ArrayList<String>();
		this.month.add("January");
		this.month.add("February");
		this.month.add("March");
		this.month.add("April");
		this.month.add("May");
		this.month.add("June");
		this.month.add("July");
		this.month.add("August");
		this.month.add("Septembre");
		this.month.add("October");
		this.month.add("November");
		this.month.add("December");
	}

	public ArrayList<String> getMonth() {

		return month;
	}

}
