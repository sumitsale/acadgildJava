import java.util.Scanner;

class S2Assignment4
{
   public static void main(String args[])
   {
		int month;
		String monthString;
		int days = 0;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter month");
		month = in.nextInt();
		System.out.println("Month is - "+month);
		
		    switch (month) {
            case 1:  monthString = "January";
					 days = 31;
                     break;
            case 2:  monthString = "February";
					 days = 28;
                     break;
            case 3:  monthString = "March";
					 days = 31;
                     break;
            case 4:  monthString = "April";
					 days = 30;
                     break;
            case 5:  monthString = "May";
					 days = 31;
                     break;
            case 6:  monthString = "June";
					 days = 30;
                     break;
            case 7:  monthString = "July";
					 days = 31;
                     break;
            case 8:  monthString = "August";
					 days = 31;
                     break;
            case 9:  monthString = "September";
					 days = 30;
                     break;
            case 10: monthString = "October";
					 days = 31;
                     break;
            case 11: monthString = "November";
					 days = 30;
                     break;
            case 12: monthString = "December";
					 days = 31;
                     break;
            default: monthString = "Invalid month";
                     break;
        }
		
		System.out.println("Month no is - "+monthString);
		System.out.println("Month days - "+days);
   }
}