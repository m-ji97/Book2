package com.javaex.ex01;

import java.util.List;

public class BookApp {

	public static void main(String[] args) {

		AuthorDao authorDao = new AuthorDao();
		
		int cnt = authorDao.authorInsert("이효리", "제주도민");
		System.out.println(cnt + " success");
		 
		List<AuthorVo> authorList = authorDao.authorList();
		for(AuthorVo authorVo : authorList) {
			int id = authorVo.getAuthorId();
			String name = authorVo.getAuthorName();
			String desc = authorVo.getAuthorDesc();
			System.out.println(id + ",    " + name + ",    " + desc);
		}
		
		/*
		for(int i=0; i<authorList.size(); i++) {
		    AuthorVo authorVo = authorList.get(i);
		
			int id = authorVo.getAuthorId(); 
			String name = authorVo.getAuthorName();
			String desc = authorVo.getAuthorDesc();
			System.out.println(id + ",    " + name + ",    " + desc);
		}
		*/
		
		System.out.println(authorList.size() + "명의 작가가 등록되어 있습니다.");
		
		
		//authorDao.authorDelete(31);
		//authorDao.authorInsert("이효리", "제주도민");
		
		
		
		
		/*
		AuthorDao authorDao = new AuthorDao();
	
		
		authorDao.authorInsert("이문열", "경북영양");
		authorDao.authorInsert("박경리", "토지작가");

		authorDao.authorDelete(2);
		authorDao.authorUpdate(1, "기안84", "웹툰작가");
		List<AuthorVo> authorList = authorList();
		
		for()
		*/
	}

}
