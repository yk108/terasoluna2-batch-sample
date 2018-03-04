package com.yk108.batch2.sample001;

import java.util.List;

import jp.terasoluna.fw.batch.core.AbstractCollector;
import jp.terasoluna.fw.batch.core.CollectedDataHandler;
import jp.terasoluna.fw.batch.core.CollectorResult;
import jp.terasoluna.fw.batch.core.JobStatus;
import jp.terasoluna.fw.batch.messages.MessageAccessor;
import jp.terasoluna.fw.batch.openapi.ReturnCode;
import jp.terasoluna.fw.dao.QueryDAO;

public class Sample001DbCollector extends AbstractCollector<Sample001JobContext> {

	/**
	 * ���b�Z�[�W�擾�N���X�B
	 */
	private MessageAccessor messageAccessor = null;

	/**
	 * �Q��DAO�B
	 */
	private QueryDAO queryDAO = null;

	@Override
	protected CollectorResult doCollect(Sample001JobContext jobContext, CollectedDataHandler collectedDataHandler,
			JobStatus jobStatus) {

		List<Customer> customerList = queryDAO.executeForObjectList("sample001.getCustomerDate", null);

		for (Customer bean : customerList) {
			collectedDataHandler.handle(bean, 1);
		}

		return new CollectorResult(ReturnCode.NORMAL_CONTINUE, customerList.size());
	}

	/**
	 * ���b�Z�[�W��ݒ肷��B
	 * 
	 * @param msgAcc
	 *            ���b�Z�[�W�N���X
	 */
	public void setMessageAccessor(MessageAccessor msgAcc) {
		this.messageAccessor = msgAcc;
	}

	/**
	 * �Q��DAO��ݒ肷��B
	 * 
	 * @param queryDAO
	 *            �Q��DAO
	 */
	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

}
