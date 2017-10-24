package lle.crud.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trade")
public class Trade {

	@EmbeddedId
     private TradeId id;
     
	@Column(name="instrument")
     private String instrument;
     
	@Column(name="currency")
     private String currency;
     
	@Column(name="portfolio")
     private String portfolio;
     
    @JoinColumns({
          @JoinColumn(name = "trn_fmly", referencedColumnName = "trn_fmly")
        , @JoinColumn(name = "trn_grp",  referencedColumnName = "trn_grp")
        , @JoinColumn(name = "trn_type", referencedColumnName = "trn_type")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrnHdr trnHdr;
     
	@Column(name="trn_status")
     private String trnStatus;

	//issue_id : in table Trade referent to column : ID in table Issue
    @JoinColumn(name = "issue_id", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Issue issueId;
	
	public Trade() {}
  
	public Issue getIssueId() {
		return issueId;
	}

	public void setIssueId(Issue issueId) {
		this.issueId = issueId;
	}

    public Trade(TradeId id) {
        this.id = id;
    }

    public TradeId getId() {
        return this.id;
    }
    
    public void setId(TradeId id) {
        this.id = id;
    }

	public String getInstrument() {
        return this.instrument;
    }
    
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    public String getCurrency() {
        return this.currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getPortfolio() {
        return this.portfolio;
    }
    
    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getTrnStatus() {
        return this.trnStatus;
    }
    
    public void setTrnStatus(String trnStatus) {
        this.trnStatus = trnStatus;
    }

}


