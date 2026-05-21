package datastructures;

import entity.Book;

// Template file for Member 1 and Member 2.
// Insert the final BST logic here after everyone agrees on the method contracts.
public class BookBST {
    private Book root;

    public void insert(int isbn, String title, String author) {
        // TODO (Member 1): call the recursive insert helper and update root.
        // root = ins(root, isbn, title, author);
    }

    private Book ins(Book r, int i, String t, String a) {
        // TODO (Member 1): recursively compare ISBN values and place the new node in the correct branch.
        // TODO (Member 1): decide the duplicate ISBN rule here.
        return r;
    }

    public Book search(int isbn) {
        // TODO (Member 1): call the recursive search helper and return the result.
        return null;
    }

    private Book sea(Book r, int i) {
        // TODO (Member 1): implement the recursive search base case and branch selection.
        return null;
    }

    public void delete(int isbn) {
        // TODO (Member 2): call the recursive delete helper and update root.
    }

    private Book del(Book root, int isbn) {
        // TODO (Member 2): implement leaf, one-child, and two-child deletion cases.
        // TODO (Member 2): use the in-order successor and rewire pointers safely.
        return root;
    }

    private Book getMin(Book root) {
        // TODO (Member 2): walk left until the smallest node in the subtree is found.
        return root;
    }
}