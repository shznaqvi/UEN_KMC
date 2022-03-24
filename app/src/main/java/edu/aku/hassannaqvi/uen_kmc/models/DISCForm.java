package edu.aku.hassannaqvi.uen_kmc.models;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_kmc.core.MainApp._EMPTY_;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.DISCFormTable;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;

public class DISCForm extends BaseObservable implements Observable {

    private final String TAG = "FPHouseholds";
    // SECTION VARIABLES
    private final String dF = _EMPTY_;
    private final String hhNo = _EMPTY_;
    private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    private boolean exist = false;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    private String distCode = _EMPTY_;
    // to be populated before first insert
    private String hdssId = _EMPTY_;

    private String visitNo = "0";
    private String fround = "";
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String structureNo = _EMPTY_;
    private String f1101 = "";  // Date of Visit
    private String f1102 = _EMPTY_;  //
    private String f1103 = _EMPTY_;
    private String f1109 = _EMPTY_;
    private String f1111 = _EMPTY_;
    private String f1112 = _EMPTY_;
    private String f1113 = _EMPTY_;

    public DISCForm() {

/*        setFround(MainApp.ROUND);
        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());
        //setRa06(MainApp.selectedUC);
        //setRa07(MainApp.selectedVillage);
        //setRa04(MainApp.leaderCode);
        //setRa05(MainApp.leaderCode);*/

    }

    public DISCForm(DISCForm discForm) {


        setUserName(discForm.getUserName());
        setDeviceId(discForm.getDeviceId());
        setAppver(discForm.getAppver());
        //setfRound(discForm.getfRound());


    }

    public void populateMeta(int position) {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setDistCode(MainApp.fupsSche.get(position).getUcCode());
        setDistCode(MainApp.fupsSche.get(position).getTehsilCode());
        setHhNo(MainApp.fupsSche.get(position).getDistCode());


    }

    @Bindable
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisitNo() {
        return visitNo;
    }

    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }


    public String getDistCode() {
        return distCode;
    }

    public void setDistCode(String distCode) {

        this.distCode = distCode;
    }

    public String getHhNo() {
        return hhNo;
    }

    public void setHhNo(String hhNo) {
    }

    public String getStructureNo() {
        return structureNo;
    }

    public void setStructureNo(String structureNo) {
        this.structureNo = structureNo;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }


    public String getFround() {
        return fround;
    }

    public void setFround(String fround) {
        this.fround = fround;
    }

    @Bindable
    public String getHdssId() {
        return hdssId;
    }

    public void setHdssId(String hdssId) {
        // Household number in DSSID was changed to 4-digits to capture more than 999 households
        String[] hdssidSplit = hdssId.split("-");
        String newHDSSID = hdssidSplit[0] + "-" + hdssidSplit[1] + "-" + String.format("%04d", Integer.parseInt(hdssidSplit[2]));

        this.hdssId = newHDSSID;

    }

    public String getdF() {
        return dF;
    }


    private synchronized void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public synchronized void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public synchronized void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }

    public DISCForm Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_SYSDATE));
        this.distCode = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_DIST_CODE));

        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_SYNCED_DATE));

//        dFHydrate(cursor.getString(cursor.getColumnIndexOrThrow(DISCFormTable.COLUMN_DF)));


        return this;
    }


/*    public void dFHydrate(String string) throws JSONException {

        if (string != null) {

            JSONObject json = null;
            json = new JSONObject(string);

            this.ra01v2 = json.has("ra01v2") ? json.getString("ra01v2") : "";
            this.ra01v3 = json.has("ra01v3") ? json.getString("ra01v3") : "";

        }
    }*/


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();


        json.put(DISCFormTable.COLUMN_ID, this.id);
        json.put(DISCFormTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(DISCFormTable.COLUMN_UID, this.uid);
        json.put(DISCFormTable.COLUMN_USERNAME, this.userName);
        json.put(DISCFormTable.COLUMN_SYSDATE, this.sysDate);
        json.put(DISCFormTable.COLUMN_DIST_CODE, this.distCode);
        json.put(DISCFormTable.COLUMN_DEVICEID, this.deviceId);
        json.put(DISCFormTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(DISCFormTable.COLUMN_ISTATUS, this.iStatus);
        json.put(DISCFormTable.COLUMN_APPVERSION, this.appver);
        //  json.put(HouseholdTable.COLUMN_SYNCED, this.synced);
        //  json.put(HouseholdTable.COLUMN_SYNCED_DATE, this.syncDate);

        json.put(DISCFormTable.COLUMN_DF, new JSONObject(dFtoString()));

        return json;

    }

    public String dFtoString() throws JSONException {
        JSONObject json = new JSONObject();

/*        json
                .put("ra01v3", ra01v3)
                .put("ra01v2", ra01v2);*/

        return json.toString();
    }


    public DISCForm Sync(JSONObject jsonObject) throws JSONException {
        this.distCode = jsonObject.getString(DISCFormTable.COLUMN_DIST_CODE);
        this.uid = jsonObject.getString(DISCFormTable.COLUMN_UID);
        this.userName = jsonObject.getString(DISCFormTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(DISCFormTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(DISCFormTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(DISCFormTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(DISCFormTable.COLUMN_APPVERSION);
        this.iStatus = jsonObject.getString(DISCFormTable.COLUMN_ISTATUS);

        return this;
    }


}
