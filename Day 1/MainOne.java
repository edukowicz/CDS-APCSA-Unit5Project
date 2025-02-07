// Air Quality Analyzer Starter 1   A+CR
class MainOne {

    // make sure to pass the correct arguments when calling the methods
 

      public static void main(String[] args) {
        
        //create 1 array of City objects and initialize the array with City objects using the loadValues() method in the City class
        CityOne[] cities = CityOne.loadValues();
    

        //print all the cities and their PM2.5 level
        for(int i = 0; i < cities.length; i++) {
          System.out.println(cities[i]);
        }
    
    
        //call the findMax method and print all the cities (using a loop) with the worst air quality
        for(int i = 0; i < cities.length; i++) {
          if(cities[i].getPMValue() == findMax(cities)){
            System.out.println(cities[i].getName() + " has the worst air quality of " + findMax(cities));
          }
        }
    
    
        //call the findMin method and print all the cities (using a loop) with the best air quality
        for(int i = 0; i < cities.length; i++) {
          if(cities[i].getPMValue() == findMin(cities)){
            System.out.println(cities[i].getName() + " has the best air quality of " + findMin(cities));
          }
        }
    

      } //end of main method
    
    
        // The method below should find the maximum pollution value in the array of City objects instantiated above 
        // The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the maxinum pollution value
        public static int findMax(CityOne[] c) {
          int temp = 0;
          for(int i = 0; i < c.length; i++) {
            if(c[temp].getPMValue() < c[i].getPMValue()) {
              temp = i;
            }
          }
          return c[temp].getPMValue();
        }
    
        // The method below should find the minimum pollution value in the array of City objects instantiated above 
        // The method will need to call the getPMValue method in the City class to retrieve each city's pollution value and return the minimum pollution value
        public static int findMin(CityOne[] c) {
          int temp = 0;
          for(int i = 0; i < c.length; i++) {
            if(c[temp].getPMValue() > c[i].getPMValue()) {
              temp = i;
            }
          }
          return c[temp].getPMValue();
        }
      
    }