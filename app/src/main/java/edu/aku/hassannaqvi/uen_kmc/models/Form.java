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
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;


public class Form extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
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
    private String sF1 = _EMPTY_;
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
    private String f1101 = _EMPTY_;
    private String f1102 = _EMPTY_;
    private String f1104 = _EMPTY_;
    private String f1105 = _EMPTY_;
    private String f1106 = _EMPTY_;
    private String f1103 = _EMPTY_;
    private String f1107 = _EMPTY_;
    private String f1108 = _EMPTY_;
    private String f1109 = _EMPTY_;
    private String f1110 = _EMPTY_;
    private String f1111 = _EMPTY_;
    private String f1112 = _EMPTY_;
    private String f1113 = _EMPTY_;
    private String f1201 = _EMPTY_;
    private String f1202 = _EMPTY_;
    private String f1203 = _EMPTY_;
    private String f1204 = _EMPTY_;
    private String f120496x = _EMPTY_;
    private String f1301 = _EMPTY_;
    private String f1302 = _EMPTY_;
    private String f1303 = _EMPTY_;
    private String f1304 = _EMPTY_;
    private String f1305 = _EMPTY_;
    private String f1306 = _EMPTY_;
    private String f1307 = _EMPTY_;
    private String f1308 = _EMPTY_;
    private String f1309 = _EMPTY_;
    private String f13101 = _EMPTY_;
    private String f13102 = _EMPTY_;
    private String f13103 = _EMPTY_;
    private String f13104 = _EMPTY_;
    private String f13105 = _EMPTY_;
    private String f13106 = _EMPTY_;
    private String f13107 = _EMPTY_;
    private String f13108 = _EMPTY_;
    private String f13109 = _EMPTY_;
    private String f13110 = _EMPTY_;
    private String f131096 = _EMPTY_;
    private String f1311 = _EMPTY_;
    private String f1312 = _EMPTY_;
    private String f1401 = _EMPTY_;
    private String f140101x = _EMPTY_;
    private String f140102x = _EMPTY_;
    private String f1402 = _EMPTY_;
    private String f1403 = _EMPTY_;
    private String f1404 = _EMPTY_;
    private String f140401x = _EMPTY_;
    private String f1405 = _EMPTY_;
    private String f1406 = _EMPTY_;
    private String f1407 = _EMPTY_;
    private String f140796x = _EMPTY_;
    private String f1408 = _EMPTY_;
    private String f1409 = _EMPTY_;
    private String f1410 = _EMPTY_;
    private String f1411 = _EMPTY_;
    private String f1412 = _EMPTY_;
    private String f1413 = _EMPTY_;
    private String f1414 = _EMPTY_;
    private String f1415 = _EMPTY_;
    private String f141501 = _EMPTY_;
    private String f141502 = _EMPTY_;
    private String f141503 = _EMPTY_;
    private String f141504 = _EMPTY_;
    private String f141505 = _EMPTY_;
    private String f141506 = _EMPTY_;
    private String f141598 = _EMPTY_;
    private String f1416 = _EMPTY_;
    private String f1417 = _EMPTY_;
    private String f141796x = _EMPTY_;
    private String f1418 = _EMPTY_;
    private String f1419 = _EMPTY_;
    private String f141901 = _EMPTY_;
    private String f141902 = _EMPTY_;
    private String f141903 = _EMPTY_;
    private String f141904 = _EMPTY_;
    private String f141996 = _EMPTY_;
    private String f141996x = _EMPTY_;
    private String f1420 = _EMPTY_;
    private String f142096x = _EMPTY_;
    private String f1421 = _EMPTY_;
    private String f142101 = _EMPTY_;
    private String f142102 = _EMPTY_;
    private String f142103 = _EMPTY_;
    private String f142104 = _EMPTY_;
    private String f142105 = _EMPTY_;
    private String f142196 = _EMPTY_;
    private String f142196x = _EMPTY_;
    private String f1422 = _EMPTY_;
    private String f1423 = _EMPTY_;
    private String f142396x = _EMPTY_;
    private String f1f01 = _EMPTY_;
    private String f1502 = _EMPTY_;
    private String f1503 = _EMPTY_;
    private String f1504 = _EMPTY_;
    private String f1505 = _EMPTY_;
    private String f1506 = _EMPTY_;
    private String f1507 = _EMPTY_;
    private String f15081 = _EMPTY_;
    private String f15082 = _EMPTY_;
    private String f1509 = _EMPTY_;
    private String f150996x = _EMPTY_;
    private String f1510 = _EMPTY_;
    private String f15111 = _EMPTY_;
    private String f15112 = _EMPTY_;
    private String f15121 = _EMPTY_;
    private String f15122 = _EMPTY_;
    private String f15131 = _EMPTY_;
    private String f15132 = _EMPTY_;
    private String f1514 = _EMPTY_;

    public Form() {

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


    public String getsF1() {
        return sF1;
    }

    public void setsF1(String sF1) {
        this.sF1 = sF1;
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

    @Bindable
    public String getF1101() {
        return f1101;
    }

    public void setF1101(String f1101) {
        this.f1101 = f1101;
        notifyPropertyChanged(BR.f1101);
    }

    @Bindable
    public String getF1102() {
        return f1102;
    }

    public void setF1102(String f1102) {
        this.f1102 = f1102;
        setF1103(f1102.equals("1") ? this.f1103 : "");
        notifyPropertyChanged(BR.f1102);
    }

    @Bindable
    public String getF1104() {
        return f1104;
    }

    public void setF1104(String f1104) {
        this.f1104 = f1104;
        notifyPropertyChanged(BR.f1104);
    }

    @Bindable
    public String getF1105() {
        return f1105;
    }

    public void setF1105(String f1105) {
        this.f1105 = f1105;
        notifyPropertyChanged(BR.f1105);
    }

    @Bindable
    public String getF1106() {
        return f1106;
    }

    public void setF1106(String f1106) {
        this.f1106 = f1106;
        notifyPropertyChanged(BR.f1106);
    }

    @Bindable
    public String getF1103() {
        return f1103;
    }

    public void setF1103(String f1103) {
        this.f1103 = f1103;
        notifyPropertyChanged(BR.f1103);
    }

    @Bindable
    public String getF1107() {
        return f1107;
    }

    public void setF1107(String f1107) {
        this.f1107 = f1107;
        notifyPropertyChanged(BR.f1107);
    }

    @Bindable
    public String getF1108() {
        return f1108;
    }

    public void setF1108(String f1108) {
        this.f1108 = f1108;
        notifyPropertyChanged(BR.f1108);
    }

    @Bindable
    public String getF1109() {
        return f1109;
    }

    public void setF1109(String f1109) {
        this.f1109 = f1109;
        notifyPropertyChanged(BR.f1109);
    }

    @Bindable
    public String getF1110() {
        return f1110;
    }

    public void setF1110(String f1110) {
        this.f1110 = f1110;
        notifyPropertyChanged(BR.f1110);
    }

    @Bindable
    public String getF1111() {
        return f1111;
    }

    public void setF1111(String f1111) {
        this.f1111 = f1111;
        setStudyNo(f1111);
        notifyPropertyChanged(BR.f1111);
    }

    @Bindable
    public String getF1112() {
        return f1112;
    }

    public void setF1112(String f1112) {
        this.f1112 = f1112;
        notifyPropertyChanged(BR.f1112);
    }

    @Bindable
    public String getF1113() {
        return f1113;
    }

    public void setF1113(String f1113) {
        this.f1113 = f1113;
        notifyPropertyChanged(BR.f1113);
    }

    @Bindable
    public String getF1201() {
        return f1201;
    }

    public void setF1201(String f1201) {
        this.f1201 = f1201;
        setF1202(f1201.equals("1") ? this.f1202 : "");
        setF1203(f1201.equals("1") ? this.f1203 : "");
        setF1204(f1201.equals("1") ? this.f1204 : "");
        notifyPropertyChanged(BR.f1201);
    }

    @Bindable
    public String getF1202() {
        return f1202;
    }

    public void setF1202(String f1202) {
        this.f1202 = f1202;
        notifyPropertyChanged(BR.f1202);
    }

    @Bindable
    public String getF1203() {
        return f1203;
    }

    public void setF1203(String f1203) {
        this.f1203 = f1203;
        setF1204(f1203.equals("2") ? this.f1204 : "");
        notifyPropertyChanged(BR.f1203);
    }

    @Bindable
    public String getF1204() {
        return f1204;
    }

    public void setF1204(String f1204) {
        this.f1204 = f1204;
        setF120496x(f1204.equals("96") ? this.f120496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1204);
    }

    @Bindable
    public String getF120496x() {
        return f120496x;
    }

    public void setF120496x(String f120496x) {
        this.f120496x = f120496x;
        notifyPropertyChanged(BR.f120496x);
    }

    @Bindable
    public String getF1301() {
        return f1301;
    }

    public void setF1301(String f1301) {
        this.f1301 = f1301;
        notifyPropertyChanged(BR.f1301);
    }

    @Bindable
    public String getF1302() {
        return f1302;
    }

    public void setF1302(String f1302) {
        this.f1302 = f1302;
        notifyPropertyChanged(BR.f1302);
    }

    @Bindable
    public String getF1303() {
        return f1303;
    }

    public void setF1303(String f1303) {
        this.f1303 = f1303;
        notifyPropertyChanged(BR.f1303);
    }

    @Bindable
    public String getF1304() {
        return f1304;
    }

    public void setF1304(String f1304) {
        this.f1304 = f1304;
        notifyPropertyChanged(BR.f1304);
    }

    @Bindable
    public String getF1305() {
        return f1305;
    }

    public void setF1305(String f1305) {
        this.f1305 = f1305;
        setF15121(f1305.equals("2") ? this.f15121 : "");
        setF15122(f1305.equals("2") ? this.f15122 : "");
        setF15131(f1305.equals("1") ? this.f15131 : "");
        setF15132(f1305.equals("1") ? this.f15132 : "");
        notifyPropertyChanged(BR.f1305);
    }

    @Bindable
    public String getF1306() {
        return f1306;
    }

    public void setF1306(String f1306) {
        this.f1306 = f1306;
        notifyPropertyChanged(BR.f1306);
    }

    @Bindable
    public String getF1307() {
        return f1307;
    }

    public void setF1307(String f1307) {
        this.f1307 = f1307;
        notifyPropertyChanged(BR.f1307);
    }

    @Bindable
    public String getF1308() {
        return f1308;
    }

    public void setF1308(String f1308) {
        this.f1308 = f1308;
        setF1309(f1308.equals("1") ? this.f1309 : "");
        setF13101(f1308.equals("1") ? this.f13101 : "");
        setF13102(f1308.equals("1") ? this.f13102 : "");
        setF13103(f1308.equals("1") ? this.f13103 : "");
        setF13104(f1308.equals("1") ? this.f13104 : "");
        setF13105(f1308.equals("1") ? this.f13105 : "");
        setF13106(f1308.equals("1") ? this.f13106 : "");
        setF13107(f1308.equals("1") ? this.f13107 : "");
        setF13108(f1308.equals("1") ? this.f13108 : "");
        setF13109(f1308.equals("1") ? this.f13109 : "");
        setF13110(f1308.equals("1") ? this.f13110 : "");
        setF131096(f1308.equals("1") ? this.f131096 : "");
        notifyPropertyChanged(BR.f1308);
    }

    @Bindable
    public String getF1309() {
        return f1309;
    }

    public void setF1309(String f1309) {
        this.f1309 = f1309;
        notifyPropertyChanged(BR.f1309);
    }

    @Bindable
    public String getF13101() {
        return f13101;
    }

    public void setF13101(String f13101) {
        this.f13101 = f13101;
        notifyPropertyChanged(BR.f13101);
    }

    @Bindable
    public String getF13102() {
        return f13102;
    }

    public void setF13102(String f13102) {
        this.f13102 = f13102;
        notifyPropertyChanged(BR.f13102);
    }

    @Bindable
    public String getF13103() {
        return f13103;
    }

    public void setF13103(String f13103) {
        this.f13103 = f13103;
        notifyPropertyChanged(BR.f13103);
    }

    @Bindable
    public String getF13104() {
        return f13104;
    }

    public void setF13104(String f13104) {
        this.f13104 = f13104;
        notifyPropertyChanged(BR.f13104);
    }

    @Bindable
    public String getF13105() {
        return f13105;
    }

    public void setF13105(String f13105) {
        this.f13105 = f13105;
        notifyPropertyChanged(BR.f13105);
    }

    @Bindable
    public String getF13106() {
        return f13106;
    }

    public void setF13106(String f13106) {
        this.f13106 = f13106;
        notifyPropertyChanged(BR.f13106);
    }

    @Bindable
    public String getF13107() {
        return f13107;
    }

    public void setF13107(String f13107) {
        this.f13107 = f13107;
        notifyPropertyChanged(BR.f13107);
    }

    @Bindable
    public String getF13108() {
        return f13108;
    }

    public void setF13108(String f13108) {
        this.f13108 = f13108;
        notifyPropertyChanged(BR.f13108);
    }

    @Bindable
    public String getF13109() {
        return f13109;
    }

    public void setF13109(String f13109) {
        this.f13109 = f13109;
        notifyPropertyChanged(BR.f13109);
    }

    @Bindable
    public String getF13110() {
        return f13110;
    }

    public void setF13110(String f13110) {
        this.f13110 = f13110;
        notifyPropertyChanged(BR.f13110);
    }

    @Bindable
    public String getF131096() {
        return f131096;
    }

    public void setF131096(String f131096) {
        this.f131096 = f131096;
        notifyPropertyChanged(BR.f131096);
    }

    @Bindable
    public String getF1311() {
        return f1311;
    }

    public void setF1311(String f1311) {
        this.f1311 = f1311;
        setF1312(f1311.equals("1") ? this.f1312 : "");
        notifyPropertyChanged(BR.f1311);
    }

    @Bindable
    public String getF1312() {
        return f1312;
    }

    public void setF1312(String f1312) {
        this.f1312 = f1312;
        notifyPropertyChanged(BR.f1312);
    }

    @Bindable
    public String getF1401() {
        return f1401;
    }

    public void setF1401(String f1401) {
        this.f1401 = f1401;
        setF140101x(f1401.equals("1") ? this.f140101x : ""); // for all skips, mention all skipped questions
        setF140102x(f1401.equals("2") ? this.f140102x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1401);
    }

    @Bindable
    public String getF140101x() {
        return f140101x;
    }

    public void setF140101x(String f140101x) {
        this.f140101x = f140101x;
        notifyPropertyChanged(BR.f140101x);
    }

    @Bindable
    public String getF140102x() {
        return f140102x;
    }

    public void setF140102x(String f140102x) {
        this.f140102x = f140102x;
        notifyPropertyChanged(BR.f140102x);
    }

    @Bindable
    public String getF1402() {
        return f1402;
    }

    public void setF1402(String f1402) {
        this.f1402 = f1402;
        notifyPropertyChanged(BR.f1402);
    }

    @Bindable
    public String getF1403() {
        return f1403;
    }

    public void setF1403(String f1403) {
        this.f1403 = f1403;
        notifyPropertyChanged(BR.f1403);
    }

    @Bindable
    public String getF1404() {
        return f1404;
    }

    public void setF1404(String f1404) {
        this.f1404 = f1404;
        setF1405(f1404.equals("2") ? this.f1405 : "");
        setF140401x(f1404.equals("1") ? this.f140401x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1404);
    }

    @Bindable
    public String getF140401x() {
        return f140401x;
    }

    public void setF140401x(String f140401x) {
        this.f140401x = f140401x;
        notifyPropertyChanged(BR.f140401x);
    }

    @Bindable
    public String getF1405() {
        return f1405;
    }

    public void setF1405(String f1405) {
        this.f1405 = f1405;
        notifyPropertyChanged(BR.f1405);
    }

    @Bindable
    public String getF1406() {
        return f1406;
    }

    public void setF1406(String f1406) {
        this.f1406 = f1406;
        setF1407(f1406.equals("2") ? this.f1407 : "");
        notifyPropertyChanged(BR.f1406);
    }

    @Bindable
    public String getF1407() {
        return f1407;
    }

    public void setF1407(String f1407) {
        this.f1407 = f1407;
        setF140796x(f1407.equals("96") ? this.f140796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1407);
    }

    @Bindable
    public String getF140796x() {
        return f140796x;
    }

    public void setF140796x(String f140796x) {
        this.f140796x = f140796x;
        notifyPropertyChanged(BR.f140796x);
    }

    @Bindable
    public String getF1408() {
        return f1408;
    }

    public void setF1408(String f1408) {
        this.f1408 = f1408;
        notifyPropertyChanged(BR.f1408);
    }

    @Bindable
    public String getF1409() {
        return f1409;
    }

    public void setF1409(String f1409) {
        this.f1409 = f1409;
        notifyPropertyChanged(BR.f1409);
    }

    @Bindable
    public String getF1410() {
        return f1410;
    }

    public void setF1410(String f1410) {
        this.f1410 = f1410;
        notifyPropertyChanged(BR.f1410);
    }

    @Bindable
    public String getF1411() {
        return f1411;
    }

    public void setF1411(String f1411) {
        this.f1411 = f1411;
        setF1412(f1411.equals("2") ? "" : this.f1412);
        notifyPropertyChanged(BR.f1411);
    }

    @Bindable
    public String getF1412() {
        return f1412;
    }

    public void setF1412(String f1412) {
        this.f1412 = f1412;
        notifyPropertyChanged(BR.f1412);
    }

    @Bindable
    public String getF1413() {
        return f1413;
    }

    public void setF1413(String f1413) {
        this.f1413 = f1413;
        notifyPropertyChanged(BR.f1413);
    }

    @Bindable
    public String getF1414() {
        return f1414;
    }

    public void setF1414(String f1414) {
        this.f1414 = f1414;
        setF141501(f1414.equals("1") ? this.f141501 : "");
        setF141502(f1414.equals("1") ? this.f141502 : "");
        setF141503(f1414.equals("1") ? this.f141503 : "");
        setF141504(f1414.equals("1") ? this.f141504 : "");
        setF141505(f1414.equals("1") ? this.f141505 : "");
        setF141506(f1414.equals("1") ? this.f141506 : "");
        setF141598(f1414.equals("1") ? this.f141598 : "");
        notifyPropertyChanged(BR.f1414);
    }

    @Bindable
    public String getF1415() {
        return f1415;
    }

    public void setF1415(String f1415) {
        this.f1415 = f1415;
        notifyPropertyChanged(BR.f1415);
    }

    @Bindable
    public String getF141501() {
        return f141501;
    }

    public void setF141501(String f141501) {
        if (this.f141501.equals(f141501)) return; // for all checkboxes
        this.f141501 = f141501;
        notifyPropertyChanged(BR.f141501);
    }

    @Bindable
    public String getF141502() {
        return f141502;
    }

    public void setF141502(String f141502) {
        if (this.f141502.equals(f141502)) return; // for all checkboxes
        this.f141502 = f141502;
        notifyPropertyChanged(BR.f141502);
    }

    @Bindable
    public String getF141503() {
        return f141503;
    }

    public void setF141503(String f141503) {
        if (this.f141503.equals(f141503)) return; // for all checkboxes
        this.f141503 = f141503;
        notifyPropertyChanged(BR.f141503);
    }

    @Bindable
    public String getF141504() {
        return f141504;
    }

    public void setF141504(String f141504) {
        if (this.f141504.equals(f141504)) return; // for all checkboxes
        this.f141504 = f141504;
        notifyPropertyChanged(BR.f141504);
    }

    @Bindable
    public String getF141505() {
        return f141505;
    }

    public void setF141505(String f141505) {
        if (this.f141505.equals(f141505)) return; // for all checkboxes
        this.f141505 = f141505;
        notifyPropertyChanged(BR.f141505);
    }

    @Bindable
    public String getF141506() {
        return f141506;
    }

    public void setF141506(String f141506) {
        if (this.f141506.equals(f141506)) return; // for all checkboxes
        this.f141506 = f141506;
        notifyPropertyChanged(BR.f141506);
    }

    @Bindable
    public String getF141598() {
        return f141598;
    }

    public void setF141598(String f141598) {
        if (this.f141598.equals(f141598)) return; // for all checkboxes
        this.f141598 = f141598;
        setF141501(f141598.equals("98") ? "" : this.f141501);
        setF141502(f141598.equals("98") ? "" : this.f141502);
        setF141503(f141598.equals("98") ? "" : this.f141503);
        setF141504(f141598.equals("98") ? "" : this.f141504);
        setF141505(f141598.equals("98") ? "" : this.f141505);
        setF141506(f141598.equals("98") ? "" : this.f141506);
        notifyPropertyChanged(BR.f141598);
    }

    @Bindable
    public String getF1416() {
        return f1416;
    }

    public void setF1416(String f1416) {
        this.f1416 = f1416;
        notifyPropertyChanged(BR.f1416);
    }

    @Bindable
    public String getF1417() {
        return f1417;
    }

    public void setF1417(String f1417) {
        this.f1417 = f1417;
        setF141796x(f1417.equals("96") ? this.f141796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1417);
    }

    @Bindable
    public String getF141796x() {
        return f141796x;
    }

    public void setF141796x(String f141796x) {
        this.f141796x = f141796x;
        notifyPropertyChanged(BR.f141796x);
    }

    @Bindable
    public String getF1418() {
        return f1418;
    }

    public void setF1418(String f1418) {
        this.f1418 = f1418;
        setF141901(f1418.equals("1") ? "" : this.f141901);
        setF141902(f1418.equals("1") ? "" : this.f141902);
        setF141903(f1418.equals("1") ? "" : this.f141903);
        setF141904(f1418.equals("1") ? "" : this.f141904);
        setF141996(f1418.equals("1") ? "" : this.f141996);
        notifyPropertyChanged(BR.f1418);
    }

    @Bindable
    public String getF1419() {
        return f1419;
    }

    public void setF1419(String f1419) {
        this.f1419 = f1419;
        notifyPropertyChanged(BR.f1419);
    }

    @Bindable
    public String getF141901() {
        return f141901;
    }

    public void setF141901(String f141901) {
        if (this.f141901.equals(f141901)) return; // for all checkboxes
        this.f141901 = f141901;
        notifyPropertyChanged(BR.f141901);
    }

    @Bindable
    public String getF141902() {
        return f141902;
    }

    public void setF141902(String f141902) {
        if (this.f141902.equals(f141902)) return; // for all checkboxes
        this.f141902 = f141902;
        notifyPropertyChanged(BR.f141902);
    }

    @Bindable
    public String getF141903() {
        return f141903;
    }

    public void setF141903(String f141903) {
        if (this.f141903.equals(f141903)) return; // for all checkboxes
        this.f141903 = f141903;
        notifyPropertyChanged(BR.f141903);
    }

    @Bindable
    public String getF141904() {
        return f141904;
    }

    public void setF141904(String f141904) {
        if (this.f141904.equals(f141904)) return; // for all checkboxes
        this.f141904 = f141904;
        notifyPropertyChanged(BR.f141904);
    }

    @Bindable
    public String getF141996() {
        return f141996;
    }

    public void setF141996(String f141996) {
        if (this.f141996.equals(f141996)) return; // for all checkboxes
        this.f141996 = f141996;
        setF141996x(f141996.equals("96") ? this.f141996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f141996);
    }

    @Bindable
    public String getF141996x() {
        return f141996x;
    }

    public void setF141996x(String f141996x) {
        this.f141996x = f141996x;
        notifyPropertyChanged(BR.f141996x);
    }

    @Bindable
    public String getF1420() {
        return f1420;
    }

    public void setF1420(String f1420) {
        this.f1420 = f1420;
        setF142101(f1420.equals("5") ? this.f142101 : "");
        setF142102(f1420.equals("5") ? this.f142102 : "");
        setF142103(f1420.equals("5") ? this.f142103 : "");
        setF142104(f1420.equals("5") ? this.f142104 : "");
        setF142105(f1420.equals("5") ? this.f142105 : "");
        setF142196(f1420.equals("5") ? this.f142196 : "");
        setF142096x(f1420.equals("96") ? this.f142096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1420);
    }

    @Bindable
    public String getF142096x() {
        return f142096x;
    }

    public void setF142096x(String f142096x) {
        this.f142096x = f142096x;
        notifyPropertyChanged(BR.f142096x);
    }

    @Bindable
    public String getF1421() {
        return f1421;
    }

    public void setF1421(String f1421) {
        this.f1421 = f1421;
        notifyPropertyChanged(BR.f1421);
    }

    @Bindable
    public String getF142101() {
        return f142101;
    }

    public void setF142101(String f142101) {
        if (this.f142101.equals(f142101)) return; // for all checkboxes
        this.f142101 = f142101;
        notifyPropertyChanged(BR.f142101);
    }

    @Bindable
    public String getF142102() {
        return f142102;
    }

    public void setF142102(String f142102) {
        if (this.f142102.equals(f142102)) return; // for all checkboxes
        this.f142102 = f142102;
        notifyPropertyChanged(BR.f142102);
    }

    @Bindable
    public String getF142103() {
        return f142103;
    }

    public void setF142103(String f142103) {
        if (this.f142103.equals(f142103)) return; // for all checkboxes
        this.f142103 = f142103;
        notifyPropertyChanged(BR.f142103);
    }

    @Bindable
    public String getF142104() {
        return f142104;
    }

    public void setF142104(String f142104) {
        if (this.f142104.equals(f142104)) return; // for all checkboxes
        this.f142104 = f142104;
        notifyPropertyChanged(BR.f142104);
    }

    @Bindable
    public String getF142105() {
        return f142105;
    }

    public void setF142105(String f142105) {
        if (this.f142105.equals(f142105)) return; // for all checkboxes
        this.f142105 = f142105;
        notifyPropertyChanged(BR.f142105);
    }

    @Bindable
    public String getF142196() {
        return f142196;
    }

    public void setF142196(String f142196) {
        if (this.f142196.equals(f142196)) return; // for all checkboxes
        this.f142196 = f142196;
        setF142196x(f142196.equals("96") ? this.f142196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f142196);
    }

    @Bindable
    public String getF142196x() {
        return f142196x;
    }

    public void setF142196x(String f142196x) {
        this.f142196x = f142196x;
        notifyPropertyChanged(BR.f142196x);
    }

    @Bindable
    public String getF1422() {
        return f1422;
    }

    public void setF1422(String f1422) {
        this.f1422 = f1422;
        setF1423(f1422.equals("2") ? this.f1423 : "");
        notifyPropertyChanged(BR.f1422);
    }

    @Bindable
    public String getF1423() {
        return f1423;
    }

    public void setF1423(String f1423) {
        this.f1423 = f1423;
        setF142396x(f1423.equals("96") ? this.f142396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1423);
    }

    @Bindable
    public String getF142396x() {
        return f142396x;
    }

    public void setF142396x(String f142396x) {
        this.f142396x = f142396x;
        notifyPropertyChanged(BR.f142396x);
    }

    @Bindable
    public String getF1f01() {
        return f1f01;
    }

    public void setF1f01(String f1f01) {
        this.f1f01 = f1f01;
        notifyPropertyChanged(BR.f1f01);
    }

    @Bindable
    public String getF1502() {
        return f1502;
    }

    public void setF1502(String f1502) {
        this.f1502 = f1502;
        notifyPropertyChanged(BR.f1502);
    }

    @Bindable
    public String getF1503() {
        return f1503;
    }

    public void setF1503(String f1503) {
        this.f1503 = f1503;
        notifyPropertyChanged(BR.f1503);
    }

    @Bindable
    public String getF1504() {
        return f1504;
    }

    public void setF1504(String f1504) {
        this.f1504 = f1504;
        notifyPropertyChanged(BR.f1504);
    }

    @Bindable
    public String getF1505() {
        return f1505;
    }

    public void setF1505(String f1505) {
        this.f1505 = f1505;
        notifyPropertyChanged(BR.f1505);
    }

    @Bindable
    public String getF1506() {
        return f1506;
    }

    public void setF1506(String f1506) {
        this.f1506 = f1506;
        notifyPropertyChanged(BR.f1506);
    }

    @Bindable
    public String getF1507() {
        return f1507;
    }

    public void setF1507(String f1507) {
        this.f1507 = f1507;
        notifyPropertyChanged(BR.f1507);
    }

    @Bindable
    public String getF15081() {
        return f15081;
    }

    public void setF15081(String f15081) {
        this.f15081 = f15081;
        notifyPropertyChanged(BR.f15081);
    }

    @Bindable
    public String getF15082() {
        return f15082;
    }

    public void setF15082(String f15082) {
        this.f15082 = f15082;
        notifyPropertyChanged(BR.f15082);
    }

    @Bindable
    public String getF1509() {
        return f1509;
    }

    public void setF1509(String f1509) {
        this.f1509 = f1509;
        setF150996x(f1509.equals("96") ? this.f150996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f1509);
    }

    @Bindable
    public String getF150996x() {
        return f150996x;
    }

    public void setF150996x(String f150996x) {
        this.f150996x = f150996x;
        notifyPropertyChanged(BR.f150996x);
    }

    @Bindable
    public String getF1510() {
        return f1510;
    }

    public void setF1510(String f1510) {
        this.f1510 = f1510;
        notifyPropertyChanged(BR.f1510);
    }

    @Bindable
    public String getF15111() {
        return f15111;
    }

    public void setF15111(String f15111) {
        this.f15111 = f15111;
        notifyPropertyChanged(BR.f15111);
    }

    @Bindable
    public String getF15112() {
        return f15112;
    }

    public void setF15112(String f15112) {
        this.f15112 = f15112;
        notifyPropertyChanged(BR.f15112);
    }

    @Bindable
    public String getF15121() {
        return f15121;
    }

    public void setF15121(String f15121) {
        this.f15121 = f15121;
        notifyPropertyChanged(BR.f15121);
    }

    @Bindable
    public String getF15122() {
        return f15122;
    }

    public void setF15122(String f15122) {
        this.f15122 = f15122;
        notifyPropertyChanged(BR.f15122);
    }

    @Bindable
    public String getF15131() {
        return f15131;
    }

    public void setF15131(String f15131) {
        this.f15131 = f15131;
        notifyPropertyChanged(BR.f15131);
    }

    @Bindable
    public String getF15132() {
        return f15132;
    }

    public void setF15132(String f15132) {
        this.f15132 = f15132;
        notifyPropertyChanged(BR.f15132);
    }

    @Bindable
    public String getF1514() {
        return f1514;
    }

    public void setF1514(String f1514) {
        this.f1514 = f1514;
        notifyPropertyChanged(BR.f1514);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.studyNo = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_STUDY_NO));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        //   this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));
        this.formComplete = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_FORM_COMPLETE));

        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF1)));
        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF2)));


        return this;
    }


    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f1101 = json.getString("f1101");
            this.f1102 = json.getString("f1102");
            this.f1104 = json.getString("f1104");
            this.f1105 = json.getString("f1105");
            this.f1106 = json.getString("f1106");
            this.f1103 = json.getString("f1103");
            this.f1107 = json.getString("f1107");
            this.f1108 = json.getString("f1108");
            this.f1109 = json.getString("f1109");
            this.f1110 = json.getString("f1110");
            this.f1111 = json.getString("f1111");
            this.f1112 = json.getString("f1112");
            this.f1113 = json.getString("f1113");
            this.f1201 = json.getString("f1201");
            this.f1202 = json.getString("f1202");
            this.f1203 = json.getString("f1203");
            this.f1204 = json.getString("f1204");
            this.f120496x = json.getString("f120496x");
            this.f1301 = json.getString("f1301");
            this.f1302 = json.getString("f1302");
            this.f1305 = json.getString("f1305");
            this.f1306 = json.getString("f1306");
            this.f1307 = json.getString("f1307");
            this.f1308 = json.getString("f1308");
            this.f1309 = json.getString("f1309");
            this.f13101 = json.getString("f13101");
            this.f13102 = json.getString("f13102");
            this.f13103 = json.getString("f13103");
            this.f13104 = json.getString("f13104");
            this.f13105 = json.getString("f13105");
            this.f13106 = json.getString("f13106");
            this.f13107 = json.getString("f13107");
            this.f13108 = json.getString("f13108");
            this.f13109 = json.getString("f13109");
            this.f13110 = json.getString("f13110");
            this.f131096 = json.getString("f131096");
            this.f1311 = json.getString("f1311");
            this.f1312 = json.getString("f1312");
            this.f1401 = json.getString("f1401");
            this.f140101x = json.getString("f140101x");
            this.f140102x = json.getString("f140102x");
            this.f1402 = json.getString("f1402");
            this.f1403 = json.getString("f1403");
            this.f1404 = json.getString("f1404");
            this.f140401x = json.getString("f140401x");
            this.f1405 = json.getString("f1405");
            this.f1406 = json.getString("f1406");
            this.f1407 = json.getString("f1407");
            this.f140796x = json.getString("f140796x");
            this.f1408 = json.getString("f1408");
            this.f1409 = json.getString("f1409");
            this.f1410 = json.getString("f1410");
            this.f1411 = json.getString("f1411");
            this.f1412 = json.getString("f1412");
            this.f1413 = json.getString("f1413");
            this.f1414 = json.getString("f1414");
            this.f141501 = json.getString("f141501");
            this.f141502 = json.getString("f141502");
            this.f141503 = json.getString("f141503");
            this.f141504 = json.getString("f141504");
            this.f141505 = json.getString("f141505");
            this.f141506 = json.getString("f141506");
            this.f141598 = json.getString("f141598");
            this.f1416 = json.getString("f1416");
            this.f1417 = json.getString("f1417");
            this.f141796x = json.getString("f141796x");
            this.f1418 = json.getString("f1418");
            this.f141901 = json.getString("f141901");
            this.f141902 = json.getString("f141902");
            this.f141903 = json.getString("f141903");
            this.f141904 = json.getString("f141904");
            this.f141996 = json.getString("f141996");
            this.f141996x = json.getString("f141996x");
            this.f1420 = json.getString("f1420");
            this.f142096x = json.getString("f142096x");
            this.f142101 = json.getString("f142101");
            this.f142102 = json.getString("f142102");
            this.f142103 = json.getString("f142103");
            this.f142104 = json.getString("f142104");
            this.f142105 = json.getString("f142105");
            this.f142196 = json.getString("f142196");
            this.f142196x = json.getString("f142196x");
            this.f1422 = json.getString("f1422");
            this.f1423 = json.getString("f1423");
            this.f142396x = json.getString("f142396x");
            this.f1f01 = json.getString("f1f01");
            this.f1502 = json.getString("f1502");
            this.f1503 = json.getString("f1503");
            this.f1504 = json.getString("f1504");
            this.f1505 = json.getString("f1505");
            this.f1506 = json.getString("f1506");
            this.f1507 = json.getString("f1507");
            this.f15081 = json.getString("f15081");
            this.f15082 = json.getString("f15082");
            this.f1509 = json.getString("f1509");
            this.f150996x = json.getString("f150996x");
            this.f1510 = json.getString("f1510");
            this.f15111 = json.getString("f15111");
            this.f15112 = json.getString("f15112");
            this.f15121 = json.getString("f15121");
            this.f15122 = json.getString("f15122");
            this.f15131 = json.getString("f15131");
            this.f15132 = json.getString("f15132");
            this.f1514 = json.getString("f1514");
        }
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


    public String sF1toString() throws JSONException {
        Log.d(TAG, "sF1toString: ");
        JSONObject json = new JSONObject();
        json.put("f1101", f1101)
                .put("f1102", f1102)
                .put("f1104", f1104)
                .put("f1105", f1105)
                .put("f1106", f1106)
                .put("f1103", f1103)
                .put("f1107", f1107)
                .put("f1108", f1108)
                .put("f1109", f1109)
                .put("f1110", f1110)
                .put("f1111", f1111)
                .put("f1112", f1112)
                .put("f1113", f1113)
                .put("f1201", f1201)
                .put("f1202", f1202)
                .put("f1203", f1203)
                .put("f1204", f1204)
                .put("f120496x", f120496x)
                .put("f1301", f1301)
                .put("f1302", f1302)
                .put("f1305", f1305)
                .put("f1306", f1306)
                .put("f1307", f1307)
                .put("f1308", f1308)
                .put("f1309", f1309)
                .put("f13101", f13101)
                .put("f13102", f13102)
                .put("f13103", f13103)
                .put("f13104", f13104)
                .put("f13105", f13105)
                .put("f13106", f13106)
                .put("f13107", f13107)
                .put("f13108", f13108)
                .put("f13109", f13109)
                .put("f13110", f13110)
                .put("f131096", f131096)
                .put("f1311", f1311)
                .put("f1312", f1312)
                .put("f1401", f1401)
                .put("f140101x", f140101x)
                .put("f140102x", f140102x)
                .put("f1402", f1402)
                .put("f1403", f1403)
                .put("f1404", f1404)
                .put("f140401x", f140401x)
                .put("f1405", f1405)
                .put("f1406", f1406)
                .put("f1407", f1407)
                .put("f140796x", f140796x)
                .put("f1408", f1408)
                .put("f1409", f1409)
                .put("f1410", f1410)
                .put("f1411", f1411)
                .put("f1412", f1412)
                .put("f1413", f1413)
                .put("f1414", f1414)
                .put("f141501", f141501)
                .put("f141502", f141502)
                .put("f141503", f141503)
                .put("f141504", f141504)
                .put("f141505", f141505)
                .put("f141506", f141506)
                .put("f141598", f141598)
                .put("f1416", f1416)
                .put("f1417", f1417)
                .put("f141796x", f141796x)
                .put("f1418", f1418)
                .put("f141901", f141901)
                .put("f141902", f141902)
                .put("f141903", f141903)
                .put("f141904", f141904)
                .put("f141996", f141996)
                .put("f141996x", f141996x)
                .put("f1420", f1420)
                .put("f142096x", f142096x)
                .put("f142101", f142101)
                .put("f142102", f142102)
                .put("f142103", f142103)
                .put("f142104", f142104)
                .put("f142105", f142105)
                .put("f142196", f142196)
                .put("f142196x", f142196x)
                .put("f1422", f1422)
                .put("f1423", f1423)
                .put("f142396x", f142396x)
                .put("f1f01", f1f01)
                .put("f1502", f1502)
                .put("f1503", f1503)
                .put("f1504", f1504)
                .put("f1505", f1505)
                .put("f1506", f1506)
                .put("f1507", f1507)
                .put("f15081", f15081)
                .put("f15082", f15082)
                .put("f1509", f1509)
                .put("f150996x", f150996x)
                .put("f1510", f1510)
                .put("f15111", f15111)
                .put("f15112", f15112)
                .put("f15121", f15121)
                .put("f15122", f15122)
                .put("f15131", f15131)
                .put("f15132", f15132)
                .put("f1514", f1514);
        return json.toString();
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

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_UUID, this.uuid);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_STUDY_NO, this.studyNo);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        //    json.put(FormsTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SF1, new JSONObject(sF1toString()));
        json.put(FormsTable.COLUMN_SF2, new JSONObject(sF2toString()));

        return json;
    }

}
