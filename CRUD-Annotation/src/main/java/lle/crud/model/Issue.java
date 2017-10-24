package lle.crud.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="issue")
public class Issue {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer id;
	
	@Column(name="report")
     private String report;
	
	@Column(name="trn_fmly")
     private String trnFmly;
	
	@Column(name="trn_grp")
     private String trnGrp;
	
	@Column(name="trn_type")
     private String trnType;
	
	@Column(name="sql_filter")
     private String sqlFilter;
	
	@Column(name="correct_source")
     private String correctSource;
	
	@Column(name="different_type")
     private String differentType;
	
	@Column(name="explanation")
     private String explanation;
	
	@Column(name="field_values")
     private String fieldValues;
	
	/**
	 * FetchType.LAZY = This does not load the relationships unless you invoke it via the getter method.

		FetchType.EAGER = This loads all the relationships.
		
		Pros and Cons of these two fetch types.
		
		Lazy initialization improves performance by avoiding unnecessary computation and reduce memory requirements.
		
		Eager initialization takes more memory consumption and processing speed is slow. 
		
		https://stackoverflow.com/questions/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api
		https://stackoverflow.com/questions/11746499/solve-failed-to-lazily-initialize-a-collection-of-role-exception
	 */
    @OneToMany(mappedBy = "issueId", fetch = FetchType.EAGER)
    private List<Trade> tradeList;
		
	public Issue() {}
	
    public Issue(Integer id, String report, String trnFmly, String trnGrp, String trnType, String sqlFilter,
			String correctSource, String differentType, String explanation, String fieldValues) {
		super();
		this.id = id;
		this.report = report;
		this.trnFmly = trnFmly;
		this.trnGrp = trnGrp;
		this.trnType = trnType;
		this.sqlFilter = sqlFilter;
		this.correctSource = correctSource;
		this.differentType = differentType;
		this.explanation = explanation;
		this.fieldValues = fieldValues;
	}


	public List<Trade> getTradeList() {
		return tradeList;
	}

	public void setTradeList(List<Trade> tradeList) {
		this.tradeList = tradeList;
	}

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getReport() {
        return this.report;
    }
    
    public void setReport(String report) {
        this.report = report;
    }
    public String getTrnFmly() {
        return this.trnFmly;
    }
    
    public void setTrnFmly(String trnFmly) {
        this.trnFmly = trnFmly;
    }
    public String getTrnGrp() {
        return this.trnGrp;
    }
    
    public void setTrnGrp(String trnGrp) {
        this.trnGrp = trnGrp;
    }
    public String getTrnType() {
        return this.trnType;
    }
    
    public void setTrnType(String trnType) {
        this.trnType = trnType;
    }
    public String getSqlFilter() {
        return this.sqlFilter;
    }
    
    public void setSqlFilter(String sqlFilter) {
        this.sqlFilter = sqlFilter;
    }
    public String getCorrectSource() {
        return this.correctSource;
    }
    
    public void setCorrectSource(String correctSource) {
        this.correctSource = correctSource;
    }
    public String getDifferentType() {
        return this.differentType;
    }
    
    public void setDifferentType(String differentType) {
        this.differentType = differentType;
    }
    public String getExplanation() {
        return this.explanation;
    }
    
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
    public String getFieldValues() {
        return this.fieldValues;
    }
    
    public void setFieldValues(String fieldValues) {
        this.fieldValues = fieldValues;
    }

}


