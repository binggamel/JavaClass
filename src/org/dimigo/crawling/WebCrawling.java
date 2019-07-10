package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {

    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
//            System.out.println(doc.html());

//            class = "rank" - > .select".rank"
            Elements result = doc.select("[id=realTimeRankFavorite]").select("li").select("a");


            int i = 0 ;
            List<String> list =  result.eachText();
            for(String title : list ){
                System.out.printf("%d, %s\n", ++i, title);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

    }



}
