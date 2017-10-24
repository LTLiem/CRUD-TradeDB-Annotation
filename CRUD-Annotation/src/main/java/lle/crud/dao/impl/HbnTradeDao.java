package lle.crud.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import lle.crud.dao.TradeDao;
import lle.crud.model.Trade;
import lle.crud.model.TradeId;

@Repository
public class HbnTradeDao extends AbstractHbnDao<Trade> implements TradeDao {

	public Trade getTradeByNbAndField(TradeId tradeId) {
		Trade result = null;	
		
		result = (Trade)getSession()
					 .createQuery("from Trade where NB = :NB and field = :field")
					 .setParameter("NB", tradeId.getNb())
					 .setParameter("field", tradeId.getField().trim())
					 .uniqueResult();		
		return result;
	
	}
	
	@SuppressWarnings("unchecked")
	public List<Trade> getTradeByNb(int nb) {
		List<Trade> result = null;			
		result = (List<Trade>)getSession()
				 .createQuery("from Trade where NB = :NB")
				 .setParameter("NB", nb)					
				 .list();	
		return result;	
	}
	
	/**
	 * Delete a row in trade table
	 * Return
	 * 		 > 0 : delete sucessful
	 * 		 = 0 : delete fail
	 */
	
	public Integer deleteTradeByKey(TradeId tradeId) {
		int result = -1;
			
		result = (Integer)getSession()
				.createQuery("delete Trade where NB = :NB and field = :field")
				.setParameter("NB", tradeId.getNb())
				.setParameter("field", tradeId.getField().trim())
				.executeUpdate();	
		return result;	
	}
}
