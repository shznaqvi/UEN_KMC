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
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.FollowUpTable;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;


public class FollowUp extends BaseObservable implements Observable {

    private final String TAG = "Followup";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // FIELD VARIABLES
    private final String f3date = _EMPTY_;
    private final String f3time = _EMPTY_;
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
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
    private String sF3 = _EMPTY_;
    // SECTION VARIABLES
    private String f3101 = _EMPTY_;
    private String f3102 = _EMPTY_;
    private String f3103 = _EMPTY_;
    private String f3104 = _EMPTY_;
    private String f3105 = _EMPTY_;
    private String f3201 = _EMPTY_;
    private String f3202 = _EMPTY_;
    private String f3203 = _EMPTY_;
    private String f3204 = _EMPTY_;
    private String f320401 = _EMPTY_;
    private String f320402 = _EMPTY_;
    private String f320403 = _EMPTY_;
    private String f320404 = _EMPTY_;
    private String f320405 = _EMPTY_;
    private String f320406 = _EMPTY_;
    private String f320407 = _EMPTY_;
    private String f320408 = _EMPTY_;
    private String f320409 = _EMPTY_;
    private String f320496 = _EMPTY_;
    private String f320496x = _EMPTY_;
    private String f3205 = _EMPTY_;
    private String f3301 = _EMPTY_;
    private String f3302 = _EMPTY_;
    private String f330201x = _EMPTY_;
    private String f330202x = _EMPTY_;
    private String f3303 = _EMPTY_;
    private String f3401 = _EMPTY_;
    private String f3402 = _EMPTY_;
    private String f340296x = _EMPTY_;
    private String f3403 = _EMPTY_;
    private String f3404 = _EMPTY_;
    private String f3405 = _EMPTY_;
    private String f340596x = _EMPTY_;
    private String f3406 = _EMPTY_;
    private String f340696x = _EMPTY_;
    private String f3407 = _EMPTY_;
    private String f3408 = _EMPTY_;
    private String f3409 = _EMPTY_;
    private String f3601 = _EMPTY_;
    private String f3602 = _EMPTY_;
    private String f360296x = _EMPTY_;
    private String f3603 = _EMPTY_;
    private String f3604 = _EMPTY_;
    private String f3605 = _EMPTY_;
    private String f360501 = _EMPTY_;
    private String f360502 = _EMPTY_;
    private String f360503 = _EMPTY_;
    private String f360504 = _EMPTY_;
    private String f360505 = _EMPTY_;
    private String f360506 = _EMPTY_;
    private String f360507 = _EMPTY_;
    private String f360596 = _EMPTY_;
    private String f360596x = _EMPTY_;
    private String f3606 = _EMPTY_;
    private String f3607 = _EMPTY_;
    private String f3608 = _EMPTY_;
    private String f360801 = _EMPTY_;
    private String f360802 = _EMPTY_;
    private String f360803 = _EMPTY_;
    private String f360804 = _EMPTY_;
    private String f360896 = _EMPTY_;
    private String f360896x = _EMPTY_;
    private String f3609 = _EMPTY_;
    private String f360996x = _EMPTY_;
    private String f3610 = _EMPTY_;
    private String f3611 = _EMPTY_;
    private String f3612 = _EMPTY_;
    private String f361296x = _EMPTY_;
    private String f3613 = _EMPTY_;
    private String f3614 = _EMPTY_;
    private String f3615 = _EMPTY_;
    private String f361501 = _EMPTY_;
    private String f361502 = _EMPTY_;
    private String f361503 = _EMPTY_;
    private String f361596 = _EMPTY_;
    private String f361596x = _EMPTY_;
    private String f3616 = _EMPTY_;
    private String f3617 = _EMPTY_;
    private String f361701 = _EMPTY_;
    private String f361702 = _EMPTY_;
    private String f361703 = _EMPTY_;
    private String f361704 = _EMPTY_;
    private String f361705 = _EMPTY_;
    private String f361796 = _EMPTY_;
    private String f361796x = _EMPTY_;
    private String f361798 = _EMPTY_;

