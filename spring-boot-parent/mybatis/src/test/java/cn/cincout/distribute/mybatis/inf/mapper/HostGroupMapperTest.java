package cn.cincout.distribute.mybatis.inf.mapper;

import cn.cincout.distribute.mybatis.domain.HostGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhaoyu on 18-6-27.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HostGroupMapperTest {

    @Resource
    private HostGroupMapper hostGroupMapper;

    @Test
    public void findAllMaintainedHostGroup() {
        List<HostGroup> hostGroupList = hostGroupMapper.findAllMaintainedHostGroup();
        System.out.println(hostGroupList);
    }
}