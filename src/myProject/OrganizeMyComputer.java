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
 //�ش� ������ ��� ���� ����
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
	
//�ش� �������� ���ϸ� return
	static File[] ShowFileOnly(String path) {
		File dir=new File(path);
		File[] files=dir.listFiles(n->n.isFile());
//		Arrays.stream(files).forEach(System.out::println);
		return files;
	}
//�ش� �������� ������ return
	static File[] ShowFolderOnly(String path) {
		File dir=new File(path);
		File[] folders=dir.listFiles(File::isDirectory);
//		Arrays.stream(folders).forEach(System.out::println);
		return folders;
	}
	
//���� ���ΰ� null���� Ȯ��
	static boolean folderIsNull(String folder) {
		return dir(folder).length==0?true: false;
	}
	
	
}
