package com.itheima.service.Impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookdao;

    public List<Book> findAll() {
        return bookdao.findAll();
    }
}
