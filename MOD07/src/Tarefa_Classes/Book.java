package Tarefa_Classes;

/**
 * @created 20/09/2022 - 2:25 PM
 * @project MOD07
 * Author Daniel Pedrozo
 */
public class Book {
    private String title;
    private String author;
    private int quantPages;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getQuantPages() {
        return quantPages;
    }
    public void setQuantPages(int quantPages) {
        this.quantPages = quantPages;
    }
    public void printBookInfo() {
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPages: "+getQuantPages());
    }
}
