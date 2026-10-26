package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[20];

        Book book0 = new Book(0,"10567812","The Polar Express") ;
        books[0] = book0;

        Book book1 = new Book(1,"10567966","The Great Gatsby") ;
        books[1] = book1;


        Book book2 = new Book(2,"10567237","Dracula") ;
        books[2] = book2;

        Book book3 = new Book(3,"10567002","Wuthering Heights") ;
        books[3] = book3;

        Book book4 = new Book(4,"10567995","The Lord of the Rings") ;
        books[4] = book4;

        Book book5 = new Book(5,"10567000","Brave New World") ;
        books[5] = book5;

        Book book6 = new Book(6,"10567116","Pride and Prejudice") ;
        books[6] = book6;

        Book book7 = new Book(7,"10567907","To Kill a Mockingbird") ;
        books[7] = book7;

        Book book8 = new Book(8,"10567009","The Hobbit") ;
        books[8] = book8;

        Book book9 = new Book(9,"10567889","1984") ;
        books[9] = book9;

        Book book10 = new Book(10,"10567223","The Great Gatsby") ;
        books[10] = book10;

        Book book11 = new Book(11,"10567456","The Odyssey") ;
        books[11] = book11;

        Book book12 = new Book(12,"10567890","The Old Man and the Sea") ;
        books[12] = book12;

        Book book13 = new Book(13,"10567112","Of Mice and Men") ;
        books[13] = book13;

        Book book14 = new Book(14,"10234055","The Alchemist") ;
        books[14] = book14;

        Book book15 = new Book(15,"10567975","The Kite Runner") ;
        books[15] = book15;

        Book book16 = new Book(16,"15879655","The Great Gatsby") ;
        books[16] = book16;

        Book book17 = new Book(18,"10566775","Treasure Island") ;
        books[17] = book17;

        Book book18 = new Book(18,"10565467","War and Peace") ;
        books[18] = book18;

        Book book19 = new Book(19,"10564432","The Shining") ;
        books[19] = book19;


    for (int i = 0; i < books.length; i++){

        if(books[i].isCheckedOut() == false ){
            System.out.println(books[i].toString() + " is available!");
        }

    }


    }
}
