package edu.aku.hassannaqvi.uen_kmc.models;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_kmc.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_kmc.BR;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.DischargeTable;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;


public class Discharge extends BaseObservable implements Observable {

    private final String TAG = "Discharge";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String ebCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;
    private String formComplete = _EMPTY_;
    private String entryType = _EMPTY_;
    private String studyNo = _EMPTY_;


    // FIELD VARIABLES
    private String sF2 = _EMPTY_;

    // SECTION VARIABLES
    private String f2date = _EMPTY_;
    private String f2time = _EMPTY_;
    private String f2101 = _EMPTY_;
    private String f2102 = _EMPTY_;
    private String f2103 = _EMPTY_;
    private String f2201 = _EMPTY_;
    private String f220101 = _EMPTY_;
    private String f220102 = _EMPTY_;
    private String f220103 = _EMPTY_;
    private String f220104 = _EMPTY_;
    private String f2202 = _EMPTY_;
    private String f2203 = _EMPTY_;
    private String f2204 = _EMPTY_;
    private String f220496x = _EMPTY_;
    private String f2205 = _EMPTY_;
    private String f220501 = _EMPTY_;
    private String f220502 = _EMPTY_;
    private String f220503 = _EMPTY_;
    private String f220596 = _EMPTY_;
    private String f220596x = _EMPTY_;
    private String f2206 = _EMPTY_;
    private String f2207 = _EMPTY_;
    private String f2208 = _EMPTY_;
    private String f220896x = _EMPTY_;
    private String f2209 = _EMPTY_;
    private String f2210 = _EMPTY_;
    private String f221096x = _EMPTY_;
    private String f2301 = _EMPTY_;
    private String f2302 = _EMPTY_;
    private String f2303 = _EMPTY_;
    private String f2304 = _EMPTY_;
    private String f230401 = _EMPTY_;
    private String f230402 = _EMPTY_;
    private String f230403 = _EMPTY_;
    private String f2305 = _EMPTY_;
    private String f2306 = _EMPTY_;
    private String f230601 = _EMPTY_;
    private String f230602 = _EMPTY_;
    private String f230603 = _EMPTY_;
    private String f230696 = _EMPTY_;
    private String f230696x = _EMPTY_;
    private String f2401 = _EMPTY_;
    private String f240101 = _EMPTY_;
    private String f240102 = _EMPTY_;
    private String f240103 = _EMPTY_;
    private String f240104 = _EMPTY_;
    private String f240105 = _EMPTY_;
    private String f240106 = _EMPTY_;
    private String f240107 = _EMPTY_;
    private String f240108 = _EMPTY_;

    public Discharge() {

/*        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());*/

    }

    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());
        //   setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
