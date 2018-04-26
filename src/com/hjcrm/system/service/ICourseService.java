package com.hjcrm.system.service;

import java.util.List;

import com.hjcrm.patter.entity.Pattertype;
import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Course;
import com.hjcrm.system.entity.Subject;

/**
 * 课程管理接口
 * @author 
 * 
 */
public interface ICourseService {

	/**
	 * 查询所有课程
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Course> queryCourse(PageBean pageBean);
	
	/**
	 * 查询课程的场景
	 * @param pageBean
	 * @param courseid
	 * @return
	 * @author  
	 * 
	 */
	public  List<Pattertype> queryPattertype(PageBean pageBean,String courseid);
	
	/**
	 * 增加或者修改课程
	 * @param course
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Course course);
	
	/**
	 * 增加或者修改课程场景
	 * @param pattertype
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Pattertype pattertype);
	
	/**
	 * 删除课程
	 * @param courseids
	 * @author  
	 * 
	 */
	public void deleteCourse(String courseids);
	
	/**
	 * 根据课程ID或者场景ID，删除课程场景
	 * @param courseids
	 * @param patterTypeIds
	 * @author  
	 * 
	 */
	public void deletePattertype(String courseids,String patterTypeIds);
	
	/**
	 * 保存/修改科目
	 * @param subject
	 * @author  
	 * 
	 */
	public void saveOrUpdate(Subject subject);
	
	/**
	 * 删除科目
	 * @param subject
	 * @author  
	 * 
	 */
	public void deleteSubject(String subjectids);
	
	/**
	 * 查询科目
	 * @param courseid
	 * @param pageBean
	 * @return
	 * @author  
	 * 
	 */
	public List<Subject> querySubject(Long courseid,PageBean pageBean);
	
	/**
	 * 根据课程ID，查询科目，用逗号隔开
	 * @param courseid
	 * @return
	 * @author  
	 * 
	 */
	public Subject querySubjectByCourseId(Integer courseid);
	
	/**
	 * 根据课程ID，查询课程
	 * @param courseid
	 * @return
	 * @author  
	 * 
	 */
	public Course queryCourseById(Integer courseid);
	
	
}
