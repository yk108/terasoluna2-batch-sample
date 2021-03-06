package com.yk108.batch2.sample001;

import java.io.Serializable;

import jp.terasoluna.fw.file.annotation.FileFormat;
import jp.terasoluna.fw.file.annotation.InputFileColumn;

@FileFormat(overWriteFlg=true, headerLineCount=1, trailerLineCount=0, fileEncoding="MS932")
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * ÚqID.
	 */
	private String customerId;

	/**
	 * Úq¼.
	 */
	@InputFileColumn(columnIndex = 0)
	private String customerName;
	
	/**
	 * XÖÔ.
	 */
	@InputFileColumn(columnIndex = 1)
	private String zipNo;
	
	/**
	 * Z.
	 */
	@InputFileColumn(columnIndex = 2)
	private String address;
	
	/**
	 * dbÔ.
	 */
	@InputFileColumn(columnIndex = 3)
	private String tel;
	
	/**
	 * [AhX.
	 */
	@InputFileColumn(columnIndex = 4)
	private String mail;
	
	/**
	 * «Ê.
	 */
	@InputFileColumn(columnIndex = 5)
	private String sex;
	
	/**
	 * WuR[h
	 */
	@InputFileColumn(columnIndex = 6)
	private String jobId;
	
	/**
	 * Nû.
	 */
	@InputFileColumn(columnIndex = 7)
	private String salary;

	/**
	 * õl.
	 */
	@InputFileColumn(columnIndex = 8)
	private String note;
	
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getZipNo() {
		return zipNo;
	}

	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	

	
}
