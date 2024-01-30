package com.javaex.ex03;

public class BookApp {
	
	public static void main(String[] args) {
		
	//작가5명 등록
		AuthorDao authorDao = new AuthorDao();
		authorDao.authorInsert("d","");
		authorDao.authorInsert("","");
		authorDao.authorInsert("","");
		authorDao.authorInsert("","");
		authorDao.authorInsert("","");
	
	//작가 출력
		

	//작가2명 삭제
		AuthorDao authorDao = new AuthorDao();
		authorDao.authorDelete();
		authorDao.authorDelete();

	//작가1명 수정

	//작가 출력

	//책 5권등록

	//책 수정

	//책 삭제

	//책 1권출력

	//책만 다 출력

	//책+작가 다출력		

	}

}
