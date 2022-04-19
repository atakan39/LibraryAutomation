package com.library.pages;

public class US4 {

    public static String popularUser="select full_name,count(*) from users u inner join book_borrow bb on u.id = bb.user_id group by full_name order by 2 desc";
}
