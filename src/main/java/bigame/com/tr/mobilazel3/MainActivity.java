package bigame.com.tr.mobilazel3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

import android.app.ExpandableListActivity;


public class MainActivity extends ExpandableListActivity implements
        ExpandableListView.OnChildClickListener {

    ArrayList<Fatura> listFatura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ExpandableListView expandbleLis = getExpandableListView();
        expandbleLis.setDividerHeight(2);
        expandbleLis.setGroupIndicator(null);
        expandbleLis.setClickable(true);


        listFatura = new ArrayList<Fatura>();
        listFatura= new Service().getFaturalar(1);

        ExpandableListAdapter mNewAdapter = new ExpandableListAdapter(listFatura);
        mNewAdapter
                .setInflater(
                        (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                        this);
        getExpandableListView().setAdapter(mNewAdapter);
        expandbleLis.setOnChildClickListener(this);

    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        return true;
    }

}
