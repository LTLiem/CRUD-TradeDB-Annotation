package lle.crud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TradeId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="field")
     private String field;
	@Column(name="nb")
     private int nb;

    public TradeId() {}

    public TradeId(String field, int nb) {
       this.field = field;
       this.nb = nb;
    }
   
    public String getField() {
        return this.field;
    }
    
    public void setField(String field) {
        this.field = field;
    }
    public int getNb() {
        return this.nb;
    }
    
    public void setNb(int nb) {
        this.nb = nb;
    }

}


