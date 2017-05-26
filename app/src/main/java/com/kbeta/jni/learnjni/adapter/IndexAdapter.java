package com.kbeta.jni.learnjni.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.kbeta.jni.learnjni.R;

import java.util.List;

/**
 * Created by Kevin Dong on 2017/5/26.
 */
public class IndexAdapter extends BaseQuickAdapter<String,BaseViewHolder>{

    public IndexAdapter(List<String> data) {
        super(R.layout.index_item_layout, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.txt,item);
    }
}
