import java.util.*;
import java.time.*;

public class Calendar {
	public ArrayList<ArrayList<Event>> january = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> feburary = new ArrayList<ArrayList<Event>>(28);
	public ArrayList<ArrayList<Event>> march = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> april = new ArrayList<ArrayList<Event>>(30);
	public ArrayList<ArrayList<Event>> may = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> june = new ArrayList<ArrayList<Event>>(30);
	public ArrayList<ArrayList<Event>> july = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> august = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> september = new ArrayList<ArrayList<Event>>(30);
	public ArrayList<ArrayList<Event>> october = new ArrayList<ArrayList<Event>>(31);
	public ArrayList<ArrayList<Event>> november = new ArrayList<ArrayList<Event>>(30);
	public ArrayList<ArrayList<Event>> december = new ArrayList<ArrayList<Event>>(31);
	
	public Calendar() {
		for(int i = 0; i < 31; i++) {
			this.january.add(new ArrayList<Event>());
			this.march.add(new ArrayList<Event>());
			this.may.add(new ArrayList<Event>());
			this.july.add(new ArrayList<Event>());
			this.august.add(new ArrayList<Event>());
			this.october.add(new ArrayList<Event>());
			this.december.add(new ArrayList<Event>());
		}
		for(int i = 0; i < 30; i++) {
			this.april.add(new ArrayList<Event>());
			this.june.add(new ArrayList<Event>());
			this.september.add(new ArrayList<Event>());
			this.november.add(new ArrayList<Event>());
		}
		for(int i = 0; i < 28; i++) {
			this.feburary.add(new ArrayList<Event>());
		}
	}
	
	private static int Days(String[] date) {
		int numbOfDays = 0;
		if(date[1].equals("01")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("02")) {
			numbOfDays = 28;
		}
		else if(date[1].equals("03")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("04")) {
			numbOfDays = 30;
		}
		else if(date[1].equals("05")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("06")) {
			numbOfDays = 30;
		}
		else if(date[1].equals("07")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("08")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("09")) {
			numbOfDays = 30;
		}
		else if(date[1].equals("10")) {
			numbOfDays = 31;
		}
		else if(date[1].equals("11")) {
			numbOfDays = 30;
		}
		else if(date[1].equals("12")) {
			numbOfDays = 31;
		}	
		
		return numbOfDays;
	}

	private static String Months(String[] date) {
		String month = "";
		if(date[1].equals("01")) {
			month = "January";
		}
		else if(date[1].equals("02")) {
			month = "February";
		}
		else if(date[1].equals("03")) {
			month = "March";
		}
		else if(date[1].equals("04")) {
			month = "April";
		}
		else if(date[1].equals("05")) {
			month = "May";
		}
		else if(date[1].equals("06")) {
			month = "June";
		}
		else if(date[1].equals("07")) {
			month = "July";
		}
		else if(date[1].equals("08")) {
			month = "August";
		}
		else if(date[1].equals("09")) {
			month = "September";
		}
		else if(date[1].equals("10")) {
			month = "October";
		}
		else if(date[1].equals("11")) {
			month = "November";
		}
		else if(date[1].equals("12")) {
			month = "December";
		}	
		
		return month;
	}
	
	private static String[] createDays(int days, String today) {
		int size = days;
		String[] layout = new String[size];
		int count = 1;
		for(int i = 0; i < days; i++) {
			if(today.equals(String.valueOf(count))) {
				layout[i] = "[>"+count+"<]";
				count++;
			}
			else {
				layout[i] = "["+count+"]";
			count++;
			}
		}
		
		return layout;
	}
	
	public void makeCalendar() {
		//object to get the current year and month
		YearMonth month = YearMonth.now();
				
		//turns object into a string and splits the month and year into an array
		String str = month.toString();
		String[] date = str.split("-");
				
		// object to get the current day
		LocalDate day = LocalDate.now();
				
		//turns object to a string and splits the month and day into an array
		String str2 = day.toString();
		String[] date2;
		//date2 = str2.split("-");
		date2 = str2.split("-0");
				
		//calls the Days() function and gets the total number of days for the month
		int numbOfDays = Days(date);
				
		//calls the Months() function and gets the name of the month
		String monthName = Months(date);
				
		//calls the createDays() function and generates an array of the days of the
		//month
		String[] layout = createDays(numbOfDays, date2[2]);
		
		System.out.println("\t\t    " +monthName +"   " +date[0]);
		
		System.out.print(" Sun\t Mon\t Tue\t Wed\t Thu\t Fri\t Sat\n");
		
		if(monthName.equals("January")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t\t\t");
				else if(j == 1)
					System.out.println("");
				else if(j == 8)
					System.out.println("");
				else if(j == 15)
					System.out.println("");
				else if(j == 22)
					System.out.println("");
				else if(j == 29)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("February")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t");
				else if(j == 5)
					System.out.println("");
				else if(j == 12)
					System.out.println("");
				else if(j == 19)
					System.out.println("");
				else if(j == 26)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("March")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t");
				else if(j == 5)
					System.out.println("");
				else if(j == 12)
					System.out.println("");
				else if(j == 19)
					System.out.println("");
				else if(j == 26)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("April")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t\t");
				else if(j == 2)
					System.out.println("");
				else if(j == 9)
					System.out.println("");
				else if(j == 16)
					System.out.println("");
				else if(j == 23)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("May")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 7)
					System.out.println("");
				else if(j == 14)
					System.out.println("");
				else if(j == 21)
					System.out.println("");
				else if(j == 28)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("June")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t");
				else if(j == 4)
					System.out.println("");
				else if(j == 11)
					System.out.println("");
				else if(j == 18)
					System.out.println("");
				else if(j == 25)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("July")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t\t");
				else if(j == 2)
					System.out.println("");
				else if(j == 9)
					System.out.println("");
				else if(j == 16)
					System.out.println("");
				else if(j == 23)
					System.out.println("");
				else if(j == 30)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("August")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t");
				else if(j == 6)
					System.out.println("");
				else if(j == 13)
					System.out.println("");
				else if(j == 20)
					System.out.println("");
				else if(j == 27)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("September")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t");
				if(j == 3)
					System.out.println("");
				else if(j == 10)
					System.out.println("");
				else if(j == 17)
					System.out.println("");
				else if(j == 24)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("October")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t\t\t");
				if(j == 1)
					System.out.println("");
				else if(j == 8)
					System.out.println("");
				else if(j == 15)
					System.out.println("");
				else if(j == 22)
					System.out.println("");
				else if(j == 29)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("November")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t");
				if(j == 5)
					System.out.println("");
				else if(j == 12)
					System.out.println("");
				else if(j == 19)
					System.out.println("");
				else if(j == 26)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
		
		else if(monthName.equals("December")) {
			for(int j = 0; j < layout.length; j++) {
				if(j == 0)
					System.out.print("\t\t\t\t");
				if(j == 3)
					System.out.println("");
				else if(j == 10)
					System.out.println("");
				else if(j == 17)
					System.out.println("");
				else if(j == 24)
					System.out.println("");
				System.out.print(layout[j] + "\t");
			}
		}
	}
}