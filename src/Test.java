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

public class Test {

	static String website="";
	static String All="";
	static int countstock = 0;
	static ArrayList<String> names;
	
	public static void main(String[] args){
		
		website = "https://www.set.or.th/set/companyprofile.do?symbol=CHOTI&ssoPageId=4&language=th&country=TH";
		
		try {
			Document doc = Jsoup.connect(website).userAgent("mozilla/17.0").get();
			Elements temp = doc.select("div.table-reponsive");

			System.out.print("CHOTI: ");
			for(Element ele:temp){

				//System.out.println(" "+ ele.getAllElements().first().text() );

				names = new ArrayList<>(Arrays.asList(ele.getAllElements().first().text().split(" ")));


			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//---------------------------------------จำนวนหุ้น
		//---------------------------------------จำนวนหุ้น
		//---------------------------------------จำนวนหุ้น
		for(int i = 0 ; i < names.size() ; i++){
			if(names.get(i).equals("จำนวนหุ้นจดทะเบียนกับตลท.")){
				countstock = i+1;
				System.out.print("จำนวนหุ้น ");
				break;
			}
		}
		System.out.println(names.get(countstock));
		//---------------------------------------จำนวนหุ้น
		//---------------------------------------จำนวนหุ้น
		//---------------------------------------จำนวนหุ้น
		
		
	}
	
}
