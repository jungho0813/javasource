package service;

import persistence.SampleDAO;

public class InsertService {
	public boolean insertArticle() {
		boolean isArticle = false;
		
		SampleDAO dao = new SampleDAO();
		isArticle = dao.insert();
		
		return isArticle;
	}
	
	
}
