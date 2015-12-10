package com.thread;

import java.util.ArrayList;
import java.util.List;

public class DataStruct {
	static List<Object> list = null;

	public static void show() {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static boolean insert(String str) {
		if (list.add(str))
			return true;
		return false;
	}

	public static void delete(String str) {
		list.remove(str);
	}

	public static void main(String[] args) {
		list = new ArrayList<Object>();
		insert("a");
		insert("s");
		insert("d");
		insert("f");
		insert("g");
		insert("h");
		insert("j");
		show();
		System.out.println("长度：" + list.size());
		delete("j");
		show();
		System.out.println("aaaaa");
	}
}
