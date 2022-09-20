package Tarefa_Classes;

/**
 * @created 20/09/2022 - 2:39 PM
 * @project MOD07
 * Author Daniel Pedrozo
 */
public class MainBook {
    public static void main(String args[]) {
        Book book = new Book();
        book.setTitle("Java for Ultra Newbies");
        book.setAuthor("Daniel Pedrozo");
        book.setQuantPages(1000);
        book.printBookInfo();
    }

}
