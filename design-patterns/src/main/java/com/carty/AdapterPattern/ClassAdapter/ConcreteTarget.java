/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: ConcreteTarget
 * Author:   Lifeifei
 * Date:     2018/12/20 14:42
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
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}