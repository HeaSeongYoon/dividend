package com.example.dividend;


import com.example.dividend.model.Company;
import com.example.dividend.scraper.Scraper;
import com.example.dividend.scraper.YahooFinanceScraper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

/*
        Scraper scraper = new YahooFinanceScraper();
//        var result =  scraper.scrap(Company.builder().ticker("0").build());
        var result = scraper.scrapCompanyByTicker("MMM");
        System.out.println(result);
*/

    }

}
