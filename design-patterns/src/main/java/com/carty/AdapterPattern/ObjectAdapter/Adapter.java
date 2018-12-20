/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: Adapter
 * Author:   Lifeifei
 * Date:     2018/12/20 16:00
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
public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }
    @Override
    public void isPs2() {
        usb.isUsb();
    }
}