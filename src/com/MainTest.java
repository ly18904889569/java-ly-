package com;

import java.io.File;
import java.io.IOException;

public class MainTest
{

	public static void main(String[] args)
	{
		// TODO write a java project to show the relative path of file
//		File file1 = new file();
		createFile();
	}
	public static void createFile()
	{
		String path = "E:/liyang/123/321";	//crazyl:create a relative path
		File f = new File(path);	//crazyl:this place has a question that if you want to create a file path like
		File fileParent = f.getParentFile();
		System.out.println("the folder path is "+f.getParentFile());
		if(!fileParent.exists())
		{
			fileParent.mkdirs();
		}
		if(!f.exists())				//this"E:/liyang/123/321",it can't success.Because you don't create a parentfile
		{
			f.mkdir();
		}
		System.out.println("the folder path is "+f);
		String filename="abc.txt";
		File file =new File(path,filename);
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
