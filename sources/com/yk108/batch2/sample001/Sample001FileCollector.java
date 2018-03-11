package com.yk108.batch2.sample001;

import jp.terasoluna.fw.batch.core.AbstractCollector;
import jp.terasoluna.fw.batch.core.CollectedDataHandler;
import jp.terasoluna.fw.batch.core.CollectorResult;
import jp.terasoluna.fw.batch.core.JobStatus;
import jp.terasoluna.fw.batch.messages.MessageAccessor;
import jp.terasoluna.fw.batch.openapi.ReturnCode;
import jp.terasoluna.fw.file.dao.FileLineIterator;
import jp.terasoluna.fw.file.dao.FileQueryDAO;

public class Sample001FileCollector extends AbstractCollector<Sample001JobContext> {

	/**
	 * メッセージ取得クラス.
	 */
	private MessageAccessor messageAccessor = null;

	/**
	 * FileQueryDAO.
	 */
    private FileQueryDAO fileDao = null;

	@Override
	protected CollectorResult doCollect(Sample001JobContext jobContext, CollectedDataHandler collectedDataHandler,
			JobStatus jobStatus) {

		FileLineIterator<Customer> fileLineIterator = fileDao.execute("inputfile/customer.csv", Customer.class);

		int counter = 0;
		if (fileLineIterator.hasNext()) {
			Customer customer = fileLineIterator.next();
			collectedDataHandler.handle(customer, 1);
			counter++;
		}

		return new CollectorResult(ReturnCode.NORMAL_CONTINUE, counter);
	}

	/**
	 * メッセージを設定する.
	 * 
	 * @param msgAcc.
	 *            メッセージクラス.
	 */
	public void setMessageAccessor(MessageAccessor msgAcc) {
		this.messageAccessor = msgAcc;
	}

    /**
     * FileQueryDAOを設定する。
     * @param fileDao FileQueryDAO
     */
    public void setFileDao(FileQueryDAO fileDao) {
        this.fileDao = fileDao;
    }


}
