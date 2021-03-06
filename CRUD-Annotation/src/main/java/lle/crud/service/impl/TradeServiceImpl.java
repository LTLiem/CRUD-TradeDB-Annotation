package lle.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lle.crud.dao.TradeDao;
import lle.crud.model.Trade;
import lle.crud.model.TradeId;
import lle.crud.service.TradeService;

@Service("TradeService")
@Transactional
public class TradeServiceImpl implements TradeService {
	
	@Autowired
	private TradeDao tradeDao;

	public void createTrade(Trade trade) {
		tradeDao.create(trade);
	}

	public void deleteTrade(Trade trade) {
		tradeDao.delete(trade);		
	}
	
	public void updateTrade(Trade trade) {
		tradeDao.update(trade);
	}

	public List<Trade> getAllTrade() {
		return tradeDao.getAll();
	}

	public Trade getTradeByNbAndField(TradeId tradeId) {
		return tradeDao.getTradeByNbAndField(tradeId);
	}

	public List<Trade> getTradeByNb(int nb) {
		return tradeDao.getTradeByNb(nb);
	}

	public Integer deleteTradeByKey(TradeId tradeId) {
		return tradeDao.deleteTradeByKey(tradeId);
	}
	
	
}
