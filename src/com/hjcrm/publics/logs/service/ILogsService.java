package com.hjcrm.publics.logs.service;

import java.util.List;

import com.hjcrm.publics.logs.entity.Userlogs;
import com.hjcrm.publics.util.PageBean;


/**
 * 操作日志接口
 * @author 
 * 
 */
public interface ILogsService {

	/**
	 * 保存用户操作日志信息
	 * @param userLogs
	 * @author  
	 * 
	 */
	public void saveUserLogsinfo(Userlogs userLogs);
	
	/**
	 * 查询用户操作日志
	 * @return
	 * @author  
	 * 
	 */
	public List<Userlogs> queryUserLogs(Long userid,PageBean pageBean);
	
}
