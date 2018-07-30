package com.ad.core.service;

import com.ad.core.model.SysResource;
import java.util.List;

public interface SysResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Mon Jul 30 18:39:31 CST 2018
     */
    int deleteByPrimaryKey(Integer resourceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Mon Jul 30 18:39:31 CST 2018
     */
    int insert(SysResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Mon Jul 30 18:39:31 CST 2018
     */
    SysResource selectByPrimaryKey(Integer resourceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Mon Jul 30 18:39:31 CST 2018
     */
    List<SysResource> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_resource
     *
     * @mbggenerated Mon Jul 30 18:39:31 CST 2018
     */
    int updateByPrimaryKey(SysResource record);
}