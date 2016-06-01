package test;

import java.io.File;
import java.io.IOException;

import file.FileUtil;

public class FileTest {
	public static void main(String []args){
		File f=new File("D:\\现在公司项目资料");
		FileUtil filutil=new FileUtil();
		filutil.fileErgodic(f);
		
	}
	
//	public static void main(String[] args) throws IOException {
//		File f=new File("D:\\U币9元以上用户.txt");
//		FileUtil fileutil=new FileUtil();
//		fileutil.filewrit(f, "我日");
//	}
	

}
