package com.hjcrm.system.service;

import java.util.List;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Role;
import com.hjcrm.system.entity.Role_menu;

/**
 * 角色接口
 * @author 
 * 
 */
public interface IRoleService {
	
	/**
	 * 保存或者修改角色
	 * @param role
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Role role);
	
	/**
	 * 保存角色-菜单对应关系
	 * @param roleMenu
	 * @author  
	 * 
	 */
	public void saveRoleMenu(Role_menu roleMenu);
	
	
	/**
	 * 删除角色
	 * @param ids
	 * @author  
	 * 
	 */
	public void delete(String ids);
	
	/**
	 * 根据部门ID，查询部门下的所有角色
	 * @param deptid
	 * @return
	 * @author  
	 * 
	 */
	public List<Role> queryRoleByDeptid(Long deptid);
	
	/**
	 * 修改角色对应的菜单，删除对应关系
	 * @param roleid
	 * @author  
	 * 
	 */
	public void deleteRoleMenu(Long roleid);
	
	/**
	 * 查询所有角色列表
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Role> queryAllRole(PageBean pageBean);
	
	

}
