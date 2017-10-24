package lle.crud.service;

import java.util.List;

import lle.crud.model.Issue;
import lle.crud.model.TrnHdr;
import lle.crud.model.TrnHdrPK;

public interface TrnHdrService {
	public void createHeader(TrnHdr trnHdr);
	
	public void deleteHeader(TrnHdr trnHdr);
	
	public void updateHeader(TrnHdr trnHdr);
	
	public List<TrnHdr> getAllHeader(); 
	
	/**
	 * Get data by Family-Group-Type
	 * @param id
	 * @return
	 */
	public TrnHdr getIssueByFGT(TrnHdrPK trnHdrPK);
}
