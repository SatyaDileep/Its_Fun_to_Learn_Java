/**
 * 
 */
package com.java.pega.dummy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author thots
 *
 */
public class ThotsDailyLog implements DailyLog {

	/* (non-Javadoc)
	 * @see com.java.pega.dummy.DailyLog#startTheDay()
	 */
	@Override
	public void startTheDay() {
		// TODO Auto-generated method stub
		System.out.println("should get invoked..! day has begun");
	}

	/* (non-Javadoc)
	 * @see com.java.pega.dummy.DailyLog#initCommute()
	 */
	@Override
	public void initCommute() {
		// TODO Auto-generated method stub
		System.out.println("should get invoked..! day has ");
	}

	/* (non-Javadoc)
	 * @see com.java.pega.dummy.DailyLog#endCommute()
	 */
	@Override
	public void endCommute() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.java.pega.dummy.DailyLog#endTheDay()
	 */
	@Override
	public void endTheDay() {
		// TODO Auto-generated method stub
		System.out.println("should get invoked..! day has ended");
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hey there thots..!");
		
		// get the method names of this class - just exploring
		Class classObj = Class.forName("com.java.pega.dummy.ThotsDailyLog");
		ThotsDailyLog thotsDailyLog = new ThotsDailyLog();
		for(Method method : classObj.getDeclaredMethods()) {
			System.out.println(method.getName());
			if(method.getName().toLowerCase().contains("day")) {
				try {
					method.invoke(thotsDailyLog, args);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
