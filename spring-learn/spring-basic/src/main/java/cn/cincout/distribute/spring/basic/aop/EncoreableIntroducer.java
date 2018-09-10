package cn.cincout.distribute.spring.basic.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by zhaoyu on 18-9-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "cn.cincout.distribute.spring.basic.aop.Performance+",
                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
