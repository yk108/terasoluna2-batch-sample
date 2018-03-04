package com.yk108.batch2.sample001;

import java.util.Date;

import jp.terasoluna.fw.batch.openapi.JobContext;

public class Sample001JobContext extends JobContext {

	
	private static final long serialVersionUID = 1L;

	 /**
     * ‰^—p“ú•t
     */
    private Date targetDate = null;

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
    
    
 
    
}
