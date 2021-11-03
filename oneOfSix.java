import java.util.*;

public class oneOfSix {
	public static void main(String [] args){

		String month;
		String season = "";
		int day; 

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a month: ");
		month = sc.nextLine();
                month = month.toLowerCase();

		System.out.println("Please enter a day: ");
		day = Integer.parseInt(sc.nextLine());

		
                switch(month) {
                        case "january" :
                                season = "summer"; 
                                break;

                        case "february" :
                                season = "summer"; 
                                break;

                        case "march" :
                                season = "summer";

                                if (day < 21) {
                                        season = "summer";
                                }

                                break;

                        case "december" :
                                season = "summer"; 

                                if (day < 21) {
                                        season = "spring";
                                }

                                break;

                        case "april" :
                                season = "autumn"; 
                                break;

                        case "may" :
                                season = "autumn"; 
                                break;

                        case "june" :
                                season = "winter"; 

                                if (day < 21) {
                                        season = "autumn";
                                }

                                break;

                        case "july" :
                                season = "winter"; 
                                break;

                        case "august" :
                                season = "winter"; 
                                break;

                        case "september" :
                                season = "spring"; 

                                if (day < 21) {
                                        season = "winter";
                                }

                                break;

                        case "october" :
                                season = "spring"; 
                                break;

                        case "november" :
                                season = "spring"; 
                                break;
                }
        System.out.println("The season is: " + season);

	}
}