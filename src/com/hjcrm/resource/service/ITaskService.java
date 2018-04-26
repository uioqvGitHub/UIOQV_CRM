package com.hjcrm.resource.service;

import java.sql.Timestamp;
import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.resource.entity.Resource;

/**
 * 定时任务接口
 * @author 
 * 
 */
public interface ITaskService {

	/**
	 * 查询符合条件的数据
	 * @param userid
	 * @param deptid
	 * @param roleid
	 * @return
	 * @author  
	 * 
	 */
	public List<Resource> queryTaskResources(String nowtime,String nexttime);
	
	

	/**
	 * 消息提醒定时任务查询数据接口
	 * @param deptid
	 * @param userid
	 * @param roleid
	 * @param resourceIds
	 * @param processPageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Resource> queryTaskResourceList(String deptid, String userid,String roleid, String resourceIds, PageBean processPageBean);
	
}
