SELECT ID FROM users;

SELECT count(is_returned) AS barrowedBooks FROM book_borrow Where is_returned=0;

select bc.name,count(*) from book_borrow bb
                                 inner join books b on bb.book_id = b.id
                                 inner join book_categories bc on b.book_category_id=bc.id
group by name order by 2 desc;

select full_name,count(*) from users u inner join book_borrow bb on u.id = bb.user_id
group by full_name
order by 2 desc ;


