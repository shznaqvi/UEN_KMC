package edu.aku.hassannaqvi.uen_kmc.models;

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
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = "";
    private String uid = "";
    private String userName = "";
    private String sysDate = "";
    private String ebCode = "";
    private String hhid = "";
    private String sno = "";
    private String deviceId = "";
    private String deviceTag = "";
    private String appver = "";
    private String endTime = "";
    private String iStatus = "";
    private String iStatus96x = "";
    private String synced = "";
    private String syncDate = "";


    // SECTION VARIABLES
    private String sA1 = "";
    private String sA3 = "";
    private String sB1 = "";
    private String sC2 = "";
    private String sD1 = "";
    private String sE1 = "";
    private String sF1 = "";
    private String sF2 = "";
    private String sF3 = "";


    // FIELD VARIABLES
    private String a101d = "";
    private String a101m = "";
    private String a101y = "";
    private String a102 = "";
    private String a103 = "";
    private String a104 = "";
    private String a105 = "";
    private String a106 = "";
    private String a107 = "";
    private String a108 = "";
    private String a109 = "";
    private String a110 = "";
    private String a111t = "";
    private String a112 = "";
    private String a113 = "";
    private String a114t = "";
    private String a115t = "";
    private String a116t = "";
    private String a11696x = "";
    private String a301 = "";
    private String a30196x = "";
    private String a302 = "";
    private String a30296x = "";
    private String a303 = "";
    private String a30396x = "";
    private String a304 = "";
    private String a30496x = "";
    private String a305 = "";
    private String a30596x = "";
    private String a306 = "";
    private String a30616 = "";
    private String a30696x = "";
    private String a307 = "";
    private String a30796x = "";
    private String a308 = "";
    private String a309 = "";
    private String a30901x = "";
    private String a310 = "";
    private String a311 = "";
    private String a312 = "";
    private String a313 = "";
    private String a314 = "";
    private String a31496x = "";
    private String a315 = "";
    private String a316 = "";
    private String a31696x = "";
    private String a317 = "";
    private String a31796x = "";
    private String a318 = "";
    private String a31896x = "";
    private String a31901 = "";
    private String a31902 = "";
    private String a31903 = "";
    private String a31904 = "";
    private String a31905 = "";
    private String a31906 = "";
    private String a31907 = "";
    private String a31908 = "";
    private String a31909 = "";
    private String a31910 = "";
    private String a31911 = "";
    private String a31912 = "";
    private String a31913 = "";
    private String a31914 = "";
    private String a31915 = "";
    private String a31916 = "";
    private String a31917 = "";
    private String a31918 = "";
    private String a320 = "";
    private String a32101 = "";
    private String a32102 = "";
    private String a32103 = "";
    private String a32104 = "";
    private String a32105 = "";
    private String a32106 = "";
    private String a32107 = "";
    private String a32108 = "";
    private String a32109 = "";
    private String a322 = "";
    private String a32296x = "";
    private String a323 = "";
    private String a324 = "";
    private String a325 = "";
    private String a326 = "";
    private String a327 = "";
    private String a32701x = "";
    private String a32702x = "";
    private String a328 = "";
    private String a329 = "";
    private String a32901 = "";
    private String a32901x = "";
    private String a32902 = "";
    private String a32902x = "";
    private String a32903 = "";
    private String a32903x = "";
    private String a32904 = "";
    private String a32904x = "";
    private String a32905 = "";
    private String a32905x = "";
    private String a32906 = "";
    private String a32906x = "";
    private String a330 = "";
    private String a331 = "";
    private String a33101x = "";
    private String a332 = "";
    private String a33201 = "";
    private String a33202 = "";
    private String a33203 = "";
    private String a33204 = "";
    private String a33205 = "";
    private String a33296 = "";
    private String a33296x = "";
    private String a333 = "";
    private String a33301 = "";
    private String a33302 = "";
    private String a33303 = "";
    private String a33396 = "";
    private String a33396x = "";
    private String b101 = "";
    private String b102 = "";
    private String b10201 = "";
    private String b10202 = "";
    private String b10203 = "";
    private String b10204 = "";
    private String b10205 = "";
    private String b10206 = "";
    private String b10207 = "";
    private String b10208 = "";
    private String b10296 = "";
    private String b10296x = "";
    private String b103a = "";
    private String b103a96x = "";
    private String b103b = "";
    private String b103b96x = "";
    private String b103c = "";
    private String b103c96x = "";
    private String b103d = "";
    private String b103d96x = "";
    private String b103e = "";
    private String b103e96x = "";
    private String b103f = "";
    private String b103f96x = "";
    private String b103g = "";
    private String b103g96x = "";
    private String b103h = "";
    private String b103h96x = "";
    private String b103i = "";
    private String b103i96x = "";
    private String b103j = "";
    private String b103j96x = "";
    private String b103k = "";
    private String b103k96x = "";
    private String b103l = "";
    private String b103l96x = "";
    private String b104 = "";
    private String b10496x = "";
    private String b105 = "";
    private String b10596x = "";
    private String b106 = "";
    private String b10696x = "";
    private String b107 = "";
    private String b10701x = "";
    private String b10801 = "";
    private String b10901 = "";
    private String b110d = "";
    private String b110w = "";
    private String b110m = "";
    private String b111 = "";
    private String b11101x = "";
    private String b11201 = "";
    private String b11202 = "";
    private String b11203 = "";
    private String b11204 = "";
    private String b11205 = "";
    private String b113 = "";
    private String b114 = "";
    private String b115 = "";
    private String b11596x = "";
    private String b11601 = "";
    private String b11602 = "";
    private String b11603 = "";
    private String b11604 = "";
    private String b11605 = "";
    private String b11606 = "";
    private String b11607 = "";
    private String b11608 = "";
    private String b11609 = "";
    private String b11696 = "";
    private String b117 = "";

    private String c201 = "";
    private String c202 = "";
    private String c20296x = "";
    private String c203 = "";
    private String c204 = "";
    private String c205 = "";
    private String c206 = "";
    private String c20601 = "";
    private String c20602 = "";
    private String c20603 = "";
    private String c20604 = "";
    private String c20605 = "";
    private String c20606 = "";
    private String c20607 = "";
    private String c20608 = "";
    private String c20698 = "";
    private String c20696 = "";
    private String c20696x = "";
    private String d101 = "";
    private String d102 = "";
    private String d10296x = "";
    private String d103 = "";
    private String d10301 = "";
    private String d10302 = "";
    private String d10303 = "";
    private String d10304 = "";
    private String d10305 = "";
    private String d10306 = "";
    private String d10307 = "";
    private String d10308 = "";
    private String d10398 = "";
    private String d10396 = "";
    private String d10396x = "";
    private String d104 = "";
    private String d105 = "";
    private String d106 = "";
    private String d107 = "";
    private String d10701 = "";
    private String d10702 = "";
    private String d10703 = "";
    private String d10704 = "";
    private String d10705 = "";
    private String d10706 = "";
    private String d10707 = "";
    private String d10708 = "";
    private String d10709 = "";
    private String d10710 = "";
    private String d10711 = "";
    private String d10712 = "";
    private String d10713 = "";
    private String d10714 = "";
    private String d10715 = "";
    private String d10716 = "";
    private String d10798 = "";
    private String d10796 = "";
    private String d10796x = "";
    private String e101 = "";
    private String e102 = "";
    private String e103 = "";
    private String e10396x = "";
    private String e104 = "";
    private String e10401x = "";
    private String e10402x = "";
    private String e10403x = "";
    private String e10404x = "";
    private String e105 = "";
    private String e10501x = "";
    private String e106 = "";
    private String e107 = "";
    private String e108 = "";
    private String e109 = "";
    private String e110 = "";
    private String e111 = "";
    private String e11196x = "";
    private String e11201 = "";
    private String e11202 = "";
    private String e11203 = "";
    private String e11204 = "";
    private String e11205 = "";
    private String e113 = "";
    private String e11396x = "";
    private String e114 = "";
    private String e11501 = "";
    private String e11502 = "";
    private String e11503 = "";
    private String e11504 = "";
    private String e11505 = "";
    private String f101 = "";
    private String f102 = "";
    private String f103 = "";
    private String f104 = "";
    private String f105 = "";
    private String f106 = "";
    private String f107 = "";
    private String f108 = "";
    private String f109 = "";
    private String f110 = "";
    private String f111 = "";
    private String f112 = "";
    private String f113 = "";
    private String f114 = "";
    private String f115 = "";
    private String f116 = "";
    private String f117 = "";
    private String f118 = "";
    private String f201 = "";
    private String f202 = "";
    private String f203 = "";
    private String f204 = "";
    private String f301 = "";
    private String f302 = "";
    private String f303 = "";
    private String f304 = "";
    private String f305 = "";
    private String f306 = "";
    private String f307 = "";
    private String f308 = "";
    private String f309 = "";
    private String f310 = "";
    private String f311 = "";
    private String f312 = "";
    private String f313 = "";
    private String f314 = "";


    public Form() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setAppver(MainApp.appInfo.getAppVersion());

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

   /* public String getsH2a() {
        return sH2a;
    }

    public void setsH2a(String sH2a) {
        this.sH2a = sH2a;
    }*/

    public String getsA1() {
        return sA1;
    }

    public void setsA1(String sA1) {
        this.sA1 = sA1;
    }


    public String getsA3() {
        return sA3;
    }

    public void setsA3(String sA3) {
        this.sA3 = sA3;
    }


    public String getsB1() {
        return sB1;
    }

    public void setsB1(String sB1) {
        this.sB1 = sB1;
    }


    public String getsC2() {
        return sC2;
    }

    public void setsC2(String sC2) {
        this.sC2 = sC2;
    }


    public String getsD1() {
        return sD1;
    }

    public void setsD1(String sD1) {
        this.sD1 = sD1;
    }


    public String getsE1() {
        return sE1;
    }

    public void setsE1(String sE1) {
        this.sE1 = sE1;
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


    public String getsF3() {
        return sF3;
    }

    public void setsF3(String sF3) {
        this.sF3 = sF3;
    }


    @Bindable
    public String getA101d() {
        return a101d;
    }

    public void setA101d(String a101d) {
        this.a101d = a101d;
        notifyPropertyChanged(BR.a101d);
    }

    @Bindable
    public String getA101m() {
        return a101m;
    }

    public void setA101m(String a101m) {
        this.a101m = a101m;
        notifyPropertyChanged(BR.a101m);
    }

    @Bindable
    public String getA101y() {
        return a101y;
    }

    public void setA101y(String a101y) {
        this.a101y = a101y;
        notifyPropertyChanged(BR.a101y);
    }

    @Bindable
    public String getA102() {
        return a102;
    }

    public void setA102(String a102) {
        this.a102 = a102;
        notifyPropertyChanged(BR.a102);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
        notifyPropertyChanged(BR.a104);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        setEbCode(a105);
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA108() {
        return a108;
    }

    public void setA108(String a108) {
        this.a108 = a108;
        notifyPropertyChanged(BR.a108);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        setHhid(a110);
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111t() {
        return a111t;
    }

    public void setA111t(String a111t) {
        this.a111t = a111t;
        notifyPropertyChanged(BR.a111t);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        setA114t(a113.length() > 0 ? (Integer.parseInt(a113) < 18 ? "" : this.a114t) : this.a114t);
        setA115t(a113.length() > 0 ? (Integer.parseInt(a113) < 18 ? "" : this.a115t) : this.a115t);
        notifyPropertyChanged(BR.a113);
    }

    @Bindable
    public String getA114t() {
        return a114t;
    }

    public void setA114t(String a114t) {
        this.a114t = a114t;
        setA115t(a114t.equals("1") ? this.a115t : "");
        notifyPropertyChanged(BR.a114t);
    }

    @Bindable
    public String getA115t() {
        return a115t;
    }

    public void setA115t(String a115t) {
        this.a115t = a115t;
        notifyPropertyChanged(BR.a115t);
    }

    @Bindable
    public String getA116t() {
        return a116t;
    }

    public void setA116t(String a116t) {
        this.a116t = a116t;
        notifyPropertyChanged(BR.a116t);
    }

    @Bindable
    public String getA11696x() {
        return a11696x;
    }

    public void setA11696x(String a11696x) {
        this.a11696x = a11696x;
        notifyPropertyChanged(BR.a11696x);
    }

    @Bindable
    public String getA301() {
        return a301;
    }

    public void setA301(String a301) {
        this.a301 = a301;
        setA30196x(a301.equals("96") ? this.a30196x : "");
        notifyPropertyChanged(BR.a301);
    }

    @Bindable
    public String getA30196x() {
        return a30196x;
    }

    public void setA30196x(String a30196x) {
        this.a30196x = a30196x;
        notifyPropertyChanged(BR.a30196x);
    }

    @Bindable
    public String getA302() {
        return a302;
    }

    public void setA302(String a302) {
        this.a302 = a302;
        setA30296x(a302.equals("96") ? this.a30296x : "");
        notifyPropertyChanged(BR.a302);
    }

    @Bindable
    public String getA30296x() {
        return a30296x;
    }

    public void setA30296x(String a30296x) {
        this.a30296x = a30296x;
        notifyPropertyChanged(BR.a30296x);
    }

    @Bindable
    public String getA303() {
        return a303;
    }

    public void setA303(String a303) {
        this.a303 = a303;
        setA30396x(a303.equals("96") ? this.a30396x : "");
        notifyPropertyChanged(BR.a303);
    }

    @Bindable
    public String getA30396x() {
        return a30396x;
    }

    public void setA30396x(String a30396x) {
        this.a30396x = a30396x;
        notifyPropertyChanged(BR.a30396x);
    }

    @Bindable
    public String getA304() {
        return a304;
    }

    public void setA304(String a304) {
        this.a304 = a304;
        setA30496x(a304.equals("96") ? this.a30496x : "");
        notifyPropertyChanged(BR.a304);
    }

    @Bindable
    public String getA30496x() {
        return a30496x;
    }

    public void setA30496x(String a30496x) {
        this.a30496x = a30496x;
        notifyPropertyChanged(BR.a30496x);
    }

    @Bindable
    public String getA305() {
        return a305;
    }

    public void setA305(String a305) {
        this.a305 = a305;
        setA30596x(a305.equals("96") ? this.a30596x : "");
        notifyPropertyChanged(BR.a305);
    }

    @Bindable
    public String getA30596x() {
        return a30596x;
    }

    public void setA30596x(String a30596x) {
        this.a30596x = a30596x;
        notifyPropertyChanged(BR.a30596x);
    }

    @Bindable
    public String getA30616() {
        return a30616;
    }

    public void setA30616(String a30616) {
        this.a30616 = a30616;
        notifyPropertyChanged(BR.a30616);
    }

    @Bindable
    public String getA306() {
        return a306;
    }

    public void setA306(String a306) {
        this.a306 = a306;
        setA30696x(a306.equals("96") ? this.a30696x : "");
        notifyPropertyChanged(BR.a306);
    }

    @Bindable
    public String getA30696x() {
        return a30696x;
    }

    public void setA30696x(String a30696x) {
        this.a30696x = a30696x;
        notifyPropertyChanged(BR.a30696x);
    }

    @Bindable
    public String getA307() {
        return a307;
    }

    public void setA307(String a307) {
        this.a307 = a307;
        setA30796x(a307.equals("96") ? this.a30796x : "");
        notifyPropertyChanged(BR.a307);
    }

    @Bindable
    public String getA30796x() {
        return a30796x;
    }

    public void setA30796x(String a30796x) {
        this.a30796x = a30796x;
        notifyPropertyChanged(BR.a30796x);
    }

    @Bindable
    public String getA308() {
        return a308;
    }

    public void setA308(String a308) {
        this.a308 = a308;
        setA309(a308.equals("3") ? this.a309 : "");
        setA310(a308.equals("3") ? this.a310 : "");
        notifyPropertyChanged(BR.a308);
    }

    @Bindable
    public String getA309() {
        return a309;
    }

    public void setA309(String a309) {
        this.a309 = a309;
        setA30901x(a309.equals("1") ? this.a30901x : "");
        notifyPropertyChanged(BR.a309);
    }

    @Bindable
    public String getA30901x() {
        return a30901x;
    }

    public void setA30901x(String a30901x) {
        this.a30901x = a30901x;
        notifyPropertyChanged(BR.a30901x);
    }

    @Bindable
    public String getA310() {
        return a310;
    }

    public void setA310(String a310) {
        this.a310 = a310;
        notifyPropertyChanged(BR.a310);
    }

    @Bindable
    public String getA311() {
        return a311;
    }

    public void setA311(String a311) {
        this.a311 = a311;
        notifyPropertyChanged(BR.a311);
    }

    @Bindable
    public String getA312() {
        return a312;
    }

    public void setA312(String a312) {
        this.a312 = a312;
        notifyPropertyChanged(BR.a312);
    }

    @Bindable
    public String getA313() {
        return a313;
    }

    public void setA313(String a313) {
        this.a313 = a313;
        setA314(a313.equals("1") ? this.a314 : "");
        notifyPropertyChanged(BR.a313);
    }

    @Bindable
    public String getA314() {
        return a314;
    }

    public void setA314(String a314) {
        this.a314 = a314;
        setA31496x(a314.equals("96") ? this.a31496x : "");
        notifyPropertyChanged(BR.a314);
    }

    @Bindable
    public String getA31496x() {
        return a31496x;
    }

    public void setA31496x(String a31496x) {
        this.a31496x = a31496x;
        notifyPropertyChanged(BR.a31496x);
    }

    @Bindable
    public String getA315() {
        return a315;
    }

    public void setA315(String a315) {
        this.a315 = a315;
        notifyPropertyChanged(BR.a315);
    }

    @Bindable
    public String getA316() {
        return a316;
    }

    public void setA316(String a316) {
        this.a316 = a316;
        setA31696x(a316.equals("96") ? this.a31696x : "");
        notifyPropertyChanged(BR.a316);
    }

    @Bindable
    public String getA31696x() {
        return a31696x;
    }

    public void setA31696x(String a31696x) {
        this.a31696x = a31696x;
        notifyPropertyChanged(BR.a31696x);
    }

    @Bindable
    public String getA317() {
        return a317;
    }

    public void setA317(String a317) {
        this.a317 = a317;
        setA31796x(a317.equals("96") ? this.a31796x : "");
        notifyPropertyChanged(BR.a317);
    }

    @Bindable
    public String getA31796x() {
        return a31796x;
    }

    public void setA31796x(String a31796x) {
        this.a31796x = a31796x;
        notifyPropertyChanged(BR.a31796x);
    }

    @Bindable
    public String getA318() {
        return a318;
    }

    public void setA318(String a318) {
        this.a318 = a318;
        setA31896x(a318.equals("96") ? this.a31896x : "");
        notifyPropertyChanged(BR.a318);
    }

    @Bindable
    public String getA31896x() {
        return a31896x;
    }

    public void setA31896x(String a31896x) {
        this.a31896x = a31896x;
        notifyPropertyChanged(BR.a31896x);
    }

    @Bindable
    public String getA31901() {
        return a31901;
    }

    public void setA31901(String a31901) {
        this.a31901 = a31901;
        notifyPropertyChanged(BR.a31901);
    }

    @Bindable
    public String getA31902() {
        return a31902;
    }

    public void setA31902(String a31902) {
        this.a31902 = a31902;
        notifyPropertyChanged(BR.a31902);
    }

    @Bindable
    public String getA31903() {
        return a31903;
    }

    public void setA31903(String a31903) {
        this.a31903 = a31903;
        notifyPropertyChanged(BR.a31903);
    }

    @Bindable
    public String getA31904() {
        return a31904;
    }

    public void setA31904(String a31904) {
        this.a31904 = a31904;
        notifyPropertyChanged(BR.a31904);
    }

    @Bindable
    public String getA31905() {
        return a31905;
    }

    public void setA31905(String a31905) {
        this.a31905 = a31905;
        notifyPropertyChanged(BR.a31905);
    }

    @Bindable
    public String getA31906() {
        return a31906;
    }

    public void setA31906(String a31906) {
        this.a31906 = a31906;
        notifyPropertyChanged(BR.a31906);
    }

    @Bindable
    public String getA31907() {
        return a31907;
    }

    public void setA31907(String a31907) {
        this.a31907 = a31907;
        notifyPropertyChanged(BR.a31907);
    }

    @Bindable
    public String getA31908() {
        return a31908;
    }

    public void setA31908(String a31908) {
        this.a31908 = a31908;
        notifyPropertyChanged(BR.a31908);
    }

    @Bindable
    public String getA31909() {
        return a31909;
    }

    public void setA31909(String a31909) {
        this.a31909 = a31909;
        notifyPropertyChanged(BR.a31909);
    }

    @Bindable
    public String getA31910() {
        return a31910;
    }

    public void setA31910(String a31910) {
        this.a31910 = a31910;
        notifyPropertyChanged(BR.a31910);
    }

    @Bindable
    public String getA31911() {
        return a31911;
    }

    public void setA31911(String a31911) {
        this.a31911 = a31911;
        notifyPropertyChanged(BR.a31911);
    }

    @Bindable
    public String getA31912() {
        return a31912;
    }

    public void setA31912(String a31912) {
        this.a31912 = a31912;
        notifyPropertyChanged(BR.a31912);
    }

    @Bindable
    public String getA31913() {
        return a31913;
    }

    public void setA31913(String a31913) {
        this.a31913 = a31913;
        notifyPropertyChanged(BR.a31913);
    }

    @Bindable
    public String getA31914() {
        return a31914;
    }

    public void setA31914(String a31914) {
        this.a31914 = a31914;
        notifyPropertyChanged(BR.a31914);
    }

    @Bindable
    public String getA31915() {
        return a31915;
    }

    public void setA31915(String a31915) {
        this.a31915 = a31915;
        notifyPropertyChanged(BR.a31915);
    }

    @Bindable
    public String getA31916() {
        return a31916;
    }

    public void setA31916(String a31916) {
        this.a31916 = a31916;
        notifyPropertyChanged(BR.a31916);
    }

    @Bindable
    public String getA31917() {
        return a31917;
    }

    public void setA31917(String a31917) {
        this.a31917 = a31917;
        notifyPropertyChanged(BR.a31917);
    }

    @Bindable
    public String getA31918() {
        return a31918;
    }

    public void setA31918(String a31918) {
        this.a31918 = a31918;
        notifyPropertyChanged(BR.a31918);
    }

    @Bindable
    public String getA320() {
        return a320;
    }

    public void setA320(String a320) {
        this.a320 = a320;
        notifyPropertyChanged(BR.a320);
    }

    @Bindable
    public String getA32101() {
        return a32101;
    }

    public void setA32101(String a32101) {
        this.a32101 = a32101;
        notifyPropertyChanged(BR.a32101);
    }

    @Bindable
    public String getA32102() {
        return a32102;
    }

    public void setA32102(String a32102) {
        this.a32102 = a32102;
        notifyPropertyChanged(BR.a32102);
    }

    @Bindable
    public String getA32103() {
        return a32103;
    }

    public void setA32103(String a32103) {
        this.a32103 = a32103;
        notifyPropertyChanged(BR.a32103);
    }

    @Bindable
    public String getA32104() {
        return a32104;
    }

    public void setA32104(String a32104) {
        this.a32104 = a32104;
        notifyPropertyChanged(BR.a32104);
    }

    @Bindable
    public String getA32105() {
        return a32105;
    }

    public void setA32105(String a32105) {
        this.a32105 = a32105;
        notifyPropertyChanged(BR.a32105);
    }

    @Bindable
    public String getA32106() {
        return a32106;
    }

    public void setA32106(String a32106) {
        this.a32106 = a32106;
        notifyPropertyChanged(BR.a32106);
    }

    @Bindable
    public String getA32107() {
        return a32107;
    }

    public void setA32107(String a32107) {
        this.a32107 = a32107;
        notifyPropertyChanged(BR.a32107);
    }

    @Bindable
    public String getA32108() {
        return a32108;
    }

    public void setA32108(String a32108) {
        this.a32108 = a32108;
        notifyPropertyChanged(BR.a32108);
    }

    @Bindable
    public String getA32109() {
        return a32109;
    }

    public void setA32109(String a32109) {
        this.a32109 = a32109;
        notifyPropertyChanged(BR.a32109);
    }

    @Bindable
    public String getA322() {
        return a322;
    }

    public void setA322(String a322) {
        this.a322 = a322;
        setA32296x(a322.equals("96") ? this.a32296x : "");
        setA323(a322.equals("11") ? "" : this.a323);
        setA324(a322.equals("11") ? "" : this.a324);
        setA325(a322.equals("11") ? "" : this.a325);
        notifyPropertyChanged(BR.a322);
    }

    @Bindable
    public String getA32296x() {
        return a32296x;
    }

    public void setA32296x(String a32296x) {
        this.a32296x = a32296x;
        notifyPropertyChanged(BR.a32296x);
    }

    @Bindable
    public String getA323() {
        return a323;
    }

    public void setA323(String a323) {
        this.a323 = a323;
        setA324(a323.equals("1") ? this.a324 : "");
        setA325(a323.equals("1") ? this.a325 : "");
        notifyPropertyChanged(BR.a323);
    }

    @Bindable
    public String getA324() {
        return a324;
    }

    public void setA324(String a324) {
        this.a324 = a324;
        notifyPropertyChanged(BR.a324);
    }

    @Bindable
    public String getA325() {
        return a325;
    }

    public void setA325(String a325) {
        this.a325 = a325;
        notifyPropertyChanged(BR.a325);
    }

    @Bindable
    public String getA326() {
        return a326;
    }

    public void setA326(String a326) {
        this.a326 = a326;
        setA327(a326.equals("1") ? this.a327 : "");
        notifyPropertyChanged(BR.a326);
    }

    @Bindable
    public String getA327() {
        return a327;
    }

    public void setA327(String a327) {
        this.a327 = a327;
        setA32701x(a327.equals("1") ? this.a32701x : "");
        setA32702x(a327.equals("2") ? this.a32702x : "");
        notifyPropertyChanged(BR.a327);
    }

    @Bindable
    public String getA32701x() {
        return a32701x;
    }

    public void setA32701x(String a32701x) {
        this.a32701x = a32701x;
        notifyPropertyChanged(BR.a32701x);
    }

    @Bindable
    public String getA32702x() {
        return a32702x;
    }

    public void setA32702x(String a32702x) {
        this.a32702x = a32702x;
        notifyPropertyChanged(BR.a32702x);
    }

    @Bindable
    public String getA328() {
        return a328;
    }

    public void setA328(String a328) {
        this.a328 = a328;
        setA32901(a328.equals("1") ? this.a32901 : "");
        setA32902(a328.equals("1") ? this.a32902 : "");
        setA32903(a328.equals("1") ? this.a32903 : "");
        setA32904(a328.equals("1") ? this.a32904 : "");
        setA32905(a328.equals("1") ? this.a32905 : "");
        setA32906(a328.equals("1") ? this.a32906 : "");
        notifyPropertyChanged(BR.a328);
    }

    @Bindable
    public String getA329() {
        return a329;
    }

    public void setA329(String a329) {
        this.a329 = a329;
        notifyPropertyChanged(BR.a329);
    }

    @Bindable
    public String getA32901() {
        return a32901;
    }

    public void setA32901(String a32901) {
        if (this.a32901.equals(a32901)) return; // for all checkboxes
        this.a32901 = a32901;
        setA32901x(a32901.equals("1") ? this.a32901x : "");
        notifyPropertyChanged(BR.a32901);
    }

    @Bindable
    public String getA32901x() {
        return a32901x;
    }

    public void setA32901x(String a32901x) {
        this.a32901x = a32901x;
        notifyPropertyChanged(BR.a32901x);
    }

    @Bindable
    public String getA32902() {
        return a32902;
    }

    public void setA32902(String a32902) {
        if (this.a32902.equals(a32902)) return; // for all checkboxes
        this.a32902 = a32902;
        setA32902x(a32902.equals("2") ? this.a32902x : "");
        notifyPropertyChanged(BR.a32902);
    }

    @Bindable
    public String getA32902x() {
        return a32902x;
    }

    public void setA32902x(String a32902x) {
        this.a32902x = a32902x;
        notifyPropertyChanged(BR.a32902x);
    }

    @Bindable
    public String getA32903() {
        return a32903;
    }

    public void setA32903(String a32903) {
        if (this.a32903.equals(a32903)) return; // for all checkboxes
        this.a32903 = a32903;
        setA32903x(a32903.equals("3") ? this.a32903x : "");
        notifyPropertyChanged(BR.a32903);
    }

    @Bindable
    public String getA32903x() {
        return a32903x;
    }

    public void setA32903x(String a32903x) {
        this.a32903x = a32903x;
        notifyPropertyChanged(BR.a32903x);
    }

    @Bindable
    public String getA32904() {
        return a32904;
    }

    public void setA32904(String a32904) {
        if (this.a32904.equals(a32904)) return; // for all checkboxes
        this.a32904 = a32904;
        setA32904x(a32904.equals("4") ? this.a32904x : "");
        notifyPropertyChanged(BR.a32904);
    }

    @Bindable
    public String getA32904x() {
        return a32904x;
    }

    public void setA32904x(String a32904x) {
        this.a32904x = a32904x;
        notifyPropertyChanged(BR.a32904x);
    }

    @Bindable
    public String getA32905() {
        return a32905;
    }

    public void setA32905(String a32905) {
        if (this.a32905.equals(a32905)) return; // for all checkboxes
        this.a32905 = a32905;
        setA32905x(a32905.equals("5") ? this.a32905x : "");
        notifyPropertyChanged(BR.a32905);
    }

    @Bindable
    public String getA32905x() {
        return a32905x;
    }

    public void setA32905x(String a32905x) {
        this.a32905x = a32905x;
        notifyPropertyChanged(BR.a32905x);
    }

    @Bindable
    public String getA32906() {
        return a32906;
    }

    public void setA32906(String a32906) {
        if (this.a32906.equals(a32906)) return; // for all checkboxes
        this.a32906 = a32906;
        setA32906x(a32906.equals("6") ? this.a32906x : "");
        notifyPropertyChanged(BR.a32906);
    }

    @Bindable
    public String getA32906x() {
        return a32906x;
    }

    public void setA32906x(String a32906x) {
        this.a32906x = a32906x;
        notifyPropertyChanged(BR.a32906x);
    }

    @Bindable
    public String getA330() {
        return a330;
    }

    public void setA330(String a330) {
        this.a330 = a330;
        notifyPropertyChanged(BR.a330);
    }

    @Bindable
    public String getA331() {
        return a331;
    }

    public void setA331(String a331) {
        this.a331 = a331;
        setA33101x(a331.equals("1") ? this.a33101x : "");
        notifyPropertyChanged(BR.a331);
    }

    @Bindable
    public String getA33101x() {
        return a33101x;
    }

    public void setA33101x(String a33101x) {
        this.a33101x = a33101x;
        notifyPropertyChanged(BR.a33101x);
    }

    @Bindable
    public String getA332() {
        return a332;
    }

    public void setA332(String a332) {
        this.a332 = a332;
        notifyPropertyChanged(BR.a332);
    }

    @Bindable
    public String getA33201() {
        return a33201;
    }

    public void setA33201(String a33201) {
        if (this.a33201.equals(a33201)) return; // for all checkboxes
        this.a33201 = a33201;
        notifyPropertyChanged(BR.a33201);
    }

    @Bindable
    public String getA33202() {
        return a33202;
    }

    public void setA33202(String a33202) {
        if (this.a33202.equals(a33202)) return; // for all checkboxes
        this.a33202 = a33202;
        notifyPropertyChanged(BR.a33202);
    }

    @Bindable
    public String getA33203() {
        return a33203;
    }

    public void setA33203(String a33203) {
        if (this.a33203.equals(a33203)) return; // for all checkboxes
        this.a33203 = a33203;
        notifyPropertyChanged(BR.a33203);
    }

    @Bindable
    public String getA33204() {
        return a33204;
    }

    public void setA33204(String a33204) {
        if (this.a33204.equals(a33204)) return; // for all checkboxes
        this.a33204 = a33204;
        notifyPropertyChanged(BR.a33204);
    }

    @Bindable
    public String getA33205() {
        return a33205;
    }

    public void setA33205(String a33205) {
        if (this.a33205.equals(a33205)) return; // for all checkboxes
        this.a33205 = a33205;
        setA33201(a33205.equals("5") ? "" : this.a33201);
        setA33202(a33205.equals("5") ? "" : this.a33202);
        setA33203(a33205.equals("5") ? "" : this.a33203);
        setA33204(a33205.equals("5") ? "" : this.a33204);
        setA33296(a33205.equals("5") ? "" : this.a33296);
        setA33301(a33205.equals("5") ? "" : this.a33301);
        setA33302(a33205.equals("5") ? "" : this.a33302);
        setA33303(a33205.equals("5") ? "" : this.a33303);
        setA33396(a33205.equals("5") ? "" : this.a33396);
        notifyPropertyChanged(BR.a33205);
    }

    @Bindable
    public String getA33296() {
        return a33296;
    }

    public void setA33296(String a33296) {
        if (this.a33296.equals(a33296)) return; // for all checkboxes
        this.a33296 = a33296;
        setA33296x(a33296.equals("96") ? this.a33296x : "");
        notifyPropertyChanged(BR.a33296);
    }

    @Bindable
    public String getA33296x() {
        return a33296x;
    }

    public void setA33296x(String a33296x) {
        this.a33296x = a33296x;
        notifyPropertyChanged(BR.a33296x);
    }

    @Bindable
    public String getA333() {
        return a333;
    }

    public void setA333(String a333) {
        this.a333 = a333;
        notifyPropertyChanged(BR.a333);
    }

    @Bindable
    public String getA33301() {
        return a33301;
    }

    public void setA33301(String a33301) {
        if (this.a33301.equals(a33301)) return; // for all checkboxes
        this.a33301 = a33301;
        notifyPropertyChanged(BR.a33301);
    }

    @Bindable
    public String getA33302() {
        return a33302;
    }

    public void setA33302(String a33302) {
        if (this.a33302.equals(a33302)) return; // for all checkboxes
        this.a33302 = a33302;
        notifyPropertyChanged(BR.a33302);
    }

    @Bindable
    public String getA33303() {
        return a33303;
    }

    public void setA33303(String a33303) {
        if (this.a33303.equals(a33303)) return; // for all checkboxes
        this.a33303 = a33303;
        notifyPropertyChanged(BR.a33303);
    }

    @Bindable
    public String getA33396() {
        return a33396;
    }

    public void setA33396(String a33396) {
        if (this.a33396.equals(a33396)) return; // for all checkboxes
        this.a33396 = a33396;
        setA33396x(a33396.equals("96") ? this.a33396x : "");
        notifyPropertyChanged(BR.a33396);
    }

    @Bindable
    public String getA33396x() {
        return a33396x;
    }

    public void setA33396x(String a33396x) {
        this.a33396x = a33396x;
        notifyPropertyChanged(BR.a33396x);
    }

    @Bindable
    public String getB101() {
        return b101;
    }

    public void setB101(String b101) {
        this.b101 = b101;
        setB10201(b101.equals("2") ? "" : this.b10201);
        setB10202(b101.equals("2") ? "" : this.b10202);
        setB10203(b101.equals("2") ? "" : this.b10203);
        setB10204(b101.equals("2") ? "" : this.b10204);
        setB10205(b101.equals("2") ? "" : this.b10205);
        setB10206(b101.equals("2") ? "" : this.b10206);
        setB10207(b101.equals("2") ? "" : this.b10207);
        setB10208(b101.equals("2") ? "" : this.b10208);
        setB10296(b101.equals("2") ? "" : this.b10296);
        setB103a(b101.equals("2") ? "" : this.b103a);
        setB103b(b101.equals("2") ? "" : this.b103b);
        setB103c(b101.equals("2") ? "" : this.b103c);
        setB103d(b101.equals("2") ? "" : this.b103d);
        setB103e(b101.equals("2") ? "" : this.b103e);
        setB103f(b101.equals("2") ? "" : this.b103f);
        setB103g(b101.equals("2") ? "" : this.b103g);
        setB103h(b101.equals("2") ? "" : this.b103h);
        setB103i(b101.equals("2") ? "" : this.b103i);
        setB103j(b101.equals("2") ? "" : this.b103j);
        setB103k(b101.equals("2") ? "" : this.b103k);
        setB103l(b101.equals("2") ? "" : this.b103l);
        notifyPropertyChanged(BR.b101);
    }

    @Bindable
    public String getB102() {
        return b102;
    }

    public void setB102(String b102) {
        this.b102 = b102;
        notifyPropertyChanged(BR.b102);
    }

    @Bindable
    public String getB10201() {
        return b10201;
    }

    public void setB10201(String b10201) {
        if (this.b10201.equals(b10201)) return; // for all checkboxes
        this.b10201 = b10201;
        notifyPropertyChanged(BR.b10201);
    }

    @Bindable
    public String getB10202() {
        return b10202;
    }

    public void setB10202(String b10202) {
        if (this.b10202.equals(b10202)) return; // for all checkboxes
        this.b10202 = b10202;
        notifyPropertyChanged(BR.b10202);
    }

    @Bindable
    public String getB10203() {
        return b10203;
    }

    public void setB10203(String b10203) {
        if (this.b10203.equals(b10203)) return; // for all checkboxes
        this.b10203 = b10203;
        notifyPropertyChanged(BR.b10203);
    }

    @Bindable
    public String getB10204() {
        return b10204;
    }

    public void setB10204(String b10204) {
        if (this.b10204.equals(b10204)) return; // for all checkboxes
        this.b10204 = b10204;
        notifyPropertyChanged(BR.b10204);
    }

    @Bindable
    public String getB10205() {
        return b10205;
    }

    public void setB10205(String b10205) {
        if (this.b10205.equals(b10205)) return; // for all checkboxes
        this.b10205 = b10205;
        notifyPropertyChanged(BR.b10205);
    }

    @Bindable
    public String getB10206() {
        return b10206;
    }

    public void setB10206(String b10206) {
        if (this.b10206.equals(b10206)) return; // for all checkboxes
        this.b10206 = b10206;
        notifyPropertyChanged(BR.b10206);
    }

    @Bindable
    public String getB10207() {
        return b10207;
    }

    public void setB10207(String b10207) {
        if (this.b10207.equals(b10207)) return; // for all checkboxes
        this.b10207 = b10207;
        notifyPropertyChanged(BR.b10207);
    }

    @Bindable
    public String getB10208() {
        return b10208;
    }

    public void setB10208(String b10208) {
        if (this.b10208.equals(b10208)) return; // for all checkboxes
        this.b10208 = b10208;
        notifyPropertyChanged(BR.b10208);
    }

    @Bindable
    public String getB10296() {
        return b10296;
    }

    public void setB10296(String b10296) {
        if (this.b10296.equals(b10296)) return; // for all checkboxes
        this.b10296 = b10296;
        setB10296x(b10296.equals("96") ? this.b10296x : "");
        notifyPropertyChanged(BR.b10296);
    }

    @Bindable
    public String getB10296x() {
        return b10296x;
    }

    public void setB10296x(String b10296x) {
        this.b10296x = b10296x;
        notifyPropertyChanged(BR.b10296x);
    }

    @Bindable
    public String getB103a() {
        return b103a;
    }

    public void setB103a(String b103a) {
        this.b103a = b103a;
        setB103a96x(b103a.equals("96") ? this.b103a96x : "");
        notifyPropertyChanged(BR.b103a);
    }

    @Bindable
    public String getB103a96x() {
        return b103a96x;
    }

    public void setB103a96x(String b103a96x) {
        this.b103a96x = b103a96x;
        notifyPropertyChanged(BR.b103a96x);
    }

    @Bindable
    public String getB103b() {
        return b103b;
    }

    public void setB103b(String b103b) {
        this.b103b = b103b;
        setB103b96x(b103b.equals("96") ? this.b103b96x : "");
        notifyPropertyChanged(BR.b103b);
    }

    @Bindable
    public String getB103b96x() {
        return b103b96x;
    }

    public void setB103b96x(String b103b96x) {
        this.b103b96x = b103b96x;
        notifyPropertyChanged(BR.b103b96x);
    }

    @Bindable
    public String getB103c() {
        return b103c;
    }

    public void setB103c(String b103c) {
        this.b103c = b103c;
        setB103c96x(b103c.equals("96") ? this.b103c96x : "");
        notifyPropertyChanged(BR.b103c);
    }

    @Bindable
    public String getB103c96x() {
        return b103c96x;
    }

    public void setB103c96x(String b103c96x) {
        this.b103c96x = b103c96x;
        notifyPropertyChanged(BR.b103c96x);
    }

    @Bindable
    public String getB103d() {
        return b103d;
    }

    public void setB103d(String b103d) {
        this.b103d = b103d;
        setB103d96x(b103d.equals("96") ? this.b103d96x : "");
        notifyPropertyChanged(BR.b103d);
    }

    @Bindable
    public String getB103d96x() {
        return b103d96x;
    }

    public void setB103d96x(String b103d96x) {
        this.b103d96x = b103d96x;
        notifyPropertyChanged(BR.b103d96x);
    }

    @Bindable
    public String getB103e() {
        return b103e;
    }

    public void setB103e(String b103e) {
        this.b103e = b103e;
        setB103e96x(b103e.equals("96") ? this.b103e96x : "");
        notifyPropertyChanged(BR.b103e);
    }

    @Bindable
    public String getB103e96x() {
        return b103e96x;
    }

    public void setB103e96x(String b103e96x) {
        this.b103e96x = b103e96x;
        notifyPropertyChanged(BR.b103e96x);
    }

    @Bindable
    public String getB103f() {
        return b103f;
    }

    public void setB103f(String b103f) {
        this.b103f = b103f;
        setB103f96x(b103f.equals("96") ? this.b103f96x : "");
        notifyPropertyChanged(BR.b103f);
    }

    @Bindable
    public String getB103f96x() {
        return b103f96x;
    }

    public void setB103f96x(String b103f96x) {
        this.b103f96x = b103f96x;
        notifyPropertyChanged(BR.b103f96x);
    }

    @Bindable
    public String getB103g() {
        return b103g;
    }

    public void setB103g(String b103g) {
        this.b103g = b103g;
        setB103g96x(b103g.equals("96") ? this.b103g96x : "");
        notifyPropertyChanged(BR.b103g);
    }

    @Bindable
    public String getB103g96x() {
        return b103g96x;
    }

    public void setB103g96x(String b103g96x) {
        this.b103g96x = b103g96x;
        notifyPropertyChanged(BR.b103g96x);
    }

    @Bindable
    public String getB103h() {
        return b103h;
    }

    public void setB103h(String b103h) {
        this.b103h = b103h;
        notifyPropertyChanged(BR.b103h);
    }

    @Bindable
    public String getB103h96x() {
        return b103h96x;
    }

    public void setB103h96x(String b103h96x) {
        this.b103h96x = b103h96x;
        notifyPropertyChanged(BR.b103h96x);
    }

    @Bindable
    public String getB103i() {
        return b103i;
    }

    public void setB103i(String b103i) {
        this.b103i = b103i;
        setB103i96x(b103i.equals("96") ? this.b103i96x : "");
        notifyPropertyChanged(BR.b103i);
    }

    @Bindable
    public String getB103i96x() {
        return b103i96x;
    }

    public void setB103i96x(String b103i96x) {
        this.b103i96x = b103i96x;
        notifyPropertyChanged(BR.b103i96x);
    }

    @Bindable
    public String getB103j() {
        return b103j;
    }

    public void setB103j(String b103j) {
        this.b103j = b103j;
        setB103j96x(b103j.equals("96") ? this.b103j96x : "");
        notifyPropertyChanged(BR.b103j);
    }

    @Bindable
    public String getB103j96x() {
        return b103j96x;
    }

    public void setB103j96x(String b103j96x) {
        this.b103j96x = b103j96x;
        notifyPropertyChanged(BR.b103j96x);
    }

    @Bindable
    public String getB103k() {
        return b103k;
    }

    public void setB103k(String b103k) {
        this.b103k = b103k;
        notifyPropertyChanged(BR.b103k);
    }

    @Bindable
    public String getB103k96x() {
        return b103k96x;
    }

    public void setB103k96x(String b103k96x) {
        this.b103k96x = b103k96x;
        notifyPropertyChanged(BR.b103k96x);
    }

    @Bindable
    public String getB103l() {
        return b103l;
    }

    public void setB103l(String b103l) {
        this.b103l = b103l;
        setB103l96x(b103l.equals("96") ? this.b103l96x : "");
        notifyPropertyChanged(BR.b103l);
    }

    @Bindable
    public String getB103l96x() {
        return b103l96x;
    }

    public void setB103l96x(String b103l96x) {
        this.b103l96x = b103l96x;
        notifyPropertyChanged(BR.b103l96x);
    }

    @Bindable
    public String getB104() {
        return b104;
    }

    public void setB104(String b104) {
        this.b104 = b104;
        setB10496x(b104.equals("96") ? this.b10496x : "");
        setB10901(b104.equals("6") ? "" : b104.equals("7") ? "" : this.b10901);
        notifyPropertyChanged(BR.b104);
    }

    @Bindable
    public String getB10496x() {
        return b10496x;
    }

    public void setB10496x(String b10496x) {
        this.b10496x = b10496x;
        notifyPropertyChanged(BR.b10496x);
    }

    @Bindable
    public String getB105() {
        return b105;
    }

    public void setB105(String b105) {
        this.b105 = b105;
        setB10596x(b105.equals("96") ? this.b10596x : "");
        notifyPropertyChanged(BR.b105);
    }

    @Bindable
    public String getB10596x() {
        return b10596x;
    }

    public void setB10596x(String b10596x) {
        this.b10596x = b10596x;
        notifyPropertyChanged(BR.b10596x);
    }

    @Bindable
    public String getB106() {
        return b106;
    }

    public void setB106(String b106) {
        this.b106 = b106;
        setB10696x(b106.equals("96") ? this.b10696x : "");
        setB107(b106.equals("1") ? this.b107
                : b106.equals("2") ? this.b107
                : b106.equals("3") ? this.b107
                : "");
        notifyPropertyChanged(BR.b106);
    }

    @Bindable
    public String getB10696x() {
        return b10696x;
    }

    public void setB10696x(String b10696x) {
        this.b10696x = b10696x;
        notifyPropertyChanged(BR.b10696x);
    }

    @Bindable
    public String getB107() {
        return b107;
    }

    public void setB107(String b107) {
        this.b107 = b107;
        setB10701x(b107.equals("1") ? this.b10701x : "");
        notifyPropertyChanged(BR.b107);
    }

    @Bindable
    public String getB10701x() {
        return b10701x;
    }

    public void setB10701x(String b10701x) {
        this.b10701x = b10701x;
        notifyPropertyChanged(BR.b10701x);
    }

    @Bindable
    public String getB10801() {
        return b10801;
    }

    public void setB10801(String b10801) {
        this.b10801 = b10801;
        notifyPropertyChanged(BR.b10801);
    }

    @Bindable
    public String getB10901() {
        return b10901;
    }

    public void setB10901(String b10901) {
        this.b10901 = b10901;
        notifyPropertyChanged(BR.b10901);
    }

    @Bindable
    public String getB110d() {
        return b110d;
    }

    public void setB110d(String b110d) {
        this.b110d = b110d;
        notifyPropertyChanged(BR.b110d);
    }

    @Bindable
    public String getB110w() {
        return b110w;
    }

    public void setB110w(String b110w) {
        this.b110w = b110w;
        notifyPropertyChanged(BR.b110w);
    }

    @Bindable
    public String getB110m() {
        return b110m;
    }

    public void setB110m(String b110m) {
        this.b110m = b110m;
        notifyPropertyChanged(BR.b110m);
    }

    @Bindable
    public String getB111() {
        return b111;
    }

    public void setB111(String b111) {
        this.b111 = b111;
        setB11101x(b111.equals("1") ? this.b11101x : "");
        notifyPropertyChanged(BR.b111);
    }

    @Bindable
    public String getB11101x() {
        return b11101x;
    }

    public void setB11101x(String b11101x) {
        this.b11101x = b11101x;
        notifyPropertyChanged(BR.b11101x);
    }

    @Bindable
    public String getB11201() {
        return b11201;
    }

    public void setB11201(String b11201) {
        this.b11201 = b11201;
        notifyPropertyChanged(BR.b11201);
    }

    @Bindable
    public String getB11202() {
        return b11202;
    }

    public void setB11202(String b11202) {
        this.b11202 = b11202;
        notifyPropertyChanged(BR.b11202);
    }

    @Bindable
    public String getB11203() {
        return b11203;
    }

    public void setB11203(String b11203) {
        this.b11203 = b11203;
        notifyPropertyChanged(BR.b11203);
    }

    @Bindable
    public String getB11204() {
        return b11204;
    }

    public void setB11204(String b11204) {
        this.b11204 = b11204;
        notifyPropertyChanged(BR.b11204);
    }

    @Bindable
    public String getB11205() {
        return b11205;
    }

    public void setB11205(String b11205) {
        this.b11205 = b11205;
        notifyPropertyChanged(BR.b11205);
    }

    @Bindable
    public String getB113() {
        return b113;
    }

    public void setB113(String b113) {
        this.b113 = b113;
        setB114(b113.equals("2") ? "" : this.b114);
        setB115(b113.equals("2") ? "" : this.b115);
        setB11601(b113.equals("2") ? "" : this.b11601);
        setB11602(b113.equals("2") ? "" : this.b11602);
        setB11603(b113.equals("2") ? "" : this.b11603);
        setB11604(b113.equals("2") ? "" : this.b11604);
        setB11605(b113.equals("2") ? "" : this.b11605);
        setB11606(b113.equals("2") ? "" : this.b11606);
        setB11607(b113.equals("2") ? "" : this.b11607);
        setB11608(b113.equals("2") ? "" : this.b11608);
        setB11609(b113.equals("2") ? "" : this.b11609);
        setB11696(b113.equals("2") ? "" : this.b11696);
        setB117(b113.equals("2") ? "" : this.b117);
        notifyPropertyChanged(BR.b113);
    }

    @Bindable
    public String getB114() {
        return b114;
    }

    public void setB114(String b114) {
        this.b114 = b114;
        setB115(b114.equals("2") ? "" : this.b115);
        setB11601(b114.equals("2") ? "" : this.b11601);
        setB11602(b114.equals("2") ? "" : this.b11602);
        setB11603(b114.equals("2") ? "" : this.b11603);
        setB11604(b114.equals("2") ? "" : this.b11604);
        setB11605(b114.equals("2") ? "" : this.b11605);
        setB11606(b114.equals("2") ? "" : this.b11606);
        setB11607(b114.equals("2") ? "" : this.b11607);
        setB11608(b114.equals("2") ? "" : this.b11608);
        setB11609(b114.equals("2") ? "" : this.b11609);
        setB11696(b114.equals("2") ? "" : this.b11696);
        setB117(b114.equals("2") ? "" : this.b117);
        notifyPropertyChanged(BR.b114);
    }

    @Bindable
    public String getB115() {
        return b115;
    }

    public void setB115(String b115) {
        this.b115 = b115;
        setB11596x(b115.equals("96") ? this.b11596x : "");
        notifyPropertyChanged(BR.b115);
    }

    @Bindable
    public String getB11596x() {
        return b11596x;
    }

    public void setB11596x(String b11596x) {
        this.b11596x = b11596x;
        notifyPropertyChanged(BR.b11596x);
    }

    @Bindable
    public String getB11601() {
        return b11601;
    }

    public void setB11601(String b11601) {
        this.b11601 = b11601;
        notifyPropertyChanged(BR.b11601);
    }

    @Bindable
    public String getB11602() {
        return b11602;
    }

    public void setB11602(String b11602) {
        this.b11602 = b11602;
        notifyPropertyChanged(BR.b11602);
    }

    @Bindable
    public String getB11603() {
        return b11603;
    }

    public void setB11603(String b11603) {
        this.b11603 = b11603;
        notifyPropertyChanged(BR.b11603);
    }

    @Bindable
    public String getB11604() {
        return b11604;
    }

    public void setB11604(String b11604) {
        this.b11604 = b11604;
        notifyPropertyChanged(BR.b11604);
    }

    @Bindable
    public String getB11605() {
        return b11605;
    }

    public void setB11605(String b11605) {
        this.b11605 = b11605;
        notifyPropertyChanged(BR.b11605);
    }

    @Bindable
    public String getB11606() {
        return b11606;
    }

    public void setB11606(String b11606) {
        this.b11606 = b11606;
        notifyPropertyChanged(BR.b11606);
    }

    @Bindable
    public String getB11607() {
        return b11607;
    }

    public void setB11607(String b11607) {
        this.b11607 = b11607;
        notifyPropertyChanged(BR.b11607);
    }

    @Bindable
    public String getB11608() {
        return b11608;
    }

    public void setB11608(String b11608) {
        this.b11608 = b11608;
        notifyPropertyChanged(BR.b11608);
    }

    @Bindable
    public String getB11609() {
        return b11609;
    }

    public void setB11609(String b11609) {
        this.b11609 = b11609;
        notifyPropertyChanged(BR.b11609);
    }

    @Bindable
    public String getB11696() {
        return b11696;
    }

    public void setB11696(String b11696) {
        this.b11696 = b11696;
        notifyPropertyChanged(BR.b11696);
    }

    @Bindable
    public String getB117() {
        return b117;
    }

    public void setB117(String b117) {
        this.b117 = b117;
        notifyPropertyChanged(BR.b117);
    }


    @Bindable
    public String getC201() {
        return c201;
    }

    public void setC201(String c201) {
        this.c201 = c201;
        setC202(c201.equals("2") ? "" : this.c202);
        setC203(c201.equals("2") ? "" : this.c203);
        setC204(c201.equals("2") ? "" : this.c204);
        setC205(c201.equals("2") ? "" : this.c205);
        setC20601(c201.equals("2") ? "" : this.c20601);
        setC20602(c201.equals("2") ? "" : this.c20602);
        setC20603(c201.equals("2") ? "" : this.c20603);
        setC20604(c201.equals("2") ? "" : this.c20604);
        setC20605(c201.equals("2") ? "" : this.c20605);
        setC20606(c201.equals("2") ? "" : this.c20606);
        setC20607(c201.equals("2") ? "" : this.c20607);
        setC20608(c201.equals("2") ? "" : this.c20608);
        setC20698(c201.equals("2") ? "" : this.c20698);
        setC20696(c201.equals("2") ? "" : this.c20696);
        notifyPropertyChanged(BR.c201);
    }

    @Bindable
    public String getC202() {
        return c202;
    }

    public void setC202(String c202) {
        this.c202 = c202;
        setC20296x(c202.equals("96") ? this.c20296x : "");
        notifyPropertyChanged(BR.c202);
    }

    @Bindable
    public String getC20296x() {
        return c20296x;
    }

    public void setC20296x(String c20296x) {
        this.c20296x = c20296x;
        notifyPropertyChanged(BR.c20296x);
    }

    @Bindable
    public String getC203() {
        return c203;
    }

    public void setC203(String c203) {
        this.c203 = c203;
        setC204(c203.equals("2") ? "" : this.c204);
        setC205(c203.equals("2") ? "" : this.c205);
        setC20601(c203.equals("2") ? "" : this.c20601);
        setC20602(c203.equals("2") ? "" : this.c20602);
        setC20603(c203.equals("2") ? "" : this.c20603);
        setC20604(c203.equals("2") ? "" : this.c20604);
        setC20605(c203.equals("2") ? "" : this.c20605);
        setC20606(c203.equals("2") ? "" : this.c20606);
        setC20607(c203.equals("2") ? "" : this.c20607);
        setC20608(c203.equals("2") ? "" : this.c20608);
        setC20698(c203.equals("2") ? "" : this.c20698);
        setC20696(c203.equals("2") ? "" : this.c20696);
        notifyPropertyChanged(BR.c203);
    }

    @Bindable
    public String getC204() {
        return c204;
    }

    public void setC204(String c204) {
        this.c204 = c204;
        notifyPropertyChanged(BR.c204);
    }

    @Bindable
    public String getC205() {
        return c205;
    }

    public void setC205(String c205) {
        this.c205 = c205;
        notifyPropertyChanged(BR.c205);
    }

    @Bindable
    public String getC206() {
        return c206;
    }

    public void setC206(String c206) {
        this.c206 = c206;
        setC20696x(c206.equals("96") ? this.c20696x : "");
        notifyPropertyChanged(BR.c206);
    }


    @Bindable
    public String getC20601() {
        return c20601;
    }

    public void setC20601(String c20601) {
        this.c20601 = c20601;
        notifyPropertyChanged(BR.c20601);
    }

    @Bindable
    public String getC20602() {
        return c20602;
    }

    public void setC20602(String c20602) {
        this.c20602 = c20602;
        notifyPropertyChanged(BR.c20602);
    }

    @Bindable
    public String getC20603() {
        return c20603;
    }

    public void setC20603(String c20603) {
        this.c20603 = c20603;
        notifyPropertyChanged(BR.c20603);
    }

    @Bindable
    public String getC20604() {
        return c20604;
    }

    public void setC20604(String c20604) {
        this.c20604 = c20604;
        notifyPropertyChanged(BR.c20604);
    }

    @Bindable
    public String getC20605() {
        return c20605;
    }

    public void setC20605(String c20605) {
        this.c20605 = c20605;
        notifyPropertyChanged(BR.c20605);
    }

    @Bindable
    public String getC20606() {
        return c20606;
    }

    public void setC20606(String c20606) {
        this.c20606 = c20606;
        notifyPropertyChanged(BR.c20606);
    }

    @Bindable
    public String getC20607() {
        return c20607;
    }

    public void setC20607(String c20607) {
        this.c20607 = c20607;
        notifyPropertyChanged(BR.c20607);
    }

    @Bindable
    public String getC20608() {
        return c20608;
    }

    public void setC20608(String c20608) {
        this.c20608 = c20608;
        notifyPropertyChanged(BR.c20608);
    }

    @Bindable
    public String getC20698() {
        return c20698;
    }

    public void setC20698(String c20698) {
        this.c20698 = c20698;
        notifyPropertyChanged(BR.c20698);
    }

    @Bindable
    public String getC20696() {
        return c20696;
    }

    public void setC20696(String c20696) {
        this.c20696 = c20696;
        notifyPropertyChanged(BR.c20696);
    }


    @Bindable
    public String getC20696x() {
        return c20696x;
    }

    public void setC20696x(String c20696x) {
        this.c20696x = c20696x;
        notifyPropertyChanged(BR.c20696x);
    }

    @Bindable
    public String getD101() {
        return d101;
    }

    public void setD101(String d101) {
        this.d101 = d101;
        setD102(d101.equals("2") ? "" : this.d102);
        setD10301(d101.equals("2") ? "" : this.d10301);
        setD10302(d101.equals("2") ? "" : this.d10302);
        setD10303(d101.equals("2") ? "" : this.d10303);
        setD10304(d101.equals("2") ? "" : this.d10304);
        setD10305(d101.equals("2") ? "" : this.d10305);
        setD10306(d101.equals("2") ? "" : this.d10306);
        setD10307(d101.equals("2") ? "" : this.d10307);
        setD10308(d101.equals("2") ? "" : this.d10308);
        setD10398(d101.equals("2") ? "" : this.d10398);
        setD10396(d101.equals("2") ? "" : this.d10396);
        setD104(d101.equals("2") ? "" : this.d104);
        setD105(d101.equals("2") ? "" : this.d105);
        notifyPropertyChanged(BR.d101);
    }

    @Bindable
    public String getD102() {
        return d102;
    }

    public void setD102(String d102) {
        this.d102 = d102;
        setD10296x(d102.equals("96") ? this.d10296x : "");
        notifyPropertyChanged(BR.d102);
    }

    @Bindable
    public String getD10296x() {
        return d10296x;
    }

    public void setD10296x(String d10296x) {
        this.d10296x = d10296x;
        notifyPropertyChanged(BR.d10296x);
    }

    @Bindable
    public String getD103() {
        return d103;
    }

    public void setD103(String d103) {
        this.d103 = d103;
        notifyPropertyChanged(BR.d103);
    }

    @Bindable
    public String getD10301() {
        return d10301;
    }

    public void setD10301(String d10301) {
        if (this.d10301.equals(d10301)) return; // for all checkboxes
        this.d10301 = d10301;
        notifyPropertyChanged(BR.d10301);
    }

    @Bindable
    public String getD10302() {
        return d10302;
    }

    public void setD10302(String d10302) {
        if (this.d10302.equals(d10302)) return; // for all checkboxes
        this.d10302 = d10302;
        notifyPropertyChanged(BR.d10302);
    }

    @Bindable
    public String getD10303() {
        return d10303;
    }

    public void setD10303(String d10303) {
        if (this.d10303.equals(d10303)) return; // for all checkboxes
        this.d10303 = d10303;
        notifyPropertyChanged(BR.d10303);
    }

    @Bindable
    public String getD10304() {
        return d10304;
    }

    public void setD10304(String d10304) {
        if (this.d10304.equals(d10304)) return; // for all checkboxes
        this.d10304 = d10304;
        notifyPropertyChanged(BR.d10304);
    }

    @Bindable
    public String getD10305() {
        return d10305;
    }

    public void setD10305(String d10305) {
        if (this.d10305.equals(d10305)) return; // for all checkboxes
        this.d10305 = d10305;
        notifyPropertyChanged(BR.d10305);
    }

    @Bindable
    public String getD10306() {
        return d10306;
    }

    public void setD10306(String d10306) {
        if (this.d10306.equals(d10306)) return; // for all checkboxes
        this.d10306 = d10306;
        notifyPropertyChanged(BR.d10306);
    }

    @Bindable
    public String getD10307() {
        return d10307;
    }

    public void setD10307(String d10307) {
        if (this.d10307.equals(d10307)) return; // for all checkboxes
        this.d10307 = d10307;
        notifyPropertyChanged(BR.d10307);
    }

    @Bindable
    public String getD10308() {
        return d10308;
    }

    public void setD10308(String d10308) {
        if (this.d10308.equals(d10308)) return; // for all checkboxes
        this.d10308 = d10308;
        notifyPropertyChanged(BR.d10308);
    }

    @Bindable
    public String getD10398() {
        return d10398;
    }

    public void setD10398(String d10398) {
        if (this.d10398.equals(d10398)) return; // for all checkboxes
        this.d10398 = d10398;
        setD10301(d10398.equals("98") ? "" : this.d10301);
        setD10302(d10398.equals("98") ? "" : this.d10302);
        setD10303(d10398.equals("98") ? "" : this.d10303);
        setD10304(d10398.equals("98") ? "" : this.d10304);
        setD10305(d10398.equals("98") ? "" : this.d10305);
        setD10306(d10398.equals("98") ? "" : this.d10306);
        setD10307(d10398.equals("98") ? "" : this.d10307);
        setD10308(d10398.equals("98") ? "" : this.d10308);
        setD10396(d10398.equals("98") ? "" : this.d10396);
        notifyPropertyChanged(BR.d10398);
    }

    @Bindable
    public String getD10396() {
        return d10396;
    }

    public void setD10396(String d10396) {
        if (this.d10396.equals(d10396)) return; // for all checkboxes
        this.d10396 = d10396;
        setD10396x(d10396.equals("96") ? this.d10396x : "");
        notifyPropertyChanged(BR.d10396);
    }

    @Bindable
    public String getD10396x() {
        return d10396x;
    }

    public void setD10396x(String d10396x) {
        this.d10396x = d10396x;
        notifyPropertyChanged(BR.d10396x);
    }

    @Bindable
    public String getD104() {
        return d104;
    }

    public void setD104(String d104) {
        this.d104 = d104;
        setD105(d104.equals("1") ? this.d105 : "");
        notifyPropertyChanged(BR.d104);
    }

    @Bindable
    public String getD105() {
        return d105;
    }

    public void setD105(String d105) {
        this.d105 = d105;
        notifyPropertyChanged(BR.d105);
    }

    @Bindable
    public String getD106() {
        return d106;
    }

    public void setD106(String d106) {
        this.d106 = d106;
        setD10701(d106.equals("1") ? "" : this.d10701);
        setD10702(d106.equals("1") ? "" : this.d10702);
        setD10703(d106.equals("1") ? "" : this.d10703);
        setD10704(d106.equals("1") ? "" : this.d10704);
        setD10705(d106.equals("1") ? "" : this.d10705);
        setD10706(d106.equals("1") ? "" : this.d10706);
        setD10707(d106.equals("1") ? "" : this.d10707);
        setD10708(d106.equals("1") ? "" : this.d10708);
        setD10709(d106.equals("1") ? "" : this.d10709);
        setD10710(d106.equals("1") ? "" : this.d10710);
        setD10711(d106.equals("1") ? "" : this.d10711);
        setD10712(d106.equals("1") ? "" : this.d10712);
        setD10713(d106.equals("1") ? "" : this.d10713);
        setD10714(d106.equals("1") ? "" : this.d10714);
        setD10715(d106.equals("1") ? "" : this.d10715);
        setD10716(d106.equals("1") ? "" : this.d10716);
        setD10798(d106.equals("1") ? "" : this.d10798);
        setD10796(d106.equals("1") ? "" : this.d10796);
        notifyPropertyChanged(BR.d106);
    }

    @Bindable
    public String getD107() {
        return d107;
    }

    public void setD107(String d107) {
        this.d107 = d107;
        notifyPropertyChanged(BR.d107);
    }

    @Bindable
    public String getD10701() {
        return d10701;
    }

    public void setD10701(String d10701) {
        if (this.d10701.equals(d10701)) return; // for all checkboxes
        this.d10701 = d10701;
        notifyPropertyChanged(BR.d10701);
    }

    @Bindable
    public String getD10702() {
        return d10702;
    }

    public void setD10702(String d10702) {
        if (this.d10702.equals(d10702)) return; // for all checkboxes
        this.d10702 = d10702;
        notifyPropertyChanged(BR.d10702);
    }

    @Bindable
    public String getD10703() {
        return d10703;
    }

    public void setD10703(String d10703) {
        if (this.d10703.equals(d10703)) return; // for all checkboxes
        this.d10703 = d10703;
        notifyPropertyChanged(BR.d10703);
    }

    @Bindable
    public String getD10704() {
        return d10704;
    }

    public void setD10704(String d10704) {
        if (this.d10704.equals(d10704)) return; // for all checkboxes
        this.d10704 = d10704;
        notifyPropertyChanged(BR.d10704);
    }

    @Bindable
    public String getD10705() {
        return d10705;
    }

    public void setD10705(String d10705) {
        if (this.d10705.equals(d10705)) return; // for all checkboxes
        this.d10705 = d10705;
        notifyPropertyChanged(BR.d10705);
    }

    @Bindable
    public String getD10706() {
        return d10706;
    }

    public void setD10706(String d10706) {
        if (this.d10706.equals(d10706)) return; // for all checkboxes
        this.d10706 = d10706;
        notifyPropertyChanged(BR.d10706);
    }

    @Bindable
    public String getD10707() {
        return d10707;
    }

    public void setD10707(String d10707) {
        if (this.d10707.equals(d10707)) return; // for all checkboxes
        this.d10707 = d10707;
        notifyPropertyChanged(BR.d10707);
    }

    @Bindable
    public String getD10708() {
        return d10708;
    }

    public void setD10708(String d10708) {
        if (this.d10708.equals(d10708)) return; // for all checkboxes
        this.d10708 = d10708;
        notifyPropertyChanged(BR.d10708);
    }

    @Bindable
    public String getD10709() {
        return d10709;
    }

    public void setD10709(String d10709) {
        if (this.d10709.equals(d10709)) return; // for all checkboxes
        this.d10709 = d10709;
        notifyPropertyChanged(BR.d10709);
    }

    @Bindable
    public String getD10710() {
        return d10710;
    }

    public void setD10710(String d10710) {
        if (this.d10710.equals(d10710)) return; // for all checkboxes
        this.d10710 = d10710;
        notifyPropertyChanged(BR.d10710);
    }

    @Bindable
    public String getD10711() {
        return d10711;
    }

    public void setD10711(String d10711) {
        if (this.d10711.equals(d10711)) return; // for all checkboxes
        this.d10711 = d10711;
        notifyPropertyChanged(BR.d10711);
    }

    @Bindable
    public String getD10712() {
        return d10712;
    }

    public void setD10712(String d10712) {
        if (this.d10712.equals(d10712)) return; // for all checkboxes
        this.d10712 = d10712;
        notifyPropertyChanged(BR.d10712);
    }

    @Bindable
    public String getD10713() {
        return d10713;
    }

    public void setD10713(String d10713) {
        if (this.d10713.equals(d10713)) return; // for all checkboxes
        this.d10713 = d10713;
        notifyPropertyChanged(BR.d10713);
    }

    @Bindable
    public String getD10714() {
        return d10714;
    }

    public void setD10714(String d10714) {
        if (this.d10714.equals(d10714)) return; // for all checkboxes
        this.d10714 = d10714;
        notifyPropertyChanged(BR.d10714);
    }

    @Bindable
    public String getD10715() {
        return d10715;
    }

    public void setD10715(String d10715) {
        if (this.d10715.equals(d10715)) return; // for all checkboxes
        this.d10715 = d10715;
        notifyPropertyChanged(BR.d10715);
    }

    @Bindable
    public String getD10716() {
        return d10716;
    }

    public void setD10716(String d10716) {
        if (this.d10716.equals(d10716)) return; // for all checkboxes
        this.d10716 = d10716;
        notifyPropertyChanged(BR.d10716);
    }

    @Bindable
    public String getD10798() {
        return d10798;
    }

    public void setD10798(String d10798) {
        if (this.d10798.equals(d10798)) return; // for all checkboxes
        this.d10798 = d10798;
        setD10701(d10798.equals("98") ? "" : this.d10701);
        setD10702(d10798.equals("98") ? "" : this.d10702);
        setD10703(d10798.equals("98") ? "" : this.d10703);
        setD10704(d10798.equals("98") ? "" : this.d10704);
        setD10705(d10798.equals("98") ? "" : this.d10705);
        setD10706(d10798.equals("98") ? "" : this.d10706);
        setD10707(d10798.equals("98") ? "" : this.d10707);
        setD10708(d10798.equals("98") ? "" : this.d10708);
        setD10709(d10798.equals("98") ? "" : this.d10709);
        setD10710(d10798.equals("98") ? "" : this.d10710);
        setD10711(d10798.equals("98") ? "" : this.d10711);
        setD10712(d10798.equals("98") ? "" : this.d10712);
        setD10713(d10798.equals("98") ? "" : this.d10713);
        setD10714(d10798.equals("98") ? "" : this.d10714);
        setD10715(d10798.equals("98") ? "" : this.d10715);
        setD10716(d10798.equals("98") ? "" : this.d10716);
        setD10796(d10798.equals("98") ? "" : this.d10796);
        notifyPropertyChanged(BR.d10798);
    }

    @Bindable
    public String getD10796() {
        return d10796;
    }

    public void setD10796(String d10796) {
        if (this.d10796.equals(d10796)) return; // for all checkboxes
        this.d10796 = d10796;
        setD10796x(d10796.equals("96") ? this.d10796x : "");
        notifyPropertyChanged(BR.d10796);
    }

    @Bindable
    public String getD10796x() {
        return d10796x;
    }

    public void setD10796x(String d10796x) {
        this.d10796x = d10796x;
        notifyPropertyChanged(BR.d10796x);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        setE102(e101.equals("1") ? this.e102 : "");
        setE103(e101.equals("1") ? this.e103 : "");
        setE104(e101.equals("1") ? this.e104 : "");
        setE105(e101.equals("1") ? this.e105 : "");
        setE106(e101.equals("1") ? this.e106 : "");
        setE107(e101.equals("1") ? this.e107 : "");
        setE108(e101.equals("1") ? this.e108 : "");
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        setE103(e102.equals("1") ? this.e103 : "");
        setE104(e102.equals("1") ? this.e104 : "");
        setE105(e102.equals("1") ? this.e105 : "");
        setE106(e102.equals("1") ? this.e106 : "");
        setE107(e102.equals("1") ? this.e107 : "");
        setE108(e102.equals("1") ? this.e108 : "");
        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        setE10396x(e103.equals("96") ? this.e10396x : "");
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE10396x() {
        return e10396x;
    }

    public void setE10396x(String e10396x) {
        this.e10396x = e10396x;
        notifyPropertyChanged(BR.e10396x);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        setE10401x(e104.equals("1") ? this.e10401x : "");
        setE10402x(e104.equals("2") ? this.e10402x : "");
        setE10403x(e104.equals("3") ? this.e10403x : "");
        setE10404x(e104.equals("4") ? this.e10404x : "");
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE10401x() {
        return e10401x;
    }

    public void setE10401x(String e10401x) {
        this.e10401x = e10401x;
        notifyPropertyChanged(BR.e10401x);
    }

    @Bindable
    public String getE10402x() {
        return e10402x;
    }

    public void setE10402x(String e10402x) {
        this.e10402x = e10402x;
        notifyPropertyChanged(BR.e10402x);
    }

    @Bindable
    public String getE10403x() {
        return e10403x;
    }

    public void setE10403x(String e10403x) {
        this.e10403x = e10403x;
        notifyPropertyChanged(BR.e10403x);
    }

    @Bindable
    public String getE10404x() {
        return e10404x;
    }

    public void setE10404x(String e10404x) {
        this.e10404x = e10404x;
        notifyPropertyChanged(BR.e10404x);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        setE10501x(e105.equals("1") ? this.e10501x : "");
        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE10501x() {
        return e10501x;
    }

    public void setE10501x(String e10501x) {
        this.e10501x = e10501x;
        notifyPropertyChanged(BR.e10501x);
    }

    @Bindable
    public String getE106() {
        return e106;
    }

    public void setE106(String e106) {
        this.e106 = e106;
        setE107(e106.equals("1") ? this.e107 : "");
        setE108(e106.equals("1") ? this.e108 : "");
        notifyPropertyChanged(BR.e106);
    }

    @Bindable
    public String getE107() {
        return e107;
    }

    public void setE107(String e107) {
        this.e107 = e107;
        notifyPropertyChanged(BR.e107);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        notifyPropertyChanged(BR.e108);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        setE110(e109.equals("1") ? this.e110 : "");
        setE111(e109.equals("1") ? this.e111 : "");
        setE11201(e109.equals("1") ? this.e11201 : "");
        setE11202(e109.equals("1") ? this.e11202 : "");
        setE11203(e109.equals("1") ? this.e11203 : "");
        setE11204(e109.equals("1") ? this.e11204 : "");
        setE11205(e109.equals("1") ? this.e11205 : "");
        setE113(e109.equals("1") ? this.e113 : "");
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE110() {
        return e110;
    }

    public void setE110(String e110) {
        this.e110 = e110;
        setE111(e110.equals("1") ? this.e111 : "");
        setE11201(e110.equals("1") ? this.e11201 : "");
        setE11202(e110.equals("1") ? this.e11202 : "");
        setE11203(e110.equals("1") ? this.e11203 : "");
        setE11204(e110.equals("1") ? this.e11204 : "");
        setE11205(e110.equals("1") ? this.e11205 : "");
        setE113(e110.equals("1") ? this.e113 : "");
        notifyPropertyChanged(BR.e110);
    }

    @Bindable
    public String getE111() {
        return e111;
    }

    public void setE111(String e111) {
        this.e111 = e111;
        setE11196x(e111.equals("96") ? this.e11196x : "");
        notifyPropertyChanged(BR.e111);
    }

    @Bindable
    public String getE11196x() {
        return e11196x;
    }

    public void setE11196x(String e11196x) {
        this.e11196x = e11196x;
        notifyPropertyChanged(BR.e11196x);
    }

    @Bindable
    public String getE11201() {
        return e11201;
    }

    public void setE11201(String e11201) {
        this.e11201 = e11201;
        notifyPropertyChanged(BR.e11201);
    }

    @Bindable
    public String getE11202() {
        return e11202;
    }

    public void setE11202(String e11202) {
        this.e11202 = e11202;
        notifyPropertyChanged(BR.e11202);
    }

    @Bindable
    public String getE11203() {
        return e11203;
    }

    public void setE11203(String e11203) {
        this.e11203 = e11203;
        notifyPropertyChanged(BR.e11203);
    }

    @Bindable
    public String getE11204() {
        return e11204;
    }

    public void setE11204(String e11204) {
        this.e11204 = e11204;
        notifyPropertyChanged(BR.e11204);
    }

    @Bindable
    public String getE11205() {
        return e11205;
    }

    public void setE11205(String e11205) {
        this.e11205 = e11205;
        notifyPropertyChanged(BR.e11205);
    }

    @Bindable
    public String getE113() {
        return e113;
    }

    public void setE113(String e113) {
        this.e113 = e113;
        setE11396x(e113.equals("96") ? this.e11396x : "");
        notifyPropertyChanged(BR.e113);
    }

    @Bindable
    public String getE11396x() {
        return e11396x;
    }

    public void setE11396x(String e11396x) {
        this.e11396x = e11396x;
        notifyPropertyChanged(BR.e11396x);
    }

    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE11501() {
        return e11501;
    }

    public void setE11501(String e11501) {
        this.e11501 = e11501;
        notifyPropertyChanged(BR.e11501);
    }

    @Bindable
    public String getE11502() {
        return e11502;
    }

    public void setE11502(String e11502) {
        this.e11502 = e11502;
        notifyPropertyChanged(BR.e11502);
    }

    @Bindable
    public String getE11503() {
        return e11503;
    }

    public void setE11503(String e11503) {
        this.e11503 = e11503;
        notifyPropertyChanged(BR.e11503);
    }

    @Bindable
    public String getE11504() {
        return e11504;
    }

    public void setE11504(String e11504) {
        this.e11504 = e11504;
        notifyPropertyChanged(BR.e11504);
    }

    @Bindable
    public String getE11505() {
        return e11505;
    }

    public void setE11505(String e11505) {
        this.e11505 = e11505;
        notifyPropertyChanged(BR.e11505);
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        setF102(f101.equals("1") ? this.f102 : "");
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        setF104(f103.equals("1") ? this.f104 : "");
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
        notifyPropertyChanged(BR.f104);
    }

    @Bindable
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
        setF106(f105.equals("1") ? this.f106 : "");
        notifyPropertyChanged(BR.f105);
    }

    @Bindable
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
        notifyPropertyChanged(BR.f106);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        setF108(f107.equals("1") ? this.f108 : "");
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF109() {
        return f109;
    }

    public void setF109(String f109) {
        this.f109 = f109;
        setF110(f109.equals("1") ? this.f110 : "");
        notifyPropertyChanged(BR.f109);
    }

    @Bindable
    public String getF110() {
        return f110;
    }

    public void setF110(String f110) {
        this.f110 = f110;
        notifyPropertyChanged(BR.f110);
    }

    @Bindable
    public String getF111() {
        return f111;
    }

    public void setF111(String f111) {
        this.f111 = f111;
        setF112(f111.equals("1") ? this.f112 : "");
        notifyPropertyChanged(BR.f111);
    }

    @Bindable
    public String getF112() {
        return f112;
    }

    public void setF112(String f112) {
        this.f112 = f112;
        notifyPropertyChanged(BR.f112);
    }

    @Bindable
    public String getF113() {
        return f113;
    }

    public void setF113(String f113) {
        this.f113 = f113;
        setF114(f113.equals("1") ? this.f114 : "");
        notifyPropertyChanged(BR.f113);
    }

    @Bindable
    public String getF114() {
        return f114;
    }

    public void setF114(String f114) {
        this.f114 = f114;
        notifyPropertyChanged(BR.f114);
    }

    @Bindable
    public String getF115() {
        return f115;
    }

    public void setF115(String f115) {
        this.f115 = f115;
        setF116(f115.equals("1") ? this.f116 : "");
        notifyPropertyChanged(BR.f115);
    }

    @Bindable
    public String getF116() {
        return f116;
    }

    public void setF116(String f116) {
        this.f116 = f116;
        notifyPropertyChanged(BR.f116);
    }

    @Bindable
    public String getF117() {
        return f117;
    }

    public void setF117(String f117) {
        this.f117 = f117;
        setF118(f117.equals("1") ? this.f118 : "");
        notifyPropertyChanged(BR.f117);
    }

    @Bindable
    public String getF118() {
        return f118;
    }

    public void setF118(String f118) {
        this.f118 = f118;
        notifyPropertyChanged(BR.f118);
    }

    @Bindable
    public String getF201() {
        return f201;
    }

    public void setF201(String f201) {
        this.f201 = f201;
        notifyPropertyChanged(BR.f201);
    }

    @Bindable
    public String getF202() {
        return f202;
    }

    public void setF202(String f202) {
        this.f202 = f202;
        notifyPropertyChanged(BR.f202);
    }

    @Bindable
    public String getF203() {
        return f203;
    }

    public void setF203(String f203) {
        this.f203 = f203;
        notifyPropertyChanged(BR.f203);
    }

    @Bindable
    public String getF204() {
        return f204;
    }

    public void setF204(String f204) {
        this.f204 = f204;
        notifyPropertyChanged(BR.f204);
    }

    @Bindable
    public String getF301() {
        return f301;
    }

    public void setF301(String f301) {
        this.f301 = f301;
        notifyPropertyChanged(BR.f301);
    }

    @Bindable
    public String getF302() {
        return f302;
    }

    public void setF302(String f302) {
        this.f302 = f302;
        notifyPropertyChanged(BR.f302);
    }

    @Bindable
    public String getF303() {
        return f303;
    }

    public void setF303(String f303) {
        this.f303 = f303;
        notifyPropertyChanged(BR.f303);
    }

    @Bindable
    public String getF304() {
        return f304;
    }

    public void setF304(String f304) {
        this.f304 = f304;
        notifyPropertyChanged(BR.f304);
    }

    @Bindable
    public String getF305() {
        return f305;
    }

    public void setF305(String f305) {
        this.f305 = f305;
        notifyPropertyChanged(BR.f305);
    }

    @Bindable
    public String getF306() {
        return f306;
    }

    public void setF306(String f306) {
        this.f306 = f306;
        notifyPropertyChanged(BR.f306);
    }

    @Bindable
    public String getF307() {
        return f307;
    }

    public void setF307(String f307) {
        this.f307 = f307;
        notifyPropertyChanged(BR.f307);
    }

    @Bindable
    public String getF308() {
        return f308;
    }

    public void setF308(String f308) {
        this.f308 = f308;
        notifyPropertyChanged(BR.f308);
    }

    @Bindable
    public String getF309() {
        return f309;
    }

    public void setF309(String f309) {
        this.f309 = f309;
        notifyPropertyChanged(BR.f309);
    }

    @Bindable
    public String getF310() {
        return f310;
    }

    public void setF310(String f310) {
        this.f310 = f310;
        notifyPropertyChanged(BR.f310);
    }

    @Bindable
    public String getF311() {
        return f311;
    }

    public void setF311(String f311) {
        this.f311 = f311;
        notifyPropertyChanged(BR.f311);
    }

    @Bindable
    public String getF312() {
        return f312;
    }

    public void setF312(String f312) {
        this.f312 = f312;
        notifyPropertyChanged(BR.f312);
    }

    @Bindable
    public String getF313() {
        return f313;
    }

    public void setF313(String f313) {
        this.f313 = f313;
        notifyPropertyChanged(BR.f313);
    }

    @Bindable
    public String getF314() {
        return f314;
    }

    public void setF314(String f314) {
        this.f314 = f314;
        notifyPropertyChanged(BR.f314);
    }


    public Form Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED_DATE));

        sA1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA1)));
        sA3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA3)));
        sB1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SB1)));
        sC2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SC2)));
        sD1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SD1)));
        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE1)));
        sF1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF1)));
        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF2)));
        sF3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF3)));


        return this;
    }

    public void sA1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a101d = json.getString("a101d");
            this.a101m = json.getString("a101m");
            this.a101y = json.getString("a101y");
            this.a102 = json.getString("a102");
            this.a103 = json.getString("a103");
            this.a104 = json.getString("a104");
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a108 = json.getString("a108");
            this.a109 = json.getString("a109");
            this.a110 = json.getString("a110");
            this.a111t = json.getString("a111t");
            this.a112 = json.getString("a112");
            this.a113 = json.getString("a113");
            this.a114t = json.getString("a114t");
            this.a115t = json.getString("a115t");
            this.a116t = json.getString("a116t");
            this.a11696x = json.getString("a11696x");
        }
    }

    public void sA3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sA3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a301 = json.getString("a301");
            this.a30196x = json.getString("a30196x");
            this.a302 = json.getString("a302");
            this.a30296x = json.getString("a30296x");
            this.a303 = json.getString("a303");
            this.a30396x = json.getString("a30396x");
            this.a304 = json.getString("a304");
            this.a30496x = json.getString("a30496x");
            this.a305 = json.getString("a305");
            this.a30596x = json.getString("a30596x");
            this.a30616 = json.getString("a30616");
            this.a306 = json.getString("a306");
            this.a30696x = json.getString("a30696x");
            this.a307 = json.getString("a307");
            this.a30796x = json.getString("a30796x");
            this.a308 = json.getString("a308");
            this.a309 = json.getString("a309");
            this.a30901x = json.getString("a30901x");
            this.a310 = json.getString("a310");
            this.a311 = json.getString("a311");
            this.a312 = json.getString("a312");
            this.a313 = json.getString("a313");
            this.a314 = json.getString("a314");
            this.a31496x = json.getString("a31496x");
            this.a315 = json.getString("a315");
            this.a316 = json.getString("a316");
            this.a31696x = json.getString("a31696x");
            this.a317 = json.getString("a317");
            this.a31796x = json.getString("a31796x");
            this.a318 = json.getString("a318");
            this.a31896x = json.getString("a31896x");
            this.a31901 = json.getString("a31901");
            this.a31902 = json.getString("a31902");
            this.a31903 = json.getString("a31903");
            this.a31904 = json.getString("a31904");
            this.a31905 = json.getString("a31905");
            this.a31906 = json.getString("a31906");
            this.a31907 = json.getString("a31907");
            this.a31908 = json.getString("a31908");
            this.a31909 = json.getString("a31909");
            this.a31910 = json.getString("a31910");
            this.a31911 = json.getString("a31911");
            this.a31912 = json.getString("a31912");
            this.a31913 = json.getString("a31913");
            this.a31914 = json.getString("a31914");
            this.a31915 = json.getString("a31915");
            this.a31916 = json.getString("a31916");
            this.a31917 = json.getString("a31917");
            this.a31918 = json.getString("a31918");
            this.a320 = json.getString("a320");
            this.a32101 = json.getString("a32101");
            this.a32102 = json.getString("a32102");
            this.a32103 = json.getString("a32103");
            this.a32104 = json.getString("a32104");
            this.a32105 = json.getString("a32105");
            this.a32106 = json.getString("a32106");
            this.a32107 = json.getString("a32107");
            this.a32108 = json.getString("a32108");
            this.a32109 = json.getString("a32109");
            this.a322 = json.getString("a322");
            this.a32296x = json.getString("a32296x");
            this.a323 = json.getString("a323");
            this.a324 = json.getString("a324");
            this.a325 = json.getString("a325");
            this.a326 = json.getString("a326");
            this.a327 = json.getString("a327");
            this.a32701x = json.getString("a32701x");
            this.a32702x = json.getString("a32702x");
            this.a328 = json.getString("a328");
            this.a329 = json.getString("a329");
            this.a32901 = json.getString("a32901");
            this.a32901x = json.getString("a32901x");
            this.a32902 = json.getString("a32902");
            this.a32902x = json.getString("a32902x");
            this.a32903 = json.getString("a32903");
            this.a32903x = json.getString("a32903x");
            this.a32904 = json.getString("a32904");
            this.a32904x = json.getString("a32904x");
            this.a32905 = json.getString("a32905");
            this.a32905x = json.getString("a32905x");
            this.a32906 = json.getString("a32906");
            this.a32906x = json.getString("a32906x");
            this.a330 = json.getString("a330");
            this.a331 = json.getString("a331");
            this.a33101x = json.getString("a33101x");
            this.a332 = json.getString("a332");
            this.a33201 = json.getString("a33201");
            this.a33202 = json.getString("a33202");
            this.a33203 = json.getString("a33203");
            this.a33204 = json.getString("a33204");
            this.a33205 = json.getString("a33205");
            this.a33296 = json.getString("a33296");
            this.a33296x = json.getString("a33296x");
            this.a333 = json.getString("a333");
            this.a33301 = json.getString("a33301");
            this.a33302 = json.getString("a33302");
            this.a33303 = json.getString("a33303");
            this.a33396 = json.getString("a33396");
            this.a33396x = json.getString("a33396x");
        }
    }

    public void sB1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sB1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.b101 = json.getString("b101");
            this.b102 = json.getString("b102");
            this.b10201 = json.getString("b10201");
            this.b10202 = json.getString("b10202");
            this.b10203 = json.getString("b10203");
            this.b10204 = json.getString("b10204");
            this.b10205 = json.getString("b10205");
            this.b10206 = json.getString("b10206");
            this.b10207 = json.getString("b10207");
            this.b10208 = json.getString("b10208");
            this.b10296 = json.getString("b10296");
            this.b10296x = json.getString("b10296x");
            this.b103a = json.getString("b103a");
            this.b103a96x = json.getString("b103a96x");
            this.b103b = json.getString("b103b");
            this.b103b96x = json.getString("b103b96x");
            this.b103c = json.getString("b103c");
            this.b103c96x = json.getString("b103c96x");
            this.b103d = json.getString("b103d");
            this.b103d96x = json.getString("b103d96x");
            this.b103e = json.getString("b103e");
            this.b103e96x = json.getString("b103e96x");
            this.b103f = json.getString("b103f");
            this.b103f96x = json.getString("b103f96x");
            this.b103g = json.getString("b103g");
            this.b103g96x = json.getString("b103g96x");
            this.b103h = json.getString("b103h");
            this.b103h96x = json.getString("b103h96x");
            this.b103i = json.getString("b103i");
            this.b103i96x = json.getString("b103i96x");
            this.b103j = json.getString("b103j");
            this.b103j96x = json.getString("b103j96x");
            this.b103k = json.getString("b103k");
            this.b103k96x = json.getString("b103k96x");
            this.b103l = json.getString("b103l");
            this.b103l96x = json.getString("b103l96x");
            this.b104 = json.getString("b104");
            this.b10496x = json.getString("b10496x");
            this.b105 = json.getString("b105");
            this.b10596x = json.getString("b10596x");
            this.b106 = json.getString("b106");
            this.b10696x = json.getString("b10696x");
            this.b107 = json.getString("b107");
            this.b10701x = json.getString("b10701x");
            this.b10801 = json.getString("b10801");
            this.b10901 = json.getString("b10901");
            this.b110d = json.getString("b110d");
            this.b110w = json.getString("b110w");
            this.b110m = json.getString("b110m");
            this.b111 = json.getString("b111");
            this.b11101x = json.getString("b11101x");
            this.b11201 = json.getString("b11201");
            this.b11202 = json.getString("b11202");
            this.b11203 = json.getString("b11203");
            this.b11204 = json.getString("b11204");
            this.b11205 = json.getString("b11205");
            this.b113 = json.getString("b113");
            this.b114 = json.getString("b114");
            this.b115 = json.getString("b115");
            this.b11596x = json.getString("b11596x");
            this.b11601 = json.getString("b11601");
            this.b11602 = json.getString("b11602");
            this.b11603 = json.getString("b11603");
            this.b11604 = json.getString("b11604");
            this.b11605 = json.getString("b11605");
            this.b11606 = json.getString("b11606");
            this.b11607 = json.getString("b11607");
            this.b11608 = json.getString("b11608");
            this.b11609 = json.getString("b11609");
            this.b11696 = json.getString("b11696");
            this.b117 = json.getString("b117");
        }
    }


    public void sC2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sC2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.c201 = json.getString("c201");
            this.c202 = json.getString("c202");
            this.c20296x = json.getString("c20296x");
            this.c203 = json.getString("c203");
            this.c204 = json.getString("c204");
            this.c205 = json.getString("c205");
            this.c206 = json.getString("c206");
            this.c20601 = json.getString("c20601");
            this.c20602 = json.getString("c20602");
            this.c20603 = json.getString("c20603");
            this.c20604 = json.getString("c20604");
            this.c20605 = json.getString("c20605");
            this.c20606 = json.getString("c20606");
            this.c20607 = json.getString("c20607");
            this.c20608 = json.getString("c20608");
            this.c20698 = json.getString("c20698");
            this.c20696 = json.getString("c20696");
            this.c20696x = json.getString("c20696x");
        }
    }

    public void sD1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sD1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d101 = json.getString("d101");
            this.d102 = json.getString("d102");
            this.d10296x = json.getString("d10296x");
            this.d103 = json.getString("d103");
            this.d10301 = json.getString("d10301");
            this.d10302 = json.getString("d10302");
            this.d10303 = json.getString("d10303");
            this.d10304 = json.getString("d10304");
            this.d10305 = json.getString("d10305");
            this.d10306 = json.getString("d10306");
            this.d10307 = json.getString("d10307");
            this.d10308 = json.getString("d10308");
            this.d10398 = json.getString("d10398");
            this.d10396 = json.getString("d10396");
            this.d10396x = json.getString("d10396x");
            this.d104 = json.getString("d104");
            this.d105 = json.getString("d105");
            this.d106 = json.getString("d106");
            this.d107 = json.getString("d107");
            this.d10701 = json.getString("d10701");
            this.d10702 = json.getString("d10702");
            this.d10703 = json.getString("d10703");
            this.d10704 = json.getString("d10704");
            this.d10705 = json.getString("d10705");
            this.d10706 = json.getString("d10706");
            this.d10707 = json.getString("d10707");
            this.d10708 = json.getString("d10708");
            this.d10709 = json.getString("d10709");
            this.d10710 = json.getString("d10710");
            this.d10711 = json.getString("d10711");
            this.d10712 = json.getString("d10712");
            this.d10713 = json.getString("d10713");
            this.d10714 = json.getString("d10714");
            this.d10715 = json.getString("d10715");
            this.d10716 = json.getString("d10716");
            this.d10798 = json.getString("d10798");
            this.d10796 = json.getString("d10796");
            this.d10796x = json.getString("d10796x");
        }
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e101 = json.getString("e101");
            this.e102 = json.getString("e102");
            this.e103 = json.getString("e103");
            this.e10396x = json.getString("e10396x");
            this.e104 = json.getString("e104");
            this.e10401x = json.getString("e10401x");
            this.e10402x = json.getString("e10402x");
            this.e10403x = json.getString("e10403x");
            this.e10404x = json.getString("e10404x");
            this.e105 = json.getString("e105");
            this.e10501x = json.getString("e10501x");
            this.e106 = json.getString("e106");
            this.e107 = json.getString("e107");
            this.e108 = json.getString("e108");
            this.e109 = json.getString("e109");
            this.e110 = json.getString("e110");
            this.e111 = json.getString("e111");
            this.e11196x = json.getString("e11196x");
            this.e11201 = json.getString("e11201");
            this.e11202 = json.getString("e11202");
            this.e11203 = json.getString("e11203");
            this.e11204 = json.getString("e11204");
            this.e11205 = json.getString("e11205");
            this.e113 = json.getString("e113");
            this.e11396x = json.getString("e11396x");
            this.e114 = json.getString("e114");
            this.e11501 = json.getString("e11501");
            this.e11502 = json.getString("e11502");
            this.e11503 = json.getString("e11503");
            this.e11504 = json.getString("e11504");
            this.e11505 = json.getString("e11505");
        }
    }

    public void sF1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f101 = json.getString("f101");
            this.f102 = json.getString("f102");
            this.f103 = json.getString("f103");
            this.f104 = json.getString("f104");
            this.f105 = json.getString("f105");
            this.f106 = json.getString("f106");
            this.f107 = json.getString("f107");
            this.f108 = json.getString("f108");
            this.f109 = json.getString("f109");
            this.f110 = json.getString("f110");
            this.f111 = json.getString("f111");
            this.f112 = json.getString("f112");
            this.f113 = json.getString("f113");
            this.f114 = json.getString("f114");
            this.f115 = json.getString("f115");
            this.f116 = json.getString("f116");
            this.f117 = json.getString("f117");
            this.f118 = json.getString("f118");
        }
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f201 = json.getString("f201");
            this.f202 = json.getString("f202");
            this.f203 = json.getString("f203");
            this.f204 = json.getString("f204");
        }
    }

    public void sF3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f301 = json.getString("f301");
            this.f302 = json.getString("f302");
            this.f303 = json.getString("f303");
            this.f304 = json.getString("f304");
            this.f305 = json.getString("f305");
            this.f306 = json.getString("f306");
            this.f307 = json.getString("f307");
            this.f308 = json.getString("f308");
            this.f309 = json.getString("f309");
            this.f310 = json.getString("f310");
            this.f311 = json.getString("f311");
            this.f312 = json.getString("f312");
            this.f313 = json.getString("f313");
            this.f314 = json.getString("f314");
        }
    }


    public String sA1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();

        json.put("a101d", a101d)
                .put("a101m", a101m)
                .put("a101y", a101y)
                .put("a102", a102)
                .put("a103", a103)
                .put("a104", a104)
                .put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a108", a108)
                .put("a109", a109)
                .put("a110", a110)
                .put("a111t", a111t)
                .put("a112", a112)
                .put("a113", a113)
                .put("a114t", a114t)
                .put("a115t", a115t)
                .put("a116t", a116t)
                .put("a11696x", a11696x);
        return json.toString();
    }

    public String sA3toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();

        json.put("a301", a301)
                .put("a30196x", a30196x)
                .put("a302", a302)
                .put("a30296x", a30296x)
                .put("a303", a303)
                .put("a30396x", a30396x)
                .put("a304", a304)
                .put("a30496x", a30496x)
                .put("a305", a305)
                .put("a30596x", a30596x)
                .put("a30616", a30616)
                .put("a306", a306)
                .put("a30696x", a30696x)
                .put("a307", a307)
                .put("a30796x", a30796x)
                .put("a308", a308)
                .put("a309", a309)
                .put("a30901x", a30901x)
                .put("a310", a310)
                .put("a311", a311)
                .put("a312", a312)
                .put("a313", a313)
                .put("a314", a314)
                .put("a31496x", a31496x)
                .put("a315", a315)
                .put("a316", a316)
                .put("a31696x", a31696x)
                .put("a317", a317)
                .put("a31796x", a31796x)
                .put("a318", a318)
                .put("a31896x", a31896x)
                .put("a31901", a31901)
                .put("a31902", a31902)
                .put("a31903", a31903)
                .put("a31904", a31904)
                .put("a31905", a31905)
                .put("a31906", a31906)
                .put("a31907", a31907)
                .put("a31908", a31908)
                .put("a31909", a31909)
                .put("a31910", a31910)
                .put("a31911", a31911)
                .put("a31912", a31912)
                .put("a31913", a31913)
                .put("a31914", a31914)
                .put("a31915", a31915)
                .put("a31916", a31916)
                .put("a31917", a31917)
                .put("a31918", a31918)
                .put("a320", a320)
                .put("a32101", a32101)
                .put("a32102", a32102)
                .put("a32103", a32103)
                .put("a32104", a32104)
                .put("a32105", a32105)
                .put("a32106", a32106)
                .put("a32107", a32107)
                .put("a32108", a32108)
                .put("a32109", a32109)
                .put("a322", a322)
                .put("a32296x", a32296x)
                .put("a323", a323)
                .put("a324", a324)
                .put("a325", a325)
                .put("a326", a326)
                .put("a327", a327)
                .put("a32701x", a32701x)
                .put("a32702x", a32702x)
                .put("a328", a328)
                .put("a329", a329)
                .put("a32901", a32901)
                .put("a32901x", a32901x)
                .put("a32902", a32902)
                .put("a32902x", a32902x)
                .put("a32903", a32903)
                .put("a32903x", a32903x)
                .put("a32904", a32904)
                .put("a32904x", a32904x)
                .put("a32905", a32905)
                .put("a32905x", a32905x)
                .put("a32906", a32906)
                .put("a32906x", a32906x)
                .put("a330", a330)
                .put("a331", a331)
                .put("a33101x", a33101x)
                .put("a332", a332)
                .put("a33201", a33201)
                .put("a33202", a33202)
                .put("a33203", a33203)
                .put("a33204", a33204)
                .put("a33205", a33205)
                .put("a33296", a33296)
                .put("a33296x", a33296x)
                .put("a333", a333)
                .put("a33301", a33301)
                .put("a33302", a33302)
                .put("a33303", a33303)
                .put("a33396", a33396)
                .put("a33396x", a33396x);
        return json.toString();
    }

    public String sB1toString() throws JSONException {
        Log.d(TAG, "sA1toString: ");
        JSONObject json = new JSONObject();

        json.put("b101", b101)
                .put("b102", b102)
                .put("b10201", b10201)
                .put("b10202", b10202)
                .put("b10203", b10203)
                .put("b10204", b10204)
                .put("b10205", b10205)
                .put("b10206", b10206)
                .put("b10207", b10207)
                .put("b10208", b10208)
                .put("b10296", b10296)
                .put("b10296x", b10296x)
                .put("b103a", b103a)
                .put("b103a96x", b103a96x)
                .put("b103b", b103b)
                .put("b103b96x", b103b96x)
                .put("b103c", b103c)
                .put("b103c96x", b103c96x)
                .put("b103d", b103d)
                .put("b103d96x", b103d96x)
                .put("b103e", b103e)
                .put("b103e96x", b103e96x)
                .put("b103f", b103f)
                .put("b103f96x", b103f96x)
                .put("b103g", b103g)
                .put("b103g96x", b103g96x)
                .put("b103h", b103h)
                .put("b103h96x", b103h96x)
                .put("b103i", b103i)
                .put("b103i96x", b103i96x)
                .put("b103j", b103j)
                .put("b103j96x", b103j96x)
                .put("b103k", b103k)
                .put("b103k96x", b103k96x)
                .put("b103l", b103l)
                .put("b103l96x", b103l96x)
                .put("b104", b104)
                .put("b10496x", b10496x)
                .put("b105", b105)
                .put("b10596x", b10596x)
                .put("b106", b106)
                .put("b10696x", b10696x)
                .put("b107", b107)
                .put("b10701x", b10701x)
                .put("b10801", b10801)
                .put("b10901", b10901)
                .put("b110d", b110d)
                .put("b110w", b110w)
                .put("b110m", b110m)
                .put("b111", b111)
                .put("b11101x", b11101x)
                .put("b11201", b11201)
                .put("b11202", b11202)
                .put("b11203", b11203)
                .put("b11204", b11204)
                .put("b11205", b11205)
                .put("b113", b113)
                .put("b114", b114)
                .put("b115", b115)
                .put("b11596x", b11596x)
                .put("b11601", b11601)
                .put("b11602", b11602)
                .put("b11603", b11603)
                .put("b11604", b11604)
                .put("b11605", b11605)
                .put("b11606", b11606)
                .put("b11607", b11607)
                .put("b11608", b11608)
                .put("b11609", b11609)
                .put("b11696", b11696)
                .put("b117", b117);
        return json.toString();
    }


    public String sC2toString() throws JSONException {
        Log.d(TAG, "sC2toString: ");
        JSONObject json = new JSONObject();
        json.put("c201", c201)
                .put("c202", c202)
                .put("c20296x", c20296x)
                .put("c203", c203)
                .put("c204", c204)
                .put("c205", c205)
                .put("c206", c206)
                .put("c20601", c20601)
                .put("c20602", c20602)
                .put("c20603", c20603)
                .put("c20604", c20604)
                .put("c20605", c20605)
                .put("c20606", c20606)
                .put("c20607", c20607)
                .put("c20608", c20608)
                .put("c20698", c20698)
                .put("c20696", c20696)
                .put("c20696x", c20696x);
        return json.toString();
    }

    public String sD1toString() throws JSONException {
        Log.d(TAG, "sD1toString: ");
        JSONObject json = new JSONObject();
        json.put("d101", d101)
                .put("d102", d102)
                .put("d10296x", d10296x)
                .put("d103", d103)
                .put("d10301", d10301)
                .put("d10302", d10302)
                .put("d10303", d10303)
                .put("d10304", d10304)
                .put("d10305", d10305)
                .put("d10306", d10306)
                .put("d10307", d10307)
                .put("d10308", d10308)
                .put("d10398", d10398)
                .put("d10396", d10396)
                .put("d10396x", d10396x)
                .put("d104", d104)
                .put("d105", d105)
                .put("d106", d106)
                .put("d107", d107)
                .put("d10701", d10701)
                .put("d10702", d10702)
                .put("d10703", d10703)
                .put("d10704", d10704)
                .put("d10705", d10705)
                .put("d10706", d10706)
                .put("d10707", d10707)
                .put("d10708", d10708)
                .put("d10709", d10709)
                .put("d10710", d10710)
                .put("d10711", d10711)
                .put("d10712", d10712)
                .put("d10713", d10713)
                .put("d10714", d10714)
                .put("d10715", d10715)
                .put("d10716", d10716)
                .put("d10798", d10798)
                .put("d10796", d10796)
                .put("d10796x", d10796x);
        return json.toString();
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("e101", e101)
                .put("e102", e102)
                .put("e103", e103)
                .put("e10396x", e10396x)
                .put("e104", e104)
                .put("e10401x", e10401x)
                .put("e10402x", e10402x)
                .put("e10403x", e10403x)
                .put("e10404x", e10404x)
                .put("e105", e105)
                .put("e10501x", e10501x)
                .put("e106", e106)
                .put("e107", e107)
                .put("e108", e108)
                .put("e109", e109)
                .put("e110", e110)
                .put("e111", e111)
                .put("e11196x", e11196x)
                .put("e11201", e11201)
                .put("e11202", e11202)
                .put("e11203", e11203)
                .put("e11204", e11204)
                .put("e11205", e11205)
                .put("e113", e113)
                .put("e11396x", e11396x)
                .put("e114", e114)
                .put("e11501", e11501)
                .put("e11502", e11502)
                .put("e11503", e11503)
                .put("e11504", e11504)
                .put("e11505", e11505);
        return json.toString();
    }

    public String sF1toString() throws JSONException {
        Log.d(TAG, "sF1toString: ");
        JSONObject json = new JSONObject();

        json.put("f101", f101)
                .put("f102", f102)
                .put("f103", f103)
                .put("f104", f104)
                .put("f105", f105)
                .put("f106", f106)
                .put("f107", f107)
                .put("f108", f108)
                .put("f109", f109)
                .put("f110", f110)
                .put("f111", f111)
                .put("f112", f112)
                .put("f113", f113)
                .put("f114", f114)
                .put("f115", f115)
                .put("f116", f116)
                .put("f117", f117)
                .put("f118", f118);
        return json.toString();
    }

    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f201", f201)
                .put("f202", f202)
                .put("f203", f203)
                .put("f204", f204);
        return json.toString();
    }

    public String sF3toString() throws JSONException {
        Log.d(TAG, "sF3toString: ");
        JSONObject json = new JSONObject();
        json.put("f301", f301)
                .put("f302", f302)
                .put("f303", f303)
                .put("f304", f304)
                .put("f305", f305)
                .put("f306", f306)
                .put("f307", f307)
                .put("f308", f308)
                .put("f309", f309)
                .put("f310", f310)
                .put("f311", f311)
                .put("f312", f312)
                .put("f313", f313)
                .put("f314", f314);
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_ENUM_BLOCK, this.ebCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SA1, new JSONObject(sA1toString()));
        json.put(FormsTable.COLUMN_SA3, new JSONObject(sA3toString()));
        json.put(FormsTable.COLUMN_SB1, new JSONObject(sB1toString()));
        json.put(FormsTable.COLUMN_SC2, new JSONObject(sC2toString()));
        json.put(FormsTable.COLUMN_SD1, new JSONObject(sD1toString()));
        json.put(FormsTable.COLUMN_SE1, new JSONObject(sE1toString()));
        json.put(FormsTable.COLUMN_SF1, new JSONObject(sF1toString()));
        json.put(FormsTable.COLUMN_SF2, new JSONObject(sF2toString()));
        json.put(FormsTable.COLUMN_SF3, new JSONObject(sF3toString()));

        return json;
    }


}
