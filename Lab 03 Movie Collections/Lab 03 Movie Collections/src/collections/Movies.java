package collections;

public class Movies extends MovieADT{
    public Movies() {
        super();
    }
    public Movies(String title){
        super(title);
    }
    public Movies(String title, String genre, int rating, int year){
        super(title,genre,rating,year);
    }
}