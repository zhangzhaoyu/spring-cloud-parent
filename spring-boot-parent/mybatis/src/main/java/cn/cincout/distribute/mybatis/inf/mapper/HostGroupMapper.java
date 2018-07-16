package cn.cincout.distribute.mybatis.inf.mapper;

import cn.cincout.distribute.mybatis.domain.HostGroup;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Mapper
public interface HostGroupMapper {
    @Results(
            id = "maintainedHostResultMap",
            value = {
                    @Result(property = "id", column = "id", javaType = Integer.class),
                    @Result(property = "grpName", column = "grp_name", javaType = String.class),
                    @Result(property = "createUser", column = "create_user", javaType = String.class),
                    @Result(property = "createAt", column = "create_at", javaType = java.util.Date.class),
                    @Result(column="id",property="hosts",many=@Many(select="cn.cincout.distribute.mybatis.inf.mapper.HostMapper.findByGroupId",fetchType=FetchType.LAZY))
            }
    )
    @Select("select a.id as id, a.grp_name as grp_name, a.create_user as create_user, a.create_at as create_at from grp as a left join grp_host as b on a.id = b.grp_id left join host as c on b.host_id = c.id where c.maintain_begin > 0 and c.maintain_end > 0")
    /**
     * find all maintained group
     */
    List<HostGroup> findAllMaintainedHostGroup();
}