    public FollowUp() {

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


    public String getsF3() {
        return sF3;
    }

    public void setsF3(String sF3) {
        this.sF3 = sF3;
    }


    @Bindable
    public String getF3101() {
        return f3101;
    }

    public void setF3101(String f3101) {
        this.f3101 = f3101;
        setF3102(f3101.equals("1") ? this.f3102 : "");
        notifyPropertyChanged(BR.f3101);
    }

    @Bindable
    public String getF3102() {
        return f3102;
    }

    public void setF3102(String f3102) {
        this.f3102 = f3102;
        notifyPropertyChanged(BR.f3102);
    }

    @Bindable
    public String getF3103() {
        return f3103;
    }

    public void setF3103(String f3103) {
        this.f3103 = f3103;
        notifyPropertyChanged(BR.f3103);
    }

    @Bindable
    public String getF3104() {
        return f3104;
    }

    public void setF3104(String f3104) {
        this.f3104 = f3104;
        notifyPropertyChanged(BR.f3104);
    }

    @Bindable
    public String getF3105() {
        return f3105;
    }

    public void setF3105(String f3105) {
        this.f3105 = f3105;
        notifyPropertyChanged(BR.f3105);
    }

    @Bindable
    public String getF3201() {
        return f3201;
    }

    public void setF3201(String f3201) {
        this.f3201 = f3201;
        notifyPropertyChanged(BR.f3201);
    }

    @Bindable
    public String getF3202() {
        return f3202;
    }

    public void setF3202(String f3202) {
        this.f3202 = f3202;
        notifyPropertyChanged(BR.f3202);
    }

    @Bindable
    public String getF3203() {
        return f3203;
    }

    public void setF3203(String f3203) {
        this.f3203 = f3203;
        setF320401(f3203.equals("2") ? this.f320401 : "");
        setF320402(f3203.equals("2") ? this.f320402 : "");
        setF320403(f3203.equals("2") ? this.f320403 : "");
        setF320404(f3203.equals("2") ? this.f320404 : "");
        setF320405(f3203.equals("2") ? this.f320405 : "");
        setF320406(f3203.equals("2") ? this.f320406 : "");
        setF320407(f3203.equals("2") ? this.f320407 : "");
        setF320408(f3203.equals("2") ? this.f320408 : "");
        setF320409(f3203.equals("2") ? this.f320409 : "");
        setF320496(f3203.equals("2") ? this.f320496 : "");

        setF3205(f3203.equals("2") ? this.f3205 : "");
        notifyPropertyChanged(BR.f3203);
    }

    @Bindable
    public String getF3204() {
        return f3204;
    }

    public void setF3204(String f3204) {
        this.f3204 = f3204;
        notifyPropertyChanged(BR.f3204);
    }

    @Bindable
    public String getF320401() {
        return f320401;
    }

    public void setF320401(String f320401) {
        if (this.f320401.equals(f320401)) return; // for all checkboxes
        this.f320401 = f320401;
        notifyPropertyChanged(BR.f320401);
    }

    @Bindable
    public String getF320402() {
        return f320402;
    }

    public void setF320402(String f320402) {
        if (this.f320402.equals(f320402)) return; // for all checkboxes
        this.f320402 = f320402;
        notifyPropertyChanged(BR.f320402);
    }

    @Bindable
    public String getF320403() {
        return f320403;
    }

    public void setF320403(String f320403) {
        if (this.f320403.equals(f320403)) return; // for all checkboxes
        this.f320403 = f320403;
        notifyPropertyChanged(BR.f320403);
    }

    @Bindable
    public String getF320404() {
        return f320404;
    }

    public void setF320404(String f320404) {
        if (this.f320404.equals(f320404)) return; // for all checkboxes
        this.f320404 = f320404;
        notifyPropertyChanged(BR.f320404);
    }

    @Bindable
    public String getF320405() {
        return f320405;
    }

    public void setF320405(String f320405) {
        if (this.f320405.equals(f320405)) return; // for all checkboxes
        this.f320405 = f320405;
        notifyPropertyChanged(BR.f320405);
    }

    @Bindable
    public String getF320406() {
        return f320406;
    }

    public void setF320406(String f320406) {
        if (this.f320406.equals(f320406)) return; // for all checkboxes
        this.f320406 = f320406;
        notifyPropertyChanged(BR.f320406);
    }

    @Bindable
    public String getF320407() {
        return f320407;
    }

    public void setF320407(String f320407) {
        if (this.f320407.equals(f320407)) return; // for all checkboxes
        this.f320407 = f320407;
        notifyPropertyChanged(BR.f320407);
    }

    @Bindable
    public String getF320408() {
        return f320408;
    }

    public void setF320408(String f320408) {
        if (this.f320408.equals(f320408)) return; // for all checkboxes
        this.f320408 = f320408;
        notifyPropertyChanged(BR.f320408);
    }

    @Bindable
    public String getF320409() {
        return f320409;
    }

    public void setF320409(String f320409) {
        if (this.f320409.equals(f320409)) return; // for all checkboxes
        this.f320409 = f320409;
        notifyPropertyChanged(BR.f320409);
    }

    @Bindable
    public String getF320496() {
        return f320496;
    }

    public void setF320496(String f320496) {
        if (this.f320496.equals(f320496)) return; // for all checkboxes
        this.f320496 = f320496;
        setF320496x(f320496.equals("96") ? this.f320496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f320496);
    }

    @Bindable
    public String getF320496x() {
        return f320496x;
    }

    public void setF320496x(String f320496x) {
        this.f320496x = f320496x;
        notifyPropertyChanged(BR.f320496x);
    }

    @Bindable
    public String getF3205() {
        return f3205;
    }

    public void setF3205(String f3205) {
        this.f3205 = f3205;
        notifyPropertyChanged(BR.f3205);
    }

    @Bindable
    public String getF3301() {
        return f3301;
    }

    public void setF3301(String f3301) {
        this.f3301 = f3301;
        notifyPropertyChanged(BR.f3301);
    }

    @Bindable
    public String getF3302() {
        return f3302;
    }

    public void setF3302(String f3302) {
        this.f3302 = f3302;
        setF330201x(f3302.equals("1") ? this.f330201x : ""); // for all skips, mention all skipped questions
        setF330202x(f3302.equals("2") ? this.f330202x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3302);
    }

    @Bindable
    public String getF330201x() {
        return f330201x;
    }

    public void setF330201x(String f330201x) {
        this.f330201x = f330201x;
        notifyPropertyChanged(BR.f330201x);
    }

    @Bindable
    public String getF330202x() {
        return f330202x;
    }

    public void setF330202x(String f330202x) {
        this.f330202x = f330202x;
        notifyPropertyChanged(BR.f330202x);
    }

    @Bindable
    public String getF3303() {
        return f3303;
    }

    public void setF3303(String f3303) {
        this.f3303 = f3303;
        notifyPropertyChanged(BR.f3303);
    }

    @Bindable
    public String getF3401() {
        return f3401;
    }

    public void setF3401(String f3401) {
        this.f3401 = f3401;
        setF3402(f3401.equals("2") ? this.f3402 : "");
        notifyPropertyChanged(BR.f3401);
    }

    @Bindable
    public String getF3402() {
        return f3402;
    }

    public void setF3402(String f3402) {
        this.f3402 = f3402;
        setF340296x(f3402.equals("96") ? this.f340296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3402);
    }

    @Bindable
    public String getF340296x() {
        return f340296x;
    }

    public void setF340296x(String f340296x) {
        this.f340296x = f340296x;
        notifyPropertyChanged(BR.f340296x);
    }

    @Bindable
    public String getF3403() {
        return f3403;
    }

    public void setF3403(String f3403) {
        this.f3403 = f3403;
        setF3404(f3403.equals("2") ? this.f3404 : "");
        setF3405(f3403.equals("2") ? this.f3405 : "");
        setF3406(f3403.equals("2") ? this.f3406 : "");
        notifyPropertyChanged(BR.f3403);
    }

    @Bindable
    public String getF3404() {
        return f3404;
    }

    public void setF3404(String f3404) {
        this.f3404 = f3404;
        notifyPropertyChanged(BR.f3404);
    }

    @Bindable
    public String getF3405() {
        return f3405;
    }

    public void setF3405(String f3405) {
        this.f3405 = f3405;
        setF340596x(f3405.equals("96") ? this.f340596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3405);
    }

    @Bindable
    public String getF340596x() {
        return f340596x;
    }

    public void setF340596x(String f340596x) {
        this.f340596x = f340596x;
        notifyPropertyChanged(BR.f340596x);
    }

    @Bindable
    public String getF3406() {
        return f3406;
    }

    public void setF3406(String f3406) {
        this.f3406 = f3406;
        setF340696x(f3406.equals("96") ? this.f340696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3406);
    }

    @Bindable
    public String getF340696x() {
        return f340696x;
    }

    public void setF340696x(String f340696x) {
        this.f340696x = f340696x;
        notifyPropertyChanged(BR.f340696x);
    }

    @Bindable
    public String getF3407() {
        return f3407;
    }

    public void setF3407(String f3407) {
        this.f3407 = f3407;
        notifyPropertyChanged(BR.f3407);
    }

    @Bindable
    public String getF3408() {
        return f3408;
    }

    public void setF3408(String f3408) {
        this.f3408 = f3408;
        notifyPropertyChanged(BR.f3408);
    }

    @Bindable
    public String getF3409() {
        return f3409;
    }

    public void setF3409(String f3409) {
        this.f3409 = f3409;
        notifyPropertyChanged(BR.f3409);
    }

    @Bindable
    public String getF3601() {
        return f3601;
    }

    public void setF3601(String f3601) {
        this.f3601 = f3601;
        setF3602(f3601.equals("1") ? this.f3602 : "");
        setF3603(f3601.equals("1") ? this.f3603 : "");
        setF3604(f3601.equals("1") ? this.f3604 : "");
        notifyPropertyChanged(BR.f3601);
    }

    @Bindable
    public String getF3602() {
        return f3602;
    }

    public void setF3602(String f3602) {
        this.f3602 = f3602;
        setF360296x(f3602.equals("96") ? this.f360296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3602);
    }

    @Bindable
    public String getF360296x() {
        return f360296x;
    }

    public void setF360296x(String f360296x) {
        this.f360296x = f360296x;
        notifyPropertyChanged(BR.f360296x);
    }

    @Bindable
    public String getF3603() {
        return f3603;
    }

    public void setF3603(String f3603) {
        this.f3603 = f3603;
        notifyPropertyChanged(BR.f3603);
    }

    @Bindable
    public String getF3604() {
        return f3604;
    }

    public void setF3604(String f3604) {
        this.f3604 = f3604;
        notifyPropertyChanged(BR.f3604);
    }

    @Bindable
    public String getF3605() {
        return f3605;
    }

    public void setF3605(String f3605) {
        this.f3605 = f3605;
        notifyPropertyChanged(BR.f3605);
    }

    @Bindable
    public String getF360501() {
        return f360501;
    }

    public void setF360501(String f360501) {
        if (this.f360501.equals(f360501)) return; // for all checkboxes
        this.f360501 = f360501;
        notifyPropertyChanged(BR.f360501);
    }

    @Bindable
    public String getF360502() {
        return f360502;
    }

    public void setF360502(String f360502) {
        if (this.f360502.equals(f360502)) return; // for all checkboxes
        this.f360502 = f360502;
        notifyPropertyChanged(BR.f360502);
    }

    @Bindable
    public String getF360503() {
        return f360503;
    }

    public void setF360503(String f360503) {
        if (this.f360503.equals(f360503)) return; // for all checkboxes
        this.f360503 = f360503;
        notifyPropertyChanged(BR.f360503);
    }

    @Bindable
    public String getF360504() {
        return f360504;
    }

    public void setF360504(String f360504) {
        if (this.f360504.equals(f360504)) return; // for all checkboxes
        this.f360504 = f360504;
        notifyPropertyChanged(BR.f360504);
    }

    @Bindable
    public String getF360505() {
        return f360505;
    }

    public void setF360505(String f360505) {
        if (this.f360505.equals(f360505)) return; // for all checkboxes
        this.f360505 = f360505;
        notifyPropertyChanged(BR.f360505);
    }

    @Bindable
    public String getF360506() {
        return f360506;
    }

    public void setF360506(String f360506) {
        if (this.f360506.equals(f360506)) return; // for all checkboxes
        this.f360506 = f360506;
        notifyPropertyChanged(BR.f360506);
    }

    @Bindable
    public String getF360507() {
        return f360507;
    }

    public void setF360507(String f360507) {
        if (this.f360507.equals(f360507)) return; // for all checkboxes
        this.f360507 = f360507;
        notifyPropertyChanged(BR.f360507);
    }

    @Bindable
    public String getF360596() {
        return f360596;
    }

    public void setF360596(String f360596) {
        if (this.f360596.equals(f360596)) return; // for all checkboxes
        this.f360596 = f360596;
        setF340296x(f3402.equals("96") ? this.f340296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f360596);
    }

    @Bindable
    public String getF360596x() {
        return f360596x;
    }

    public void setF360596x(String f360596x) {
        this.f360596x = f360596x;
        notifyPropertyChanged(BR.f360596x);
    }

    @Bindable
    public String getF3606() {
        return f3606;
    }

    public void setF3606(String f3606) {
        this.f3606 = f3606;
        notifyPropertyChanged(BR.f3606);
    }

    @Bindable
    public String getF3607() {
        return f3607;
    }

    public void setF3607(String f3607) {
        this.f3607 = f3607;
        setF360801(f3607.equals("1") ? this.f360801 : "");
        setF360802(f3607.equals("1") ? this.f360802 : "");
        setF360803(f3607.equals("1") ? this.f360803 : "");
        setF360804(f3607.equals("1") ? this.f360804 : "");
        setF360896(f3607.equals("1") ? this.f360896 : "");
        notifyPropertyChanged(BR.f3607);
    }

    @Bindable
    public String getF3608() {
        return f3608;
    }

    public void setF3608(String f3608) {
        this.f3608 = f3608;
        notifyPropertyChanged(BR.f3608);
    }

    @Bindable
    public String getF360801() {
        return f360801;
    }

    public void setF360801(String f360801) {
        if (this.f360801.equals(f360801)) return; // for all checkboxes
        this.f360801 = f360801;
        notifyPropertyChanged(BR.f360801);
    }

    @Bindable
    public String getF360802() {
        return f360802;
    }

    public void setF360802(String f360802) {
        if (this.f360802.equals(f360802)) return; // for all checkboxes
        this.f360802 = f360802;
        notifyPropertyChanged(BR.f360802);
    }

    @Bindable
    public String getF360803() {
        return f360803;
    }

    public void setF360803(String f360803) {
        if (this.f360803.equals(f360803)) return; // for all checkboxes
        this.f360803 = f360803;
        notifyPropertyChanged(BR.f360803);
    }

    @Bindable
    public String getF360804() {
        return f360804;
    }

    public void setF360804(String f360804) {
        if (this.f360804.equals(f360804)) return; // for all checkboxes
        this.f360804 = f360804;
        notifyPropertyChanged(BR.f360804);
    }

    @Bindable
    public String getF360896() {
        return f360896;
    }

    public void setF360896(String f360896) {
        if (this.f360896.equals(f360896)) return; // for all checkboxes
        this.f360896 = f360896;
        setF360896x(f360896.equals("96") ? this.f360896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f360896);
    }

    @Bindable
    public String getF360896x() {
        return f360896x;
    }

    public void setF360896x(String f360896x) {
        this.f360896x = f360896x;
        notifyPropertyChanged(BR.f360896x);
    }

    @Bindable
    public String getF3609() {
        return f3609;
    }

    public void setF3609(String f3609) {
        this.f3609 = f3609;
        setF360996x(f3609.equals("96") ? this.f360996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3609);
    }

    @Bindable
    public String getF360996x() {
        return f360996x;
    }

    public void setF360996x(String f360996x) {
        this.f360996x = f360996x;
        notifyPropertyChanged(BR.f360996x);
    }

    @Bindable
    public String getF3610() {
        return f3610;
    }

    public void setF3610(String f3610) {
        this.f3610 = f3610;
        setF3611(f3610.equals("1") ? this.f3611 : "");
        setF3612(f3610.equals("1") ? this.f3612 : "");
        notifyPropertyChanged(BR.f3610);
    }

    @Bindable
    public String getF3611() {
        return f3611;
    }

    public void setF3611(String f3611) {
        this.f3611 = f3611;
        notifyPropertyChanged(BR.f3611);
    }

    @Bindable
    public String getF3612() {
        return f3612;
    }

    public void setF3612(String f3612) {
        this.f3612 = f3612;
        setF361296x(f3612.equals("96") ? this.f361296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f3612);
    }

    @Bindable
    public String getF361296x() {
        return f361296x;
    }

    public void setF361296x(String f361296x) {
        this.f361296x = f361296x;
        notifyPropertyChanged(BR.f361296x);
    }

    @Bindable
    public String getF3613() {
        return f3613;
    }

    public void setF3613(String f3613) {
        this.f3613 = f3613;
        notifyPropertyChanged(BR.f3613);
    }

    @Bindable
    public String getF3614() {
        return f3614;
    }

    public void setF3614(String f3614) {
        this.f3614 = f3614;
        setF361501(f3614.equals("2") ? this.f361501 : "");
        setF361502(f3614.equals("2") ? this.f361502 : "");
        setF361503(f3614.equals("2") ? this.f361503 : "");
        setF361596(f3614.equals("2") ? this.f361596 : "");
        notifyPropertyChanged(BR.f3614);
    }

    @Bindable
    public String getF3615() {
        return f3615;
    }

    public void setF3615(String f3615) {
        this.f3615 = f3615;
        notifyPropertyChanged(BR.f3615);
    }

    @Bindable
    public String getF361501() {
        return f361501;
    }

    public void setF361501(String f361501) {
        if (this.f361501.equals(f361501)) return; // for all checkboxes
        this.f361501 = f361501;
        notifyPropertyChanged(BR.f361501);
    }

    @Bindable
    public String getF361502() {
        return f361502;
    }

    public void setF361502(String f361502) {
        if (this.f361502.equals(f361502)) return; // for all checkboxes
        this.f361502 = f361502;
        notifyPropertyChanged(BR.f361502);
    }

    @Bindable
    public String getF361503() {
        return f361503;
    }

    public void setF361503(String f361503) {
        if (this.f361503.equals(f361503)) return; // for all checkboxes
        this.f361503 = f361503;
        notifyPropertyChanged(BR.f361503);
    }

    @Bindable
    public String getF361596() {
        return f361596;
    }

    public void setF361596(String f361596) {
        if (this.f361596.equals(f361596)) return; // for all checkboxes
        this.f361596 = f361596;
        setF361596x(f361596.equals("96") ? this.f361596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f361596);
    }

    @Bindable
    public String getF361596x() {
        return f361596x;
    }

    public void setF361596x(String f361596x) {
        this.f361596x = f361596x;
        notifyPropertyChanged(BR.f361596x);
    }

    @Bindable
    public String getF3616() {
        return f3616;
    }

    public void setF3616(String f3616) {
        this.f3616 = f3616;
        notifyPropertyChanged(BR.f3616);
    }

    @Bindable
    public String getF3617() {
        return f3617;
    }

    public void setF3617(String f3617) {
        this.f3617 = f3617;
        notifyPropertyChanged(BR.f3617);
    }

    @Bindable
    public String getF361701() {
        return f361701;
    }

    public void setF361701(String f361701) {
        if (this.f361701.equals(f361701)) return; // for all checkboxes
        this.f361701 = f361701;
        notifyPropertyChanged(BR.f361701);
    }

    @Bindable
    public String getF361702() {
        return f361702;
    }

    public void setF361702(String f361702) {
        if (this.f361702.equals(f361702)) return; // for all checkboxes
        this.f361702 = f361702;
        notifyPropertyChanged(BR.f361702);
    }

    @Bindable
    public String getF361703() {
        return f361703;
    }

    public void setF361703(String f361703) {
        if (this.f361703.equals(f361703)) return; // for all checkboxes
        this.f361703 = f361703;
        notifyPropertyChanged(BR.f361703);
    }

    @Bindable
    public String getF361704() {
        return f361704;
    }

    public void setF361704(String f361704) {
        if (this.f361704.equals(f361704)) return; // for all checkboxes
        this.f361704 = f361704;
        notifyPropertyChanged(BR.f361704);
    }

    @Bindable
    public String getF361705() {
        return f361705;
    }

    public void setF361705(String f361705) {
        if (this.f361705.equals(f361705)) return; // for all checkboxes
        this.f361705 = f361705;
        notifyPropertyChanged(BR.f361705);
    }

    @Bindable
    public String getF361796() {
        return f361796;
    }

    public void setF361796(String f361796) {
        if (this.f361796.equals(f361796)) return; // for all checkboxes
        this.f361796 = f361796;
        setF361796x(f3402.equals("96") ? this.f361796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f361796);
    }

    @Bindable
    public String getF361796x() {
        return f361796x;
    }

    public void setF361796x(String f361796x) {
        this.f361796x = f361796x;
        notifyPropertyChanged(BR.f361796x);
    }

    @Bindable
    public String getF361798() {
        return f361798;
    }

    public void setF361798(String f361798) {
        if (this.f361798.equals(f361798)) return; // for all checkboxes
        this.f361798 = f361798;
        setF361701(f361798.equals("98") ? "" : this.f361701);
        setF361702(f361798.equals("98") ? "" : this.f361702);
        setF361703(f361798.equals("98") ? "" : this.f361703);
        setF361704(f361798.equals("98") ? "" : this.f361704);
        setF361705(f361798.equals("98") ? "" : this.f361705);
        setF361796(f361798.equals("98") ? "" : this.f361796);
        notifyPropertyChanged(BR.f361798);
    }


    public FollowUp Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_UID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_DEVICETAGID));
        //   this.entryType = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_ENTRY_TYPE));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_SYNCED_DATE));
        this.formComplete = cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_FORM_COMPLETE));

        sF3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FollowUpTable.COLUMN_SF3)));


        return this;
    }

    public void sF3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f3101 = json.getString("f3101");
            this.f3102 = json.getString("f3102");
            this.f3103 = json.getString("f3103");
            this.f3104 = json.getString("f3104");
            this.f3105 = json.getString("f3105");
            this.f3201 = json.getString("f3201");
            this.f3202 = json.getString("f3202");
            this.f3203 = json.getString("f3203");
            this.f320401 = json.getString("f320401");
            this.f320402 = json.getString("f320402");
            this.f320403 = json.getString("f320403");
            this.f320404 = json.getString("f320404");
            this.f320405 = json.getString("f320405");
            this.f320406 = json.getString("f320406");
            this.f320407 = json.getString("f320407");
            this.f320408 = json.getString("f320408");
            this.f320409 = json.getString("f320409");
            this.f320496 = json.getString("f320496");
            this.f320496x = json.getString("f320496x");
            this.f3205 = json.getString("f3205");
            this.f3301 = json.getString("f3301");
            this.f3302 = json.getString("f3302");
            this.f330201x = json.getString("f330201x");
            this.f330202x = json.getString("f330202x");
            this.f3303 = json.getString("f3303");
            this.f3401 = json.getString("f3401");
            this.f3402 = json.getString("f3402");
            this.f340296x = json.getString("f340296x");
            this.f3403 = json.getString("f3403");
            this.f3404 = json.getString("f3404");
            this.f3405 = json.getString("f3405");
            this.f340596x = json.getString("f340596x");
            this.f3406 = json.getString("f3406");
            this.f340696x = json.getString("f340696x");
            this.f3407 = json.getString("f3407");
            this.f3408 = json.getString("f3408");
            this.f3409 = json.getString("f3409");
            this.f3601 = json.getString("f3601");
            this.f3602 = json.getString("f3602");
            this.f360296x = json.getString("f360296x");
            this.f3603 = json.getString("f3603");
            this.f3604 = json.getString("f3604");
            this.f360501 = json.getString("f360501");
            this.f360502 = json.getString("f360502");
            this.f360503 = json.getString("f360503");
            this.f360504 = json.getString("f360504");
            this.f360505 = json.getString("f360505");
            this.f360506 = json.getString("f360506");
            this.f360507 = json.getString("f360507");
            this.f360596 = json.getString("f360596");
            this.f360596x = json.getString("f360596x");
            this.f3606 = json.getString("f3606");
            this.f3607 = json.getString("f3607");
            this.f360801 = json.getString("f360801");
            this.f360802 = json.getString("f360802");
            this.f360803 = json.getString("f360803");
            this.f360804 = json.getString("f360804");
            this.f360896 = json.getString("f360896");
            this.f360896x = json.getString("f360896x");
            this.f3609 = json.getString("f3609");
            this.f360996x = json.getString("f360996x");
            this.f3610 = json.getString("f3610");
            this.f3611 = json.getString("f3611");
            this.f3612 = json.getString("f3612");
            this.f361296x = json.getString("f361296x");
            this.f3613 = json.getString("f3613");
            this.f3614 = json.getString("f3614");
            this.f361501 = json.getString("f361501");
            this.f361502 = json.getString("f361502");
            this.f361503 = json.getString("f361503");
            this.f361596 = json.getString("f361596");
            this.f361596x = json.getString("f361596x");
            this.f3616 = json.getString("f3616");
            this.f361701 = json.getString("f361701");
            this.f361702 = json.getString("f361702");
            this.f361703 = json.getString("f361703");
            this.f361704 = json.getString("f361704");
            this.f361705 = json.getString("f361705");
            this.f361796 = json.getString("f361796");
            this.f361796x = json.getString("f361796x");
            this.f361798 = json.getString("f361798");
        }
    }


    public String sF3toString() throws JSONException {
        Log.d(TAG, "sF3toString: ");
        JSONObject json = new JSONObject();
        json.put("f3101", f3101)
                .put("f3102", f3102)
                .put("f3103", f3103)
                .put("f3104", f3104)
                .put("f3105", f3105)
                .put("f3201", f3201)
                .put("f3202", f3202)
                .put("f3203", f3203)
                .put("f320401", f320401)
                .put("f320402", f320402)
                .put("f320403", f320403)
                .put("f320404", f320404)
                .put("f320405", f320405)
                .put("f320406", f320406)
                .put("f320407", f320407)
                .put("f320408", f320408)
                .put("f320409", f320409)
                .put("f320496", f320496)
                .put("f320496x", f320496x)
                .put("f3205", f3205)
                .put("f3301", f3301)
                .put("f3302", f3302)
                .put("f330201x", f330201x)
                .put("f330202x", f330202x)
                .put("f3303", f3303)
                .put("f3401", f3401)
                .put("f3402", f3402)
                .put("f340296x", f340296x)
                .put("f3403", f3403)
                .put("f3404", f3404)
                .put("f3405", f3405)
                .put("f340596x", f340596x)
                .put("f3406", f3406)
                .put("f340696x", f340696x)
                .put("f3407", f3407)
                .put("f3408", f3408)
                .put("f3409", f3409)
                .put("f3601", f3601)
                .put("f3602", f3602)
                .put("f360296x", f360296x)
                .put("f3603", f3603)
                .put("f3604", f3604)
                .put("f360501", f360501)
                .put("f360502", f360502)
                .put("f360503", f360503)
                .put("f360504", f360504)
                .put("f360505", f360505)
                .put("f360506", f360506)
                .put("f360507", f360507)
                .put("f360596", f360596)
                .put("f360596x", f360596x)
                .put("f3606", f3606)
                .put("f3607", f3607)
                .put("f360801", f360801)
                .put("f360802", f360802)
                .put("f360803", f360803)
                .put("f360804", f360804)
                .put("f360896", f360896)
                .put("f360896x", f360896x)
                .put("f3609", f3609)
                .put("f360996x", f360996x)
                .put("f3610", f3610)
                .put("f3611", f3611)
                .put("f3612", f3612)
                .put("f361296x", f361296x)
                .put("f3613", f3613)
                .put("f3614", f3614)
                .put("f361501", f361501)
                .put("f361502", f361502)
                .put("f361503", f361503)
                .put("f361596", f361596)
                .put("f361596x", f361596x)
                .put("f3616", f3616)
                .put("f361701", f361701)
                .put("f361702", f361702)
                .put("f361703", f361703)
                .put("f361704", f361704)
                .put("f361705", f361705)
                .put("f361796", f361796)
                .put("f361796x", f361796x)
                .put("f361798", f361798);
        return json.toString();

    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FollowUpTable.COLUMN_ID, this.id);
        json.put(FollowUpTable.COLUMN_UID, this.uid);
        json.put(FollowUpTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(FollowUpTable.COLUMN_HHID, this.hhid);
        json.put(FollowUpTable.COLUMN_SNO, this.sno);
        json.put(FollowUpTable.COLUMN_USERNAME, this.userName);
        json.put(FollowUpTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FollowUpTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FollowUpTable.COLUMN_DEVICETAGID, this.deviceTag);
        //    json.put(FollowUpTable.COLUMN_ENTRY_TYPE, this.entryType);
        json.put(FollowUpTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FollowUpTable.COLUMN_SF3, new JSONObject(sF3toString()));

        return json;
    }

}
