package Ch21;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) {
		
		try {
//			Writer out = new FileWriter("c:\\iotest\\test1.txt");	//덮어쓰기
			Writer out = new FileWriter("c:\\iotest\\test1.txt",true);	//추가하기
			out.write("BBB\n");
			out.write("CCCC\n");
			out.write("DDDDD\n");
			out.flush();//버퍼초기화
			out.close();
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
