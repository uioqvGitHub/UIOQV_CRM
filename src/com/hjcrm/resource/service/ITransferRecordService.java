package com.hjcrm.resource.service;

import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.resource.entity.Transferrecord;


/**
 * 转移记录接口
 * @author 
 * 
 */
public interface ITransferRecordService {
	
	/**
	 * 保存转移记录
	 * @param transferrecord
	 * @author  
	 * 
	 */
	public void saveTransferRecord(Transferrecord transferrecord);
	
	/**
	 * 查询转移记录
	 * @param phone
	 * @param tel
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Transferrecord> queryTransferrecord(Long deptid,String phone,String tel,PageBean pageBean);

	/**
	 * 转移记录筛选
	 * @param transferrecord
	 * @param deptid
	 * @param processPageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Transferrecord> queryTransferRecordBysceen(Transferrecord transferrecord, Long deptid, String transferrecords,PageBean processPageBean);

}
