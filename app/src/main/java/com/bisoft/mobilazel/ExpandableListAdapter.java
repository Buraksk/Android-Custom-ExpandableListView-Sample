package com.bisoft.mobilazel;

/**
 * Created by burakisik on 7/17/2017.
 */

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    public ArrayList<BillModel> billList ;
    public LayoutInflater minflater;
    public Activity activity;

    public ExpandableListAdapter(ArrayList<BillModel>  bill) {
        billList = bill;
    }
    public void setInflater(LayoutInflater mInflater, Activity act) {
        this.minflater = mInflater;
        activity = act;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = minflater.inflate(R.layout.childrow, null);
        }
        TextView declaration = (TextView) convertView.findViewById(R.id.lblDefination);
        TextView quantity= (TextView) convertView.findViewById(R.id.lblQuantity);
        TextView unitPrice= (TextView) convertView.findViewById(R.id.lblUnitPrice);
        TextView debt= (TextView) convertView.findViewById(R.id.lblDebt);

        BillModel bill = billList.get(groupPosition);
        declaration.setText(String.valueOf(bill.getDeclaration()));
        quantity.setText(String.valueOf(bill.getQuantity()));
        unitPrice.setText(String.valueOf(bill.getUnitPrice()));
        debt.setText(String.valueOf(bill.getDebt()));

        convertView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }
    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }
    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public int getGroupCount() {
        return billList.size();
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = minflater.inflate(R.layout.grouprow, null);
        }
        ((CheckedTextView) convertView).setText(billList.get(groupPosition).getPayingBillPeriod());
        ((CheckedTextView) convertView).setChecked(isExpanded);
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
