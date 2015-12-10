package com.aspirecn.test;

public class Test3 extends Thread{
	
	
	

	public static class InnerClass{
		String name;
		String sex;
		int age;

		public InnerClass(String name, String sex, int age) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
	}
	
	public InnerClass add(String name,String sex,int age){
//		InnerClass ic = new InnerClass(name, sex, age);
//		ic.name = ic;
//		Test3.InnerClass ti = new Test3.InnerClass(name, sex, age);
		return null;
	}
	
	public static void main(String[] args) {
		byte[] data = {1,2,3,4};
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		short command = (short) ((data[0] << 8) + data[1]);
		System.out.println(command);
		System.out.println(Integer.toHexString(command));
	}
	
	public void run()
	{
		
	}
}
