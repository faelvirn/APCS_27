package pkg;

public class Movie{
    private String name;
    private double rating;
    private int numberofRatings;
    private int revenue;

    public Movie(){
        name = "Avengers";
        rating = 8.0;
        numberofRatings = 33;
        revenue = 623357910;
    }
    public Movie(String name){
        this.name = name;
        rating = 0;
        numberofRatings = 0;
        revenue = 0;
    }
    public Movie(double rating){
        name = "";
        this.rating = rating;
        numberofRatings = 0;
        revenue = 0;
    }
    public Movie(int revenue){
        name = "";
        rating = 0;
        numberofRatings = 0;
        this.revenue = revenue;
    }
    public Movie(String name, double rating, int numberofRatings, int revenue){
        this.name = name;
        this.rating = rating;
        this.numberofRatings = numberofRatings;
        this.revenue = revenue;
    }

    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public int getRaters(){
        return numberofRatings;
    }

    public void addRating(double newRating){
        rating = (rating*numberofRatings)+newRating;
        numberofRatings ++;
        rating = rating/numberofRatings;
    }

    public boolean compareRatings(Movie movie2){
        if(rating > movie2.getRating()){
            return true;
        }
        else{
            return false;
        }
    }

    public String revenueToString(){
        String revenue1 = revenue+"";

        return revenue1;
    }

    public void movieToString(){
        System.out.println("Movie: " + name + "\nRating: " + rating + "\nNumber of Ratings: " + numberofRatings + "\nRevenue: " + revenue);
        System.out.println("");
    }

    public Movie pirateMovie(){
        Movie newMovie = new Movie(name, rating, numberofRatings, revenue);
        return newMovie;
    }
}