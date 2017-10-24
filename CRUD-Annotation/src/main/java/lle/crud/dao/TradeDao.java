package lle.crud.dao;

import java.util.List;

import lle.crud.model.Trade;
import lle.crud.model.TradeId;


public interface TradeDao extends Dao<Trade> {
	public Trade getTradeByNbAndField(TradeId tradeId);
	public List<Trade> getTradeByNb(int nb);
	public Integer deleteTradeByKey(TradeId tradeId);
}
