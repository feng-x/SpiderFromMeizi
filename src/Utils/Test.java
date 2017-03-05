package Utils;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws Exception {
//		String url ="http://www.mzitu.com/86778/1";
//		ArrayList<String> urls = new ArrayList<String>();
//		for(int i = 0;i<40;i++){
//			int lastnumber = url.indexOf("m")+16;
//			int ordernumber = Integer.parseInt(url.substring(lastnumber));
//			ordernumber++;
//			String preurl = url.substring(0, lastnumber);
//			url = preurl+String.valueOf(ordernumber);
//			String src = SpiderUtil.getSrc(url);
//			urls.add(src);
//		}
//		SpiderUtil.saveImage(urls);
		SpiderTest.getHtml();
	}
}
