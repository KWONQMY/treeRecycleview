package com.example.treelist2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * @Author: gelan
 * @CreateDate: 2020/6/15 18:29
 * @Description: 模板列表树形适配器
 */
public class TemplateTreeRecyclerAdapter extends TreeRecyclerAdapter {

    public TemplateTreeRecyclerAdapter(RecyclerView mTree, Context context, List<Node> datas, int defaultExpandLevel, int iconExpand, int iconNoExpand) {
        super(mTree, context, datas, defaultExpandLevel, iconExpand, iconNoExpand);
    }

    public TemplateTreeRecyclerAdapter(RecyclerView mTree, Context context, List<Node> datas, int defaultExpandLevel) {
        super(mTree, context, datas, defaultExpandLevel);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHoder(View.inflate(mContext, R.layout.item_template_list,null));
    }

    @Override
    public void onBindViewHolder(final Node node, RecyclerView.ViewHolder holder, int position) {

        final MyHoder viewHolder = (MyHoder) holder;

        if (node.getIcon() == -1) {
            viewHolder.arrow.setVisibility(View.INVISIBLE);
        } else {
            viewHolder.arrow.setVisibility(View.VISIBLE);
            viewHolder.arrow.setImageResource(node.getIcon());
        }

        ((MyHoder) holder).text.setText(node.getName());


    }

    class MyHoder extends RecyclerView.ViewHolder{

        public ImageView icon;

        public TextView text;

        public ImageView arrow;
        public MyHoder(View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.template_icon);
            text = (TextView) itemView
                    .findViewById(R.id.template_text);
            arrow = (ImageView) itemView.findViewById(R.id.template_arrow);

        }

    }
}
