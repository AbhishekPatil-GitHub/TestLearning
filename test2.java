import java.text.Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Test2 {

	/*public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat simpleformat = new SimpleDateFormat("MMM d,yyyy");
		System.out.println("Today's date and time = " + simpleformat.format(cal.getTime()));
		simpleformat = new SimpleDateFormat("hh:mm");
		System.out.println("Today's date and time = " + simpleformat.format(cal.getTime()));
	    
		
		// displaying date
		Format f = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = f.format(new Date());
		System.out.println("Current Date = " + strDate);
		stringTest();
	}*/
	public void mains() throws ParseException {
		// Add 3 months to the Calendar
		   SimpleDateFormat simpleformat = new SimpleDateFormat("MMM d,yyyy");
		   
		//Adding months and days to the current date
		Calendar calendar = Calendar.getInstance();
		Calendar calendar1 = Calendar.getInstance();
		Date date1 = simpleformat.parse("Nov 30,2021");
		calendar1.setTime(date1);
	    System.out.println("Calendar = " + calendar.getTime());
	    
	   
	   calendar1.add(Calendar.MONTH, 3);
	   System.out.println("Calendar + 30 Days = " + simpleformat.format(calendar.getTime()));
	   System.out.println("Calendar1 = " + simpleformat.format(calendar1.getTime()));
	   
	   //Check if a date is less than another date
	   if(calendar1.before(calendar)) {
		   System.out.println("current date is before than expiry date");
	   }
	   
	   
	   String str="Access Tokens (40 of 128) ";
	   String result = str.substring(str.indexOf("("));
	   System.out.println(result.substring(1, result.indexOf(" ")));
/*	   String str2=str.substring(0, str.indexOf("P"));
	   System.out.println(str2);*/
	   
//	   state();
	   
	   stringContains();
	   
	   RandomNumber();
	   
	}
	  
//	public void RandomPickFromList(
		public static void mainto(String args[]) {
		//Generating randm Number between 1 to 10 > if you want 1 to 100 then multiply by 100.0
	 /*  int a =(int) (10.0 * Math.random());
	   System.out.println(a);*/
	   
	   
	   
	   List<String> list = new ArrayList<>();
	   
       // add 5 element in ArrayList
       list.add("1");
       list.add("3");
       list.add("9");
       list.add("12");

       
       //Select a random element from list
       Random randomizer = new Random();
       String random = list.get(randomizer.nextInt(list.size()));
//       randomizer.nextInt(max - min) + min;
       System.out.println(randomizer.nextInt(4));
       
       System.out.println(random);
       
       Test2 test2=new Test2();
       test2.getCurrentDate();
       
       
	}
		
	public static void main(String args[]) {
		Test2 test2=new Test2();
	       test2.getCurrentDate();
	}
	
	//Removing hyphen in a string
	public static String stringTest() {
		
		String input="ABH-8KIU-676";
		String[] input1=input.split("-");
//		input=input.replaceAll("[\\s\\-()]", "");
/*		for(String i:input1) {
			System.out.println(i);
		}*/
		return input;
			
		
	}
	
	
public void toss() {
		
		double toss=Math.random();
		System.out.println(toss);
		if(toss<0.5)
			System.out.println("HEADS");
		else
			System.out.println("TAILS");
		
	}

//Switch Case Sample
public static void switchTest() {
		String color = "yellow";
		
		
		// Switch expression
		switch (color) {
		// Case statements
		case "yellow":
			System.out.println("yellow");
			break;
		case "Red":
			System.out.println("Red");
			break;
		case "Black":
			System.out.println("Black");
			break;
		// Default case statement
		default:
			System.out.println("Default");
		}
	}

	//How to Sort Dates in a list
	public static void state() throws ParseException {
		SimpleDateFormat simpleformat = new SimpleDateFormat("MMM d,yyyy");
		List<Date> dateList = new ArrayList<Date>();
		dateList.add(simpleformat.parse("Oct 28,2022"));
		dateList.add(simpleformat.parse("Sep 28,2021"));
		dateList.add(simpleformat.parse("Nov 28,2021"));
		dateList.add(simpleformat.parse("Jan 28,2022"));
		
		Collections.sort(dateList);
		
		System.out.println(dateList);
		
		
	}
	
	public static void stringContains() {
		String a="ABHISHEK";
		System.out.println(a.toLowerCase().contains("a"));
		
	}
	
	public static void RandomNumber() {
		Random randomizer = new Random();
	    int random = randomizer.nextInt(10);
	    System.out.println(random);
		
	}
	
	//Function to get current date in a specific format
	public void getCurrentDate() {
		SimpleDateFormat simpleformat = new SimpleDateFormat("MMM d, yyyy");
		Date date1 = null;
		
			//date1 is the current date
			date1= new Date(System.currentTimeMillis());
			try {
				date1=simpleformat.parse(simpleformat.format(date1));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(date1.toString());
			
	}
	
}
	
