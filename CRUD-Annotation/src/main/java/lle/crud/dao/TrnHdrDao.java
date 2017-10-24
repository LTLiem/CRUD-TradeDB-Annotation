package lle.crud.dao;

import lle.crud.model.TrnHdr;
import lle.crud.model.TrnHdrPK;

public interface TrnHdrDao extends Dao<TrnHdr> {
	//Add specified method for Trade header (TrnHdr)
	public TrnHdr getIssueByFGT(TrnHdrPK trnHdrPK);
}
