package com.multi.mvc01.dao;

import com.multi.mvc01.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {

    @Autowired
    SqlSessionTemplate my;

    public int createBook(BookDTO bookDTO) {
        return my.insert("book.createbook", bookDTO);
    }

    public BookDTO getBook(String id){
        return my.selectOne("book.getbook", id);
    }

    public int updateBook(BookDTO bookDTO){
        return my.update("book.updatebook", bookDTO);
    }

    public int deleteBook(String id){
        return my.delete("book.deletebook", id);
    }

    public List<BookDTO> getBooks(){
        return my.selectList("book.getbooks");

    }

}
