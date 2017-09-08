package bigame.com.tr.mobilazel3;

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


    public ArrayList<Fatura> faturas ;
    public LayoutInflater minflater;
    public Activity activity;

    public ExpandableListAdapter(ArrayList<Fatura>  fatura) {
        faturas = fatura;

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

        //tempChild = (ArrayList<String>) Childtem.get(groupPosition);

        if (convertView == null) {
            convertView = minflater.inflate(R.layout.childrow, null);
        }
        TextView aciklama = (TextView) convertView.findViewById(R.id.lblAciklama);
        TextView tutar= (TextView) convertView.findViewById(R.id.lbltutar1);
        TextView birimFiyat= (TextView) convertView.findViewById(R.id.lblBirimFiyat);
        TextView miktar= (TextView) convertView.findViewById(R.id.lblMiktar);

        Fatura fatura = faturas.get(groupPosition);
        aciklama.setText(String.valueOf(fatura.getAciklama()));
        tutar.setText(String.valueOf(fatura.getTutar()));
        birimFiyat.setText(String.valueOf(fatura.getBirimFiyat()));
        miktar.setText(String.valueOf(fatura.getMiktar()));

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
        return faturas.size();
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
        ((CheckedTextView) convertView).setText(faturas.get(groupPosition).getFaturaDonemi());
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
