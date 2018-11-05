package com.itheima.dao;

import com.itheima.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookDao {

    List<Book> findAll();
}
