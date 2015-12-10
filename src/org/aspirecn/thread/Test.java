package org.aspirecn.thread;

public class Test extends TestParent implements Runnable{

	public void run ()
	{
		System.out.println("test start..."+getName("lqh"));
	}
}
