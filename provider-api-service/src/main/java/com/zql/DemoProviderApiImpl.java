package com.zql;

/**
 * Created by 张启磊 on 2019-5-15.
 */
public class DemoProviderApiImpl  implements DemoProviderApi {
    public String getUser(Integer i) {
        return "生产者提供服务";
    }
}