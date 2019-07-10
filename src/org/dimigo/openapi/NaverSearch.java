package org.dimigo.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class NaverSearch {
    public static void main(String[] args) {
        String clientId = "wYusuXRrCfQG_yagpmTD";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "L0a0n7rDVk";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("binggamel", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/blog?query="+ text; // json 결과 query에 검색어가 들어감
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream())); //한 줄 한 줄 읽어옴
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = br.readLine()) != null) { //계속 넘겨 받음
                response.append(inputLine);
            }

            br.close();
            System.out.println(response.toString()); //stirng Bufferㄴ에 있는 내용 나와야 함

            parseBook(response.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void parseBook(String json) throws Exception{
        Map map = new ObjectMapper().readValue(json, Map.class); //keyvalue값으로 다 바꿔줌
        List<Map<String,String>> list = (List) map.get("items");
        int i = 0 ;
        for(Map<String,String> blog : list){
            String title = blog.get("title");
            String description = blog.get("description");
            String bloggerlink = blog.get("bloggerlink");
            System.out.printf("%d. %s %s %s\n", ++i,title,description,bloggerlink);

        }


    }
}

// { -> HashMap
// [ -> ArrayList
