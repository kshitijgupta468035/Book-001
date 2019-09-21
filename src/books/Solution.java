package books;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        if (n > 0) {
            Books[] books = new Books[n];
            r.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String bookName = r.nextLine().trim();
                String authorName = r.nextLine().trim();
                String ISBN = r.nextLine().trim();
                books[i] = new Books(bookName, authorName, ISBN);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
            r.close();
        } else {
            System.out.println("N/A");
        }
    }
}
