// Air Quality Analyzer 2    A+CR
import java.util.ArrayList;

class MainTwo {

  // make sure to pass the correct arguments when calling the methods


  public static void main(String[] args) {
    //instantiate 1 ArrayList of City objects and initialize the ArrayList with City objects using the loadValues() method in the City class
	ArrayList<CityTwo> cities = CityTwo.loadValues();






    //print all the cities and their PM2.5 level
	for(int i =0; i<cities.size(); i++) {
		System.out.println(cities.get(i));
	}




    //call the findMax method and print all the cities (using a loop) with the worst air quality
	for(int i = 0; i < cities.size(); i++) {
		if(cities.get(i).getPMValue() == findMax(cities)) {
			System.out.println(cities.get(i).getName() + " has the worst air quality of " + cities.get(i).getPMValue());
		}
	}




    //call the findMin method and print all the cities (using a loop) with the best air quality
	for(int i = 0; i < cities.size(); i++) {
		if(cities.get(i).getPMValue() == findMin(cities)) {
			System.out.println(cities.get(i).getName() + " has the best air quality of " + cities.get(i).getPMValue());
		}
	}




  } //end of main method



	// The method below should find the maximum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the maxinum pollution value
	public static int findMax(ArrayList<CityTwo> c) {
		int temp = 0;
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() > c.get(temp).getPMValue()) {
				temp = i;
			}
		}
		return c.get(temp).getPMValue();
	}

  // The method below should find the minimum pollution value in the ArrayList of City objects instantiated above 
	// The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the minimum pollution value
	public static int findMin(ArrayList<CityTwo> c) {
		int temp = 0;
		for(int i = 0; i < c.size(); i++){
			if(c.get(i).getPMValue() < c.get(temp).getPMValue()) {
				temp = i;
			}
		}
		return c.get(temp).getPMValue();
	}

 
}