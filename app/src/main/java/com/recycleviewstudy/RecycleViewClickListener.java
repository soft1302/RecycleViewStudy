package com.recycleviewstudy;

import android.view.View;

/**
 * Created by guohu on 2017/5/29.
 */

public interface RecycleViewClickListener {
    public abstract void onClick(int position, View view);

    public abstract void onLongClick(int position, View view);
}
