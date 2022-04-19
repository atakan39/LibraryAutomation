package com.library.pages;

public class US2 {

    public static final String barrowedBooks="SELECT count(is_returned) AS barrowedBooks FROM book_borrow Where is_returned=0";

}
