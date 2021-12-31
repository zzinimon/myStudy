package myProject;

import java.io.File;

public class OrganizeMyComputer {

	public static void main(String[] args) {
		String path="";
//		String test="C:\\";
		File[] files=ShowFolderOnly(path);
		for (int i = 0; i < files.length; i++) {
			String str=files[i].toString();
			if(str.contains("WinSAT")) continue;
			if(folderIsNull(str)) {
				System.out.println(files[i]);
				//files[i].delete();
			}
		}
	}
 //해당 폴더의 모든 파일 보기
	static File[] dir(String path) {
	 File dir=new File(path);
	 File[] files=dir.listFiles();
	 try {
		 for (int i = 0; i < files.length; i++) {
			 //System.out.println(files[i]);
		 }
	} catch (Exception e) {
		System.out.println(path);
		System.out.println(e);
	}
	return files;
 }
	
//해당 폴더에서 파일만 return
	static File[] ShowFileOnly(String path) {
		File dir=new File(path);
		File[] files=dir.listFiles(n->n.isFile());
//		Arrays.stream(files).forEach(System.out::println);
		return files;
	}
//해당 폴더에서 폴더만 return
	static File[] ShowFolderOnly(String path) {
		File dir=new File(path);
		File[] folders=dir.listFiles(File::isDirectory);
//		Arrays.stream(folders).forEach(System.out::println);
		return folders;
	}
	
//폴더 내부가 null인지 확인
	static boolean folderIsNull(String folder) {
		return dir(folder).length==0?true: false;
	}
	
	
}
