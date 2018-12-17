package com.test;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string=new String("java");
		StringBuffer stringBuffer=new StringBuffer("java");
		rep(string);
		append(stringBuffer);
		System.out.println(string+stringBuffer);
	}
	public static void rep(String text){
		text="aaaa";
		System.out.println(text);
	}
	public static void append(StringBuffer stringBuffer){
		stringBuffer=new StringBuffer("ss");
		
	}
	public static String getStr(){
		System.out.println("A");
		return "A";
	}
}
