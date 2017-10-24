import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import lle.crud.model.Issue;
import lle.crud.model.Trade;
import lle.crud.model.TradeId;
import lle.crud.model.TrnHdr;
import lle.crud.model.TrnHdrPK;
import lle.crud.service.IssueService;
import lle.crud.service.TradeService;
import lle.crud.service.TrnHdrService;

public class main {

	public static void main(String[] args) {
					
//			File file = new File("applicationContext.xml");
//			//URL url = Thread.class.getClassLoader().getResource("applicationContext.xml");
//			System.out.println(file.getAbsolutePath());
//			System.out.println(url.toString());
//			
			ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
			
			//System.out.println(context.getBeanDefinitionNames().getClass());
			//Object obj = context.getBean("issueService");
			IssueService issueService = context.getBean(IssueService.class);
			TradeService tradeService = context.getBean(TradeService.class);
			TrnHdrService trnHdrService = context.getBean(TrnHdrService.class);
			
			//System.out.println(obj.getClass());
			//System.out.println(issueService.getClass());
			
			//Issue issue = new Issue();
			//issue.setFieldValues("test add new issue 1002");
			
			//issueService.createIssue(issue);

			//IssueService issueService;
			//System.out.println("Load application context finished !");
			
			/*Issue issue = null;
			issue = issueService.getIssueByID(1);
			System.out.println(issue.getTradeList().get(1).getId().getNb());*/
			
			/*List<Trade> trades = null;
			trades = tradeService.getAllTrade();
			for (Trade t : trades) {
				System.out.println(t.getId().getNb() + " " + t.getId().getField() + " " + t.getIssue());
			}*/
			
			//TradeId tradId = new TradeId("MV", 12351);
			//Trade trade = tradeService.getTradeByNbAndField(tradId);
			//System.out.println(trade.getId().getNb() + " " + trade.getId().getField());

/*			List<TrnHdr> r = trnHdrService.getAllHeader();
			for (TrnHdr trnHdr : r) {
				System.out.println(trnHdr.getTrnHdrPK().getTrnType());
				if(trnHdr.getTrnHdrPK().getTrnType().equals(""))
					System.out.println(1);
				else
					System.out.println(0);				
			}*/
			
			TrnHdrPK trmHdrPk = new TrnHdrPK("COM","FWD","");
			TrnHdr trnHdr = trnHdrService.getIssueByFGT(trmHdrPk);
			System.out.println(trnHdr.getDescription());
			
			
	}

}
