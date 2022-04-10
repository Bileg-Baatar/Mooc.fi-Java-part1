/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bileg
 */
public class Book {
    private String title;
    private String pages;
    private String year;
    
    public Book(String titleBook, String numberPages, String pubYear){
        this.title = titleBook;
        this.pages = numberPages;
        this.year = pubYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title+", "+this.pages+" pages, "+this.year;
    }
}
