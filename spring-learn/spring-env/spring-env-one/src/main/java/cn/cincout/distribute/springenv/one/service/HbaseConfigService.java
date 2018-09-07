package cn.cincout.distribute.springenv.one.service;

import lombok.Data;

/**
 * Created by zhaoyu on 18-9-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Data
public class HbaseConfigService  {
    private String host;
    private int port;

    public void postConstruct() {
        System.out.println(this);
    }
}
