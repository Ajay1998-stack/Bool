package com.stackroute;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
//            Document doc = Jsoup.connect("https://www.imdb.com/search/title/?groups=top_250&sort=user_rating").userAgent("mozilla/17.0").get();
//            Elements temp = doc.select("div.lister-item-content");

            Document doc = Jsoup.connect("https://www.google.com/search?client=ubuntu&channel=fs&q=distance+from+bangalore+to+mysore&ie=utf-8&oe=utf-8").userAgent("mozilla/17.0").get();
            Elements temp = doc.select("div.BbbuR uc9Qxb uE1RRc");

            int i=0;
            for(Element variable:temp){
                i++;
                System.out.println(i+" "+variable.getElementsByTag("span").first().text());

            }

        }

        catch(IOException e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
