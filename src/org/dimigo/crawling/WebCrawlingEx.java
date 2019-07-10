package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawlingEx {
    public static void main(String[] args) {

        try{
            Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();


            Elements songName = doc.select("[id=frm]").select("[id=lst50]").select("td").select("[class=ellipsis rank01]").select("span").select("a");
            Elements artist = doc.select("[id=frm]").select("[id=lst50]").select("td").select("[class=ellipsis rank02]").select("span").select("a");


            Elements calender = doc.select("[class=multi_row]").select("[class=hhmm]").select("span");

//            Elements likenumber = doc.select("[id=frm]").select("[id=lst50]").select("td").select("[class=cnt]");

//            Elements album = doc.select("[id=frm]").select("[id=lst50]").select("td").select("[class=ellipsis rank03]").select("span");


            List<String> list =  songName.eachText();
            List<String> list2 = artist.eachText();
            List<String> list3 = calender.eachText();
//            List<String> list4 = likenumber.eachText();
//            List<String> list5 = album.eachText();
//            List<String> list4 = timer.eachText();


            System.out.printf("%s\n",list3);

            int i = 0 ;
            int j = 0;
            for(String title : list ){

                System.out.printf("%d위 : %s\n", ++i, title);
                System.out.printf("- 가수 : %s \n", list2.get(j++));
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
