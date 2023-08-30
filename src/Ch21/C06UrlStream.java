package Ch21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C06UrlStream {
	
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("https://sports.news.naver.com/wfootball/index");
		InputStream bin = url.openStream();
		BufferedInputStream buffIn = new BufferedInputStream(bin);
		
		
		Reader r = new InputStreamReader(buffIn);
		
		OutputStream out = new FileOutputStream("c:\\iotest\\index.html");
		Writer wout = new OutputStreamWriter(out);
		while(true) {
			int data = r.read();
			if(data==-1)
				break;
			System.out.println((char)data);
			wout.write(data);
		}
	}

}
