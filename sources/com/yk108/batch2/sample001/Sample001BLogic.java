package com.yk108.batch2.sample001;

import jp.terasoluna.fw.batch.openapi.BLogic;
import jp.terasoluna.fw.batch.openapi.BLogicResult;
import jp.terasoluna.fw.batch.openapi.ReturnCode;
import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;

public class Sample001BLogic  implements BLogic<Customer, Sample001JobContext> {

	
	private final String MSG_CD_NODATA = "COMMON.NO_DATA";
	
	private UpdateDAO updateDAO = null;
	
	private QueryDAO queryDAO = null;
	
	@Override
	public BLogicResult execute(Customer customer, Sample001JobContext arg1) {
		
		
		String customerId = queryDAO.executeForObject("sample001.getCustomerId", null, String.class);
		customerId = String.valueOf(Integer.parseInt(customerId) + 1);
		customer.setCustomerId(customerId);
		updateDAO.execute("sample001.insertCustomer", customer);
		
		
        //ビジネスロジック処理結果オブジェクトを返却する。
        return new BLogicResult(ReturnCode.NORMAL_CONTINUE);
    
	}
	
	  /**
     * UpdateDAOを設定する。
     * @param updateDAO 設定するUpdateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {
        this.updateDAO = updateDAO;
    }
    
    /**
     * QueryDAOを設定する。
     * @param queryDAO 設定するQueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }
    

}
