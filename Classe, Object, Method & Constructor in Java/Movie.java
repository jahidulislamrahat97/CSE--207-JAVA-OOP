/*
basic class & object & method 
*/


public class Movie {
    
    // field of class
    String title;
    String type;
    int rating;

    // method of class
    void paly_it(){
        System.out.println("Movie Name: "+title+"\nMovie Type: "+type+"\nRating: "+rating);
    }


    
    public static void main(String[] args) {
        // create object
        Movie movie1 = new Movie();
        // access field and method
        movie1.title = "End of the world.";
        movie1.type = "Sci-Fi";
        movie1.rating = 8;
        movie1.paly_it();
        

        // create object
        Movie movie2 = new Movie();
        // access field and method
        movie2.title = "Hello";
        movie2.type = "Thriller";
        movie2.rating = 5;
        movie2.paly_it();

    }    
}
