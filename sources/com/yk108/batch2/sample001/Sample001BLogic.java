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
		
		
        //�r�W�l�X���W�b�N�������ʃI�u�W�F�N�g��ԋp����B
        return new BLogicResult(ReturnCode.NORMAL_CONTINUE);
    
	}
	
	  /**
     * UpdateDAO��ݒ肷��B
     * @param updateDAO �ݒ肷��UpdateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {
        this.updateDAO = updateDAO;
    }
    
    /**
     * QueryDAO��ݒ肷��B
     * @param queryDAO �ݒ肷��QueryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }
    

}
