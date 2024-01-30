package com.javaex.ex02;

import java.util.List;

import com.javaex.ex01.AuthorDao;

public class BookApp {

	public static void main(String[] args) {

		AuthorDao authorDao = new AuthorDao();
		authorDao.authorInsert("서장훈", "농구선수");
		authorDao.authorInsert("안정환", "축구선수");

		AuthorVo authorVo = new AuthorVo("황일영", "개발강사");
		authorDao.authorInsert(authorVo);

		authorDao.authorDelete(26);
		authorDao.authorDelete(27);
		authorDao.authorDelete(28);

		List<AuthorVo> authorList= authorDao.authorList();
		for(AuthorVo vo : authorList) {
			System.out.println(vo.getAuthorId() + ","
					+ vo.getAuthorName() + ", "
					+ vo.getAuthorDesc());
		}

	}
}
