package com.example.application.controller;

@RestController // Annotation for endpoints that return data. HTTP requests. (GET,POST,ETC)
@Requestmapping("/") // Annotation that maps requests in methods. URL prefix.

public class ApplicationController {

    @GetMapping("/nome") // maps GET requests for methods. URL prefix, sets a name for the method.
    public int metodo(int param, int etros){
        return metodo(param, etros);
    }

}
