package edu.aku.hassannaqvi.uen_kmc.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.models.FollowUp;
import edu.aku.hassannaqvi.uen_kmc.models.FollowUpsSche;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S1Activity;


public class FollowUpsScheAdapter extends RecyclerView.Adapter<FollowUpsScheAdapter.ViewHolder> {
    private static final String TAG = "MWRAAdapter";
    private Context mContext;


    public FollowUpsScheAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "Element " + position + " set.");
        FollowUpsSche fups = MainApp.fupsSche.get(position);        // Get element from your dataset at this position and replace the contents of the view
        // with that element

        TextView mID = holder.mID;
        TextView mName = holder.mName;
        TextView fupWeek = holder.fupWeek;
        TextView mrno = holder.mrno;
        TextView fupdates = holder.fupdates;
        ImageView istatus = holder.istatus;

        //String pregStatus = familyMember.getRb07().equals("1") ? "Pregnant" : "Not Pregnant";

        fupWeek.setText("0" + fups.getFpcode());
        mID.setText(fups.getF1113());
        mName.setText(fups.getF1112());
        mrno.setText(fups.getMemberid());
        fupdates.setText(fups.getFupdonedt().equals("") ? "SCHEDULED NO: " + fups.getFp_date() : "DONE ON: " + fups.getFupdonedt());
        fupdates.setTextColor(fups.getFupdonedt().equals("") ? ContextCompat.getColor(mContext, R.color.colorPrimaryDark) : ContextCompat.getColor(mContext, R.color.redDark));
        istatus.setVisibility(fups.getFupdonedt().equals("") ? View.INVISIBLE : View.VISIBLE);

/*        if (!fups.getFupdonedt().equals("")) {
            fupdates.setText("DONE ON: " + fups.getFupdonedt());
            fupdates.setTextColor(ContextCompat.getColor(mContext, R.color.redDark));
            istatus.setVisibility(View.VISIBLE);
        }*/

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fups.getFupdonedt().equals("")) {
                    MainApp.position = position;
                    Intent intent = new Intent(mContext, SectionF3S1Activity.class);
                    intent.putExtra("list", true);
                    MainApp.followupsSche = fups;
                    MainApp.followup = new FollowUp();
                    // MainApp.followup.setFha01(fups.get(position).getHa01());
                    MainApp.followup.setF3103(fups.getF1109());
                    MainApp.followup.setF3104(fups.getF1111());
                    MainApp.followup.setF3105(fups.getF1112());
                    ((Activity) mContext).startActivityForResult(intent, 1002);
                } else {
                    Toast.makeText(mContext, " Followup-" + fups.getFpcode() + " of " + fups.getF1112() + " has already been done.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.followups_list_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return MainApp.fupsSche.size();
    }

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView mID;
        public TextView mName;
        public TextView fupWeek;
        public TextView mrno;
        public TextView fupdates;
        public ImageView istatus;


        public ViewHolder(View v) {
            super(v);
            fupWeek = v.findViewById(R.id.fupWeek);
            mID = v.findViewById(R.id.mID);
            mName = v.findViewById(R.id.mname);
            mrno = v.findViewById(R.id.mrno);
            fupdates = v.findViewById(R.id.fupDates);
            istatus = v.findViewById(R.id.istatus);
            mContext = v.getContext();

        }
    }
}
