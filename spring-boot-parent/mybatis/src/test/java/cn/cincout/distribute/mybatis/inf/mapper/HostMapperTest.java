package cn.cincout.distribute.mybatis.inf.mapper;

import cn.cincout.distribute.mybatis.domain.Host;
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
public class HostMapperTest {

    @Resource
    private HostMapper hostMapper;

    @Test
    public void findByGroupId() {
        List<Host> hosts = hostMapper.findByGroupId(3);
        System.out.println(hosts);
    }
}