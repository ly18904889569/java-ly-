package test3;

import java.util.ArrayList;
import java.util.Collections;

public class Main
{

	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();	//crazy：其中对于list的定义尖括号中需要用String或者类别名称不能够用int等
		
//		ArrayList<String> array = new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			Student student = new Student();
			student.setAge(i);
			student.setId("123456");
			list.add(student);
		}
		System.out.println(list);	//crazy：ArrayList众多功能中可以直接将数组进行输出。
		
		Collections.sort(list);
		for(Student student: list)
		{
			System.out.println(student);
		}
	}

}
