package com.hjcrm.system.service;

import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Dept;

/**
 * 部门管理接口类
 * @author 
 * 
 */
public interface IDeptService {

	/**
	 * 保存或者修改部门
	 * @param dept
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Dept dept);
	
	/**
	 * 删除部门
	 * @param ids
	 * @author  
	 * 
	 */
	public void delete(String ids);
	
	/**
	 * 查询所有部门
	 * @return
	 * @author  
	 * 
	 */
	public List<Dept> queryDept(PageBean pageBean);
	
}
