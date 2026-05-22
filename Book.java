/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartlibraryproject;

public class Book {
    // Changing fields to private ensures compliance with the Information Hiding rubric    // Originally given:
    private int isbn;                                                                      // int isbn;
    private String title;                                                                  // String title, author;
    private String author;                                                                 // Book left, right;
    private Book left;
    private Book right;

    // Public constructor to initialize the book entity node                              
    public Book(int isbn, String title, String author) {                                  
        this.isbn = isbn;                                                                  
        this.title = title;                                                                
        this.author = author;
        this.left = null;
        this.right = null;
    }

    // Public Getters and Setters to safely bridge data to other structures
    public int getIsbn() { 
        return isbn; 
    }                                  
    
    public void setIsbn(int isbn) { 
        this.isbn = isbn; 
    }

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

    public Book getLeft() { 
        return left; 
    }
    
    public void setLeft(Book left) { 
        this.left = left; 
    }

    public Book getRight() { 
        return right; 
    }
    
    public void setRight(Book right) { 
        this.right = right; 
    }
}
