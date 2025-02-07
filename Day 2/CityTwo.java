import java.util.ArrayList;

// instance variables are the city name and the PM value for that city

class CityTwo {
    String name;
    int pmValue;

    public CityTwo() {
        name = "no name";
        pmValue = 0;
    }

    public CityTwo(String nm, int pm) {
        name = nm;
        pmValue = pm;
    }

    public String getName() {
        return name;
    }

    public int getPMValue() {
        return pmValue;
    }

    public static ArrayList<CityTwo> loadValues() {
         // set up parallel arrays with the city names and pollution data
          // initialize each array with the information from the Student Data Set A, B, C, or D
      String[] cities = {"Miami", "New Orleans", "San Francisco", "Atlanta"};

      int[] pmValues = {48,46,25,46,};

      //create an array of City objects
      ArrayList<CityTwo> theC = new ArrayList<CityTwo>();

      for (int i = 0; i < 4; i++)
      {
        theC.add(new CityTwo(cities[i], pmValues[i]));
      }
      
      return theC;

    }

    public String toString() {
        return (name + " has pollution value of " + pmValue +".");
    }

}