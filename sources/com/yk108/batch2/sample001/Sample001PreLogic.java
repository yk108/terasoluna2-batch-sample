package com.yk108.batch2.sample001;

import java.util.Date;

import jp.terasoluna.fw.batch.openapi.BLogicResult;
import jp.terasoluna.fw.batch.openapi.ReturnCode;
import jp.terasoluna.fw.batch.openapi.SupportLogic;
import jp.terasoluna.fw.dao.QueryDAO;

public class Sample001PreLogic implements SupportLogic<Sample001JobContext> {

	/**
	 * DAO�N���X�B Spring�ɂ��C���X�^���X��������ݒ肳���B
	 */
	private QueryDAO queryDAO = null;

	/**
	 * �W���u�O���������s����B �g�^�p���t�e�[�u���h���g�^�p���t���h�擾���A�W���u�R���e�L�X�g�ɐݒ肷��B
	 * 
	 * @param jobContext
	 *            �W���u�R���e�L�X�g
	 */
	public BLogicResult execute(Sample001JobContext jobContext) {
		
		// �t�@�C���̓��̓`�F�b�N���s��

		// �g�^�p���t�h���擾���A�W���u�R���e�L�X�g�ɐݒ肷��B
		Date unyohiduke = queryDAO.executeForObject("sample001.getUnyohiduke", null, Date.class);
		jobContext.setTargetDate(unyohiduke);

		// �r�W�l�X���W�b�N�������ʃI�u�W�F�N�g��ԋp����B
		return new BLogicResult(ReturnCode.NORMAL_CONTINUE);
	}

	/**
	 * QueryDAO��ݒ肷��B
	 * 
	 * @param queryDAO
	 *            �ݒ肷��QueryDAO
	 */
	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

}
