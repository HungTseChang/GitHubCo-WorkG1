package com.tha103.cooklab;

import java.util.ArrayList;
import java.util.List;


public class Hellochunchungwang {

	public static void main(String[] args) {
//		System.out.print("Hello ChunChungWang");
	HelloDing Ding = new HelloDing();
	HelloHo Ho =new  HelloHo();
	HelloMartin  Martin  = new HelloMartin();
	HelloTom Tom = new HelloTom();
	HelloWorld_rs rs = new HelloWorld_rs();
	List<String> data = new ArrayList<String>();
	data.add(Ding.getClass().getName());
	data.add(Ho.getClass().getName());
	data.add(Martin.getClass().getName());
	data.add(Tom.getClass().getName());
	data.add(rs.getClass().getName());
	int random = (int)Math.random()*5;
	System.out.println("Hello "+data.get(random));
	
}}
