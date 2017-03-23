package cn.qtech.mapper;

import cn.qtech.domain.RoleMenuMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int insert(RoleMenuMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int insertSelective(RoleMenuMap record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    RoleMenuMap selectByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int updateByPrimaryKeySelective(RoleMenuMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int updateByPrimaryKey(RoleMenuMap record);
}