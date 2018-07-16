package cn.cincout.distribute.mybatis.inf.mapper;

import cn.cincout.distribute.mybatis.domain.Host;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Mapper
public interface HostMapper {
    @Results(
            id = "hostListResultMap",
            value = {
                    @Result(property = "id", column = "id", javaType = Integer.class),
                    @Result(property = "hostname", column = "hostname", javaType = String.class),
                    @Result(property = "ip", column = "ip", javaType = String.class),
                    @Result(property = "maintainBegin", column = "maintain_begin", javaType = Integer.class),
                    @Result(property = "maintainEnd", column = "maintain_end", javaType = Integer.class),
                    @Result(property = "updateAt", column = "update_at", javaType = java.util.Date.class)
            }
    )
    @Select("SELECT * FROM host WHERE id IN (SELECT host_id FROM grp_host WHERE grp_id = #{groupId})")
    List<Host> findByGroupId(int groupId);
}
