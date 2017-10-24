package lle.crud.dao.impl;

import org.springframework.stereotype.Repository;

import lle.crud.dao.TrnHdrDao;
import lle.crud.model.TrnHdr;
import lle.crud.model.TrnHdrPK;

@Repository
public class HbnTrnHdr extends AbstractHbnDao<TrnHdr> implements TrnHdrDao {

	public TrnHdr getIssueByFGT(TrnHdrPK trnHdrPK) {
		TrnHdr trnHdr = null;
		
		//String trnType = trnHdrPK.getTrnType().equals("") ? "0" : trnHdrPK.getTrnType();
		
		trnHdr = (TrnHdr)getSession()
				.createQuery("from TrnHdr where trnHdrPK.trnFmly like :trnFmly "
						+ "and trnHdrPK.trnGrp like :trnGrp and trnHdrPK.trnType = :trnType")
				.setParameter("trnFmly", trnHdrPK.getTrnFmly())
				.setParameter("trnGrp", trnHdrPK.getTrnGrp())
				.setParameter("trnType", trnHdrPK.getTrnType())
				.uniqueResult();
		
		return trnHdr;
	}
}
