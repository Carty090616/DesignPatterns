/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: TestClient
 * Author:   Lifeifei
 * Date:     2018/12/20 14:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.AdapterPattern.ClassAdapter;

/**
 * 〈〉
 *
 * @author Lifeifei
 * @create 2018/12/20
 * @since 1.0.0
 */
public class TestClient {

    public static void main(String[] args) {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}