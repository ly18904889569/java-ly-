package test3;

public class Student implements Comparable<Student>
{
	private String id;
	
	private String name;
	
	private int age;
	
	public Student()
	{
		
	}
	
	

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Student o)
	{
		//降序
        return o.age - this.age;
        //升序
//        return this.age - o.age;  
	}
	
}
