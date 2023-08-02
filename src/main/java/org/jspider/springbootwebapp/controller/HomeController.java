package org.jspider.springbootwebapp.controller;

import org.jspider.springbootwebapp.domain.Book;
import org.jspider.springbootwebapp.domain.Laptop;
import org.jspider.springbootwebapp.domain.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    List<Stock> stockList = new ArrayList<>();

    {
        stockList.add(new Stock(1, "ABC", 120, 122));
        stockList.add(new Stock(2, "PQR", 190, 220));
        stockList.add(new Stock(3, "LMN", 160, 145));
        stockList.add(new Stock(4, "STU", 250, 310));
        stockList.add(new Stock(5, "XYZ", 410, 370));
    }


    List<Book> bookList = new ArrayList<>();

    {
        bookList.add(new Book(101, "SQL", 1200));
        bookList.add(new Book(102, "WEB TECH", 1300));
        bookList.add(new Book(103, "JAVA", 1400));
        bookList.add(new Book(104, "J2EE", 1500));
    }

    @GetMapping("/welcome")
    public String getMessage() {
        return "welcome";
    }


    @GetMapping("/laptop")
    public String getLaptop(Model model) {
        Laptop l1 = new Laptop("hp", 5678.8);
        model.addAttribute("laptop", l1);


        return "laptop";
    }

    @GetMapping("/book")
    public String getBook(Model model) {
        model.addAttribute("books", bookList);
        return "book";
    }


    @GetMapping("/stocks")
    public String getStock(Model model) {
        model.addAttribute("stocks", stockList);
        return "stocks";
    }

    //show stock form
    @GetMapping("/showform")
    public String showStockForm(Model model){
        model.addAttribute("stock",new Stock());
        return "stockform";
    }


    //add stock into list
    @PostMapping("/savestock")
    public  String addStock(Stock stock){
        stockList.add(stock);
        return "redirect:/stocks";
    }
}