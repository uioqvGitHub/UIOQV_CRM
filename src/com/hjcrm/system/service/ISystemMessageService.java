package com.hjcrm.system.service;

import java.sql.Timestamp;
import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Systemmessage;

/**
 * 系统消息接口
 * @author 
 * 
 */
public interface ISystemMessageService {

	/**
	 * 增加或者修改消息
	 * @param message
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Systemmessage message);
	
	/**
	 * 查询最近一条发布信息
	 * @return
	 * @author  
	 * 
	 */
	public List<Systemmessage> querySystemmessageSend();
	
	/**
	 * 查询所有系统消息
	 * @return
	 * @author  
	 * 
	 */
	public List<Systemmessage> querySystemmessages(PageBean pageBean);
	
	/**
	 * 发布或者撤回消息
	 * @param systemmessageId
	 * @param issend
	 * @author  
	 * 
	 */
	public void sendMessage(String systemmessageId,String issend,Timestamp send_time);
	
}
