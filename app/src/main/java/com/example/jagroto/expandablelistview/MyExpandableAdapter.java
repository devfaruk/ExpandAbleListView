package com.example.jagroto.expandablelistview;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by F on 5/19/2016.
 */
public class MyExpandableAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String>headitemlist;
    private HashMap<String,List<String>>childitemlist;


    public MyExpandableAdapter(Context context,List<String>headitemlist,HashMap<String,List<String>>childitemlist){
        this.context =context;
        this.headitemlist=headitemlist;
        this.childitemlist =childitemlist;
    }
    @Override
    public int getGroupCount() {
        return this.headitemlist.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.childitemlist.get(this.headitemlist.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.headitemlist.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return this.childitemlist.get(this.headitemlist.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerItem =(String)getGroup(i);
        if (view==null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.head_layout,null);
        }
        TextView textView =(TextView)view.findViewById(R.id.header_text_v);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(headerItem);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
      final String childItem =(String)getChild(i,i1);
        if (view==null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.child_layout,null);
        }
        TextView textView =(TextView)view.findViewById(R.id.child_data_item);
        textView.setText(childItem);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
