package stringmethods1;

public class Stringmethods {

	public static void main(String[] args) {

		String name = "Utkarsh";
		System.out.println("My name is "+ name);
		System.out.println("--------1----------");
		
		
		name=name.concat(" Jadhav ");                                   // concat method
		System.out.println("My name is " + name);
		System.out.println("---------2------------");
		
		StringBuffer name1 = new StringBuffer("Utkarsh");
		
		name1.append(" Jadhav ");                                      // append method
		System.out.println(name1);
		
		System.out.println("-------------3----------------");
		
		String details = " I am avery clever student ";
		
		int len = details.length()	;
		
		System.out.println(" The leanth of the details is " + len);             // leanth method
		
		System.out.println("--------------4--------------");
		
		String name3 = "Utkarsh";
		String name4 = " Jadhav ";
		String name5 = "utkarsH";
		
		System.out.println(name3.equals(name4));                                 // equals method
		
		System.out.println("--------------5--------------");              

		System.out.println(name3.equalsIgnoreCase(name5));                  // equalsIgnoreCase Method
		
		System.out.println("--------------6--------------");              

		String details1 = " I am avery clever student ";
		
		
		System.out.println(details1.toUpperCase());                          // toUpperCase
		
		System.out.println("---------------7-------------");              

		System.out.println(details1.toLowerCase());                             // toLowerCase
		
		
		System.out.println("--------------8--------------");              

		System.out.println(details1.contains("clever"));                       // contains method
		
		System.out.println("---------------9-------------");              

		String details2 ="";
		System.out.println(details2.isEmpty());                                 // isEmpty Method
		
		System.out.println("--------------10--------------");        
		
		System.out.println(details1.charAt(12));                               // charAt method

		System.out.println("---------------11-------------");              

		String movie = "Pushpa picture is really a awesome";
		
		System.out.println(movie.indexOf("h"));                             // indexOf method
		System.out.println(movie.indexOf("awesome"));
		System.out.println(movie.indexOf("u"));
		System.out.println(movie.length());

		System.out.println("--------------12--------------");     
		System.out.println(movie.lastIndexOf("e"));                           // lastIndexOf method
		System.out.println(movie.lastIndexOf("really"));
		
		System.out.println("--------------13--------------");              

		System.out.println(movie.startsWith("Pu"));                        // startsWith Method
		System.out.println("Push");
		
		System.out.println("--------------14--------------");              

		System.out.println(movie.endsWith("some "));                     // endsWith Method
		System.out.println(movie.endsWith("awesome "));
		
		System.out.println("-------------15---------------");              

		System.out.println(movie.substring(3));                          // Sub string method
		System.out.println(movie.substring(2,10));

		System.out.println("--------------16--------------");              

		System.out.println(movie.replace("Pushpa", "RRR"));                 // Replace Method
		System.out.println(movie.replace("awesome", "Fantastic"));

	//	System.out.println("---------------17-------------");                // split method
  //    System.out.println(movie.pushpa);
		
		String nickname = "My name is         "; 
		String nickname1= " Utkarsh Jadhav        ";                                // Trim method
		System.out.println(nickname+nickname1);
		System.out.println(nickname.trim()+ nickname1);
		System.out.println(nickname.trim()+ " "  + nickname1.trim());
		
	}

}
