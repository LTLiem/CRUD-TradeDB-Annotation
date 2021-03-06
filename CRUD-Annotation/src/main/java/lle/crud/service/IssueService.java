package lle.crud.service;

import java.util.List;
import lle.crud.model.Issue;

public interface IssueService {
	
	public void createIssue(Issue issue);
	
	public void deleteIssue(Issue issue);
	
	public void updateIssue(Issue issue);
	
	public List<Issue> getAllIssue(); 
	
	public Issue getIssueByID(int id);
	
}
