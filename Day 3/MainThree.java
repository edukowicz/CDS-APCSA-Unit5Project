//Air Quality Analyzer 3               A+CR
import java.util.ArrayList;

//Use your assigned data set A,B,C, or D

class MainThree {

  public static void main(String[] args) {

    //create an array for the city names
    String[] cities = {"Columbo, Sri Lanka", "Manali, Chennai", "Secretariat, Amaravati", "Solapur, Solapur", "Katraj Pune", "MIDC Khutala, Chandraur"};
   

    //create 1D arrays for each of the rows of PM2.5 levels from the table - they must all be of the same data type 
    double[] columbo = {68, 30, 17, 46, 30, 42, 46, 70, 127, 95, 80, 65, 59, 53, 50, 53, 38, 59, 46, 55, 61, 65, 38, 53};
    double[] manali = {67, 109, 125, 77, 89, 69, 112, 158, 124, 58, 86, 96, 76, 88, 87, 95, 99, 92, 116, 154, 157, 147, 104, 154};
    double[] secretariat = {0, 0, 0, 63, 56, 28, 42, 33, 42, 0, 0, 24, 32, 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    double[] solapur = {11, 3, 14, 9, 24, 35, 21, 21, 52, 58, 48, 50 , 58, 51, 37, 62, 80, 49, 17, 31, 49, 13, 34, 24};
    double[] katraj = {17, 17, 16, 16, 16, 16, 16, 15, 15, 15, 14, 14, 14, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14,};
    double[] midcKjutala = {32, 26, 26, 17, 18, 24, 24, 24, 25, 47, 48, 64, 64, 61, 60, 36, 36, 34, 35, 63, 63, 84, 83, 55};




    //create a 2D array that is an array of arrays, each row is represents a city's PM2.5 levels for 24 hours
    double[][] citiesPollution = {columbo, manali, secretariat, solapur, katraj, midcKjutala};




 
    //call the printData method passing the correct arguments
    printData(cities, citiesPollution);
    
    



  //create a 1D data structure (array or ArrayList) and add the average PM2.5 level for a day for each city by calling the average method and passing a 1D array that represents each row in the 2D array
    double[] avg = {average(columbo), average(manali), average(secretariat), average(solapur), average(katraj), average(midcKjutala)};

 
    //print a summary of the cities and their average PM2.5 levels rounded to the nearest one hundredth place
    for(int i = 0; i < avg.length; i++) {
      double newAvg = avg[i] * 100;
      newAvg = newAvg - (newAvg% 1);
      newAvg = newAvg/100;
      System.out.println("In the city of " + cities[i] + " the average PM2.5 level for the day is " + newAvg);
    }
    
  }//end of main method

	// The method below should print all of the data as a table. 
	// The method uses paramaters c which is the array of cities and d which is the 2D array of 24-hour PM2.5 levels.
	public static void printData(String[] c, double[][] d) {
    for(int r = 0; r < d.length; r++) {
      System.out.print("| " + c[r] + " | ");
      for(int col = 0; col < d[r].length; col++) {
        System.out.print(d[r][col] + " | ");
      }
      System.out.println();
    }
	}

  //the method uses a parameter which is a 1D array (one row from the 2D array)
  //the method should calculate and return the average of the values in the 1D array (or row)
 
 public static double average(double[] values) {
  double sum = 0;
  for(int i = 0; i < values.length; i++) {
    sum = sum + values[i];
  }
  sum = sum/values.length;
  return sum;
 }


} //end of class