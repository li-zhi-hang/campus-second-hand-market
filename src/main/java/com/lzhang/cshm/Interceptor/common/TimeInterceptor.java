package com.lzhang.cshm.Interceptor.common;
import com.lzhang.cshm.domain.common.BaseEntity;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;

import java.util.Date;

import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Signature;

/**
 * @author:lizhihang
 * @date: 2024/1/19 13:34
 * @description: 拦截器 拦截插入和更新操作 在操作前设置时间戳
 */


@Intercepts({
        @Signature(
                type = Executor.class,
                method = "update",
                args = {MappedStatement.class, Object.class}
        )
})
public class TimeInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];

        if (parameter instanceof BaseEntity) {
            BaseEntity entity = (BaseEntity) parameter;
            Date now = new Date();
            if (ms.getSqlCommandType().equals(SqlCommandType.INSERT)) {
                entity.setCreate_time(now);
            }
            entity.setUpdate_time(now);
        }

        return invocation.proceed();
    }


}
