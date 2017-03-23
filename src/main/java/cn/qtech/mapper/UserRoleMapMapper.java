package cn.qtech.mapper;

import cn.qtech.domain.UserRoleMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int insert(UserRoleMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int insertSelective(UserRoleMap record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    UserRoleMap selectByPrimaryKey(String id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int updateByPrimaryKeySelective(UserRoleMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_map
     *
     * @mbggenerated Tue Mar 14 18:06:39 CST 2017
     */
    int updateByPrimaryKey(UserRoleMap record);
}