package com.stephen.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stephen.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ssc on 2023-03-26 11:48 .
 * Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
