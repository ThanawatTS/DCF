import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
	
	static String website="";
	static String All="";
	static int countpfofstock = 0, countprice=0;
	static ArrayList<String> names;
	
	public static void main (String[] args){

		website = "https://www.set.or.th/set/companyhighlight.do?symbol=CHOTI&ssoPageId=5&language=th&country=TH";
		
		try {
			Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
			Elements temp = doc.select("table.table-info");

			System.out.print("CHOTI: ");
			
			for(Element ele:temp){

				//System.out.println(" "+ ele.getAllElements().first().text() );

				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));

				

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < names.size() ; i++){
			if(names.get(i).equals("กำไรต่อหุ้น")){
				countpfofstock = i+2;
				System.out.print("กำไรต่อหุ้น ");
				break;
			}
		}
		for(int i = 0 ; i < 5 ; i++){
			System.out.print(names.get(countpfofstock+i) );
		}
		
		for(int i = 0 ; i < names.size() ; i++){
			if(names.get(i).equals("ราคาล่าสุด(บาท)")){
				countprice = i+1;
				System.out.print("ราคาล่าสุด ");
				break;
			}
		}
		for(int i = 0 ; i < 5 ; i++){
			System.out.print(names.get(countprice+i) );
		}
		
		
	}
	
}
