package core;

import datastructures.BookBST;
import datastructures.BorrowStack;
import entity.Book;
import java.util.InputMismatchException;
import java.util.Scanner;

// Template file for Member 4.
// This class should become the menu/controller layer after the team fills in the interaction logic.
public class SmartLibrary implements LibraryADT {
    private BookBST catalogue;
    private BorrowStack history;
    private Scanner sc;

    public SmartLibrary() {
        // TODO (Member 4): initialize the catalogue, history, and scanner.
        catalogue = new BookBST();
        history = new BorrowStack();
        sc = new Scanner(System.in);
    }

    public void runMenu() {
        // TODO (Member 4): repeatedly print the menu, read a choice, and stop only when Exit is selected.
        printMenu();
    }

    private void printMenu() {
        // TODO (Member 4): write the full menu text and prompt the user for input.
        System.out.println();
    }

    private boolean handleChoice(int choice, Scanner sc) {
        // TODO (Member 4): route each valid menu choice to the correct public method.
        // TODO (Member 4): keep invalid choices inside a default case so the menu does not crash.
        return choice != 0;
    }

    private int getValidInt(Scanner sc) {
        // TODO (Member 4): use try/catch for InputMismatchException and clear the scanner buffer.
        return 0;
    }

    @Override
    public void addBook(int isbn, String title, String author) {
        // TODO (Member 4): call catalogue.insert(...) after the team finalizes validation.
    }

    @Override
    public void borrowBook(int isbn) {
        // TODO (Member 4): search the catalogue, delete the found book, and push it into history.
        // TODO (Member 4): guard against null results before pushing to the stack.
    }

    @Override
    public void viewLatestHistory() {
        // TODO (Member 4): delegate to the BorrowStack show method.
    }

    @Override
    public void searchBook(int isbn) {
        // TODO (Member 4): search the BST and print a success or not-found message.
    }
}