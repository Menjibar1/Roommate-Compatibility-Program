
public class Date {
	
	private int year;
	private int day;
	private int month;
	
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int dayOfYear(int month) {
		int totalDays = 0;
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
		}
		totalDays += day;
		return totalDays;
		}

	
	public int compare(Date dt) {
		int diff = 0;
		
		diff += (Math.abs(dt.year - year)) * 365;
		
		diff += Math.abs(dayOfYear(dt.month) - dayOfYear(month));
		if (diff/30 > 60)
			return 60;
		else
			return diff/30;
		
	}

}
