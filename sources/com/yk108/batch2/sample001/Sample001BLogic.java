package com.yk108.batch2.sample001;

import jp.terasoluna.fw.batch.openapi.BLogic;
import jp.terasoluna.fw.batch.openapi.BLogicResult;
import jp.terasoluna.fw.batch.openapi.ReturnCode;

public class Sample001BLogic  implements BLogic<Customer, Sample001JobContext> {

	
	private final String MSG_CD_NODATA = "COMMON.NO_DATA";
	
	@Override
	public BLogicResult execute(Customer customer, Sample001JobContext arg1) {
		
		
		
		
		
        //�r�W�l�X���W�b�N�������ʃI�u�W�F�N�g��ԋp����B
        return new BLogicResult(ReturnCode.NORMAL_CONTINUE);
    
	}

}
