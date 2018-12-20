/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: TestClienter
 * Author:   Lifeifei
 * Date:     2018/12/20 16:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.AdapterPattern.ObjectAdapter;

/**
 * 〈〉
 *
 * @author Lifeifei
 * @create 2018/12/20
 * @since 1.0.0
 */
public class TestClienter {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}