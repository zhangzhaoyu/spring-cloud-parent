package cn.cincout.distribute.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostGroup {
    private int id;
    private String grpName;
    private String createUser;
    private Date createAt;
    private List<Host> hosts;

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
