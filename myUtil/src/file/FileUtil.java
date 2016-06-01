package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	/**
	 * 文件遍历，不可直接遍历盘符
	 * 
	 * @param file
	 */
	public void fileErgodic(File file) {
		if (!file.exists()) {
			System.out.println("文件不存在");
			return ;
		}

		if (file.isDirectory()) {
			System.out.println("文件夹：" + file.getName());
			File[] filelist = file.listFiles();
			for (File f : filelist) {
				fileErgodic(f);
			}
		}
		if (file.isFile()) {
			System.out.println(file.getName());
		}
		if (file.isHidden()) {
			System.out.println("隐藏文件：" + file.getName());
		}
		
	}
	
	/**
	 * 文件拷贝
	 * @throws FileNotFoundException 
	 */
	public void filecopy(String newpath,File file) throws FileNotFoundException{
		if(!file.exists()){
			System.out.println("文件不存在");
			return ;
		}
		FileReader reader=new FileReader(file);
		
	}
	
	public void filewrit(File f,String sql) throws IOException{
		if(!f.exists()){
			f.createNewFile();
		}
		FileWriter fw=new FileWriter(f);
		fw.write(sql);
		fw.flush();
		fw.close();
		
	}
	
}
