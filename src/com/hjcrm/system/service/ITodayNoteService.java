package com.hjcrm.system.service;

import java.util.List;

import com.hjcrm.system.entity.Todaynote;


/**
 * 今日目标接口
 * @author 
 * 
 */
public interface ITodayNoteService {

	/**
	 * 增加/修改今日目标
	 * @param todaynote
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Todaynote todaynote);
	
	/**
	 * 查询
	 * @param userid
	 * @return
	 * @author  
	 * 
	 */
	public List<Todaynote> queryTodaynote(Long userid);
	
}
