package edu.aku.hassannaqvi.uen_kmc.models;

import android.database.Cursor;

import androidx.databinding.Observable;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;

public class FollowUpsSche implements Observable {

    /**
     * Fupdonedt			// * not used
     * Fupweek				// fpcode
     * mID				// pa01 <= woman name
     * mName				// pa01a <= husband name
     * Studyid				// * not used
     * getMrno				// memberid
     * fupdate				// fp_date
     */

    String id = "";
    private String ucCode;
    private String distCode;
    private String tehsilCode;
    private String form_colid = "";
    private String memberid = "";
    private String fpcode = "";
    private String fpid = "";
    private String f1101 = "";
    private String f1102 = "";
    private String f1103 = "";
    private String f1104 = "";
    private String f1105 = "";
    private String f1109 = "";
    private String f1111 = "";
    private String f1112 = "";
    private String f1113 = "";
    private String fp_date = "";
    private String fupdonedt = "";


    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
    }


    public FollowUpsSche() {
        // Default Constructor
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
    }

    public String getDistCode() {
        return distCode;
    }

    public void setDistCode(String distCode) {
        this.distCode = distCode;
    }

    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }

    public String getForm_colid() {
        return form_colid;
    }

    public void setForm_colid(String form_colid) {
        this.form_colid = form_colid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getFpcode() {
        return fpcode;
    }

    public void setFpcode(String fpcode) {
        this.fpcode = fpcode;
    }

    public String getFpid() {
        return fpid;
    }

    public void setFpid(String fpid) {
        this.fpid = fpid;
    }

    public String getF1101() {
        return f1101;
    }

    public void setF1101(String f1101) {
        this.f1101 = f1101;
    }

    public String getF1102() {
        return f1102;
    }

    public void setF1102(String f1102) {
        this.f1102 = f1102;
    }

    public String getF1103() {
        return f1103;
    }

    public void setF1103(String f1103) {
        this.f1103 = f1103;
    }

    public String getF1104() {
        return f1104;
    }

    public void setF1104(String f1104) {
        this.f1104 = f1104;
    }

    public String getF1105() {
        return f1105;
    }

    public void setF1105(String f1105) {
        this.f1105 = f1105;
    }

    public String getF1109() {
        return f1109;
    }

    public void setF1109(String f1109) {
        this.f1109 = f1109;
    }

    public String getF1111() {
        return f1111;
    }

    public void setF1111(String f1111) {
        this.f1111 = f1111;
    }

    public String getF1112() {
        return f1112;
    }

    public void setF1112(String f1112) {
        this.f1112 = f1112;
    }

    public String getF1113() {
        return f1113;
    }

    public void setF1113(String f1113) {
        this.f1113 = f1113;
    }

    public String getFp_date() {
        return fp_date;
    }

    public void setFp_date(String fp_date) {
        this.fp_date = fp_date;
    }

    public String getFupdonedt() {
        return fupdonedt;
    }

    public void setFupdonedt(String fupdonedt) {
        this.fupdonedt = fupdonedt;
    }


    public FollowUpsSche Hydrate(Cursor cursor) throws JSONException {

        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_ID));
        this.form_colid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_FORM_COLID));
        this.memberid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_MEMBER_ID));
        this.ucCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_UC_CODE));
        this.distCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_DIST_CODE));
        this.tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_TEHSIL_CODE));
        this.fpcode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_FP_CODE));
        this.fpid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_FP_ID));
        this.f1101 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1101));
        this.f1102 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1102));
        this.f1103 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1103));
        this.f1104 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1104));
        this.f1105 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1105));
        this.f1109 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1109));
        this.f1111 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1111));
        this.f1112 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1112));
        this.f1113 = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_F1113));
        this.fp_date = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_FP_DATE));
        this.fupdonedt = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.FollowupsScheTable.COLUMN_FP_DONE));

        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(TableContracts.FollowupsScheTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
        json.put(TableContracts.FollowupsScheTable.COLUMN_FORM_COLID, this.form_colid == null ? JSONObject.NULL : this.form_colid);
        json.put(TableContracts.FollowupsScheTable.COLUMN_MEMBER_ID, this.memberid == null ? JSONObject.NULL : this.memberid);
        json.put(TableContracts.FollowupsScheTable.COLUMN_FP_CODE, this.fpcode == null ? JSONObject.NULL : this.fpcode);
        json.put(TableContracts.FollowupsScheTable.COLUMN_UC_CODE, this.ucCode == null ? JSONObject.NULL : this.ucCode);
        json.put(TableContracts.FollowupsScheTable.COLUMN_DIST_CODE, this.distCode == null ? JSONObject.NULL : this.distCode);
        json.put(TableContracts.FollowupsScheTable.COLUMN_TEHSIL_CODE, this.tehsilCode == null ? JSONObject.NULL : this.tehsilCode);
        json.put(TableContracts.FollowupsScheTable.COLUMN_FP_ID, this.fpid == null ? JSONObject.NULL : this.fpid);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1101, this.f1101 == null ? JSONObject.NULL : this.f1101);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1102, this.f1102 == null ? JSONObject.NULL : this.f1102);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1103, this.f1103 == null ? JSONObject.NULL : this.f1103);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1104, this.f1104 == null ? JSONObject.NULL : this.f1104);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1105, this.f1105 == null ? JSONObject.NULL : this.f1105);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1109, this.f1109 == null ? JSONObject.NULL : this.f1109);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1111, this.f1111 == null ? JSONObject.NULL : this.f1111);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1112, this.f1112 == null ? JSONObject.NULL : this.f1112);
        json.put(TableContracts.FollowupsScheTable.COLUMN_F1113, this.f1113 == null ? JSONObject.NULL : this.f1113);
        json.put(TableContracts.FollowupsScheTable.COLUMN_FP_DATE, this.fp_date == null ? JSONObject.NULL : this.fp_date);
        json.put(TableContracts.FollowupsScheTable.COLUMN_FP_DONE, this.fupdonedt == null ? JSONObject.NULL : this.fupdonedt);

        return json;

    }

    public FollowUpsSche Sync(JSONObject jsonObject) throws JSONException {

        this.id = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_ID);
        this.form_colid = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_FORM_COLID);
        this.memberid = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_MEMBER_ID);
        this.fpcode = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_FP_CODE);
        this.ucCode = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_UC_CODE);
        this.distCode = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_DIST_CODE);
        this.tehsilCode = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_TEHSIL_CODE);
        this.fpid = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_FP_ID);
        this.f1101 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1101);
        this.f1102 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1102);
        this.f1103 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1103);
        this.f1104 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1104);
        this.f1105 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1105);
        this.f1109 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1109);
        this.f1111 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1111);
        this.f1112 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1112);
        this.f1113 = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_F1113);
        this.fp_date = jsonObject.getString(TableContracts.FollowupsScheTable.COLUMN_FP_DATE);


        return this;
    }

}
