package test;

import java.io.File;
import java.io.IOException;

import file.FileUtil;

public class FileTest {
	public static void main(String []args){
		File f=new File("D:\\���ڹ�˾��Ŀ����");
		FileUtil filutil=new FileUtil();
		filutil.fileErgodic(f);
		
	}
	
//	public static void main(String[] args) throws IOException {
//		File f=new File("D:\\U��9Ԫ�����û�.txt");
//		FileUtil fileutil=new FileUtil();
//		fileutil.filewrit(f, "����");
//	}
	

}
