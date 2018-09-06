package cn.cincout.distribute.spring.basic.scope;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by zhaoyu on 18-7-20.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Setter
@Slf4j
public class UserService {
    private SessionScopeBean sessionScopeBean;
}
