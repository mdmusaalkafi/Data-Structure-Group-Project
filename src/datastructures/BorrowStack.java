package datastructures;

import entity.Book;
import java.util.Stack;

// Template file for Member 3.
// Replace these placeholders with the final stack-based borrowing history logic.
public class BorrowStack {
    private Stack<Book> stack;

    public BorrowStack() {
        // TODO (Member 3): initialize the stack used for borrow history.
        stack = new Stack<>();
    }

    public void push(Book b) {
        // TODO (Member 3): ignore null values and push valid books to the top of the stack.
    }

    public void show() {
        // TODO (Member 3): check isEmpty() first, then print from newest to oldest.
    }

    private boolean isEmpty() {
        // TODO (Member 3): return whether the stack has no items.
        return stack.isEmpty();
    }
}