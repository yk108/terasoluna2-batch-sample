package com.yk108.batch2.sample001;

import java.util.Date;

import jp.terasoluna.fw.batch.openapi.BLogicResult;
import jp.terasoluna.fw.batch.openapi.ReturnCode;
import jp.terasoluna.fw.batch.openapi.SupportLogic;
import jp.terasoluna.fw.dao.QueryDAO;

public class Sample001PreLogic implements SupportLogic<Sample001JobContext> {

	/**
	 * DAOクラス。 Springによりインスタンス生成され設定される。
	 */
	private QueryDAO queryDAO = null;

	/**
	 * ジョブ前処理を実行する。 “運用日付テーブル”より“運用日付を”取得し、ジョブコンテキストに設定する。
	 * 
	 * @param jobContext
	 *            ジョブコンテキスト
	 */
	public BLogicResult execute(Sample001JobContext jobContext) {
		
		// ファイルの入力チェックを行う

		// “運用日付”を取得し、ジョブコンテキストに設定する。
		Date unyohiduke = queryDAO.executeForObject("sample001.getUnyohiduke", null, Date.class);
		jobContext.setTargetDate(unyohiduke);

		// ビジネスロジック処理結果オブジェクトを返却する。
		return new BLogicResult(ReturnCode.NORMAL_CONTINUE);
	}

	/**
	 * QueryDAOを設定する。
	 * 
	 * @param queryDAO
	 *            設定するQueryDAO
	 */
	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}

}
