package com.itheima.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){

        System.out.println("springboot is running...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");

        System.out.println("id ==> " + id);
        return "hello , spring boot!";
    }

}


