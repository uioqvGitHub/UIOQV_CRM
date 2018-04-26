package com.hjcrm.system.service;

import java.util.List;

import com.hjcrm.system.entity.Cellinfo;

/**
 * 选择列接口
 * @author 
 * 
 */
public interface ICellinfoService {
	
	/**
	 * 保存/修改列名
	 * @param cellinfo
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Cellinfo cellinfo);
	
	/**
	 * 删除用户的菜单选择列
	 * @param userid
	 * @param cellmenu
	 * @author  
	 * 
	 */
	public void deleteCellinfo(Long userid,String cellmenu);
	
	/**
	 * 查询用户的菜单列名
	 * @param userid
	 * @param cellmenu
	 * @return
	 * @author  
	 * 
	 */
	public List<Cellinfo> queryCellinfo(Long userid,String cellmenu);

}
