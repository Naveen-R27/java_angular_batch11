package javaprog;

import java.util.Scanner;

enum Month {

    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April");
    String name;

    Month(String value) {
        this.name = value;
    }
}
public class WorkingEnum {
    public static void main(String[] args) {
        //Month month = Month.APR;
    	//Month[] n= Month.values();
    	//System.out.println(n);
        
        /*for(Month m : Month.values()){
            System.out.println(m.name);
        }*/
        
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your choice 1 to perform 0 to exit--->");
			int y= sc.nextInt();
			System.out.println("\nEnter month--->");

			String x = sc.next();
			//System.out.println(Month.valueOf(x).name);
			//System.out.println(mn.name);
			while(y == 1) {
			switch(x) {
			case "JAN":
				System.out.println(Month.valueOf(x).name);
				break;
			case "FEB":
				System.out.println(Month.valueOf(x).name);
				break;
			case "MAR" :
				System.out.println(Month.valueOf(x).name);
				break;
			case"APR":
				System.out.println(Month.valueOf(x).name);
				break;
			default:
				System.out.println("Enter valid Month-->");
			
			}
			System.out.println("Enter your choice 1 to perform 0 to exit--->");
			y= sc.nextInt();
			x = sc.next();
			}
		}
        
    }
}
