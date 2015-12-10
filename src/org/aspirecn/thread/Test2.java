package org.aspirecn.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	static class Student{
		String name;
		
		public Student(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
//		ClassInfo[] classList=task.execute(conn, userid);			
//		if(classList!=null){
//			protocol.classList=new ArrayList<ClassInfo>(Arrays.asList(classList));
//		}
		Student s1 = new Student("aaa");
		Student s2 = new Student("bbb");
		Student s3= new Student("ccc");
		Student[]  studentList = {s1,s2,s3};
		@SuppressWarnings("unused")
		List<Student> list = new ArrayList<Student>(Arrays.asList(studentList));
		for (Student student : list) {
			System.out.println(student.name);
		}
	}
}
