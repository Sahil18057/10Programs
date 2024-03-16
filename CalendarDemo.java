import java.util.Calendar;
class CalendarDemo
{
	public static void main(String args[])
	{
		String months[] = {
			"Jan", "Feb", "Mar", "Apr", 
			"May", "Jun", "Jul", "Aug", 
			"Sep", "Oct", "Nov", "Dec"
		};
	Calendar calendar = Calendar.getInstance();
	System.out.println("Date : ");
	System.out.println(months[calendar.get(Calendar.MONTH)]);
	System.out.println(" " + calendar.get(Calendar.DATE) + " ");
	System.out.println(calendar.get(Calendar.YEAR));

	System.out.println("Time : ");
	System.out.println(calendar.get(Calendar.HOUR) + ":");
	System.out.println(calendar.get(Calendar.MINUTE) + ":");
	System.out.println(calendar.get(Calendar.SECOND));

	calendar.set(Calendar.HOUR, 10);
	calendar.set(Calendar.MINUTE, 29);
	calendar.set(Calendar.SECOND, 22);
	System.out.println("Updated time : ");
	System.out.println(calendar.get(Calendar.HOUR) + ":");
	System.out.println(calendar.get(Calendar.MINUTE) + ":");
	System.out.println(calendar.get(Calendar.SECOND));
	}
}


/*

Date :
Feb
 22
2024
Time :
9:
11:
6
Updated time :
10:
29:
22

*/