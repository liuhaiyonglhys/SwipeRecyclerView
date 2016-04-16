package com.lhy.swipelibrary;

/**
 * Created by lhy on 2016/4/16.
 */
public interface SwipeRecyclerListener {
    /**
     * 开启
     * @param position
     */
     void opened(int position);

    /**
     * 关闭
     * @param position
     */
     void close(int position);


}
