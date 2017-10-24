package lle.crud.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="trn_hdr")
public class TrnHdr {
	
	@EmbeddedId
	private TrnHdrPK trnHdrPK;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "trnHdr", fetch = FetchType.EAGER)
    private List<Trade> tradeList;
	
	public TrnHdr() {}

	public TrnHdr(TrnHdrPK trnHdrPK, String description) {
		super();
		this.trnHdrPK = trnHdrPK;
		this.description = description;
	}



	public TrnHdrPK getTrnHdrPK() {
		return trnHdrPK;
	}

	public void setTrnHdrPK(TrnHdrPK trnHdrPK) {
		this.trnHdrPK = trnHdrPK;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Trade> getTradeList() {
		return tradeList;
	}

	public void setTradeList(List<Trade> tradeList) {
		this.tradeList = tradeList;
	}	
	
}
