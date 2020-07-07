
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class Project3
 {

  
  public static void main(String[] args) {

    
    Scanner user_input = new Scanner(System.in);

    System.out.println("U.S. National Debt Tracker\n\n");
    System.out.println("Enter a year from 2000-2019\n\n");
   
    //Data from http://www.polidiotic.com/by-the-numbers/us-national-debt-by-year/
    long[] yearlyDebt = {5674178209886L, 5807463412200L, 6228235965597L, 6783231062743L, 7379052696330L, 7932709661723L, 8506973899215L, 9007653372262L, 10024724896912L, 11909829003511L, 13561623030891L, 14790340328557L, 16066241407385L, 16738183526697L, 17824071380733L, 18150617666484L, 19573444713936L, 20244900016053L, 21606948383546L, 22027424114818L};
    
    int year = user_input.nextInt();
    switch (year) {
    case 2000:
      System.out.println("U.S National Debt for 2000: $" + yearlyDebt[0]);
      break;
    case 2001:
      System.out.println("U.S National Debt for 2001: $" + yearlyDebt[1]);
      break;
    case 2002:
      System.out.println("U.S National Debt for 2002: $" + yearlyDebt[2]);
      break;
    case 2003:
      System.out.println("U.S National Debt for 2003: $" + yearlyDebt[3]);
      break;
    case 2004:
      System.out.println("U.S National Debt for 2004: $" + yearlyDebt[4]);
      break;
    case 2005:
      System.out.println("U.S National Debt for 2005: $" + yearlyDebt[5]);
      break;
    case 2006:
      System.out.println("U.S National Debt for 2006: $" + yearlyDebt[6]);
      break;
    case 2007:
      System.out.println("U.S National Debt for 2007: $" + yearlyDebt[7]);
      break;
    case 2008:
      System.out.println("U.S National Debt for 2008: $" + yearlyDebt[8]);
      break;
    case 2009:
      System.out.println("U.S National Debt for 2009: $" + yearlyDebt[9]);
      break;  
    case 2010:
      System.out.println("U.S National Debt for 2010: $" + yearlyDebt[10]);
      break;
    case 2011:
      System.out.println("U.S National Debt for 2011: $" + yearlyDebt[11]);
      break;
    case 2012:
      System.out.println("U.S National Debt for 2012: $" + yearlyDebt[12]);
      break;
    case 2013:
      System.out.println("U.S National Debt for 2013: $" + yearlyDebt[13]);
      break;
    case 2014:
      System.out.println("U.S National Debt for 2014: $" + yearlyDebt[14]);
      break;
    case 2015:
      System.out.println("U.S National Debt for 2015: $" + yearlyDebt[15]);
      break;
    case 2016:
      System.out.println("U.S National Debt for 2016: $" + yearlyDebt[16]);
      break;
    case 2017:
      System.out.println("U.S National Debt for 2017: $" + yearlyDebt[17]);
      break;
    case 2018:
      System.out.println("U.S National Debt for 2018: $" + yearlyDebt[18]);
      break;
    case 2019:
      System.out.println("U.S National Debt for 2019: $" + yearlyDebt[19]);
      break;
    } 
    
   
    System.out.println("Do you want to see a list of the yearly national debt from 2000-2019? Enter Yes or No\n\n");
   
    boolean yesNo = true;
    while(yesNo) {
      String userInput = user_input.next();
      if (userInput.equals("Yes")) {
        yesNo = false;
        for (long i : yearlyDebt) {
        System.out.println(i);
        }
        } else {
        System.out.println("Thank you for using the U.S. National Debt Tracker!");
      }
    } 
  }
}
