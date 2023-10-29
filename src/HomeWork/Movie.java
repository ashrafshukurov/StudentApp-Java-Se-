package HomeWork;

public class Movie implements Comparable<Movie> {
    private int year;
    public Movie(int year){
        this.year=year;
    }
   ///123 116 117 118
    @Override
    public int compareTo(Movie o) {
        if (this.year % 2 == 0 && o.year % 2 == 0) {
            return o.year - this.year;
        } else if (this.year % 2 != 0 && o.year % 2 != 0) {
            return this.year - o.year;
        } else if (this.year % 2 != 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public int getYear() {
        return year;
    }
}
