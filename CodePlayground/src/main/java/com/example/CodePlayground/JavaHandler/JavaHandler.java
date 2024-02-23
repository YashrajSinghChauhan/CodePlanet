package com.example.CodePlayground.JavaHandler;

public class JavaHandler {
	FileHelper fileHelper = null;   
	public void handleRequest(String userid,String code)
	{
		fileHelper = new FileHelper();
		fileHelper.createUserDir(userid);
	}
}
