package entity;

// Template file for Member 1.
// Fill in the data node behavior here before merging the full BST.
public class Book {
    private int isbn;
    private String title;
    private String author;
    private Book left;
    private Book right;

    public Book(int isbn, String title, String author) {
        // TODO (Member 1): initialize the book data and set both child pointers to null.
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.left = null;
        this.right = null;
    }

    public int getIsbn() {
        // TODO (Member 1): return the private ISBN value.
        return isbn;
    }

    public String getTitle() {
        // TODO (Member 1): return the private title value.
        return title;
    }

    public String getAuthor() {
        // TODO (Member 1): return the private author value.
        return author;
    }

    public Book getLeft() {
        // TODO (Member 1): return the left child pointer.
        return left;
    }

    public Book getRight() {
        // TODO (Member 1): return the right child pointer.
        return right;
    }

    public void setLeft(Book left) {
        // TODO (Member 1): assign the left child pointer.
        this.left = left;
    }

    public void setRight(Book right) {
        // TODO (Member 1): assign the right child pointer.
        this.right = right;
    }

    @Override
    public String toString() {
        // TODO (Member 1): format this node for console output if the team wants a different style.
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author;
    }
}