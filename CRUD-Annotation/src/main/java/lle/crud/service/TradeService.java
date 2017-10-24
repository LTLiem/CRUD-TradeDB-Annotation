package lle.crud.service;

import java.util.List;

import lle.crud.model.Trade;
import lle.crud.model.TradeId;

public interface TradeService {
	
	public void createTrade(Trade trade);
	
	public void deleteTrade(Trade trade);
	
	public void updateTrade(Trade trade);
	
	public List<Trade> getAllTrade(); 
	
	public Trade getTradeByNbAndField(TradeId tradeId);
	
	public List<Trade> getTradeByNb(int nb);
	
	public Integer deleteTradeByKey(TradeId tradeId);
	
}
