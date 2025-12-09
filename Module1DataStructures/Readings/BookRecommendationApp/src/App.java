import java.util.ArrayList;

public class App {

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String args[]) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua Bloch"));
        recommendations.add(new Book("Clean Code", "Robert C. Martin"));
        recommendations.add(new Book("Java Concurrency", "Brian Goetz"));

        // TODO 1: Add 3 new books to the recommendation list
        recommendations.add(new Book("A", "1"));
        recommendations.add(new Book("B", "2"));
        recommendations.add(new Book("C", "3"));

        /* TODO 2: Update existing recommendations
         * at index 1 (2nd element)
         * at index 2 (3rd element)
         */
        recommendations.set(1, new Book("D", "4"));
        recommendations.set(2, new Book("E", "5"));

        /* TODO 3: Remove outdated recommendations
         * at index 0 (first place)
         * at index 3 (fourth place)
         */
        recommendations.remove(0);
        recommendations.remove(3);
    }
}