//        setHhid(MainApp.selectedHHID);
        setEntryType(String.valueOf(MainApp.entryType));

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
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

    public String getFormComplete() {
        return formComplete;
    }

    public void setFormComplete(String formComplete) {
        this.formComplete = formComplete;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getStudyNo() {
        return studyNo;
    }

    public void setStudyNo(String studyNo) {
        this.studyNo = studyNo;
    }

    public String getsF2() {
        return sF2;
    }

    public void setsF2(String sF2) {
        this.sF2 = sF2;
    }

    @Bindable
    public String getF2date() {
        return f2date;
    }

    public void setF2date(String f2date) {
        this.f2date = f2date;
        notifyPropertyChanged(BR.f2date);
    }

    @Bindable
    public String getF2time() {
        return f2time;
    }

    public void setF2time(String f2time) {
        this.f2time = f2time;
        notifyPropertyChanged(BR.f2time);
    }

    @Bindable
    public String getF2101() {
        return f2101;
    }

    public void setF2101(String f2101) {
        this.f2101 = f2101;
        setStudyNo(f2101);
        notifyPropertyChanged(BR.f2101);
    }

    @Bindable
    public String getF2102() {
        return f2102;
    }

    public void setF2102(String f2102) {
        this.f2102 = f2102;
        notifyPropertyChanged(BR.f2102);
    }

    @Bindable
    public String getF2103() {
        return f2103;
    }

    public void setF2103(String f2103) {
        this.f2103 = f2103;
        notifyPropertyChanged(BR.f2103);
    }

    @Bindable
    public String getF2201() {
        return f2201;
    }

    public void setF2201(String f2201) {
        this.f2201 = f2201;
        notifyPropertyChanged(BR.f2201);
    }

    @Bindable
    public String getF220101() {
        return f220101;
    }

    public void setF220101(String f220101) {
        if (this.f220101.equals(f220101)) return; // for all checkboxes
        this.f220101 = f220101;
        notifyPropertyChanged(BR.f220101);
    }

    @Bindable
    public String getF220102() {
        return f220102;
    }

    public void setF220102(String f220102) {
        if (this.f220102.equals(f220102)) return; // for all checkboxes
        this.f220102 = f220102;
        notifyPropertyChanged(BR.f220102);
    }

    @Bindable
    public String getF220103() {
        return f220103;
    }

    public void setF220103(String f220103) {
        if (this.f220103.equals(f220103)) return; // for all checkboxes
        this.f220103 = f220103;
        notifyPropertyChanged(BR.f220103);
    }

    @Bindable
    public String getF220104() {
        return f220104;
    }

    public void setF220104(String f220104) {
        if (this.f220104.equals(f220104)) return; // for all checkboxes
        this.f220104 = f220104;
        notifyPropertyChanged(BR.f220104);
    }

    @Bindable
    public String getF2202() {
        return f2202;
    }

    public void setF2202(String f2202) {
        this.f2202 = f2202;
        notifyPropertyChanged(BR.f2202);
    }

    @Bindable
    public String getF2203() {
        return f2203;
    }

    public void setF2203(String f2203) {
        this.f2203 = f2203;
        setF2204(f2203.equals("1") ? this.f2204 : "");
        notifyPropertyChanged(BR.f2203);
    }

    @Bindable
    public String getF2204() {
        return f2204;
    }

    public void setF2204(String f2204) {
        this.f2204 = f2204;
        setF220496x(f2204.equals("96") ? this.f220496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f2204);
    }

    @Bindable
    public String getF220496x() {
        return f220496x;
    }

    public void setF220496x(String f220496x) {
        this.f220496x = f220496x;
        notifyPropertyChanged(BR.f220496x);
    }

    @Bindable
    public String getF2205() {
        return f2205;
    }

    public void setF2205(String f2205) {
        this.f2205 = f2205;
        notifyPropertyChanged(BR.f2205);
    }

    @Bindable
    public String getF220501() {
        return f220501;
    }

    public void setF220501(String f220501) {
        if (this.f220501.equals(f220501)) return; // for all checkboxes
        this.f220501 = f220501;
        notifyPropertyChanged(BR.f220501);
    }

    @Bindable
    public String getF220502() {
        return f220502;
    }

    public void setF220502(String f220502) {
        if (this.f220502.equals(f220502)) return; // for all checkboxes
        this.f220502 = f220502;
        notifyPropertyChanged(BR.f220502);
    }

    @Bindable
    public String getF220503() {
        return f220503;
    }

    public void setF220503(String f220503) {
        if (this.f220503.equals(f220503)) return; // for all checkboxes
        this.f220503 = f220503;
        notifyPropertyChanged(BR.f220503);
    }

    @Bindable
    public String getF220596() {
        return f220596;
    }

    public void setF220596(String f220596) {
        if (this.f220596.equals(f220596)) return; // for all checkboxes
        this.f220596 = f220596;
        setF220596x(f220596.equals("96") ? this.f220596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f220596);
    }

    @Bindable
    public String getF220596x() {
        return f220596x;
    }

    public void setF220596x(String f220596x) {
        this.f220596x = f220596x;
        notifyPropertyChanged(BR.f220596x);
    }

    @Bindable
    public String getF2206() {
        return f2206;
    }

    public void setF2206(String f2206) {
        this.f2206 = f2206;
        notifyPropertyChanged(BR.f2206);
    }

    @Bindable
    public String getF2207() {
        return f2207;
    }

    public void setF2207(String f2207) {
        this.f2207 = f2207;
        setF2208(f2207.equals("1") ? this.f2208 : "");
        notifyPropertyChanged(BR.f2207);
    }

    @Bindable
    public String getF2208() {
        return f2208;
    }

    public void setF2208(String f2208) {
        this.f2208 = f2208;
        setF220896x(f2208.equals("96") ? this.f220896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f2208);
    }

    @Bindable
    public String getF220896x() {
        return f220896x;
    }

    public void setF220896x(String f220896x) {
        this.f220896x = f220896x;
        notifyPropertyChanged(BR.f220896x);
    }

    @Bindable
    public String getF2209() {
        return f2209;
    }

    public void setF2209(String f2209) {
        this.f2209 = f2209;
        setF2210(f2209.equals("2") ? this.f2210 : "");
        notifyPropertyChanged(BR.f2209);
    }

    @Bindable
    public String getF2210() {
        return f2210;
    }

    public void setF2210(String f2210) {
        this.f2210 = f2210;
        setF221096x(f2210.equals("96") ? this.f221096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f2210);
    }

    @Bindable
    public String getF221096x() {
        return f221096x;
    }

    public void setF221096x(String f221096x) {
        this.f221096x = f221096x;
        notifyPropertyChanged(BR.f221096x);
    }

    @Bindable
    public String getF2301() {
        return f2301;
    }

    public void setF2301(String f2301) {
        this.f2301 = f2301;
        notifyPropertyChanged(BR.f2301);
    }

    @Bindable
    public String getF2302() {
        return f2302;
    }

    public void setF2302(String f2302) {
        this.f2302 = f2302;
        notifyPropertyChanged(BR.f2302);
    }

    @Bindable
    public String getF2303() {
        return f2303;
    }

    public void setF2303(String f2303) {
        this.f2303 = f2303;
        notifyPropertyChanged(BR.f2303);
    }

    @Bindable
    public String getF2304() {
        return f2304;
    }

    public void setF2304(String f2304) {
        this.f2304 = f2304;
        notifyPropertyChanged(BR.f2304);
    }

    @Bindable
    public String getF230401() {
        return f230401;
    }

    public void setF230401(String f230401) {
        if (this.f230401.equals(f230401)) return; // for all checkboxes
        this.f230401 = f230401;
        notifyPropertyChanged(BR.f230401);
    }

    @Bindable
    public String getF230402() {
        return f230402;
    }

    public void setF230402(String f230402) {
        if (this.f230402.equals(f230402)) return; // for all checkboxes
        this.f230402 = f230402;
        notifyPropertyChanged(BR.f230402);
    }

    @Bindable
    public String getF230403() {
        return f230403;
    }

    public void setF230403(String f230403) {
        if (this.f230403.equals(f230403)) return; // for all checkboxes
        this.f230403 = f230403;
        notifyPropertyChanged(BR.f230403);
    }

    @Bindable
    public String getF2305() {
        return f2305;
    }

    public void setF2305(String f2305) {
        this.f2305 = f2305;
        notifyPropertyChanged(BR.f2305);
    }

    @Bindable
    public String getF2306() {
        return f2306;
    }

    public void setF2306(String f2306) {
        this.f2306 = f2306;
        notifyPropertyChanged(BR.f2306);
    }

    @Bindable
    public String getF230601() {
        return f230601;
    }

    public void setF230601(String f230601) {
        if (this.f230601.equals(f230601)) return; // for all checkboxes
        this.f230601 = f230601;
        notifyPropertyChanged(BR.f230601);
    }

    @Bindable
    public String getF230602() {
        return f230602;
    }

    public void setF230602(String f230602) {
        if (this.f230602.equals(f230602)) return; // for all checkboxes
        this.f230602 = f230602;
        notifyPropertyChanged(BR.f230602);
    }

    @Bindable
    public String getF230603() {
        return f230603;
    }

    public void setF230603(String f230603) {
        if (this.f230603.equals(f230603)) return; // for all checkboxes
        this.f230603 = f230603;
        notifyPropertyChanged(BR.f230603);
    }

    @Bindable
    public String getF230696() {
        return f230696;
    }

    public void setF230696(String f230696) {
        if (this.f230696.equals(f230696)) return; // for all checkboxes
        this.f230696 = f230696;
        setF230696x(f230696.equals("96") ? this.f230696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f230696);
    }

    @Bindable
    public String getF230696x() {
        return f230696x;
    }

    public void setF230696x(String f230696x) {
        this.f230696x = f230696x;
        notifyPropertyChanged(BR.f230696x);
    }

    @Bindable
    public String getF2401() {
        return f2401;
    }

    public void setF2401(String f2401) {
        this.f2401 = f2401;
        notifyPropertyChanged(BR.f2401);
    }

    @Bindable
    public String getF240101() {
        return f240101;
    }

    public void setF240101(String f240101) {
        if (this.f240101.equals(f240101)) return; // for all checkboxes
        this.f240101 = f240101;
        notifyPropertyChanged(BR.f240101);
    }

    @Bindable
    public String getF240102() {
        return f240102;
    }

    public void setF240102(String f240102) {
        if (this.f240102.equals(f240102)) return; // for all checkboxes
        this.f240102 = f240102;
        notifyPropertyChanged(BR.f240102);
    }

    @Bindable
    public String getF240103() {
        return f240103;
    }

    public void setF240103(String f240103) {
        if (this.f240103.equals(f240103)) return; // for all checkboxes
        this.f240103 = f240103;
        notifyPropertyChanged(BR.f240103);
    }

    @Bindable
    public String getF240104() {
        return f240104;
    }

    public void setF240104(String f240104) {
        if (this.f240104.equals(f240104)) return; // for all checkboxes
        this.f240104 = f240104;
        notifyPropertyChanged(BR.f240104);
    }

    @Bindable
    public String getF240105() {
        return f240105;
    }

    public void setF240105(String f240105) {
        if (this.f240105.equals(f240105)) return; // for all checkboxes
        this.f240105 = f240105;
        notifyPropertyChanged(BR.f240105);
    }

    @Bindable
    public String getF240106() {
        return f240106;
    }

    public void setF240106(String f240106) {
        if (this.f240106.equals(f240106)) return; // for all checkboxes
        this.f240106 = f240106;
        notifyPropertyChanged(BR.f240106);
    }

    @Bindable
    public String getF240107() {
        return f240107;
    }

    public void setF240107(String f240107) {
        if (this.f240107.equals(f240107)) return; // for all checkboxes
        this.f240107 = f240107;
        notifyPropertyChanged(BR.f240107);
    }

    @Bindable
    public String getF240108() {
        return f240108;
    }

    public void setF240108(String f240108) {
        if (this.f240108.equals(f240108)) return; // for all checkboxes
        this.f240108 = f240108;
        notifyPropertyChanged(BR.f240108);
    }


    public Discharge Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_UUID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_DEVICETAGID));
        this.studyNo = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_STUDY_NO));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_APPVERSION));
        //   this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_SYNCED_DATE));
        this.formComplete = cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_FORM_COMPLETE));

        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(DischargeTable.COLUMN_SF2)));


        return this;
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f2date = json.getString("f2date");
            this.f2time = json.getString("f2time");
            this.f2101 = json.getString("f2101");
            this.f2102 = json.getString("f2102");
            this.f2103 = json.getString("f2103");
            this.f220101 = json.getString("f220101");
            this.f220102 = json.getString("f220102");
            this.f220103 = json.getString("f220103");
            this.f220104 = json.getString("f220104");
            this.f2202 = json.getString("f2202");
            this.f2203 = json.getString("f2203");
            this.f2204 = json.getString("f2204");
            this.f220496x = json.getString("f220496x");
            this.f220501 = json.getString("f220501");
            this.f220502 = json.getString("f220502");
            this.f220503 = json.getString("f220503");
            this.f220596 = json.getString("f220596");
            this.f220596x = json.getString("f220596x");
            this.f2206 = json.getString("f2206");
            this.f2207 = json.getString("f2207");
            this.f2208 = json.getString("f2208");
            this.f220896x = json.getString("f220896x");
            this.f2209 = json.getString("f2209");
            this.f2210 = json.getString("f2210");
            this.f221096x = json.getString("f221096x");
            this.f2301 = json.getString("f2301");
            this.f2302 = json.getString("f2302");
            this.f2303 = json.getString("f2303");
            this.f230401 = json.getString("f230401");
            this.f230402 = json.getString("f230402");
            this.f230403 = json.getString("f230403");
            this.f2305 = json.getString("f2305");
            this.f230601 = json.getString("f230601");
            this.f230602 = json.getString("f230602");
            this.f230603 = json.getString("f230603");
            this.f230696 = json.getString("f230696");
            this.f230696x = json.getString("f230696x");
            this.f240101 = json.getString("f240101");
            this.f240102 = json.getString("f240102");
            this.f240103 = json.getString("f240103");
            this.f240104 = json.getString("f240104");
            this.f240105 = json.getString("f240105");
            this.f240106 = json.getString("f240106");
            this.f240107 = json.getString("f240107");
            this.f240108 = json.getString("f240108");

        }
    }


    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f2date", f2date)
                .put("f2time", f2time)
                .put("f2101", f2101)
                .put("f2102", f2102)
                .put("f2103", f2103)
                .put("f220101", f220101)
                .put("f220102", f220102)
                .put("f220103", f220103)
                .put("f220104", f220104)
                .put("f2202", f2202)
                .put("f2203", f2203)
                .put("f2204", f2204)
                .put("f220496x", f220496x)
                .put("f220501", f220501)
                .put("f220502", f220502)
                .put("f220503", f220503)
                .put("f220596", f220596)
                .put("f220596x", f220596x)
                .put("f2206", f2206)
                .put("f2207", f2207)
                .put("f2208", f2208)
                .put("f220896x", f220896x)
                .put("f2209", f2209)
                .put("f2210", f2210)
                .put("f221096x", f221096x)
                .put("f2301", f2301)
                .put("f2302", f2302)
                .put("f2303", f2303)
                .put("f230401", f230401)
                .put("f230402", f230402)
                .put("f230403", f230403)
                .put("f2305", f2305)
                .put("f230601", f230601)
                .put("f230602", f230602)
                .put("f230603", f230603)
                .put("f230696", f230696)
                .put("f230696x", f230696x)
                .put("f240101", f240101)
                .put("f240102", f240102)
                .put("f240103", f240103)
                .put("f240104", f240104)
                .put("f240105", f240105)
                .put("f240106", f240106)
                .put("f240107", f240107)
                .put("f240108", f240108);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(DischargeTable.COLUMN_ID, this.id);
        json.put(DischargeTable.COLUMN_UID, this.uid);
        json.put(DischargeTable.COLUMN_UUID, this.uuid);
        json.put(DischargeTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(DischargeTable.COLUMN_HHID, this.hhid);
        json.put(DischargeTable.COLUMN_SNO, this.sno);
        json.put(DischargeTable.COLUMN_USERNAME, this.userName);
        json.put(DischargeTable.COLUMN_SYNCED, this.synced);
        json.put(DischargeTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(DischargeTable.COLUMN_SYSDATE, this.sysDate);
        json.put(DischargeTable.COLUMN_DEVICEID, this.deviceId);
        json.put(DischargeTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(DischargeTable.COLUMN_STUDY_NO, this.studyNo);
        json.put(DischargeTable.COLUMN_APPVERSION, this.appver);
        //    json.put(DischargeTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(DischargeTable.COLUMN_ISTATUS, this.iStatus);
        json.put(DischargeTable.COLUMN_SF2, new JSONObject(sF2toString()));

        return json;
    }

}
