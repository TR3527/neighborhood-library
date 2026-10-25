package com.pluralsight;


public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Book(int id, String isbn, String title) {
        // TODO: initialize the fields (a new book is not checked out)
         this.id = id;
         this.isbn =isbn;
         this.title = title;


    }

    //method
    public void checkOut(String name) {
        // TODO
        this.checkedOutTo = name;
        this.isCheckedOut = true;

    }
    //method
    public void checkIn() {
        // TODO
        this.checkedOutTo ="";
        this.isCheckedOut = false;



    }

    // TODO: getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
