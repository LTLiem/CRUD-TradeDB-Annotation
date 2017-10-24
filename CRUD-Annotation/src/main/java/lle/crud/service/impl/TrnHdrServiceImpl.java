package lle.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lle.crud.dao.TrnHdrDao;
import lle.crud.model.TrnHdr;
import lle.crud.model.TrnHdrPK;
import lle.crud.service.TrnHdrService;

@Service("TradeHeaderService")
@Transactional
public class TrnHdrServiceImpl implements TrnHdrService {

	@Autowired
	private TrnHdrDao trnHdrDao;
	
	public void createHeader(TrnHdr trnHdr) {
		trnHdrDao.create(trnHdr);
	}

	public void deleteHeader(TrnHdr trnHdr) {
		trnHdrDao.delete(trnHdr);
	}

	public void updateHeader(TrnHdr trnHdr) {
		trnHdrDao.update(trnHdr);
	}

	public List<TrnHdr> getAllHeader() {
		return trnHdrDao.getAll();
	}

	public TrnHdr getIssueByFGT(TrnHdrPK trnHdrPK) {
		return trnHdrDao.getIssueByFGT(trnHdrPK);
	}

}
