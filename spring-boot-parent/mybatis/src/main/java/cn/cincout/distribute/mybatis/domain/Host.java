package cn.cincout.distribute.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host {
    private Integer id;
    private String hostname;
    private String ip;
    private Integer maintainBegin;
    private Integer maintainEnd;
    private Date updateAt;
}
