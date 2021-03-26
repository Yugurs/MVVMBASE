package org.yugurs.baselib;

import com.xuexiang.xui.XUI;

import me.goldze.mvvmhabit.base.BaseApplication;

/**
 * org.yugurs.baselib
 *
 * @author xyq
 * @time 2021-3-25 15:03
 * Remark ------------------------------------------------
 */
public class LibApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        XUI.init(this); //初始化UI框架
        XUI.debug(true);  //开启UI框架调试日志
    }

}
