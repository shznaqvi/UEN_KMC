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
    private String sF2 = "";
    private String sF3 = "";
    private String sF5 = "";
    private String sF6 = "";
    private String sF7 = "";
    private String sF8 = "";
    private String sF9 = "";


    // FIELD VARIABLES
    private String f2101 = "";
    private String f2102 = "";
    private String f2103 = "";
    private String f2104 = "";
    private String f2105 = "";
    private String f2106 = "";
    private String f2107 = "";
    private String f2108 = "";
    private String f2201 = "";
    private String f2202 = "";
    private String f2203 = "";
    private String f2301 = "";
    private String f2302 = "";
    private String f2302a = "";
    private String f2302b = "";
    private String f2302c = "";
    private String f2302d = "";
    private String f2302e = "";
    private String f2302f = "";
    private String f2302g = "";
    private String f2302h = "";
    private String f2303 = "";
    private String f2304 = "";
    private String f2401 = "";
    private String f2402 = "";
    private String f240296x = "";
    private String f2403 = "";
    private String f3101 = "";
    private String f3102 = "";
    private String f3103 = "";
    private String f3104 = "";
    private String f3105 = "";
    private String f3106 = "";
    private String f3107 = "";
    private String f3108 = "";
    private String f3201 = "";
    private String f3202 = "";
    private String f3301 = "";
    private String f3302 = "";
    private String f3302a = "";
    private String f3302b = "";
    private String f3302c = "";
    private String f3302d = "";
    private String f3302e = "";
    private String f3302f = "";
    private String f3302g = "";
    private String f3302h = "";
    private String f3302i = "";
    private String f3303 = "";
    private String f3304 = "";
    private String f3401 = "";
    private String f3402 = "";
    private String f340296x = "";
    private String f3403 = "";
    private String f3404 = "";
    private String f5101 = "";
    private String f5102 = "";
    private String f5103 = "";
    private String f5104 = "";
    private String f5105 = "";
    private String f5106 = "";
    private String f5107 = "";
    private String f5108 = "";
    private String f5109 = "";
    private String f5110 = "";
    private String f5111 = "";
    private String f5112 = "";
    private String f5113 = "";
    private String f5201 = "";
    private String f5202 = "";
    private String f5203d = "";
    private String f5203m = "";
    private String f5203y = "";
    private String f5204h = "";
    private String f5204m = "";
    private String f5205 = "";
    private String f5206 = "";
    private String f5207 = "";
    private String f5208 = "";
    private String f5209 = "";
    private String f5210 = "";
    private String f5211 = "";
    private String f5212 = "";
    private String f5213 = "";
    private String f5214 = "";
    private String f5215a = "";
    private String f5215b = "";
    private String f5215c = "";
    private String f5215d = "";
    private String f5215e = "";
    private String f5215f = "";
    private String f5215g = "";
    private String f5215h = "";
    private String f5215i = "";
    private String f5215j = "";
    private String f521596 = "";
    private String f5216 = "";
    private String f5217 = "";
    private String f5218 = "";
    private String f5219 = "";
    private String f5220 = "";
    private String f5221 = "";
    private String f5221wx = "";
    private String f5221dx = "";
    private String f5222w = "";
    private String f5222d = "";
    private String f5301 = "";
    private String f5302 = "";
    private String f5303 = "";
    private String f5304 = "";
    private String f5305 = "";
    private String f5306 = "";
    private String f5307 = "";
    private String f530796x = "";
    private String f5308 = "";
    private String f5309 = "";
    private String f5310 = "";
    private String f5311 = "";
    private String f5312 = "";
    private String f5313 = "";
    private String f531396x = "";
    private String f5314 = "";
    private String f5315 = "";
    private String f5315a = "";
    private String f5315b = "";
    private String f5315c = "";
    private String f5315d = "";
    private String f5315e = "";
    private String f5315f = "";
    private String f531598 = "";
    private String f531596 = "";
    private String f531596x = "";
    private String f5316 = "";
    private String f5317 = "";
    private String f531796x = "";
    private String f5318 = "";
    private String f5319 = "";
    private String f5319a = "";
    private String f5319b = "";
    private String f5319c = "";
    private String f5319d = "";
    private String f531996 = "";
    private String f531996x = "";
    private String f5320 = "";
    private String f532096x = "";
    private String f5321 = "";
    private String f5321a = "";
    private String f5321b = "";
    private String f5321c = "";
    private String f5321d = "";
    private String f5321e = "";
    private String f532196 = "";
    private String f532196x = "";
    private String f5322 = "";
    private String f5323 = "";
    private String f5401 = "";
    private String f5402 = "";
    private String f5403 = "";
    private String f5404 = "";
    private String f5405 = "";
    private String f5406 = "";
    private String f5407 = "";
    private String f5408 = "";
    private String f5409 = "";
    private String f540996x = "";
    private String f5410a = "";
    private String f5410b = "";
    private String f5411 = "";
    private String f541196x = "";
    private String f5412 = "";
    private String f5413 = "";
    private String f5414a = "";
    private String f5414b = "";
    private String f5415 = "";
    private String f5416 = "";
    private String f5417 = "";
    private String f6101 = "";
    private String f6102 = "";
    private String f6103 = "";
    private String f4104 = "";
    private String f6105 = "";
    private String f6106 = "";
    private String f6201 = "";
    private String f6202 = "";
    private String f6203 = "";
    private String f6204 = "";
    private String f6205 = "";
    private String f6206 = "";
    private String f6206a = "";
    private String f6206b = "";
    private String f6206c = "";
    private String f6206d = "";
    private String f6206e = "";
    private String f6206f = "";
    private String f6206g = "";
    private String f6206h = "";
    private String f6206i = "";
    private String f620696 = "";
    private String f6207 = "";
    private String f6301 = "";
    private String f6302 = "";
    private String f6303 = "";
    private String f6304 = "";
    private String f6305 = "";
    private String f64011 = "";
    private String f64012 = "";
    private String f6402 = "";
    private String f6403 = "";
    private String f6404 = "";
    private String f6405 = "";
    private String f6406 = "";
    private String f6407 = "";
    private String f6408 = "";
    private String f6409 = "";
    private String f6410 = "";
    private String f6411 = "";
    private String f6412 = "";
    private String f6413 = "";
    private String f6414 = "";
    private String f6415 = "";
    private String f6416 = "";
    private String f6417 = "";
    private String f6501 = "";
    private String f650196x = "";
    private String f6502 = "";
    private String f6503 = "";
    private String f6503a = "";
    private String f6503b = "";
    private String f6503c = "";
    private String f6503d = "";
    private String f650396 = "";
    private String f650396x = "";
    private String f6504 = "";
    private String f650496x = "";
    private String f6505 = "";
    private String f6505a = "";
    private String f6505b = "";
    private String f6505c = "";
    private String f6505d = "";
    private String f6505e = "";
    private String f650596 = "";
    private String f650596x = "";
    private String f6506 = "";
    private String f6507 = "";
    private String f650796x = "";
    private String f6508 = "";
    private String f6509 = "";
    private String f6510 = "";
    private String f651096x = "";
    private String f6511 = "";
    private String f6511a = "";
    private String f6511b = "";
    private String f6511c = "";
    private String f6511d = "";
    private String f6511e = "";
    private String f6511f = "";
    private String f6511g = "";
    private String f6511h = "";
    private String f6511i = "";
    private String f6511j = "";
    private String f6511k = "";
    private String f651196 = "";
    private String f651196x = "";
    private String f6512 = "";
    private String f6513 = "";
    private String f6514 = "";
    private String f6515 = "";
    private String f6515hx = "";
    private String f6515dx = "";
    private String f6516 = "";
    private String f6516a = "";
    private String f6516b = "";
    private String f6516c = "";
    private String f6516d = "";
    private String f6516e = "";
    private String f651696 = "";
    private String f651696x = "";
    private String f6517 = "";
    private String f6518 = "";
    private String f6518a = "";
    private String f6518b = "";
    private String f6518c = "";
    private String f6518d = "";
    private String f6518e = "";
    private String f6518f = "";
    private String f6518g = "";
    private String f651896 = "";
    private String f651896x = "";
    private String f6519 = "";
    private String f6520 = "";
    private String f6520dx = "";
    private String f6521 = "";
    private String f6521a = "";
    private String f6521b = "";
    private String f6521c = "";
    private String f6521d = "";
    private String f6521e = "";
    private String f6521f = "";
    private String f6521g = "";
    private String f6521h = "";
    private String f6521i = "";
    private String f6521j = "";
    private String f652198 = "";
    private String f652196 = "";
    private String f652196x = "";
    private String f6522 = "";
    private String f652296x = "";
    private String f6523 = "";
    private String f6524 = "";
    private String f6524dx = "";
    private String f6525 = "";
    private String f652596x = "";
    private String f6601 = "";
    private String f6602 = "";
    private String f6602a = "";
    private String f6602b = "";
    private String f6602c = "";
    private String f6602d = "";
    private String f6602e = "";
    private String f660296 = "";
    private String f660296x = "";
    private String f6603 = "";
    private String f6604 = "";
    private String f660496x = "";
    private String f6605 = "";
    private String f6605a = "";
    private String f6605b = "";
    private String f6605c = "";
    private String f660596 = "";
    private String f660596x = "";
    private String f6606 = "";
    private String f6701 = "";
    private String f6702 = "";
    private String f670296x = "";
    private String f6703 = "";
    private String f6704 = "";
    private String f6705 = "";
    private String f6705a = "";
    private String f6705b = "";
    private String f6705c = "";
    private String f6705d = "";
    private String f6705e = "";
    private String f6705f = "";
    private String f6705g = "";
    private String f670596 = "";
    private String f670596x = "";
    private String f6706 = "";
    private String f6707d = "";
    private String f6707h = "";
    private String f6707m = "";
    private String f6708 = "";
    private String f6709 = "";
    private String f6709a = "";
    private String f6709b = "";
    private String f6709c = "";
    private String f6709d = "";
    private String f6709e = "";
    private String f670996 = "";
    private String f670996x = "";
    private String f6710 = "";
    private String f671096x = "";
    private String f6711 = "";
    private String f6712h = "";
    private String f6712n = "";
    private String f6713 = "";
    private String f671396x = "";
    private String f6714d = "";
    private String f6714h = "";
    private String f6714m = "";
    private String f6715 = "";
    private String f6716 = "";
    private String f6717 = "";
    private String f6718 = "";
    private String f6719 = "";
    private String f6719a = "";
    private String f6719b = "";
    private String f6719c = "";
    private String f671996 = "";
    private String f671996x = "";
    private String f6720 = "";
    private String f6721 = "";
    private String f6721a = "";
    private String f6721b = "";
    private String f6721c = "";
    private String f6721d = "";
    private String f6721e = "";
    private String f6721f = "";
    private String f672196 = "";
    private String f672196x = "";
    private String f6722 = "";
    private String f6723 = "";
    private String f6723a = "";
    private String f6723b = "";
    private String f6723c = "";
    private String f6723d = "";
    private String f6723e = "";
    private String f672396 = "";
    private String f7101 = "";
    private String f7102 = "";
    private String f7103 = "";
    private String f7201 = "";
    private String f7202 = "";
    private String f7203 = "";
    private String f7203a = "";
    private String f7203b = "";
    private String f7203c = "";
    private String f7203d = "";
    private String f7203e = "";
    private String f7203f = "";
    private String f7203g = "";
    private String f7203h = "";
    private String f7203i = "";
    private String f720396 = "";
    private String f720396x = "";
    private String f7204 = "";
    private String f7204hx = "";
    private String f7204mx = "";
    private String f7301 = "";
    private String f7302 = "";
    private String f7303a = "";
    private String f7303b = "";
    private String f7304 = "";
    private String f7305 = "";
    private String f7306 = "";
    private String f7307 = "";
    private String f7308 = "";
    private String f7309 = "";
    private String f7310 = "";
    private String f7311 = "";
    private String f7312 = "";
    private String f7312t = "";
    private String f7313 = "";
    private String f7314 = "";
    private String f7315 = "";
    private String f7316 = "";
    private String f7317 = "";
    private String f7318 = "";
    private String f7319 = "";
    private String f7401 = "";
    private String f7402 = "";
    private String f7402a = "";
    private String f7402b = "";
    private String f7402c = "";
    private String f7402d = "";
    private String f7402e = "";
    private String f7402f = "";
    private String f7402g = "";
    private String f7402h = "";
    private String f7402i = "";
    private String f7402j = "";
    private String f7402k = "";
    private String f740296 = "";
    private String f740296x = "";
    private String f7403 = "";
    private String f7404 = "";
    private String f7405 = "";
    private String f740596x = "";
    private String f7406 = "";
    private String f7406mx = "";
    private String f7406hx = "";
    private String f7407 = "";
    private String f7408 = "";
    private String f7409 = "";
    private String f7410 = "";
    private String f7410a = "";
    private String f7410b = "";
    private String f7410c = "";
    private String f741096 = "";
    private String f741096x = "";
    private String f7411 = "";
    private String f7412 = "";
    private String f7413 = "";
    private String f7413a = "";
    private String f7413b = "";
    private String f7413c = "";
    private String f7413d = "";
    private String f7413e = "";
    private String f7413f = "";
    private String f7413g = "";
    private String f7413h = "";
    private String f741396 = "";
    private String f741396x = "";
    private String f7501 = "";
    private String f7502 = "";
    private String f7502a = "";
    private String f7502b = "";
    private String f7502c = "";
    private String f7502d = "";
    private String f7502e = "";
    private String f7502f = "";
    private String f7502g = "";
    private String f750296 = "";
    private String f750296x = "";
    private String f7503 = "";
    private String f7504d = "";
    private String f7504h = "";
    private String f7504m = "";
    private String f7505 = "";
    private String f7506 = "";
    private String f7506a = "";
    private String f7506b = "";
    private String f7506c = "";
    private String f7506d = "";
    private String f750696 = "";
    private String f750696x = "";
    private String f7507 = "";
    private String f750796x = "";
    private String f7508 = "";
    private String f7509 = "";
    private String f8101 = "";
    private String f8102 = "";
    private String f8103 = "";
    private String f8104 = "";
    private String f8201 = "";
    private String f8202 = "";
    private String f8203 = "";
    private String f8204 = "";
    private String f8205 = "";
    private String f8206 = "";
    private String f8207 = "";
    private String f8208 = "";
    private String f8208a = "";
    private String f8208b = "";
    private String f8208c = "";
    private String f8208d = "";
    private String f8208e = "";
    private String f8208f = "";
    private String f820896 = "";
    private String f820896x = "";
    private String f8209 = "";
    private String f8210h = "";
    private String f8210m = "";
    private String f8211 = "";
    private String f8301 = "";
    private String f8302 = "";
    private String f8303 = "";
    private String f8304 = "";
    private String f8305 = "";
    private String f8306 = "";
    private String f8307 = "";
    private String f8308 = "";
    private String f8308a = "";
    private String f8308b = "";
    private String f8308c = "";
    private String f8308d = "";
    private String f8308e = "";
    private String f8308f = "";
    private String f830896 = "";
    private String f830896x = "";
    private String f8309 = "";
    private String f8310h = "";
    private String f8310m = "";
    private String f8311 = "";
    private String f8401 = "";
    private String f8402 = "";
    private String f8403 = "";
    private String f8404 = "";
    private String f8405 = "";
    private String f8406 = "";
    private String f8407 = "";
    private String f8408 = "";
    private String f8408a = "";
    private String f8408b = "";
    private String f8408c = "";
    private String f8408d = "";
    private String f8408e = "";
    private String f8408f = "";
    private String f840896 = "";
    private String f840896x = "";
    private String f8409 = "";
    private String f8410h = "";
    private String f8410m = "";
    private String f8411 = "";
    private String f8501 = "";
    private String f8502 = "";
    private String f8503 = "";
    private String f8504 = "";
    private String f8505 = "";
    private String f8506 = "";
    private String f8507 = "";
    private String f8508 = "";
    private String f8508a = "";
    private String f8508b = "";
    private String f8508c = "";
    private String f8508d = "";
    private String f8508e = "";
    private String f8508f = "";
    private String f850896 = "";
    private String f850896x = "";
    private String f8509 = "";
    private String f8510h = "";
    private String f8510m = "";
    private String f8511 = "";
    private String f8601 = "";
    private String f8602 = "";
    private String f8603 = "";
    private String f8604 = "";
    private String f8605 = "";
    private String f8606 = "";
    private String f8607 = "";
    private String f8608 = "";
    private String f8608a = "";
    private String f8608b = "";
    private String f8608c = "";
    private String f8608d = "";
    private String f8608e = "";
    private String f8608f = "";
    private String f860896 = "";
    private String f860896x = "";
    private String f8609 = "";
    private String f8610h = "";
    private String f8610m = "";
    private String f8611 = "";
    private String f8701 = "";
    private String f8702 = "";
    private String f8703 = "";
    private String f8704 = "";
    private String f8705 = "";
    private String f8706 = "";
    private String f8707 = "";
    private String f8708 = "";
    private String f8708a = "";
    private String f8708b = "";
    private String f8708c = "";
    private String f8708d = "";
    private String f8708e = "";
    private String f8708f = "";
    private String f870896 = "";
    private String f870896x = "";
    private String f8709 = "";
    private String f8710h = "";
    private String f8710m = "";
    private String f8711 = "";
    private String f9101 = "";
    private String f9102 = "";
    private String f9103 = "";
    private String f9201 = "";
    private String f9202 = "";
    private String f9203 = "";
    private String f9203a = "";
    private String f9203b = "";
    private String f9203c = "";
    private String f9203d = "";
    private String f9203e = "";
    private String f9203f = "";
    private String f9203g = "";
    private String f9203h = "";
    private String f9203i = "";
    private String f920396 = "";
    private String f920396x = "";
    private String f9204 = "";
    private String f9204hx = "";
    private String f9204mx = "";
    private String f9204dx = "";
    private String f9301 = "";
    private String f9302 = "";
    private String f9303 = "";
    private String f9304 = "";
    private String f9305a = "";
    private String f9305b = "";
    private String f9306 = "";
    private String f9307 = "";
    private String f9308 = "";
    private String f9309 = "";
    private String f9310 = "";
    private String f9311 = "";
    private String f9312 = "";
    private String f9313 = "";
    private String f9313a = "";
    private String f9313b = "";
    private String f9313c = "";
    private String f9313d = "";
    private String f9313e = "";
    private String f9314 = "";
    private String f9315 = "";
    private String f9316 = "";
    private String f9317 = "";
    private String f9318 = "";
    private String f9319 = "";
    private String f9320 = "";
    private String f9321 = "";
    private String f9322 = "";
    private String f9401 = "";
    private String f9402 = "";
    private String f9402a = "";
    private String f9402b = "";
    private String f9402c = "";
    private String f9402d = "";
    private String f9402e = "";
    private String f9402f = "";
    private String f9402g = "";
    private String f9402h = "";
    private String f9402i = "";
    private String f9402j = "";
    private String f9402k = "";
    private String f940296 = "";
    private String f940296x = "";
    private String f9403 = "";
    private String f9404 = "";
    private String f9405 = "";
    private String f940596x = "";
    private String f9406 = "";
    private String f9406mx = "";
    private String f9406hx = "";
    private String f9406dx = "";
    private String f9407 = "";
    private String f9408 = "";
    private String f9409 = "";
    private String f9410 = "";
    private String f9410a = "";
    private String f9410b = "";
    private String f9410c = "";
    private String f941096 = "";
    private String f941096x = "";
    private String f9411 = "";
    private String f9412 = "";
    private String f9412hx = "";
    private String f9412dx = "";
    private String f9413 = "";
    private String f9413a = "";
    private String f9413b = "";
    private String f9413c = "";
    private String f9413d = "";
    private String f9413e = "";
    private String f9413f = "";
    private String f9413g = "";
    private String f9413h = "";
    private String f941396 = "";
    private String f941396x = "";
    private String f9501 = "";
    private String f950196x = "";
    private String f9502 = "";
    private String f9503 = "";
    private String f950396x = "";
    private String f9504 = "";
    private String f9505 = "";
    private String f9505a = "";
    private String f9505b = "";
    private String f9505c = "";
    private String f950596 = "";
    private String f950596x = "";
    private String f9601 = "";
    private String f9602 = "";
    private String f9602a = "";
    private String f9602b = "";
    private String f9602c = "";
    private String f9602d = "";
    private String f9602e = "";
    private String f9602f = "";
    private String f960296 = "";
    private String f960296x = "";
    private String f9603 = "";
    private String f9604d = "";
    private String f9604h = "";
    private String f9604m = "";
    private String f9605 = "";
    private String f9606 = "";
    private String f9606a = "";
    private String f9606b = "";
    private String f9606c = "";
    private String f9606d = "";
    private String f960696 = "";
    private String f960696x = "";
    private String f9607 = "";
    private String f9608 = "";
    private String f9609 = "";
    private String f9610 = "";
    private String f9610a = "";
    private String f9610b = "";
    private String f9610c = "";
    private String f9610d = "";
    private String f9610e = "";
    private String f9610f = "";
    private String f961096 = "";
    private String f961096x = "";


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


    public String getsF5() {
        return sF5;
    }

    public void setsF5(String sF5) {
        this.sF5 = sF5;
    }


    public String getsF6() {
        return sF6;
    }

    public void setsF6(String sF6) {
        this.sF6 = sF6;
    }


    public String getsF7() {
        return sF7;
    }

    public void setsF7(String sF7) {
        this.sF7 = sF7;
    }


    public String getsF8() {
        return sF8;
    }

    public void setsF8(String sF8) {
        this.sF8 = sF8;
    }


    public String getsF9() {
        return sF9;
    }

    public void setsF9(String sF9) {
        this.sF9 = sF9;
    }


    @Bindable
    public String getF2101() {
        return f2101;
    }

    public void setF2101(String f2101) {
        this.f2101 = f2101;
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
    public String getF2104() {
        return f2104;
    }

    public void setF2104(String f2104) {
        this.f2104 = f2104;
        notifyPropertyChanged(BR.f2104);
    }

    @Bindable
    public String getF2105() {
        return f2105;
    }

    public void setF2105(String f2105) {
        this.f2105 = f2105;
        notifyPropertyChanged(BR.f2105);
    }

    @Bindable
    public String getF2106() {
        return f2106;
    }

    public void setF2106(String f2106) {
        this.f2106 = f2106;
        notifyPropertyChanged(BR.f2106);
    }

    @Bindable
    public String getF2107() {
        return f2107;
    }

    public void setF2107(String f2107) {
        this.f2107 = f2107;
        notifyPropertyChanged(BR.f2107);
    }

    @Bindable
    public String getF2108() {
        return f2108;
    }

    public void setF2108(String f2108) {
        this.f2108 = f2108;
        notifyPropertyChanged(BR.f2108);
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
        notifyPropertyChanged(BR.f2203);
    }

    @Bindable
    public String getF2301() {
        return f2301;
    }

    public void setF2301(String f2301) {
        this.f2301 = f2301;
        setF2302a(f2301.equals("2") ? "" : this.f2302a);
        setF2302b(f2301.equals("2") ? "" : this.f2302b);
        setF2302c(f2301.equals("2") ? "" : this.f2302c);
        setF2302d(f2301.equals("2") ? "" : this.f2302d);
        setF2302e(f2301.equals("2") ? "" : this.f2302e);
        setF2302f(f2301.equals("2") ? "" : this.f2302f);
        setF2302g(f2301.equals("2") ? "" : this.f2302g);
        setF2302h(f2301.equals("2") ? "" : this.f2302h);
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
    public String getF2302a() {
        return f2302a;
    }

    public void setF2302a(String f2302a) {
        if (this.f2302a.equals(f2302a)) return; // for all checkboxes
        this.f2302a = f2302a;
        notifyPropertyChanged(BR.f2302a);
    }

    @Bindable
    public String getF2302b() {
        return f2302b;
    }

    public void setF2302b(String f2302b) {
        if (this.f2302b.equals(f2302b)) return; // for all checkboxes
        this.f2302b = f2302b;
        notifyPropertyChanged(BR.f2302b);
    }

    @Bindable
    public String getF2302c() {
        return f2302c;
    }

    public void setF2302c(String f2302c) {
        if (this.f2302c.equals(f2302c)) return; // for all checkboxes
        this.f2302c = f2302c;
        notifyPropertyChanged(BR.f2302c);
    }

    @Bindable
    public String getF2302d() {
        return f2302d;
    }

    public void setF2302d(String f2302d) {
        if (this.f2302d.equals(f2302d)) return; // for all checkboxes
        this.f2302d = f2302d;
        notifyPropertyChanged(BR.f2302d);
    }

    @Bindable
    public String getF2302e() {
        return f2302e;
    }

    public void setF2302e(String f2302e) {
        if (this.f2302e.equals(f2302e)) return; // for all checkboxes
        this.f2302e = f2302e;
        notifyPropertyChanged(BR.f2302e);
    }

    @Bindable
    public String getF2302f() {
        return f2302f;
    }

    public void setF2302f(String f2302f) {
        if (this.f2302f.equals(f2302f)) return; // for all checkboxes
        this.f2302f = f2302f;
        notifyPropertyChanged(BR.f2302f);
    }

    @Bindable
    public String getF2302g() {
        return f2302g;
    }

    public void setF2302g(String f2302g) {
        if (this.f2302g.equals(f2302g)) return; // for all checkboxes
        this.f2302g = f2302g;
        notifyPropertyChanged(BR.f2302g);
    }

    @Bindable
    public String getF2302h() {
        return f2302h;
    }

    public void setF2302h(String f2302h) {
        if (this.f2302h.equals(f2302h)) return; // for all checkboxes
        this.f2302h = f2302h;
        notifyPropertyChanged(BR.f2302h);
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
        setF2401(f2304.equals("2") ? this.f2401 : "");
        setF2402(f2304.equals("2") ? this.f2402 : "");
        setF2403(f2304.equals("2") ? this.f2403 : "");
        notifyPropertyChanged(BR.f2304);
    }

    @Bindable
    public String getF2401() {
        return f2401;
    }

    public void setF2401(String f2401) {
        this.f2401 = f2401;
        setF2402(f2401.equals("1") ? this.f2402 : "");
        setF2403(f2401.equals("2") ? this.f2403 : "");
        notifyPropertyChanged(BR.f2401);
    }

    @Bindable
    public String getF2402() {
        return f2402;
    }

    public void setF2402(String f2402) {
        this.f2402 = f2402;
        setF240296x(f2402.equals("96") ? this.f240296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f2402);
    }

    @Bindable
    public String getF240296x() {
        return f240296x;
    }

    public void setF240296x(String f240296x) {
        this.f240296x = f240296x;
        notifyPropertyChanged(BR.f240296x);
    }

    @Bindable
    public String getF2403() {
        return f2403;
    }

    public void setF2403(String f2403) {
        this.f2403 = f2403;
        notifyPropertyChanged(BR.f2403);
    }

    @Bindable
    public String getF3101() {
        return f3101;
    }

    public void setF3101(String f3101) {
        this.f3101 = f3101;
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
    public String getF3106() {
        return f3106;
    }

    public void setF3106(String f3106) {
        this.f3106 = f3106;
        notifyPropertyChanged(BR.f3106);
    }

    @Bindable
    public String getF3107() {
        return f3107;
    }

    public void setF3107(String f3107) {
        this.f3107 = f3107;
        notifyPropertyChanged(BR.f3107);
    }

    @Bindable
    public String getF3108() {
        return f3108;
    }

    public void setF3108(String f3108) {
        this.f3108 = f3108;
        notifyPropertyChanged(BR.f3108);
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
    public String getF3301() {
        return f3301;
    }

    public void setF3301(String f3301) {
        this.f3301 = f3301;
        setF3302a(f3301.equals("2") ? "" : this.f3302a);
        setF3302b(f3301.equals("2") ? "" : this.f3302b);
        setF3302c(f3301.equals("2") ? "" : this.f3302c);
        setF3302d(f3301.equals("2") ? "" : this.f3302d);
        setF3302e(f3301.equals("2") ? "" : this.f3302e);
        setF3302f(f3301.equals("2") ? "" : this.f3302f);
        setF3302g(f3301.equals("2") ? "" : this.f3302g);
        setF3302h(f3301.equals("2") ? "" : this.f3302h);
        notifyPropertyChanged(BR.f3301);
    }

    @Bindable
    public String getF3302() {
        return f3302;
    }

    public void setF3302(String f3302) {
        this.f3302 = f3302;
        notifyPropertyChanged(BR.f3302);
    }

    @Bindable
    public String getF3302a() {
        return f3302a;
    }

    public void setF3302a(String f3302a) {
        if (this.f3302a.equals(f3302a)) return; // for all checkboxes
        this.f3302a = f3302a;
        notifyPropertyChanged(BR.f3302a);
    }

    @Bindable
    public String getF3302b() {
        return f3302b;
    }

    public void setF3302b(String f3302b) {
        if (this.f3302b.equals(f3302b)) return; // for all checkboxes
        this.f3302b = f3302b;
        notifyPropertyChanged(BR.f3302b);
    }

    @Bindable
    public String getF3302c() {
        return f3302c;
    }

    public void setF3302c(String f3302c) {
        if (this.f3302c.equals(f3302c)) return; // for all checkboxes
        this.f3302c = f3302c;
        notifyPropertyChanged(BR.f3302c);
    }

    @Bindable
    public String getF3302d() {
        return f3302d;
    }

    public void setF3302d(String f3302d) {
        if (this.f3302d.equals(f3302d)) return; // for all checkboxes
        this.f3302d = f3302d;
        notifyPropertyChanged(BR.f3302d);
    }

    @Bindable
    public String getF3302e() {
        return f3302e;
    }

    public void setF3302e(String f3302e) {
        if (this.f3302e.equals(f3302e)) return; // for all checkboxes
        this.f3302e = f3302e;
        notifyPropertyChanged(BR.f3302e);
    }

    @Bindable
    public String getF3302f() {
        return f3302f;
    }

    public void setF3302f(String f3302f) {
        if (this.f3302f.equals(f3302f)) return; // for all checkboxes
        this.f3302f = f3302f;
        notifyPropertyChanged(BR.f3302f);
    }

    @Bindable
    public String getF3302g() {
        return f3302g;
    }

    public void setF3302g(String f3302g) {
        if (this.f3302g.equals(f3302g)) return; // for all checkboxes
        this.f3302g = f3302g;
        notifyPropertyChanged(BR.f3302g);
    }

    @Bindable
    public String getF3302h() {
        return f3302h;
    }

    public void setF3302h(String f3302h) {
        if (this.f3302h.equals(f3302h)) return; // for all checkboxes
        this.f3302h = f3302h;
        notifyPropertyChanged(BR.f3302h);
    }

    @Bindable
    public String getF3302i() {
        return f3302i;
    }

    public void setF3302i(String f3302i) {
        if (this.f3302i.equals(f3302i)) return; // for all checkboxes
        this.f3302i = f3302i;
        notifyPropertyChanged(BR.f3302i);
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
    public String getF3304() {
        return f3304;
    }

    public void setF3304(String f3304) {
        this.f3304 = f3304;
        notifyPropertyChanged(BR.f3304);
    }

    @Bindable
    public String getF3401() {
        return f3401;
    }

    public void setF3401(String f3401) {
        this.f3401 = f3401;
        setF3402(f3304.equals("1") ? this.f3402 : "");
        setF3403(f3304.equals("2") ? this.f3403 : "");
        setF3404(f3304.equals("2") ? this.f3404 : "");
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
    public String getF5101() {
        return f5101;
    }

    public void setF5101(String f5101) {
        this.f5101 = f5101;
        notifyPropertyChanged(BR.f5101);
    }

    @Bindable
    public String getF5102() {
        return f5102;
    }

    public void setF5102(String f5102) {
        this.f5102 = f5102;
        notifyPropertyChanged(BR.f5102);
    }

    @Bindable
    public String getF5103() {
        return f5103;
    }

    public void setF5103(String f5103) {
        this.f5103 = f5103;
        notifyPropertyChanged(BR.f5103);
    }

    @Bindable
    public String getF5104() {
        return f5104;
    }

    public void setF5104(String f5104) {
        this.f5104 = f5104;
        notifyPropertyChanged(BR.f5104);
    }

    @Bindable
    public String getF5105() {
        return f5105;
    }

    public void setF5105(String f5105) {
        this.f5105 = f5105;
        notifyPropertyChanged(BR.f5105);
    }

    @Bindable
    public String getF5106() {
        return f5106;
    }

    public void setF5106(String f5106) {
        this.f5106 = f5106;
        notifyPropertyChanged(BR.f5106);
    }

    @Bindable
    public String getF5107() {
        return f5107;
    }

    public void setF5107(String f5107) {
        this.f5107 = f5107;
        notifyPropertyChanged(BR.f5107);
    }

    @Bindable
    public String getF5108() {
        return f5108;
    }

    public void setF5108(String f5108) {
        this.f5108 = f5108;
        notifyPropertyChanged(BR.f5108);
    }

    @Bindable
    public String getF5109() {
        return f5109;
    }

    public void setF5109(String f5109) {
        this.f5109 = f5109;
        notifyPropertyChanged(BR.f5109);
    }

    @Bindable
    public String getF5110() {
        return f5110;
    }

    public void setF5110(String f5110) {
        this.f5110 = f5110;
        notifyPropertyChanged(BR.f5110);
    }

    @Bindable
    public String getF5111() {
        return f5111;
    }

    public void setF5111(String f5111) {
        this.f5111 = f5111;
        notifyPropertyChanged(BR.f5111);
    }

    @Bindable
    public String getF5112() {
        return f5112;
    }

    public void setF5112(String f5112) {
        this.f5112 = f5112;
        notifyPropertyChanged(BR.f5112);
    }

    @Bindable
    public String getF5113() {
        return f5113;
    }

    public void setF5113(String f5113) {
        this.f5113 = f5113;
        notifyPropertyChanged(BR.f5113);
    }

    @Bindable
    public String getF5201() {
        return f5201;
    }

    public void setF5201(String f5201) {
        this.f5201 = f5201;
        notifyPropertyChanged(BR.f5201);
    }

    @Bindable
    public String getF5202() {
        return f5202;
    }

    public void setF5202(String f5202) {
        this.f5202 = f5202;
        notifyPropertyChanged(BR.f5202);
    }

    @Bindable
    public String getF5203d() {
        return f5203d;
    }

    public void setF5203d(String f5203d) {
        this.f5203d = f5203d;
        notifyPropertyChanged(BR.f5203d);
    }

    @Bindable
    public String getF5203m() {
        return f5203m;
    }

    public void setF5203m(String f5203m) {
        this.f5203m = f5203m;
        notifyPropertyChanged(BR.f5203m);
    }

    @Bindable
    public String getF5203y() {
        return f5203y;
    }

    public void setF5203y(String f5203y) {
        this.f5203y = f5203y;
        notifyPropertyChanged(BR.f5203y);
    }

    @Bindable
    public String getF5204h() {
        return f5204h;
    }

    public void setF5204h(String f5204h) {
        this.f5204h = f5204h;
        notifyPropertyChanged(BR.f5204h);
    }

    @Bindable
    public String getF5204m() {
        return f5204m;
    }

    public void setF5204m(String f5204m) {
        this.f5204m = f5204m;
        notifyPropertyChanged(BR.f5204m);
    }

    @Bindable
    public String getF5205() {
        return f5205;
    }

    public void setF5205(String f5205) {
        this.f5205 = f5205;
        notifyPropertyChanged(BR.f5205);
    }

    @Bindable
    public String getF5206() {
        return f5206;
    }

    public void setF5206(String f5206) {
        this.f5206 = f5206;
        notifyPropertyChanged(BR.f5206);
    }

    @Bindable
    public String getF5207() {
        return f5207;
    }

    public void setF5207(String f5207) {
        this.f5207 = f5207;
        setF5208(f5207.equals("2") ? this.f5208 : "");
        notifyPropertyChanged(BR.f5207);
    }

    @Bindable
    public String getF5208() {
        return f5208;
    }

    public void setF5208(String f5208) {
        this.f5208 = f5208;
        notifyPropertyChanged(BR.f5208);
    }

    @Bindable
    public String getF5209() {
        return f5209;
    }

    public void setF5209(String f5209) {
        this.f5209 = f5209;
        notifyPropertyChanged(BR.f5209);
    }

    @Bindable
    public String getF5210() {
        return f5210;
    }

    public void setF5210(String f5210) {
        this.f5210 = f5210;
        notifyPropertyChanged(BR.f5210);
    }

    @Bindable
    public String getF5211() {
        return f5211;
    }

    public void setF5211(String f5211) {
        this.f5211 = f5211;
        notifyPropertyChanged(BR.f5211);
    }

    @Bindable
    public String getF5212() {
        return f5212;
    }

    public void setF5212(String f5212) {
        this.f5212 = f5212;
        notifyPropertyChanged(BR.f5212);
    }

    @Bindable
    public String getF5213() {
        return f5213;
    }

    public void setF5213(String f5213) {
        this.f5213 = f5213;
        setF5214(f5213.equals("1") ? this.f5214 : "");
        notifyPropertyChanged(BR.f5213);
    }

    @Bindable
    public String getF5214() {
        return f5214;
    }

    public void setF5214(String f5214) {
        this.f5214 = f5214;
        notifyPropertyChanged(BR.f5214);
    }

    @Bindable
    public String getF5215a() {
        return f5215a;
    }

    public void setF5215a(String f5215a) {
        this.f5215a = f5215a;
        notifyPropertyChanged(BR.f5215a);
    }

    @Bindable
    public String getF5215b() {
        return f5215b;
    }

    public void setF5215b(String f5215b) {
        this.f5215b = f5215b;
        notifyPropertyChanged(BR.f5215b);
    }

    @Bindable
    public String getF5215c() {
        return f5215c;
    }

    public void setF5215c(String f5215c) {
        this.f5215c = f5215c;
        notifyPropertyChanged(BR.f5215c);
    }

    @Bindable
    public String getF5215d() {
        return f5215d;
    }

    public void setF5215d(String f5215d) {
        this.f5215d = f5215d;
        notifyPropertyChanged(BR.f5215d);
    }

    @Bindable
    public String getF5215e() {
        return f5215e;
    }

    public void setF5215e(String f5215e) {
        this.f5215e = f5215e;
        notifyPropertyChanged(BR.f5215e);
    }

    @Bindable
    public String getF5215f() {
        return f5215f;
    }

    public void setF5215f(String f5215f) {
        this.f5215f = f5215f;
        notifyPropertyChanged(BR.f5215f);
    }

    @Bindable
    public String getF5215g() {
        return f5215g;
    }

    public void setF5215g(String f5215g) {
        this.f5215g = f5215g;
        notifyPropertyChanged(BR.f5215g);
    }

    @Bindable
    public String getF5215h() {
        return f5215h;
    }

    public void setF5215h(String f5215h) {
        this.f5215h = f5215h;
        notifyPropertyChanged(BR.f5215h);
    }

    @Bindable
    public String getF5215i() {
        return f5215i;
    }

    public void setF5215i(String f5215i) {
        this.f5215i = f5215i;
        notifyPropertyChanged(BR.f5215i);
    }

    @Bindable
    public String getF5215j() {
        return f5215j;
    }

    public void setF5215j(String f5215j) {
        this.f5215j = f5215j;
        notifyPropertyChanged(BR.f5215j);
    }

    @Bindable
    public String getF521596() {
        return f521596;
    }

    public void setF521596(String f521596) {
        this.f521596 = f521596;
        notifyPropertyChanged(BR.f521596);
    }

    @Bindable
    public String getF5216() {
        return f5216;
    }

    public void setF5216(String f5216) {
        this.f5216 = f5216;
        notifyPropertyChanged(BR.f5216);
    }

    @Bindable
    public String getF5217() {
        return f5217;
    }

    public void setF5217(String f5217) {
        this.f5217 = f5217;
        notifyPropertyChanged(BR.f5217);
    }

    @Bindable
    public String getF5218() {
        return f5218;
    }

    public void setF5218(String f5218) {
        this.f5218 = f5218;
        notifyPropertyChanged(BR.f5218);
    }

    @Bindable
    public String getF5219() {
        return f5219;
    }

    public void setF5219(String f5219) {
        this.f5219 = f5219;
        notifyPropertyChanged(BR.f5219);
    }

    @Bindable
    public String getF5220() {
        return f5220;
    }

    public void setF5220(String f5220) {
        this.f5220 = f5220;
        setF5221(f5220.equals("1") ? this.f5221 : "");
        setF5222d(f5220.equals("1") ? this.f5222d : "");
        setF5222w(f5220.equals("1") ? this.f5222w : "");
        notifyPropertyChanged(BR.f5220);
    }

    @Bindable
    public String getF5221() {
        return f5221;
    }

    public void setF5221(String f5221) {
        this.f5221 = f5221;
        notifyPropertyChanged(BR.f5221);
    }

    @Bindable
    public String getF5221wx() {
        return f5221wx;
    }

    public void setF5221wx(String f5221wx) {
        this.f5221wx = f5221wx;
        notifyPropertyChanged(BR.f5221wx);
    }

    @Bindable
    public String getF5221dx() {
        return f5221dx;
    }

    public void setF5221dx(String f5221dx) {
        this.f5221dx = f5221dx;
        notifyPropertyChanged(BR.f5221dx);
    }

    @Bindable
    public String getF5222w() {
        return f5222w;
    }

    public void setF5222w(String f5222w) {
        this.f5222w = f5222w;
        notifyPropertyChanged(BR.f5222w);
    }

    @Bindable
    public String getF5222d() {
        return f5222d;
    }

    public void setF5222d(String f5222d) {
        this.f5222d = f5222d;
        notifyPropertyChanged(BR.f5222d);
    }

    @Bindable
    public String getF5301() {
        return f5301;
    }

    public void setF5301(String f5301) {
        this.f5301 = f5301;
        notifyPropertyChanged(BR.f5301);
    }

    @Bindable
    public String getF5302() {
        return f5302;
    }

    public void setF5302(String f5302) {
        this.f5302 = f5302;
        notifyPropertyChanged(BR.f5302);
    }

    @Bindable
    public String getF5303() {
        return f5303;
    }

    public void setF5303(String f5303) {
        this.f5303 = f5303;
        notifyPropertyChanged(BR.f5303);
    }

    @Bindable
    public String getF5304() {
        return f5304;
    }

    public void setF5304(String f5304) {
        this.f5304 = f5304;
        notifyPropertyChanged(BR.f5304);
    }

    @Bindable
    public String getF5305() {
        return f5305;
    }

    public void setF5305(String f5305) {
        this.f5305 = f5305;
        notifyPropertyChanged(BR.f5305);
    }

    @Bindable
    public String getF5306() {
        return f5306;
    }

    public void setF5306(String f5306) {
        this.f5306 = f5306;
        setF5307(f5306.equals("2") ? this.f5307 : "");
        notifyPropertyChanged(BR.f5306);
    }

    @Bindable
    public String getF5307() {
        return f5307;
    }

    public void setF5307(String f5307) {
        this.f5307 = f5307;
        setF530796x(f5307.equals("96") ? this.f530796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f5307);
    }

    @Bindable
    public String getF530796x() {
        return f530796x;
    }

    public void setF530796x(String f530796x) {
        this.f530796x = f530796x;
        notifyPropertyChanged(BR.f530796x);
    }

    @Bindable
    public String getF5308() {
        return f5308;
    }

    public void setF5308(String f5308) {
        this.f5308 = f5308;
        notifyPropertyChanged(BR.f5308);
    }

    @Bindable
    public String getF5309() {
        return f5309;
    }

    public void setF5309(String f5309) {
        this.f5309 = f5309;
        notifyPropertyChanged(BR.f5309);
    }

    @Bindable
    public String getF5310() {
        return f5310;
    }

    public void setF5310(String f5310) {
        this.f5310 = f5310;
        notifyPropertyChanged(BR.f5310);
    }

    @Bindable
    public String getF5311() {
        return f5311;
    }

    public void setF5311(String f5311) {
        this.f5311 = f5311;
        notifyPropertyChanged(BR.f5311);
    }

    @Bindable
    public String getF5312() {
        return f5312;
    }

    public void setF5312(String f5312) {
        this.f5312 = f5312;
        notifyPropertyChanged(BR.f5312);
    }

    @Bindable
    public String getF5313() {
        return f5313;
    }

    public void setF5313(String f5313) {
        this.f5313 = f5313;
        notifyPropertyChanged(BR.f5313);
    }

    @Bindable
    public String getF531396x() {
        return f531396x;
    }

    public void setF531396x(String f531396x) {
        this.f531396x = f531396x;
        notifyPropertyChanged(BR.f531396x);
    }

    @Bindable
    public String getF5314() {
        return f5314;
    }

    public void setF5314(String f5314) {
        this.f5314 = f5314;
        setF5315a(f5314.equals("1") ? this.f5315a : "");
        setF5315b(f5314.equals("1") ? this.f5315b : "");
        setF5315c(f5314.equals("1") ? this.f5315c : "");
        setF5315d(f5314.equals("1") ? this.f5315d : "");
        setF5315e(f5314.equals("1") ? this.f5315e : "");
        setF5315f(f5314.equals("1") ? this.f5315f : "");
        setF531596(f5314.equals("1") ? this.f531596 : "");
        setF531598(f5314.equals("1") ? this.f531598 : "");
        notifyPropertyChanged(BR.f5314);
    }

    @Bindable
    public String getF5315() {
        return f5315;
    }

    public void setF5315(String f5315) {
        this.f5315 = f5315;
        notifyPropertyChanged(BR.f5315);
    }

    @Bindable
    public String getF5315a() {
        return f5315a;
    }

    public void setF5315a(String f5315a) {
        if (this.f5315a.equals(f5315a)) return; // for all checkboxes
        this.f5315a = f5315a;
        notifyPropertyChanged(BR.f5315a);
    }

    @Bindable
    public String getF5315b() {
        return f5315b;
    }

    public void setF5315b(String f5315b) {
        if (this.f5315b.equals(f5315b)) return; // for all checkboxes
        this.f5315b = f5315b;
        notifyPropertyChanged(BR.f5315b);
    }

    @Bindable
    public String getF5315c() {
        return f5315c;
    }

    public void setF5315c(String f5315c) {
        if (this.f5315c.equals(f5315c)) return; // for all checkboxes
        this.f5315c = f5315c;
        notifyPropertyChanged(BR.f5315c);
    }

    @Bindable
    public String getF5315d() {
        return f5315d;
    }

    public void setF5315d(String f5315d) {
        if (this.f5315d.equals(f5315d)) return; // for all checkboxes
        this.f5315d = f5315d;
        notifyPropertyChanged(BR.f5315d);
    }

    @Bindable
    public String getF5315e() {
        return f5315e;
    }

    public void setF5315e(String f5315e) {
        if (this.f5315e.equals(f5315e)) return; // for all checkboxes
        this.f5315e = f5315e;
        notifyPropertyChanged(BR.f5315e);
    }

    @Bindable
    public String getF5315f() {
        return f5315f;
    }

    public void setF5315f(String f5315f) {
        if (this.f5315f.equals(f5315f)) return; // for all checkboxes
        this.f5315f = f5315f;
        notifyPropertyChanged(BR.f5315f);
    }

    @Bindable
    public String getF531598() {
        return f531598;
    }

    public void setF531598(String f531598) {
        if (this.f531598.equals(f531598)) return; // for all checkboxes
        this.f531598 = f531598;
        setF5315a(f531598.equals("98") ? "" : this.f5315a);
        setF5315b(f531598.equals("98") ? "" : this.f5315b);
        setF5315c(f531598.equals("98") ? "" : this.f5315c);
        setF5315d(f531598.equals("98") ? "" : this.f5315d);
        setF5315e(f531598.equals("98") ? "" : this.f5315e);
        setF5315f(f531598.equals("98") ? "" : this.f5315f);
        setF531596(f531598.equals("98") ? "" : this.f531596);
        notifyPropertyChanged(BR.f531598);
    }

    @Bindable
    public String getF531596() {
        return f531596;
    }

    public void setF531596(String f531596) {
        if (this.f531596.equals(f531596)) return; // for all checkboxes
        this.f531596 = f531596;
        setF531596x(f531596.equals("96") ? this.f531596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f531596);
    }

    @Bindable
    public String getF531596x() {
        return f531596x;
    }

    public void setF531596x(String f531596x) {
        this.f531596x = f531596x;
        notifyPropertyChanged(BR.f531596x);
    }

    @Bindable
    public String getF5316() {
        return f5316;
    }

    public void setF5316(String f5316) {
        this.f5316 = f5316;
        notifyPropertyChanged(BR.f5316);
    }

    @Bindable
    public String getF5317() {
        return f5317;
    }

    public void setF5317(String f5317) {
        this.f5317 = f5317;
        setF531796x(f5317.equals("96") ? this.f531796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f5317);
    }

    @Bindable
    public String getF531796x() {
        return f531796x;
    }

    public void setF531796x(String f531796x) {
        this.f531796x = f531796x;
        notifyPropertyChanged(BR.f531796x);
    }

    @Bindable
    public String getF5318() {
        return f5318;
    }

    public void setF5318(String f5318) {
        this.f5318 = f5318;
        setF5319a(!f5318.equals("1") ? this.f5319a : "");
        setF5319b(!f5318.equals("1") ? this.f5319b : "");
        setF5319c(!f5318.equals("1") ? this.f5319c : "");
        setF5319d(!f5318.equals("1") ? this.f5319d : "");
        setF531996(!f5318.equals("1") ? this.f531996 : "");
        notifyPropertyChanged(BR.f5318);
    }

    @Bindable
    public String getF5319() {
        return f5319;
    }

    public void setF5319(String f5319) {
        this.f5319 = f5319;
        notifyPropertyChanged(BR.f5319);
    }

    @Bindable
    public String getF5319a() {
        return f5319a;
    }

    public void setF5319a(String f5319a) {
        if (this.f5319a.equals(f5319a)) return; // for all checkboxes
        this.f5319a = f5319a;
        notifyPropertyChanged(BR.f5319a);
    }

    @Bindable
    public String getF5319b() {
        return f5319b;
    }

    public void setF5319b(String f5319b) {
        if (this.f5319b.equals(f5319b)) return; // for all checkboxes
        this.f5319b = f5319b;
        notifyPropertyChanged(BR.f5319b);
    }

    @Bindable
    public String getF5319c() {
        return f5319c;
    }

    public void setF5319c(String f5319c) {
        if (this.f5319c.equals(f5319c)) return; // for all checkboxes
        this.f5319c = f5319c;
        notifyPropertyChanged(BR.f5319c);
    }

    @Bindable
    public String getF5319d() {
        return f5319d;
    }

    public void setF5319d(String f5319d) {
        if (this.f5319d.equals(f5319d)) return; // for all checkboxes
        this.f5319d = f5319d;
        notifyPropertyChanged(BR.f5319d);
    }

    @Bindable
    public String getF531996() {
        return f531996;
    }

    public void setF531996(String f531996) {
        if (this.f531996.equals(f531996)) return; // for all checkboxes
        setF531996x(f531996.equals("96") ? this.f531996x : ""); // for all skips, mention all skipped questions
        this.f531996 = f531996;
        notifyPropertyChanged(BR.f531996);
    }

    @Bindable
    public String getF531996x() {
        return f531996x;
    }

    public void setF531996x(String f531996x) {
        this.f531996x = f531996x;
        notifyPropertyChanged(BR.f531996x);
    }

    @Bindable
    public String getF5320() {
        return f5320;
    }

    public void setF5320(String f5320) {
        this.f5320 = f5320;
        setF532096x(f5320.equals("96") ? this.f532096x : ""); // for all skips, mention all skipped questions
        setF5321a(!f5320.equals("5") ? this.f5321a : "");
        setF5321b(!f5320.equals("5") ? this.f5321b : "");
        setF5321c(!f5320.equals("5") ? this.f5321c : "");
        setF5321d(!f5320.equals("5") ? this.f5321d : "");
        setF5321e(!f5320.equals("5") ? this.f5321e : "");
        setF532196(!f5320.equals("5") ? this.f532196 : "");
        notifyPropertyChanged(BR.f5320);
    }

    @Bindable
    public String getF532096x() {
        return f532096x;
    }

    public void setF532096x(String f532096x) {
        this.f532096x = f532096x;
        notifyPropertyChanged(BR.f532096x);
    }

    @Bindable
    public String getF5321() {
        return f5321;
    }

    public void setF5321(String f5321) {
        this.f5321 = f5321;
        notifyPropertyChanged(BR.f5321);
    }

    @Bindable
    public String getF5321a() {
        return f5321a;
    }

    public void setF5321a(String f5321a) {
        if (this.f5321a.equals(f5321a)) return; // for all checkboxes
        this.f5321a = f5321a;
        notifyPropertyChanged(BR.f5321a);
    }

    @Bindable
    public String getF5321b() {
        return f5321b;
    }

    public void setF5321b(String f5321b) {
        if (this.f5321b.equals(f5321b)) return; // for all checkboxes
        this.f5321b = f5321b;
        notifyPropertyChanged(BR.f5321b);
    }

    @Bindable
    public String getF5321c() {
        return f5321c;
    }

    public void setF5321c(String f5321c) {
        if (this.f5321c.equals(f5321c)) return; // for all checkboxes
        this.f5321c = f5321c;
        notifyPropertyChanged(BR.f5321c);
    }

    @Bindable
    public String getF5321d() {
        return f5321d;
    }

    public void setF5321d(String f5321d) {
        if (this.f5321d.equals(f5321d)) return; // for all checkboxes
        this.f5321d = f5321d;
        notifyPropertyChanged(BR.f5321d);
    }

    @Bindable
    public String getF5321e() {
        return f5321e;
    }

    public void setF5321e(String f5321e) {
        if (this.f5321e.equals(f5321e)) return; // for all checkboxes
        this.f5321e = f5321e;
        notifyPropertyChanged(BR.f5321e);
    }

    @Bindable
    public String getF532196() {
        return f532196;
    }

    public void setF532196(String f532196) {
        if (this.f532196.equals(f532196)) return; // for all checkboxes
        this.f532196 = f532196;
        setF532196x(f532196.equals("96") ? this.f532196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f532196);
    }

    @Bindable
    public String getF532196x() {
        return f532196x;
    }

    public void setF532196x(String f532196x) {
        this.f532196x = f532196x;
        notifyPropertyChanged(BR.f532196x);
    }

    @Bindable
    public String getF5322() {
        return f5322;
    }

    public void setF5322(String f5322) {
        setF5323(f5322.equals("1") ? this.f5323 : "");
        this.f5322 = f5322;
        notifyPropertyChanged(BR.f5322);
    }

    @Bindable
    public String getF5323() {
        return f5323;
    }

    public void setF5323(String f5323) {
        this.f5323 = f5323;
        notifyPropertyChanged(BR.f5323);
    }

    @Bindable
    public String getF5401() {
        return f5401;
    }

    public void setF5401(String f5401) {
        this.f5401 = f5401;
        notifyPropertyChanged(BR.f5401);
    }

    @Bindable
    public String getF5402() {
        return f5402;
    }

    public void setF5402(String f5402) {
        this.f5402 = f5402;
        notifyPropertyChanged(BR.f5402);
    }

    @Bindable
    public String getF5403() {
        return f5403;
    }

    public void setF5403(String f5403) {
        this.f5403 = f5403;
        notifyPropertyChanged(BR.f5403);
    }

    @Bindable
    public String getF5404() {
        return f5404;
    }

    public void setF5404(String f5404) {
        this.f5404 = f5404;
        notifyPropertyChanged(BR.f5404);
    }

    @Bindable
    public String getF5405() {
        return f5405;
    }

    public void setF5405(String f5405) {
        this.f5405 = f5405;
        notifyPropertyChanged(BR.f5405);
    }

    @Bindable
    public String getF5406() {
        return f5406;
    }

    public void setF5406(String f5406) {
        this.f5406 = f5406;
        notifyPropertyChanged(BR.f5406);
    }

    @Bindable
    public String getF5407() {
        return f5407;
    }

    public void setF5407(String f5407) {
        this.f5407 = f5407;
        notifyPropertyChanged(BR.f5407);
    }

    @Bindable
    public String getF5408() {
        return f5408;
    }

    public void setF5408(String f5408) {
        this.f5408 = f5408;
        notifyPropertyChanged(BR.f5408);
    }

    @Bindable
    public String getF5409() {
        return f5409;
    }

    public void setF5409(String f5409) {
        this.f5409 = f5409;
        setF540996x(f5409.equals("96") ? this.f540996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f5409);
    }

    @Bindable
    public String getF540996x() {
        return f540996x;
    }

    public void setF540996x(String f540996x) {
        this.f540996x = f540996x;
        notifyPropertyChanged(BR.f540996x);
    }

    @Bindable
    public String getF5410a() {
        return f5410a;
    }

    public void setF5410a(String f5410a) {
        this.f5410a = f5410a;
        notifyPropertyChanged(BR.f5410a);
    }

    @Bindable
    public String getF5410b() {
        return f5410b;
    }

    public void setF5410b(String f5410b) {
        this.f5410b = f5410b;
        notifyPropertyChanged(BR.f5410b);
    }

    @Bindable
    public String getF5411() {
        return f5411;
    }

    public void setF5411(String f5411) {
        this.f5411 = f5411;
        setF541196x(f5411.equals("96") ? this.f541196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f5411);
    }

    @Bindable
    public String getF541196x() {
        return f541196x;
    }

    public void setF541196x(String f541196x) {
        this.f541196x = f541196x;
        notifyPropertyChanged(BR.f541196x);
    }

    @Bindable
    public String getF5412() {
        return f5412;
    }

    public void setF5412(String f5412) {
        this.f5412 = f5412;
        notifyPropertyChanged(BR.f5412);
    }

    @Bindable
    public String getF5413() {
        return f5413;
    }

    public void setF5413(String f5413) {
        this.f5413 = f5413;
        notifyPropertyChanged(BR.f5413);
    }

    @Bindable
    public String getF5414a() {
        return f5414a;
    }

    public void setF5414a(String f5414a) {
        this.f5414a = f5414a;
        notifyPropertyChanged(BR.f5414a);
    }

    @Bindable
    public String getF5414b() {
        return f5414b;
    }

    public void setF5414b(String f5414b) {
        this.f5414b = f5414b;
        notifyPropertyChanged(BR.f5414b);
    }

    @Bindable
    public String getF5415() {
        return f5415;
    }

    public void setF5415(String f5415) {
        this.f5415 = f5415;
        notifyPropertyChanged(BR.f5415);
    }

    @Bindable
    public String getF5416() {
        return f5416;
    }

    public void setF5416(String f5416) {
        this.f5416 = f5416;
        notifyPropertyChanged(BR.f5416);
    }

    @Bindable
    public String getF5417() {
        return f5417;
    }

    public void setF5417(String f5417) {
        this.f5417 = f5417;
        notifyPropertyChanged(BR.f5417);
    }

    @Bindable
    public String getF6101() {
        return f6101;
    }

    public void setF6101(String f6101) {
        this.f6101 = f6101;
        notifyPropertyChanged(BR.f6101);
    }

    @Bindable
    public String getF6102() {
        return f6102;
    }

    public void setF6102(String f6102) {
        this.f6102 = f6102;
        notifyPropertyChanged(BR.f6102);
    }

    @Bindable
    public String getF6103() {
        return f6103;
    }

    public void setF6103(String f6103) {
        this.f6103 = f6103;
        notifyPropertyChanged(BR.f6103);
    }

    @Bindable
    public String getF4104() {
        return f4104;
    }

    public void setF4104(String f4104) {
        this.f4104 = f4104;
        notifyPropertyChanged(BR.f4104);
    }

    @Bindable
    public String getF6105() {
        return f6105;
    }

    public void setF6105(String f6105) {
        this.f6105 = f6105;
        notifyPropertyChanged(BR.f6105);
    }

    @Bindable
    public String getF6106() {
        return f6106;
    }

    public void setF6106(String f6106) {
        this.f6106 = f6106;
        notifyPropertyChanged(BR.f6106);
    }

    @Bindable
    public String getF6201() {
        return f6201;
    }

    public void setF6201(String f6201) {
        this.f6201 = f6201;
        notifyPropertyChanged(BR.f6201);
    }

    @Bindable
    public String getF6202() {
        return f6202;
    }

    public void setF6202(String f6202) {
        this.f6202 = f6202;
        setF6203(f6202.equals("2") ? this.f6203 : "");
        notifyPropertyChanged(BR.f6202);
    }

    @Bindable
    public String getF6203() {
        return f6203;
    }

    public void setF6203(String f6203) {
        this.f6203 = f6203;
        notifyPropertyChanged(BR.f6203);
    }

    @Bindable
    public String getF6204() {
        return f6204;
    }

    public void setF6204(String f6204) {
        this.f6204 = f6204;
        notifyPropertyChanged(BR.f6204);
    }

    @Bindable
    public String getF6205() {
        return f6205;
    }

    public void setF6205(String f6205) {
        this.f6205 = f6205;
        setF6206a(f6205.equals("2") ? this.f6206a : "");
        setF6206b(f6205.equals("2") ? this.f6206b : "");
        setF6206c(f6205.equals("2") ? this.f6206c : "");
        setF6206d(f6205.equals("2") ? this.f6206d : "");
        setF6206e(f6205.equals("2") ? this.f6206e : "");
        setF6206f(f6205.equals("2") ? this.f6206f : "");
        setF6206g(f6205.equals("2") ? this.f6206g : "");
        setF6206h(f6205.equals("2") ? this.f6206h : "");
        setF6206i(f6205.equals("2") ? this.f6206i : "");
        setF620696(f6205.equals("2") ? this.f620696 : "");
        setF6207(f6205.equals("2") ? this.f6207 : "");
        notifyPropertyChanged(BR.f6205);
    }

    @Bindable
    public String getF6206() {
        return f6206;
    }

    public void setF6206(String f6206) {
        this.f6206 = f6206;
        notifyPropertyChanged(BR.f6206);
    }

    @Bindable
    public String getF6206a() {
        return f6206a;
    }

    public void setF6206a(String f6206a) {
        if (this.f6206a.equals(f6206a)) return; // for all checkboxes
        this.f6206a = f6206a;
        notifyPropertyChanged(BR.f6206a);
    }

    @Bindable
    public String getF6206b() {
        return f6206b;
    }

    public void setF6206b(String f6206b) {
        if (this.f6206b.equals(f6206b)) return; // for all checkboxes
        this.f6206b = f6206b;
        notifyPropertyChanged(BR.f6206b);
    }

    @Bindable
    public String getF6206c() {
        return f6206c;
    }

    public void setF6206c(String f6206c) {
        if (this.f6206c.equals(f6206c)) return; // for all checkboxes
        this.f6206c = f6206c;
        notifyPropertyChanged(BR.f6206c);
    }

    @Bindable
    public String getF6206d() {
        return f6206d;
    }

    public void setF6206d(String f6206d) {
        if (this.f6206d.equals(f6206d)) return; // for all checkboxes
        this.f6206d = f6206d;
        notifyPropertyChanged(BR.f6206d);
    }

    @Bindable
    public String getF6206e() {
        return f6206e;
    }

    public void setF6206e(String f6206e) {
        if (this.f6206e.equals(f6206e)) return; // for all checkboxes
        this.f6206e = f6206e;
        notifyPropertyChanged(BR.f6206e);
    }

    @Bindable
    public String getF6206f() {
        return f6206f;
    }

    public void setF6206f(String f6206f) {
        if (this.f6206f.equals(f6206f)) return; // for all checkboxes
        this.f6206f = f6206f;
        notifyPropertyChanged(BR.f6206f);
    }

    @Bindable
    public String getF6206g() {
        return f6206g;
    }

    public void setF6206g(String f6206g) {
        if (this.f6206g.equals(f6206g)) return; // for all checkboxes
        this.f6206g = f6206g;
        notifyPropertyChanged(BR.f6206g);
    }

    @Bindable
    public String getF6206h() {
        return f6206h;
    }

    public void setF6206h(String f6206h) {
        if (this.f6206h.equals(f6206h)) return; // for all checkboxes
        this.f6206h = f6206h;
        notifyPropertyChanged(BR.f6206h);
    }

    @Bindable
    public String getF6206i() {
        return f6206i;
    }

    public void setF6206i(String f6206i) {
        if (this.f6206i.equals(f6206i)) return; // for all checkboxes
        this.f6206i = f6206i;
        notifyPropertyChanged(BR.f6206i);
    }

    @Bindable
    public String getF620696() {
        return f620696;
    }

    public void setF620696(String f620696) {
        if (this.f620696.equals(f620696)) return; // for all checkboxes
        this.f620696 = f620696;
        notifyPropertyChanged(BR.f620696);
    }

    @Bindable
    public String getF6207() {
        return f6207;
    }

    public void setF6207(String f6207) {
        this.f6207 = f6207;
        notifyPropertyChanged(BR.f6207);
    }

    @Bindable
    public String getF6301() {
        return f6301;
    }

    public void setF6301(String f6301) {
        this.f6301 = f6301;
        notifyPropertyChanged(BR.f6301);
    }

    @Bindable
    public String getF6302() {
        return f6302;
    }

    public void setF6302(String f6302) {
        this.f6302 = f6302;
        setF6303(f6302.equals("1") ? this.f6303 : "");
        notifyPropertyChanged(BR.f6302);
    }

    @Bindable
    public String getF6303() {
        return f6303;
    }

    public void setF6303(String f6303) {
        this.f6303 = f6303;
        notifyPropertyChanged(BR.f6303);
    }

    @Bindable
    public String getF6304() {
        return f6304;
    }

    public void setF6304(String f6304) {
        this.f6304 = f6304;
        setF6305(f6304.equals("1") ? this.f6305 : "");
        notifyPropertyChanged(BR.f6304);
    }

    @Bindable
    public String getF6305() {
        return f6305;
    }

    public void setF6305(String f6305) {
        this.f6305 = f6305;
        notifyPropertyChanged(BR.f6305);
    }

    @Bindable
    public String getF64011() {
        return f64011;
    }

    public void setF64011(String f64011) {
        this.f64011 = f64011;
        notifyPropertyChanged(BR.f64011);
    }

    @Bindable
    public String getF64012() {
        return f64012;
    }

    public void setF64012(String f64012) {
        this.f64012 = f64012;
        notifyPropertyChanged(BR.f64012);
    }

    @Bindable
    public String getF6402() {
        return f6402;
    }

    public void setF6402(String f6402) {
        this.f6402 = f6402;
        notifyPropertyChanged(BR.f6402);
    }

    @Bindable
    public String getF6403() {
        return f6403;
    }

    public void setF6403(String f6403) {
        this.f6403 = f6403;
        notifyPropertyChanged(BR.f6403);
    }

    @Bindable
    public String getF6404() {
        return f6404;
    }

    public void setF6404(String f6404) {
        this.f6404 = f6404;
        notifyPropertyChanged(BR.f6404);
    }

    @Bindable
    public String getF6405() {
        return f6405;
    }

    public void setF6405(String f6405) {
        this.f6405 = f6405;
        notifyPropertyChanged(BR.f6405);
    }

    @Bindable
    public String getF6406() {
        return f6406;
    }

    public void setF6406(String f6406) {
        this.f6406 = f6406;
        notifyPropertyChanged(BR.f6406);
    }

    @Bindable
    public String getF6407() {
        return f6407;
    }

    public void setF6407(String f6407) {
        this.f6407 = f6407;
        notifyPropertyChanged(BR.f6407);
    }

    @Bindable
    public String getF6408() {
        return f6408;
    }

    public void setF6408(String f6408) {
        this.f6408 = f6408;
        notifyPropertyChanged(BR.f6408);
    }

    @Bindable
    public String getF6409() {
        return f6409;
    }

    public void setF6409(String f6409) {
        this.f6409 = f6409;
        notifyPropertyChanged(BR.f6409);
    }

    @Bindable
    public String getF6410() {
        return f6410;
    }

    public void setF6410(String f6410) {
        this.f6410 = f6410;
        notifyPropertyChanged(BR.f6410);
    }

    @Bindable
    public String getF6411() {
        return f6411;
    }

    public void setF6411(String f6411) {
        this.f6411 = f6411;
        notifyPropertyChanged(BR.f6411);
    }

    @Bindable
    public String getF6412() {
        return f6412;
    }

    public void setF6412(String f6412) {
        this.f6412 = f6412;
        notifyPropertyChanged(BR.f6412);
    }

    @Bindable
    public String getF6413() {
        return f6413;
    }

    public void setF6413(String f6413) {
        this.f6413 = f6413;
        notifyPropertyChanged(BR.f6413);
    }

    @Bindable
    public String getF6414() {
        return f6414;
    }

    public void setF6414(String f6414) {
        this.f6414 = f6414;
        notifyPropertyChanged(BR.f6414);
    }

    @Bindable
    public String getF6415() {
        return f6415;
    }

    public void setF6415(String f6415) {
        this.f6415 = f6415;
        setF6416(f6415.equals("2") ? this.f6416 : "");
        setF6417(f6415.equals("2") ? this.f6417 : "");
        notifyPropertyChanged(BR.f6415);
    }

    @Bindable
    public String getF6416() {
        return f6416;
    }

    public void setF6416(String f6416) {
        this.f6416 = f6416;
        setF6417(f6416.equals("2") ? this.f6417 : "");
        notifyPropertyChanged(BR.f6416);
    }

    @Bindable
    public String getF6417() {
        return f6417;
    }

    public void setF6417(String f6417) {
        this.f6417 = f6417;
        notifyPropertyChanged(BR.f6417);
    }

    @Bindable
    public String getF6501() {
        return f6501;
    }

    public void setF6501(String f6501) {
        this.f6501 = f6501;
        notifyPropertyChanged(BR.f6501);
    }

    @Bindable
    public String getF650196x() {
        return f650196x;
    }

    public void setF650196x(String f650196x) {
        this.f650196x = f650196x;
        notifyPropertyChanged(BR.f650196x);
    }

    @Bindable
    public String getF6502() {
        return f6502;
    }

    public void setF6502(String f6502) {
        this.f6502 = f6502;
        setF6503a(!f6502.equals("1") ? this.f6503a : "");
        setF6503b(!f6502.equals("1") ? this.f6503b : "");
        setF6503c(!f6502.equals("1") ? this.f6503c : "");
        setF6503d(!f6502.equals("1") ? this.f6503d : "");
        setF650396(!f6502.equals("1") ? this.f650396 : "");
        notifyPropertyChanged(BR.f6502);
    }

    @Bindable
    public String getF6503() {
        return f6503;
    }

    public void setF6503(String f6503) {
        this.f6503 = f6503;
        notifyPropertyChanged(BR.f6503);
    }

    @Bindable
    public String getF6503a() {
        return f6503a;
    }

    public void setF6503a(String f6503a) {
        if (this.f6503a.equals(f6503a)) return; // for all checkboxes
        this.f6503a = f6503a;
        notifyPropertyChanged(BR.f6503a);
    }

    @Bindable
    public String getF6503b() {
        return f6503b;
    }

    public void setF6503b(String f6503b) {
        if (this.f6503b.equals(f6503b)) return; // for all checkboxes
        this.f6503b = f6503b;
        notifyPropertyChanged(BR.f6503b);
    }

    @Bindable
    public String getF6503c() {
        return f6503c;
    }

    public void setF6503c(String f6503c) {
        if (this.f6503c.equals(f6503c)) return; // for all checkboxes
        this.f6503c = f6503c;
        notifyPropertyChanged(BR.f6503c);
    }

    @Bindable
    public String getF6503d() {
        return f6503d;
    }

    public void setF6503d(String f6503d) {
        if (this.f6503d.equals(f6503d)) return; // for all checkboxes
        this.f6503d = f6503d;
        notifyPropertyChanged(BR.f6503d);
    }

    @Bindable
    public String getF650396() {
        return f650396;
    }

    public void setF650396(String f650396) {
        if (this.f650396.equals(f650396)) return; // for all checkboxes
        this.f650396 = f650396;
        setF650396x(f650396.equals("96") ? this.f650396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f650396);
    }

    @Bindable
    public String getF650396x() {
        return f650396x;
    }

    public void setF650396x(String f650396x) {
        this.f650396x = f650396x;
        notifyPropertyChanged(BR.f650396x);
    }

    @Bindable
    public String getF6504() {
        return f6504;
    }

    public void setF6504(String f6504) {
        this.f6504 = f6504;
        setF650496x(f6504.equals("96") ? this.f650496x : ""); // for all skips, mention all skipped questions

        setF6505a(!f6504.equals("5") ? this.f6505a : "");
        setF6505b(!f6504.equals("5") ? this.f6505b : "");
        setF6505c(!f6504.equals("5") ? this.f6505c : "");
        setF6505d(!f6504.equals("5") ? this.f6505d : "");
        setF6505e(!f6504.equals("5") ? this.f6505e : "");
        setF650596(!f6504.equals("5") ? this.f650596 : "");

        setF6506(!f6504.equals("5") ? this.f6506 : "");
        setF6507(!f6504.equals("5") ? this.f6507 : "");
        setF6508(!f6504.equals("5") ? this.f6508 : "");
        setF6509(!f6504.equals("5") ? this.f6509 : "");
        setF6510(!f6504.equals("5") ? this.f6510 : "");

        setF6511a(!f6504.equals("5") ? this.f6511a : "");
        setF6511b(!f6504.equals("5") ? this.f6511b : "");
        setF6511c(!f6504.equals("5") ? this.f6511c : "");
        setF6511d(!f6504.equals("5") ? this.f6511d : "");
        setF6511e(!f6504.equals("5") ? this.f6511e : "");
        setF6511f(!f6504.equals("5") ? this.f6511f : "");
        setF6511g(!f6504.equals("5") ? this.f6511g : "");
        setF6511h(!f6504.equals("5") ? this.f6511h : "");
        setF6511i(!f6504.equals("5") ? this.f6511i : "");
        setF6511j(!f6504.equals("5") ? this.f6511j : "");
        setF6511k(!f6504.equals("5") ? this.f6511k : "");
        setF651196(!f6504.equals("5") ? this.f651196 : "");


        setF6512(!f6504.equals("5") ? this.f6512 : "");
        setF6513(!f6504.equals("5") ? this.f6513 : "");
        setF6514(!f6504.equals("5") ? this.f6514 : "");

        setF6515(!f6504.equals("5") ? this.f6515 : "");

        setF6516a(!f6504.equals("5") ? this.f6516a : "");
        setF6516b(!f6504.equals("5") ? this.f6516b : "");
        setF6516c(!f6504.equals("5") ? this.f6516c : "");
        setF6516d(!f6504.equals("5") ? this.f6516d : "");
        setF6516e(!f6504.equals("5") ? this.f6516e : "");
        setF651696(!f6504.equals("5") ? this.f651696 : "");

        setF6517(!f6504.equals("5") ? this.f6517 : "");

        setF6518a(!f6504.equals("5") ? this.f6518a : "");
        setF6518b(!f6504.equals("5") ? this.f6518b : "");
        setF6518c(!f6504.equals("5") ? this.f6518c : "");
        setF6518d(!f6504.equals("5") ? this.f6518d : "");
        setF6518e(!f6504.equals("5") ? this.f6518e : "");
        setF6518f(!f6504.equals("5") ? this.f6518f : "");
        setF6518g(!f6504.equals("5") ? this.f6518g : "");
        setF651896(!f6504.equals("5") ? this.f651896 : "");

        setF6519(!f6504.equals("5") ? this.f6519 : "");

        setF6520(!f6504.equals("5") ? this.f6520 : "");
        setF6520dx(!f6504.equals("5") ? this.f6520dx : "");

        setF6521a(!f6504.equals("5") ? this.f6521a : "");
        setF6521b(!f6504.equals("5") ? this.f6521b : "");
        setF6521c(!f6504.equals("5") ? this.f6521c : "");
        setF6521d(!f6504.equals("5") ? this.f6521d : "");
        setF6521e(!f6504.equals("5") ? this.f6521e : "");
        setF6521f(!f6504.equals("5") ? this.f6521f : "");
        setF6521g(!f6504.equals("5") ? this.f6521g : "");
        setF6521h(!f6504.equals("5") ? this.f6521h : "");
        setF6521i(!f6504.equals("5") ? this.f6521i : "");
        setF6521j(!f6504.equals("5") ? this.f6521j : "");
        setF652198(!f6504.equals("5") ? this.f652196 : "");
        setF652196(!f6504.equals("5") ? this.f652198 : "");

        setF6522(!f6504.equals("5") ? this.f6522 : "");
        setF6523(!f6504.equals("5") ? this.f6523 : "");

        setF6524(!f6504.equals("5") ? this.f6524 : "");
        setF6524dx(!f6504.equals("5") ? this.f6524dx : "");

        setF6525(!f6504.equals("5") ? this.f6525 : "");


        notifyPropertyChanged(BR.f6504);
    }

    @Bindable
    public String getF650496x() {
        return f650496x;
    }

    public void setF650496x(String f650496x) {
        this.f650496x = f650496x;
        notifyPropertyChanged(BR.f650496x);
    }

    @Bindable
    public String getF6505() {
        return f6505;
    }

    public void setF6505(String f6505) {
        this.f6505 = f6505;
        notifyPropertyChanged(BR.f6505);
    }

    @Bindable
    public String getF6505a() {
        return f6505a;
    }

    public void setF6505a(String f6505a) {
        if (this.f6505a.equals(f6505a)) return; // for all checkboxes
        this.f6505a = f6505a;
        notifyPropertyChanged(BR.f6505a);
    }

    @Bindable
    public String getF6505b() {
        return f6505b;
    }

    public void setF6505b(String f6505b) {
        if (this.f6505b.equals(f6505b)) return; // for all checkboxes
        this.f6505b = f6505b;
        notifyPropertyChanged(BR.f6505b);
    }

    @Bindable
    public String getF6505c() {
        return f6505c;
    }

    public void setF6505c(String f6505c) {
        if (this.f6505c.equals(f6505c)) return; // for all checkboxes
        this.f6505c = f6505c;
        notifyPropertyChanged(BR.f6505c);
    }

    @Bindable
    public String getF6505d() {
        return f6505d;
    }

    public void setF6505d(String f6505d) {
        if (this.f6505d.equals(f6505d)) return; // for all checkboxes
        this.f6505d = f6505d;
        notifyPropertyChanged(BR.f6505d);
    }

    @Bindable
    public String getF6505e() {
        return f6505e;
    }

    public void setF6505e(String f6505e) {
        if (this.f6505a.equals(f6505a)) return; // for all checkboxes
        this.f6505e = f6505e;
        notifyPropertyChanged(BR.f6505e);
    }

    @Bindable
    public String getF650596() {
        return f650596;
    }

    public void setF650596(String f650596) {
        if (this.f650596.equals(f650596)) return; // for all checkboxes
        this.f650596 = f650596;
        setF650596x(f650596.equals("96") ? this.f650596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f650596);
    }

    @Bindable
    public String getF650596x() {
        return f650596x;
    }

    public void setF650596x(String f650596x) {
        this.f650596x = f650596x;
        notifyPropertyChanged(BR.f650596x);
    }

    @Bindable
    public String getF6506() {
        return f6506;
    }

    public void setF6506(String f6506) {
        this.f6506 = f6506;
        notifyPropertyChanged(BR.f6506);
    }

    @Bindable
    public String getF6507() {
        return f6507;
    }

    public void setF6507(String f6507) {
        this.f6507 = f6507;
        setF650796x(f6507.equals("96") ? this.f650796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6507);
    }

    @Bindable
    public String getF650796x() {
        return f650796x;
    }

    public void setF650796x(String f650796x) {
        this.f650796x = f650796x;
        notifyPropertyChanged(BR.f650796x);
    }

    @Bindable
    public String getF6508() {
        return f6508;
    }

    public void setF6508(String f6508) {
        this.f6508 = f6508;
        notifyPropertyChanged(BR.f6508);
    }

    @Bindable
    public String getF6509() {
        return f6509;
    }

    public void setF6509(String f6509) {
        this.f6509 = f6509;
        notifyPropertyChanged(BR.f6509);
    }

    @Bindable
    public String getF6510() {
        return f6510;
    }

    public void setF6510(String f6510) {
        this.f6510 = f6510;
        setF651096x(f6510.equals("96") ? this.f651096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6510);
    }

    @Bindable
    public String getF651096x() {
        return f651096x;
    }

    public void setF651096x(String f651096x) {
        this.f651096x = f651096x;
        notifyPropertyChanged(BR.f651096x);
    }

    @Bindable
    public String getF6511() {
        return f6511;
    }

    public void setF6511(String f6511) {
        this.f6511 = f6511;
        notifyPropertyChanged(BR.f6511);
    }

    @Bindable
    public String getF6511a() {
        return f6511a;
    }

    public void setF6511a(String f6511a) {
        if (this.f6511a.equals(f6511a)) return; // for all checkboxes
        this.f6511a = f6511a;
        notifyPropertyChanged(BR.f6511a);
    }

    @Bindable
    public String getF6511b() {
        return f6511b;
    }

    public void setF6511b(String f6511b) {
        if (this.f6511b.equals(f6511b)) return; // for all checkboxes
        this.f6511b = f6511b;
        notifyPropertyChanged(BR.f6511b);
    }

    @Bindable
    public String getF6511c() {
        return f6511c;
    }

    public void setF6511c(String f6511c) {
        if (this.f6511c.equals(f6511c)) return; // for all checkboxes
        this.f6511c = f6511c;
        notifyPropertyChanged(BR.f6511c);
    }

    @Bindable
    public String getF6511d() {
        return f6511d;
    }

    public void setF6511d(String f6511d) {
        if (this.f6511d.equals(f6511d)) return; // for all checkboxes
        this.f6511d = f6511d;
        notifyPropertyChanged(BR.f6511d);
    }

    @Bindable
    public String getF6511e() {
        return f6511e;
    }

    public void setF6511e(String f6511e) {
        if (this.f6511e.equals(f6511e)) return; // for all checkboxes
        this.f6511e = f6511e;
        notifyPropertyChanged(BR.f6511e);
    }

    @Bindable
    public String getF6511f() {
        return f6511f;
    }

    public void setF6511f(String f6511f) {
        if (this.f6511f.equals(f6511f)) return; // for all checkboxes
        this.f6511f = f6511f;
        notifyPropertyChanged(BR.f6511f);
    }

    @Bindable
    public String getF6511g() {
        return f6511g;
    }

    public void setF6511g(String f6511g) {
        if (this.f6511g.equals(f6511g)) return; // for all checkboxes
        this.f6511g = f6511g;
        notifyPropertyChanged(BR.f6511g);
    }

    @Bindable
    public String getF6511h() {
        return f6511h;
    }

    public void setF6511h(String f6511h) {
        if (this.f6511h.equals(f6511h)) return; // for all checkboxes
        this.f6511h = f6511h;
        notifyPropertyChanged(BR.f6511h);
    }

    @Bindable
    public String getF6511i() {
        return f6511i;
    }

    public void setF6511i(String f6511i) {
        if (this.f6511i.equals(f6511i)) return; // for all checkboxes
        this.f6511i = f6511i;
        notifyPropertyChanged(BR.f6511i);
    }

    @Bindable
    public String getF6511j() {
        return f6511j;
    }

    public void setF6511j(String f6511j) {
        if (this.f6511j.equals(f6511j)) return; // for all checkboxes
        this.f6511j = f6511j;
        notifyPropertyChanged(BR.f6511j);
    }

    @Bindable
    public String getF6511k() {
        return f6511k;
    }

    public void setF6511k(String f6511k) {
        if (this.f6511k.equals(f6511k)) return; // for all checkboxes
        this.f6511k = f6511k;
        notifyPropertyChanged(BR.f6511k);
    }

    @Bindable
    public String getF651196() {
        return f651196;
    }

    public void setF651196(String f651196) {
        if (this.f651196.equals(f651196)) return; // for all checkboxes
        this.f651196 = f651196;
        setF651196x(f651196.equals("96") ? this.f651196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f651196);
    }

    @Bindable
    public String getF651196x() {
        return f651196x;
    }

    public void setF651196x(String f651196x) {
        this.f651196x = f651196x;
        notifyPropertyChanged(BR.f651196x);
    }

    @Bindable
    public String getF6512() {
        return f6512;
    }

    public void setF6512(String f6512) {
        this.f6512 = f6512;
        notifyPropertyChanged(BR.f6512);
    }

    @Bindable
    public String getF6513() {
        return f6513;
    }

    public void setF6513(String f6513) {
        this.f6513 = f6513;
        notifyPropertyChanged(BR.f6513);
    }

    @Bindable
    public String getF6514() {
        return f6514;
    }

    public void setF6514(String f6514) {
        this.f6514 = f6514;
        notifyPropertyChanged(BR.f6514);
    }

    @Bindable
    public String getF6515() {
        return f6515;
    }

    public void setF6515(String f6515) {
        this.f6515 = f6515;
        setF6515hx(f6515.equals("1") ? this.f6515hx : "");
        setF6515dx(f6515.equals("2") ? this.f6515dx : "");
        notifyPropertyChanged(BR.f6515);
    }

    @Bindable
    public String getF6515hx() {
        return f6515hx;
    }

    public void setF6515hx(String f6515hx) {
        this.f6515hx = f6515hx;
        notifyPropertyChanged(BR.f6515hx);
    }

    @Bindable
    public String getF6515dx() {
        return f6515dx;
    }

    public void setF6515dx(String f6515dx) {
        this.f6515dx = f6515dx;
        notifyPropertyChanged(BR.f6515dx);
    }

    @Bindable
    public String getF6516() {
        return f6516;
    }

    public void setF6516(String f6516) {
        this.f6516 = f6516;
        notifyPropertyChanged(BR.f6516);
    }

    @Bindable
    public String getF6516a() {
        return f6516a;
    }

    public void setF6516a(String f6516a) {
        if (this.f6516a.equals(f6516a)) return; // for all checkboxes
        this.f6516a = f6516a;
        notifyPropertyChanged(BR.f6516a);
    }

    @Bindable
    public String getF6516b() {
        return f6516b;
    }

    public void setF6516b(String f6516b) {
        if (this.f6516b.equals(f6516b)) return; // for all checkboxes
        this.f6516b = f6516b;
        notifyPropertyChanged(BR.f6516b);
    }

    @Bindable
    public String getF6516c() {
        return f6516c;
    }

    public void setF6516c(String f6516c) {
        if (this.f6516c.equals(f6516c)) return; // for all checkboxes
        this.f6516c = f6516c;
        notifyPropertyChanged(BR.f6516c);
    }

    @Bindable
    public String getF6516d() {
        return f6516d;
    }

    public void setF6516d(String f6516d) {
        if (this.f6516d.equals(f6516d)) return; // for all checkboxes
        this.f6516d = f6516d;
        notifyPropertyChanged(BR.f6516d);
    }

    @Bindable
    public String getF6516e() {
        return f6516e;
    }

    public void setF6516e(String f6516e) {
        if (this.f6516e.equals(f6516e)) return; // for all checkboxes
        this.f6516e = f6516e;
        notifyPropertyChanged(BR.f6516e);
    }

    @Bindable
    public String getF651696() {
        return f651696;
    }

    public void setF651696(String f651696) {
        if (this.f651696.equals(f651696)) return; // for all checkboxes
        this.f651696 = f651696;
        setF651696x(f651696.equals("96") ? this.f651696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f651696);
    }

    @Bindable
    public String getF651696x() {
        return f651696x;
    }

    public void setF651696x(String f651696x) {
        this.f651696x = f651696x;
        notifyPropertyChanged(BR.f651696x);
    }

    @Bindable
    public String getF6517() {
        return f6517;
    }

    public void setF6517(String f6517) {
        this.f6517 = f6517;
        notifyPropertyChanged(BR.f6517);
    }

    @Bindable
    public String getF6518() {
        return f6518;
    }

    public void setF6518(String f6518) {
        this.f6518 = f6518;
        notifyPropertyChanged(BR.f6518);
    }

    @Bindable
    public String getF6518a() {
        return f6518a;
    }

    public void setF6518a(String f6518a) {
        if (this.f6518a.equals(f6518a)) return; // for all checkboxes
        this.f6518a = f6518a;
        notifyPropertyChanged(BR.f6518a);
    }

    @Bindable
    public String getF6518b() {
        return f6518b;
    }

    public void setF6518b(String f6518b) {
        if (this.f6518b.equals(f6518b)) return; // for all checkboxes
        this.f6518b = f6518b;
        notifyPropertyChanged(BR.f6518b);
    }

    @Bindable
    public String getF6518c() {
        return f6518c;
    }

    public void setF6518c(String f6518c) {
        if (this.f6518c.equals(f6518c)) return; // for all checkboxes
        this.f6518c = f6518c;
        notifyPropertyChanged(BR.f6518c);
    }

    @Bindable
    public String getF6518d() {
        return f6518d;
    }

    public void setF6518d(String f6518d) {
        if (this.f6518d.equals(f6518d)) return; // for all checkboxes
        this.f6518d = f6518d;
        notifyPropertyChanged(BR.f6518d);
    }

    @Bindable
    public String getF6518e() {
        return f6518e;
    }

    public void setF6518e(String f6518e) {
        if (this.f6518e.equals(f6518e)) return; // for all checkboxes
        this.f6518e = f6518e;
        notifyPropertyChanged(BR.f6518e);
    }

    @Bindable
    public String getF6518f() {
        return f6518f;
    }

    public void setF6518f(String f6518f) {
        if (this.f6518f.equals(f6518f)) return; // for all checkboxes
        this.f6518f = f6518f;
        notifyPropertyChanged(BR.f6518f);
    }

    @Bindable
    public String getF6518g() {
        return f6518g;
    }

    public void setF6518g(String f6518g) {
        if (this.f6518g.equals(f6518g)) return; // for all checkboxes
        this.f6518g = f6518g;
        notifyPropertyChanged(BR.f6518g);
    }

    @Bindable
    public String getF651896() {
        return f651896;
    }

    public void setF651896(String f651896) {
        if (this.f651896.equals(f651896)) return; // for all checkboxes
        this.f651896 = f651896;
        setF651896x(f651896.equals("96") ? this.f651896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f651896);
    }

    @Bindable
    public String getF651896x() {
        return f651896x;
    }

    public void setF651896x(String f651896x) {
        this.f651896x = f651896x;
        notifyPropertyChanged(BR.f651896x);
    }

    @Bindable
    public String getF6519() {
        return f6519;
    }

    public void setF6519(String f6519) {
        this.f6519 = f6519;
        notifyPropertyChanged(BR.f6519);
    }

    @Bindable
    public String getF6520() {
        return f6520;
    }

    public void setF6520(String f6520) {
        this.f6520 = f6520;
        setF6520dx(f6520.equals("1") ? this.f6520dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6520);
    }

    @Bindable
    public String getF6520dx() {
        return f6520dx;
    }

    public void setF6520dx(String f6520dx) {
        this.f6520dx = f6520dx;
        notifyPropertyChanged(BR.f6520dx);
    }

    @Bindable
    public String getF6521() {
        return f6521;
    }

    public void setF6521(String f6521) {
        this.f6521 = f6521;
        notifyPropertyChanged(BR.f6521);
    }

    @Bindable
    public String getF6521a() {
        return f6521a;
    }

    public void setF6521a(String f6521a) {
        if (this.f6521a.equals(f6521a)) return; // for all checkboxes
        this.f6521a = f6521a;
        notifyPropertyChanged(BR.f6521a);
    }

    @Bindable
    public String getF6521b() {
        return f6521b;
    }

    public void setF6521b(String f6521b) {
        if (this.f6521b.equals(f6521b)) return; // for all checkboxes
        this.f6521b = f6521b;
        notifyPropertyChanged(BR.f6521b);
    }

    @Bindable
    public String getF6521c() {
        return f6521c;
    }

    public void setF6521c(String f6521c) {
        if (this.f6521c.equals(f6521c)) return; // for all checkboxes
        this.f6521c = f6521c;
        notifyPropertyChanged(BR.f6521c);
    }

    @Bindable
    public String getF6521d() {
        return f6521d;
    }

    public void setF6521d(String f6521d) {
        if (this.f6521d.equals(f6521d)) return; // for all checkboxes
        this.f6521d = f6521d;
        notifyPropertyChanged(BR.f6521d);
    }

    @Bindable
    public String getF6521e() {
        return f6521e;
    }

    public void setF6521e(String f6521e) {
        if (this.f6521e.equals(f6521e)) return; // for all checkboxes
        this.f6521e = f6521e;
        notifyPropertyChanged(BR.f6521e);
    }

    @Bindable
    public String getF6521f() {
        return f6521f;
    }

    public void setF6521f(String f6521f) {
        if (this.f6521f.equals(f6521f)) return; // for all checkboxes
        this.f6521f = f6521f;
        notifyPropertyChanged(BR.f6521f);
    }

    @Bindable
    public String getF6521g() {
        return f6521g;
    }

    public void setF6521g(String f6521g) {
        if (this.f6521g.equals(f6521g)) return; // for all checkboxes
        this.f6521g = f6521g;
        notifyPropertyChanged(BR.f6521g);
    }

    @Bindable
    public String getF6521h() {
        return f6521h;
    }

    public void setF6521h(String f6521h) {
        if (this.f6521h.equals(f6521h)) return; // for all checkboxes
        this.f6521h = f6521h;
        notifyPropertyChanged(BR.f6521h);
    }

    @Bindable
    public String getF6521i() {
        return f6521i;
    }

    public void setF6521i(String f6521i) {
        if (this.f6521i.equals(f6521i)) return; // for all checkboxes
        this.f6521i = f6521i;
        notifyPropertyChanged(BR.f6521i);
    }

    @Bindable
    public String getF6521j() {
        return f6521j;
    }

    public void setF6521j(String f6521j) {
        if (this.f6521j.equals(f6521j)) return; // for all checkboxes
        this.f6521j = f6521j;
        notifyPropertyChanged(BR.f6521j);
    }

    @Bindable
    public String getF652198() {
        return f652198;
    }

    public void setF652198(String f652198) {
        if (this.f652198.equals(f652198)) return; // for all checkboxes
        this.f652198 = f652198;
        setF6521a(f652198.equals("98") ? this.f6521a : "");
        setF6521b(f652198.equals("98") ? this.f6521b : "");
        setF6521c(f652198.equals("98") ? this.f6521c : "");
        setF6521d(f652198.equals("98") ? this.f6521d : "");
        setF6521e(f652198.equals("98") ? this.f6521e : "");
        setF6521f(f652198.equals("98") ? this.f6521f : "");
        setF6521g(f652198.equals("98") ? this.f6521g : "");
        setF6521h(f652198.equals("98") ? this.f6521h : "");
        setF6521i(f652198.equals("98") ? this.f6521i : "");
        setF6521j(f652198.equals("98") ? this.f6521j : "");
        setF652196(f652198.equals("98") ? this.f652198 : "");
        notifyPropertyChanged(BR.f652198);
    }

    @Bindable
    public String getF652196() {
        return f652196;
    }

    public void setF652196(String f652196) {
        if (this.f652196.equals(f652196)) return; // for all checkboxes
        this.f652196 = f652196;
        setF652196x(f652196.equals("96") ? this.f652196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f652196);
    }

    @Bindable
    public String getF652196x() {
        return f652196x;
    }

    public void setF652196x(String f652196x) {
        this.f652196x = f652196x;
        notifyPropertyChanged(BR.f652196x);
    }

    @Bindable
    public String getF6522() {
        return f6522;
    }

    public void setF6522(String f6522) {
        this.f6522 = f6522;
        setF652296x(f6522.equals("96") ? this.f652296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6522);
    }

    @Bindable
    public String getF652296x() {
        return f652296x;
    }

    public void setF652296x(String f652296x) {
        this.f652296x = f652296x;
        notifyPropertyChanged(BR.f652296x);
    }

    @Bindable
    public String getF6523() {
        return f6523;
    }

    public void setF6523(String f6523) {
        this.f6523 = f6523;
        notifyPropertyChanged(BR.f6523);
    }

    @Bindable
    public String getF6524() {
        return f6524;
    }

    public void setF6524(String f6524) {
        this.f6524 = f6524;
        setF6524dx(f6524.equals("1") ? this.f6524dx : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6524);
    }

    @Bindable
    public String getF6524dx() {
        return f6524dx;
    }

    public void setF6524dx(String f6524dx) {
        this.f6524dx = f6524dx;
        notifyPropertyChanged(BR.f6524dx);
    }

    @Bindable
    public String getF6525() {
        return f6525;
    }

    public void setF6525(String f6525) {
        this.f6525 = f6525;
        setF652596x(f6525.equals("96") ? this.f652596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6525);
    }

    @Bindable
    public String getF652596x() {
        return f652596x;
    }

    public void setF652596x(String f652596x) {
        this.f652596x = f652596x;
        notifyPropertyChanged(BR.f652596x);
    }

    @Bindable
    public String getF6601() {
        return f6601;
    }

    public void setF6601(String f6601) {
        this.f6601 = f6601;
        notifyPropertyChanged(BR.f6601);
    }

    @Bindable
    public String getF6602() {
        return f6602;
    }

    public void setF6602(String f6602) {
        this.f6602 = f6602;
        notifyPropertyChanged(BR.f6602);
    }

    @Bindable
    public String getF6602a() {
        return f6602a;
    }

    public void setF6602a(String f6602a) {
        if (this.f6602a.equals(f6602a)) return; // for all checkboxes
        this.f6602a = f6602a;
        notifyPropertyChanged(BR.f6602a);
    }

    @Bindable
    public String getF6602b() {
        return f6602b;
    }

    public void setF6602b(String f6602b) {
        if (this.f6602b.equals(f6602b)) return; // for all checkboxes
        this.f6602b = f6602b;
        notifyPropertyChanged(BR.f6602b);
    }

    @Bindable
    public String getF6602c() {
        return f6602c;
    }

    public void setF6602c(String f6602c) {
        if (this.f6602c.equals(f6602c)) return; // for all checkboxes
        this.f6602c = f6602c;
        notifyPropertyChanged(BR.f6602c);
    }

    @Bindable
    public String getF6602d() {
        return f6602d;
    }

    public void setF6602d(String f6602d) {
        if (this.f6602d.equals(f6602d)) return; // for all checkboxes
        this.f6602d = f6602d;
        notifyPropertyChanged(BR.f6602d);
    }

    @Bindable
    public String getF6602e() {
        return f6602e;
    }

    public void setF6602e(String f6602e) {
        if (this.f6602e.equals(f6602e)) return; // for all checkboxes
        this.f6602e = f6602e;
        notifyPropertyChanged(BR.f6602e);
    }

    @Bindable
    public String getF660296() {
        return f660296;
    }

    public void setF660296(String f660296) {
        if (this.f660296.equals(f660296)) return; // for all checkboxes
        this.f660296 = f660296;
        setF660296x(f660296.equals("96") ? this.f660296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f660296);
    }

    @Bindable
    public String getF660296x() {
        return f660296x;
    }

    public void setF660296x(String f660296x) {
        this.f660296x = f660296x;
        notifyPropertyChanged(BR.f660296x);
    }

    @Bindable
    public String getF6603() {
        return f6603;
    }

    public void setF6603(String f6603) {
        this.f6603 = f6603;
        setF6604(f6603.equals("1") ? this.f6604 : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6603);
    }

    @Bindable
    public String getF6604() {
        return f6604;
    }

    public void setF6604(String f6604) {
        this.f6604 = f6604;
        setF660496x(f6604.equals("96") ? this.f660496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6604);
    }

    @Bindable
    public String getF660496x() {
        return f660496x;
    }

    public void setF660496x(String f660496x) {
        this.f660496x = f660496x;
        notifyPropertyChanged(BR.f660496x);
    }

    @Bindable
    public String getF6605() {
        return f6605;
    }

    public void setF6605(String f6605) {
        this.f6605 = f6605;
        notifyPropertyChanged(BR.f6605);
    }

    @Bindable
    public String getF6605a() {
        return f6605a;
    }

    public void setF6605a(String f6605a) {
        if (this.f6605a.equals(f6605a)) return; // for all checkboxes
        this.f6605a = f6605a;
        notifyPropertyChanged(BR.f6605a);
    }

    @Bindable
    public String getF6605b() {
        return f6605b;
    }

    public void setF6605b(String f6605b) {
        if (this.f6605b.equals(f6605b)) return; // for all checkboxes
        this.f6605b = f6605b;
        notifyPropertyChanged(BR.f6605b);
    }

    @Bindable
    public String getF6605c() {
        return f6605c;
    }

    public void setF6605c(String f6605c) {
        if (this.f6605c.equals(f6605c)) return; // for all checkboxes
        this.f6605c = f6605c;
        notifyPropertyChanged(BR.f6605c);
    }

    @Bindable
    public String getF660596() {
        return f660596;
    }

    public void setF660596(String f660596) {
        if (this.f660596.equals(f660596)) return; // for all checkboxes
        this.f660596 = f660596;
        setF660596x(f660596.equals("96") ? this.f660596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f660596);
    }

    @Bindable
    public String getF660596x() {
        return f660596x;
    }

    public void setF660596x(String f660596x) {
        this.f660596x = f660596x;
        notifyPropertyChanged(BR.f660596x);
    }

    @Bindable
    public String getF6606() {
        return f6606;
    }

    public void setF6606(String f6606) {
        this.f6606 = f6606;
        notifyPropertyChanged(BR.f6606);
    }

    @Bindable
    public String getF6701() {
        return f6701;
    }

    public void setF6701(String f6701) {
        this.f6701 = f6701;
        setF6702(f6701.equals("1") ? this.f6702 : "");
        setF6703(f6701.equals("1") ? this.f6703 : "");
        setF6704(f6701.equals("1") ? this.f6704 : "");
        notifyPropertyChanged(BR.f6701);
    }

    @Bindable
    public String getF6702() {
        return f6702;
    }

    public void setF6702(String f6702) {
        this.f6702 = f6702;
        setF670296x(f6702.equals("96") ? this.f670296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6702);
    }

    @Bindable
    public String getF670296x() {
        return f670296x;
    }

    public void setF670296x(String f670296x) {
        this.f670296x = f670296x;
        notifyPropertyChanged(BR.f670296x);
    }

    @Bindable
    public String getF6703() {
        return f6703;
    }

    public void setF6703(String f6703) {
        this.f6703 = f6703;
        notifyPropertyChanged(BR.f6703);
    }

    @Bindable
    public String getF6704() {
        return f6704;
    }

    public void setF6704(String f6704) {
        this.f6704 = f6704;
        setF6705a(!f6704.equals("0") ? this.f6705a : "");
        setF6705b(!f6704.equals("0") ? this.f6705b : "");
        setF6705c(!f6704.equals("0") ? this.f6705c : "");
        setF6705d(!f6704.equals("0") ? this.f6705d : "");
        setF6705e(!f6704.equals("0") ? this.f6705e : "");
        setF6705f(!f6704.equals("0") ? this.f6705f : "");
        setF6705g(!f6704.equals("0") ? this.f6705g : "");
        setF670596(!f6704.equals("0") ? this.f670596 : "");
        setF6706(!f6704.equals("0") ? this.f6706 : "");
        notifyPropertyChanged(BR.f6704);
    }

    @Bindable
    public String getF6705() {
        return f6705;
    }

    public void setF6705(String f6705) {
        this.f6705 = f6705;
        notifyPropertyChanged(BR.f6705);
    }

    @Bindable
    public String getF6705a() {
        return f6705a;
    }

    public void setF6705a(String f6705a) {
        if (this.f6705a.equals(f6705a)) return; // for all checkboxes
        this.f6705a = f6705a;
        notifyPropertyChanged(BR.f6705a);
    }

    @Bindable
    public String getF6705b() {
        return f6705b;
    }

    public void setF6705b(String f6705b) {
        if (this.f6705b.equals(f6705b)) return; // for all checkboxes
        this.f6705b = f6705b;
        notifyPropertyChanged(BR.f6705b);
    }

    @Bindable
    public String getF6705c() {
        return f6705c;
    }

    public void setF6705c(String f6705c) {
        if (this.f6705c.equals(f6705c)) return; // for all checkboxes
        this.f6705c = f6705c;
        notifyPropertyChanged(BR.f6705c);
    }

    @Bindable
    public String getF6705d() {
        return f6705d;
    }

    public void setF6705d(String f6705d) {
        if (this.f6705d.equals(f6705d)) return; // for all checkboxes
        this.f6705d = f6705d;
        notifyPropertyChanged(BR.f6705d);
    }

    @Bindable
    public String getF6705e() {
        return f6705e;
    }

    public void setF6705e(String f6705e) {
        if (this.f6705e.equals(f6705e)) return; // for all checkboxes
        this.f6705e = f6705e;
        notifyPropertyChanged(BR.f6705e);
    }

    @Bindable
    public String getF6705f() {
        return f6705f;
    }

    public void setF6705f(String f6705f) {
        if (this.f6705f.equals(f6705f)) return; // for all checkboxes
        this.f6705f = f6705f;
        notifyPropertyChanged(BR.f6705f);
    }

    @Bindable
    public String getF6705g() {
        return f6705g;
    }

    public void setF6705g(String f6705g) {
        if (this.f6705g.equals(f6705g)) return; // for all checkboxes
        this.f6705g = f6705g;
        notifyPropertyChanged(BR.f6705g);
    }

    @Bindable
    public String getF670596() {
        return f670596;
    }

    public void setF670596(String f670596) {
        if (this.f670596.equals(f670596)) return; // for all checkboxes
        this.f670596 = f670596;
        setF670596x(f670596.equals("96") ? this.f670596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f670596);
    }

    @Bindable
    public String getF670596x() {
        return f670596x;
    }

    public void setF670596x(String f670596x) {
        this.f670596x = f670596x;
        notifyPropertyChanged(BR.f670596x);
    }

    @Bindable
    public String getF6706() {
        return f6706;
    }

    public void setF6706(String f6706) {
        this.f6706 = f6706;
        notifyPropertyChanged(BR.f6706);
    }

    @Bindable
    public String getF6707d() {
        return f6707d;
    }

    public void setF6707d(String f6707d) {
        this.f6707d = f6707d;
        notifyPropertyChanged(BR.f6707d);
    }

    @Bindable
    public String getF6707h() {
        return f6707h;
    }

    public void setF6707h(String f6707h) {
        this.f6707h = f6707h;
        notifyPropertyChanged(BR.f6707h);
    }

    @Bindable
    public String getF6707m() {
        return f6707m;
    }

    public void setF6707m(String f6707m) {
        this.f6707m = f6707m;
        notifyPropertyChanged(BR.f6707m);
    }

    @Bindable
    public String getF6708() {
        return f6708;
    }

    public void setF6708(String f6708) {
        this.f6708 = f6708;
        setF6709a(f6708.equals("1") ? this.f6709a : "");
        setF6709b(f6708.equals("1") ? this.f6709b : "");
        setF6709c(f6708.equals("1") ? this.f6709c : "");
        setF6709d(f6708.equals("1") ? this.f6709d : "");
        setF6709e(f6708.equals("1") ? this.f6709e : "");
        setF670996(f6708.equals("1") ? this.f670996 : "");

        setF6710(f6708.equals("1") ? this.f6710 : "");
        setF6711(f6708.equals("1") ? this.f6711 : "");

        setF6712h(f6708.equals("1") ? this.f6712h : "");
        setF6712n(f6708.equals("1") ? this.f6712n : "");

        setF6713(f6708.equals("1") ? this.f6713 : "");

        setF6714d(f6708.equals("1") ? this.f6714d : "");
        setF6714h(f6708.equals("1") ? this.f6714h : "");
        setF6714m(f6708.equals("1") ? this.f6714m : "");

        setF6715(f6708.equals("1") ? this.f6715 : "");
        setF6716(f6708.equals("1") ? this.f6716 : "");
        setF6717(f6708.equals("1") ? this.f6717 : "");
        setF6718(f6708.equals("1") ? this.f6718 : "");

        setF6719a(f6708.equals("1") ? this.f6719a : "");
        setF6719b(f6708.equals("1") ? this.f6719b : "");
        setF6719c(f6708.equals("1") ? this.f6719c : "");
        setF671996(f6708.equals("1") ? this.f670996 : "");
        notifyPropertyChanged(BR.f6708);
    }

    @Bindable
    public String getF6709() {
        return f6709;
    }

    public void setF6709(String f6709) {
        this.f6709 = f6709;
        notifyPropertyChanged(BR.f6709);
    }

    @Bindable
    public String getF6709a() {
        return f6709a;
    }

    public void setF6709a(String f6709a) {
        if (this.f6709a.equals(f6709a)) return; // for all checkboxes
        this.f6709a = f6709a;
        notifyPropertyChanged(BR.f6709a);
    }

    @Bindable
    public String getF6709b() {
        return f6709b;
    }

    public void setF6709b(String f6709b) {
        if (this.f6709b.equals(f6709b)) return; // for all checkboxes
        this.f6709b = f6709b;
        notifyPropertyChanged(BR.f6709b);
    }

    @Bindable
    public String getF6709c() {
        return f6709c;
    }

    public void setF6709c(String f6709c) {
        if (this.f6709c.equals(f6709c)) return; // for all checkboxes
        this.f6709c = f6709c;
        notifyPropertyChanged(BR.f6709c);
    }

    @Bindable
    public String getF6709d() {
        return f6709d;
    }

    public void setF6709d(String f6709d) {
        if (this.f6709d.equals(f6709d)) return; // for all checkboxes
        this.f6709d = f6709d;
        notifyPropertyChanged(BR.f6709d);
    }

    @Bindable
    public String getF6709e() {
        return f6709e;
    }

    public void setF6709e(String f6709e) {
        if (this.f6709e.equals(f6709e)) return; // for all checkboxes
        this.f6709e = f6709e;
        notifyPropertyChanged(BR.f6709e);
    }

    @Bindable
    public String getF670996() {
        return f670996;
    }

    public void setF670996(String f670996) {
        if (this.f670996.equals(f670996)) return; // for all checkboxes
        this.f670996 = f670996;
        setF670996x(f670996.equals("96") ? this.f670996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f670996);
    }

    @Bindable
    public String getF670996x() {
        return f670996x;
    }

    public void setF670996x(String f670996x) {
        this.f670996x = f670996x;
        notifyPropertyChanged(BR.f670996x);
    }

    @Bindable
    public String getF6710() {
        return f6710;
    }

    public void setF6710(String f6710) {
        this.f6710 = f6710;
        setF671096x(f6710.equals("96") ? this.f671096x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6710);
    }

    @Bindable
    public String getF671096x() {
        return f671096x;
    }

    public void setF671096x(String f671096x) {
        this.f671096x = f671096x;
        notifyPropertyChanged(BR.f671096x);
    }

    @Bindable
    public String getF6711() {
        return f6711;
    }

    public void setF6711(String f6711) {
        this.f6711 = f6711;
        notifyPropertyChanged(BR.f6711);
    }

    @Bindable
    public String getF6712h() {
        return f6712h;
    }

    public void setF6712h(String f6712h) {
        this.f6712h = f6712h;
        notifyPropertyChanged(BR.f6712h);
    }

    @Bindable
    public String getF6712n() {
        return f6712n;
    }

    public void setF6712n(String f6712n) {
        this.f6712n = f6712n;
        notifyPropertyChanged(BR.f6712n);
    }

    @Bindable
    public String getF6713() {
        return f6713;
    }

    public void setF6713(String f6713) {
        this.f6713 = f6713;
        setF671396x(f6713.equals("96") ? this.f671396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f6713);
    }

    @Bindable
    public String getF671396x() {
        return f671396x;
    }

    public void setF671396x(String f671396x) {
        this.f671396x = f671396x;
        notifyPropertyChanged(BR.f671396x);
    }

    @Bindable
    public String getF6714d() {
        return f6714d;
    }

    public void setF6714d(String f6714d) {
        this.f6714d = f6714d;
        notifyPropertyChanged(BR.f6714d);
    }

    @Bindable
    public String getF6714h() {
        return f6714h;
    }

    public void setF6714h(String f6714h) {
        this.f6714h = f6714h;
        notifyPropertyChanged(BR.f6714h);
    }

    @Bindable
    public String getF6714m() {
        return f6714m;
    }

    public void setF6714m(String f6714m) {
        this.f6714m = f6714m;
        notifyPropertyChanged(BR.f6714m);
    }

    @Bindable
    public String getF6715() {
        return f6715;
    }

    public void setF6715(String f6715) {
        this.f6715 = f6715;
        setF6716(f6715.equals("2") ? this.f6716 : "");
        notifyPropertyChanged(BR.f6715);
    }

    @Bindable
    public String getF6716() {
        return f6716;
    }

    public void setF6716(String f6716) {
        this.f6716 = f6716;
        notifyPropertyChanged(BR.f6716);
    }

    @Bindable
    public String getF6717() {
        return f6717;
    }

    public void setF6717(String f6717) {
        this.f6717 = f6717;
        notifyPropertyChanged(BR.f6717);
    }

    @Bindable
    public String getF6718() {
        return f6718;
    }

    public void setF6718(String f6718) {
        this.f6718 = f6718;
        setF6719a(f6718.equals("2") ? this.f6719a : "");
        setF6719b(f6718.equals("2") ? this.f6719b : "");
        setF6719c(f6718.equals("2") ? this.f6719c : "");
        setF671996(f6718.equals("2") ? this.f671996 : "");
        notifyPropertyChanged(BR.f6718);
    }

    @Bindable
    public String getF6719() {
        return f6719;
    }

    public void setF6719(String f6719) {
        this.f6719 = f6719;
        notifyPropertyChanged(BR.f6719);
    }

    @Bindable
    public String getF6719a() {
        return f6719a;
    }

    public void setF6719a(String f6719a) {
        if (this.f6719a.equals(f6719a)) return; // for all checkboxes
        this.f6719a = f6719a;
        notifyPropertyChanged(BR.f6719a);
    }

    @Bindable
    public String getF6719b() {
        return f6719b;
    }

    public void setF6719b(String f6719b) {
        if (this.f6719b.equals(f6719b)) return; // for all checkboxes
        this.f6719b = f6719b;
        notifyPropertyChanged(BR.f6719b);
    }

    @Bindable
    public String getF6719c() {
        return f6719c;
    }

    public void setF6719c(String f6719c) {
        if (this.f6719c.equals(f6719c)) return; // for all checkboxes
        this.f6719c = f6719c;
        notifyPropertyChanged(BR.f6719c);
    }

    @Bindable
    public String getF671996() {
        return f671996;
    }

    public void setF671996(String f671996) {
        if (this.f671996.equals(f671996)) return; // for all checkboxes
        this.f671996 = f671996;
        setF671996x(f671996.equals("96") ? this.f671996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f671996);
    }

    @Bindable
    public String getF671996x() {
        return f671996x;
    }

    public void setF671996x(String f671996x) {
        this.f671996x = f671996x;
        notifyPropertyChanged(BR.f671996x);
    }

    @Bindable
    public String getF6720() {
        return f6720;
    }

    public void setF6720(String f6720) {
        this.f6720 = f6720;
        notifyPropertyChanged(BR.f6720);
    }

    @Bindable
    public String getF6721() {
        return f6721;
    }

    public void setF6721(String f6721) {
        this.f6721 = f6721;
        notifyPropertyChanged(BR.f6721);
    }

    @Bindable
    public String getF6721a() {
        return f6721a;
    }

    public void setF6721a(String f6721a) {
        if (this.f6721a.equals(f6721a)) return; // for all checkboxes
        this.f6721a = f6721a;
        notifyPropertyChanged(BR.f6721a);
    }

    @Bindable
    public String getF6721b() {
        return f6721b;
    }

    public void setF6721b(String f6721b) {
        if (this.f6721b.equals(f6721b)) return; // for all checkboxes
        this.f6721b = f6721b;
        notifyPropertyChanged(BR.f6721b);
    }

    @Bindable
    public String getF6721c() {
        return f6721c;
    }

    public void setF6721c(String f6721c) {
        if (this.f6721c.equals(f6721c)) return; // for all checkboxes
        this.f6721c = f6721c;
        notifyPropertyChanged(BR.f6721c);
    }

    @Bindable
    public String getF6721d() {
        return f6721d;
    }

    public void setF6721d(String f6721d) {
        if (this.f6721d.equals(f6721d)) return; // for all checkboxes
        this.f6721d = f6721d;
        notifyPropertyChanged(BR.f6721d);
    }

    @Bindable
    public String getF6721e() {
        return f6721e;
    }

    public void setF6721e(String f6721e) {
        if (this.f6721e.equals(f6721e)) return; // for all checkboxes
        this.f6721e = f6721e;
        notifyPropertyChanged(BR.f6721e);
    }

    @Bindable
    public String getF6721f() {
        return f6721f;
    }

    public void setF6721f(String f6721f) {
        if (this.f6721f.equals(f6721f)) return; // for all checkboxes
        this.f6721f = f6721f;
        notifyPropertyChanged(BR.f6721f);
    }

    @Bindable
    public String getF672196() {
        return f672196;
    }

    public void setF672196(String f672196) {
        if (this.f672196.equals(f672196)) return; // for all checkboxes
        this.f672196 = f672196;
        setF672196x(f672196.equals("96") ? this.f672196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.f672196);
    }

    @Bindable
    public String getF672196x() {
        return f672196x;
    }

    public void setF672196x(String f672196x) {
        this.f672196x = f672196x;
        notifyPropertyChanged(BR.f672196x);
    }

    @Bindable
    public String getF6722() {
        return f6722;
    }

    public void setF6722(String f6722) {
        this.f6722 = f6722;
        notifyPropertyChanged(BR.f6722);
    }

    @Bindable
    public String getF6723() {
        return f6723;
    }

    public void setF6723(String f6723) {
        this.f6723 = f6723;
        notifyPropertyChanged(BR.f6723);
    }

    @Bindable
    public String getF6723a() {
        return f6723a;
    }

    public void setF6723a(String f6723a) {
        if (this.f6723a.equals(f6723a)) return; // for all checkboxes
        this.f6723a = f6723a;
        notifyPropertyChanged(BR.f6723a);
    }

    @Bindable
    public String getF6723b() {
        return f6723b;
    }

    public void setF6723b(String f6723b) {
        if (this.f6723b.equals(f6723b)) return; // for all checkboxes
        this.f6723b = f6723b;
        notifyPropertyChanged(BR.f6723b);
    }

    @Bindable
    public String getF6723c() {
        return f6723c;
    }

    public void setF6723c(String f6723c) {
        if (this.f6723c.equals(f6723c)) return; // for all checkboxes
        this.f6723c = f6723c;
        notifyPropertyChanged(BR.f6723c);
    }

    @Bindable
    public String getF6723d() {
        return f6723d;
    }

    public void setF6723d(String f6723d) {
        if (this.f6723d.equals(f6723d)) return; // for all checkboxes
        this.f6723d = f6723d;
        notifyPropertyChanged(BR.f6723d);
    }

    @Bindable
    public String getF6723e() {
        return f6723e;
    }

    public void setF6723e(String f6723e) {
        if (this.f6723e.equals(f6723e)) return; // for all checkboxes
        this.f6723e = f6723e;
        notifyPropertyChanged(BR.f6723e);
    }

    @Bindable
    public String getF672396() {
        return f672396;
    }

    public void setF672396(String f672396) {
        if (this.f672396.equals(f672396)) return; // for all checkboxes
        this.f672396 = f672396;
        notifyPropertyChanged(BR.f672396);
    }

    @Bindable
    public String getF7101() {
        return f7101;
    }

    public void setF7101(String f7101) {
        this.f7101 = f7101;
        notifyPropertyChanged(BR.f7101);
    }

    @Bindable
    public String getF7102() {
        return f7102;
    }

    public void setF7102(String f7102) {
        this.f7102 = f7102;
        notifyPropertyChanged(BR.f7102);
    }

    @Bindable
    public String getF7103() {
        return f7103;
    }

    public void setF7103(String f7103) {
        this.f7103 = f7103;
        notifyPropertyChanged(BR.f7103);
    }

    @Bindable
    public String getF7201() {
        return f7201;
    }

    public void setF7201(String f7201) {
        this.f7201 = f7201;
        notifyPropertyChanged(BR.f7201);
    }

    @Bindable
    public String getF7202() {
        return f7202;
    }

    public void setF7202(String f7202) {
        this.f7202 = f7202;
        notifyPropertyChanged(BR.f7202);
    }

    @Bindable
    public String getF7203() {
        return f7203;
    }

    public void setF7203(String f7203) {
        this.f7203 = f7203;
        notifyPropertyChanged(BR.f7203);
    }

    @Bindable
    public String getF7203a() {
        return f7203a;
    }

    public void setF7203a(String f7203a) {
        this.f7203a = f7203a;
        notifyPropertyChanged(BR.f7203a);
    }

    @Bindable
    public String getF7203b() {
        return f7203b;
    }

    public void setF7203b(String f7203b) {
        this.f7203b = f7203b;
        notifyPropertyChanged(BR.f7203b);
    }

    @Bindable
    public String getF7203c() {
        return f7203c;
    }

    public void setF7203c(String f7203c) {
        this.f7203c = f7203c;
        notifyPropertyChanged(BR.f7203c);
    }

    @Bindable
    public String getF7203d() {
        return f7203d;
    }

    public void setF7203d(String f7203d) {
        this.f7203d = f7203d;
        notifyPropertyChanged(BR.f7203d);
    }

    @Bindable
    public String getF7203e() {
        return f7203e;
    }

    public void setF7203e(String f7203e) {
        this.f7203e = f7203e;
        notifyPropertyChanged(BR.f7203e);
    }

    @Bindable
    public String getF7203f() {
        return f7203f;
    }

    public void setF7203f(String f7203f) {
        this.f7203f = f7203f;
        notifyPropertyChanged(BR.f7203f);
    }

    @Bindable
    public String getF7203g() {
        return f7203g;
    }

    public void setF7203g(String f7203g) {
        this.f7203g = f7203g;
        notifyPropertyChanged(BR.f7203g);
    }

    @Bindable
    public String getF7203h() {
        return f7203h;
    }

    public void setF7203h(String f7203h) {
        this.f7203h = f7203h;
        notifyPropertyChanged(BR.f7203h);
    }

    @Bindable
    public String getF7203i() {
        return f7203i;
    }

    public void setF7203i(String f7203i) {
        this.f7203i = f7203i;
        notifyPropertyChanged(BR.f7203i);
    }

    @Bindable
    public String getF720396() {
        return f720396;
    }

    public void setF720396(String f720396) {
        this.f720396 = f720396;
        notifyPropertyChanged(BR.f720396);
    }

    @Bindable
    public String getF720396x() {
        return f720396x;
    }

    public void setF720396x(String f720396x) {
        this.f720396x = f720396x;
        notifyPropertyChanged(BR.f720396x);
    }

    @Bindable
    public String getF7204() {
        return f7204;
    }

    public void setF7204(String f7204) {
        this.f7204 = f7204;
        notifyPropertyChanged(BR.f7204);
    }

    @Bindable
    public String getF7204hx() {
        return f7204hx;
    }

    public void setF7204hx(String f7204hx) {
        this.f7204hx = f7204hx;
        notifyPropertyChanged(BR.f7204hx);
    }

    @Bindable
    public String getF7204mx() {
        return f7204mx;
    }

    public void setF7204mx(String f7204mx) {
        this.f7204mx = f7204mx;
        notifyPropertyChanged(BR.f7204mx);
    }

    @Bindable
    public String getF7301() {
        return f7301;
    }

    public void setF7301(String f7301) {
        this.f7301 = f7301;
        notifyPropertyChanged(BR.f7301);
    }

    @Bindable
    public String getF7302() {
        return f7302;
    }

    public void setF7302(String f7302) {
        this.f7302 = f7302;
        notifyPropertyChanged(BR.f7302);
    }

    @Bindable
    public String getF7303a() {
        return f7303a;
    }

    public void setF7303a(String f7303a) {
        this.f7303a = f7303a;
        notifyPropertyChanged(BR.f7303a);
    }

    @Bindable
    public String getF7303b() {
        return f7303b;
    }

    public void setF7303b(String f7303b) {
        this.f7303b = f7303b;
        notifyPropertyChanged(BR.f7303b);
    }

    @Bindable
    public String getF7304() {
        return f7304;
    }

    public void setF7304(String f7304) {
        this.f7304 = f7304;
        notifyPropertyChanged(BR.f7304);
    }

    @Bindable
    public String getF7305() {
        return f7305;
    }

    public void setF7305(String f7305) {
        this.f7305 = f7305;
        notifyPropertyChanged(BR.f7305);
    }

    @Bindable
    public String getF7306() {
        return f7306;
    }

    public void setF7306(String f7306) {
        this.f7306 = f7306;
        notifyPropertyChanged(BR.f7306);
    }

    @Bindable
    public String getF7307() {
        return f7307;
    }

    public void setF7307(String f7307) {
        this.f7307 = f7307;
        notifyPropertyChanged(BR.f7307);
    }

    @Bindable
    public String getF7308() {
        return f7308;
    }

    public void setF7308(String f7308) {
        this.f7308 = f7308;
        notifyPropertyChanged(BR.f7308);
    }

    @Bindable
    public String getF7309() {
        return f7309;
    }

    public void setF7309(String f7309) {
        this.f7309 = f7309;
        notifyPropertyChanged(BR.f7309);
    }

    @Bindable
    public String getF7310() {
        return f7310;
    }

    public void setF7310(String f7310) {
        this.f7310 = f7310;
        notifyPropertyChanged(BR.f7310);
    }

    @Bindable
    public String getF7311() {
        return f7311;
    }

    public void setF7311(String f7311) {
        this.f7311 = f7311;
        notifyPropertyChanged(BR.f7311);
    }

    @Bindable
    public String getF7312() {
        return f7312;
    }

    public void setF7312(String f7312) {
        this.f7312 = f7312;
        notifyPropertyChanged(BR.f7312);
    }

    @Bindable
    public String getF7312t() {
        return f7312t;
    }

    public void setF7312t(String f7312t) {
        this.f7312t = f7312t;
        notifyPropertyChanged(BR.f7312t);
    }

    @Bindable
    public String getF7313() {
        return f7313;
    }

    public void setF7313(String f7313) {
        this.f7313 = f7313;
        notifyPropertyChanged(BR.f7313);
    }

    @Bindable
    public String getF7314() {
        return f7314;
    }

    public void setF7314(String f7314) {
        this.f7314 = f7314;
        notifyPropertyChanged(BR.f7314);
    }

    @Bindable
    public String getF7315() {
        return f7315;
    }

    public void setF7315(String f7315) {
        this.f7315 = f7315;
        notifyPropertyChanged(BR.f7315);
    }

    @Bindable
    public String getF7316() {
        return f7316;
    }

    public void setF7316(String f7316) {
        this.f7316 = f7316;
        notifyPropertyChanged(BR.f7316);
    }

    @Bindable
    public String getF7317() {
        return f7317;
    }

    public void setF7317(String f7317) {
        this.f7317 = f7317;
        notifyPropertyChanged(BR.f7317);
    }

    @Bindable
    public String getF7318() {
        return f7318;
    }

    public void setF7318(String f7318) {
        this.f7318 = f7318;
        notifyPropertyChanged(BR.f7318);
    }

    @Bindable
    public String getF7319() {
        return f7319;
    }

    public void setF7319(String f7319) {
        this.f7319 = f7319;
        notifyPropertyChanged(BR.f7319);
    }

    @Bindable
    public String getF7401() {
        return f7401;
    }

    public void setF7401(String f7401) {
        this.f7401 = f7401;
        notifyPropertyChanged(BR.f7401);
    }

    @Bindable
    public String getF7402() {
        return f7402;
    }

    public void setF7402(String f7402) {
        this.f7402 = f7402;
        notifyPropertyChanged(BR.f7402);
    }

    @Bindable
    public String getF7402a() {
        return f7402a;
    }

    public void setF7402a(String f7402a) {
        this.f7402a = f7402a;
        notifyPropertyChanged(BR.f7402a);
    }

    @Bindable
    public String getF7402b() {
        return f7402b;
    }

    public void setF7402b(String f7402b) {
        this.f7402b = f7402b;
        notifyPropertyChanged(BR.f7402b);
    }

    @Bindable
    public String getF7402c() {
        return f7402c;
    }

    public void setF7402c(String f7402c) {
        this.f7402c = f7402c;
        notifyPropertyChanged(BR.f7402c);
    }

    @Bindable
    public String getF7402d() {
        return f7402d;
    }

    public void setF7402d(String f7402d) {
        this.f7402d = f7402d;
        notifyPropertyChanged(BR.f7402d);
    }

    @Bindable
    public String getF7402e() {
        return f7402e;
    }

    public void setF7402e(String f7402e) {
        this.f7402e = f7402e;
        notifyPropertyChanged(BR.f7402e);
    }

    @Bindable
    public String getF7402f() {
        return f7402f;
    }

    public void setF7402f(String f7402f) {
        this.f7402f = f7402f;
        notifyPropertyChanged(BR.f7402f);
    }

    @Bindable
    public String getF7402g() {
        return f7402g;
    }

    public void setF7402g(String f7402g) {
        this.f7402g = f7402g;
        notifyPropertyChanged(BR.f7402g);
    }

    @Bindable
    public String getF7402h() {
        return f7402h;
    }

    public void setF7402h(String f7402h) {
        this.f7402h = f7402h;
        notifyPropertyChanged(BR.f7402h);
    }

    @Bindable
    public String getF7402i() {
        return f7402i;
    }

    public void setF7402i(String f7402i) {
        this.f7402i = f7402i;
        notifyPropertyChanged(BR.f7402i);
    }

    @Bindable
    public String getF7402j() {
        return f7402j;
    }

    public void setF7402j(String f7402j) {
        this.f7402j = f7402j;
        notifyPropertyChanged(BR.f7402j);
    }

    @Bindable
    public String getF7402k() {
        return f7402k;
    }

    public void setF7402k(String f7402k) {
        this.f7402k = f7402k;
        notifyPropertyChanged(BR.f7402k);
    }

    @Bindable
    public String getF740296() {
        return f740296;
    }

    public void setF740296(String f740296) {
        this.f740296 = f740296;
        notifyPropertyChanged(BR.f740296);
    }

    @Bindable
    public String getF740296x() {
        return f740296x;
    }

    public void setF740296x(String f740296x) {
        this.f740296x = f740296x;
        notifyPropertyChanged(BR.f740296x);
    }

    @Bindable
    public String getF7403() {
        return f7403;
    }

    public void setF7403(String f7403) {
        this.f7403 = f7403;
        notifyPropertyChanged(BR.f7403);
    }

    @Bindable
    public String getF7404() {
        return f7404;
    }

    public void setF7404(String f7404) {
        this.f7404 = f7404;
        notifyPropertyChanged(BR.f7404);
    }

    @Bindable
    public String getF7405() {
        return f7405;
    }

    public void setF7405(String f7405) {
        this.f7405 = f7405;
        notifyPropertyChanged(BR.f7405);
    }

    @Bindable
    public String getF740596x() {
        return f740596x;
    }

    public void setF740596x(String f740596x) {
        this.f740596x = f740596x;
        notifyPropertyChanged(BR.f740596x);
    }

    @Bindable
    public String getF7406() {
        return f7406;
    }

    public void setF7406(String f7406) {
        this.f7406 = f7406;
        notifyPropertyChanged(BR.f7406);
    }

    @Bindable
    public String getF7406mx() {
        return f7406mx;
    }

    public void setF7406mx(String f7406mx) {
        this.f7406mx = f7406mx;
        notifyPropertyChanged(BR.f7406mx);
    }

    @Bindable
    public String getF7406hx() {
        return f7406hx;
    }

    public void setF7406hx(String f7406hx) {
        this.f7406hx = f7406hx;
        notifyPropertyChanged(BR.f7406hx);
    }

    @Bindable
    public String getF7407() {
        return f7407;
    }

    public void setF7407(String f7407) {
        this.f7407 = f7407;
        notifyPropertyChanged(BR.f7407);
    }

    @Bindable
    public String getF7408() {
        return f7408;
    }

    public void setF7408(String f7408) {
        this.f7408 = f7408;
        notifyPropertyChanged(BR.f7408);
    }

    @Bindable
    public String getF7409() {
        return f7409;
    }

    public void setF7409(String f7409) {
        this.f7409 = f7409;
        notifyPropertyChanged(BR.f7409);
    }

    @Bindable
    public String getF7410() {
        return f7410;
    }

    public void setF7410(String f7410) {
        this.f7410 = f7410;
        notifyPropertyChanged(BR.f7410);
    }

    @Bindable
    public String getF7410a() {
        return f7410a;
    }

    public void setF7410a(String f7410a) {
        this.f7410a = f7410a;
        notifyPropertyChanged(BR.f7410a);
    }

    @Bindable
    public String getF7410b() {
        return f7410b;
    }

    public void setF7410b(String f7410b) {
        this.f7410b = f7410b;
        notifyPropertyChanged(BR.f7410b);
    }

    @Bindable
    public String getF7410c() {
        return f7410c;
    }

    public void setF7410c(String f7410c) {
        this.f7410c = f7410c;
        notifyPropertyChanged(BR.f7410c);
    }

    @Bindable
    public String getF741096() {
        return f741096;
    }

    public void setF741096(String f741096) {
        this.f741096 = f741096;
        notifyPropertyChanged(BR.f741096);
    }

    @Bindable
    public String getF741096x() {
        return f741096x;
    }

    public void setF741096x(String f741096x) {
        this.f741096x = f741096x;
        notifyPropertyChanged(BR.f741096x);
    }

    @Bindable
    public String getF7411() {
        return f7411;
    }

    public void setF7411(String f7411) {
        this.f7411 = f7411;
        notifyPropertyChanged(BR.f7411);
    }

    @Bindable
    public String getF7412() {
        return f7412;
    }

    public void setF7412(String f7412) {
        this.f7412 = f7412;
        notifyPropertyChanged(BR.f7412);
    }

    @Bindable
    public String getF7413() {
        return f7413;
    }

    public void setF7413(String f7413) {
        this.f7413 = f7413;
        notifyPropertyChanged(BR.f7413);
    }

    @Bindable
    public String getF7413a() {
        return f7413a;
    }

    public void setF7413a(String f7413a) {
        this.f7413a = f7413a;
        notifyPropertyChanged(BR.f7413a);
    }

    @Bindable
    public String getF7413b() {
        return f7413b;
    }

    public void setF7413b(String f7413b) {
        this.f7413b = f7413b;
        notifyPropertyChanged(BR.f7413b);
    }

    @Bindable
    public String getF7413c() {
        return f7413c;
    }

    public void setF7413c(String f7413c) {
        this.f7413c = f7413c;
        notifyPropertyChanged(BR.f7413c);
    }

    @Bindable
    public String getF7413d() {
        return f7413d;
    }

    public void setF7413d(String f7413d) {
        this.f7413d = f7413d;
        notifyPropertyChanged(BR.f7413d);
    }

    @Bindable
    public String getF7413e() {
        return f7413e;
    }

    public void setF7413e(String f7413e) {
        this.f7413e = f7413e;
        notifyPropertyChanged(BR.f7413e);
    }

    @Bindable
    public String getF7413f() {
        return f7413f;
    }

    public void setF7413f(String f7413f) {
        this.f7413f = f7413f;
        notifyPropertyChanged(BR.f7413f);
    }

    @Bindable
    public String getF7413g() {
        return f7413g;
    }

    public void setF7413g(String f7413g) {
        this.f7413g = f7413g;
        notifyPropertyChanged(BR.f7413g);
    }

    @Bindable
    public String getF7413h() {
        return f7413h;
    }

    public void setF7413h(String f7413h) {
        this.f7413h = f7413h;
        notifyPropertyChanged(BR.f7413h);
    }

    @Bindable
    public String getF741396() {
        return f741396;
    }

    public void setF741396(String f741396) {
        this.f741396 = f741396;
        notifyPropertyChanged(BR.f741396);
    }

    @Bindable
    public String getF741396x() {
        return f741396x;
    }

    public void setF741396x(String f741396x) {
        this.f741396x = f741396x;
        notifyPropertyChanged(BR.f741396x);
    }

    @Bindable
    public String getF7501() {
        return f7501;
    }

    public void setF7501(String f7501) {
        this.f7501 = f7501;
        notifyPropertyChanged(BR.f7501);
    }

    @Bindable
    public String getF7502() {
        return f7502;
    }

    public void setF7502(String f7502) {
        this.f7502 = f7502;
        notifyPropertyChanged(BR.f7502);
    }

    @Bindable
    public String getF7502a() {
        return f7502a;
    }

    public void setF7502a(String f7502a) {
        this.f7502a = f7502a;
        notifyPropertyChanged(BR.f7502a);
    }

    @Bindable
    public String getF7502b() {
        return f7502b;
    }

    public void setF7502b(String f7502b) {
        this.f7502b = f7502b;
        notifyPropertyChanged(BR.f7502b);
    }

    @Bindable
    public String getF7502c() {
        return f7502c;
    }

    public void setF7502c(String f7502c) {
        this.f7502c = f7502c;
        notifyPropertyChanged(BR.f7502c);
    }

    @Bindable
    public String getF7502d() {
        return f7502d;
    }

    public void setF7502d(String f7502d) {
        this.f7502d = f7502d;
        notifyPropertyChanged(BR.f7502d);
    }

    @Bindable
    public String getF7502e() {
        return f7502e;
    }

    public void setF7502e(String f7502e) {
        this.f7502e = f7502e;
        notifyPropertyChanged(BR.f7502e);
    }

    @Bindable
    public String getF7502f() {
        return f7502f;
    }

    public void setF7502f(String f7502f) {
        this.f7502f = f7502f;
        notifyPropertyChanged(BR.f7502f);
    }

    @Bindable
    public String getF7502g() {
        return f7502g;
    }

    public void setF7502g(String f7502g) {
        this.f7502g = f7502g;
        notifyPropertyChanged(BR.f7502g);
    }

    @Bindable
    public String getF750296() {
        return f750296;
    }

    public void setF750296(String f750296) {
        this.f750296 = f750296;
        notifyPropertyChanged(BR.f750296);
    }

    @Bindable
    public String getF750296x() {
        return f750296x;
    }

    public void setF750296x(String f750296x) {
        this.f750296x = f750296x;
        notifyPropertyChanged(BR.f750296x);
    }

    @Bindable
    public String getF7503() {
        return f7503;
    }

    public void setF7503(String f7503) {
        this.f7503 = f7503;
        notifyPropertyChanged(BR.f7503);
    }

    @Bindable
    public String getF7504d() {
        return f7504d;
    }

    public void setF7504d(String f7504d) {
        this.f7504d = f7504d;
        notifyPropertyChanged(BR.f7504d);
    }

    @Bindable
    public String getF7504h() {
        return f7504h;
    }

    public void setF7504h(String f7504h) {
        this.f7504h = f7504h;
        notifyPropertyChanged(BR.f7504h);
    }

    @Bindable
    public String getF7504m() {
        return f7504m;
    }

    public void setF7504m(String f7504m) {
        this.f7504m = f7504m;
        notifyPropertyChanged(BR.f7504m);
    }

    @Bindable
    public String getF7505() {
        return f7505;
    }

    public void setF7505(String f7505) {
        this.f7505 = f7505;
        notifyPropertyChanged(BR.f7505);
    }

    @Bindable
    public String getF7506() {
        return f7506;
    }

    public void setF7506(String f7506) {
        this.f7506 = f7506;
        notifyPropertyChanged(BR.f7506);
    }

    @Bindable
    public String getF7506a() {
        return f7506a;
    }

    public void setF7506a(String f7506a) {
        this.f7506a = f7506a;
        notifyPropertyChanged(BR.f7506a);
    }

    @Bindable
    public String getF7506b() {
        return f7506b;
    }

    public void setF7506b(String f7506b) {
        this.f7506b = f7506b;
        notifyPropertyChanged(BR.f7506b);
    }

    @Bindable
    public String getF7506c() {
        return f7506c;
    }

    public void setF7506c(String f7506c) {
        this.f7506c = f7506c;
        notifyPropertyChanged(BR.f7506c);
    }

    @Bindable
    public String getF7506d() {
        return f7506d;
    }

    public void setF7506d(String f7506d) {
        this.f7506d = f7506d;
        notifyPropertyChanged(BR.f7506d);
    }

    @Bindable
    public String getF750696() {
        return f750696;
    }

    public void setF750696(String f750696) {
        this.f750696 = f750696;
        notifyPropertyChanged(BR.f750696);
    }

    @Bindable
    public String getF750696x() {
        return f750696x;
    }

    public void setF750696x(String f750696x) {
        this.f750696x = f750696x;
        notifyPropertyChanged(BR.f750696x);
    }

    @Bindable
    public String getF7507() {
        return f7507;
    }

    public void setF7507(String f7507) {
        this.f7507 = f7507;
        notifyPropertyChanged(BR.f7507);
    }

    @Bindable
    public String getF750796x() {
        return f750796x;
    }

    public void setF750796x(String f750796x) {
        this.f750796x = f750796x;
        notifyPropertyChanged(BR.f750796x);
    }

    @Bindable
    public String getF7508() {
        return f7508;
    }

    public void setF7508(String f7508) {
        this.f7508 = f7508;
        notifyPropertyChanged(BR.f7508);
    }

    @Bindable
    public String getF7509() {
        return f7509;
    }

    public void setF7509(String f7509) {
        this.f7509 = f7509;
        notifyPropertyChanged(BR.f7509);
    }

    @Bindable
    public String getF8101() {
        return f8101;
    }

    public void setF8101(String f8101) {
        this.f8101 = f8101;
        notifyPropertyChanged(BR.f8101);
    }

    @Bindable
    public String getF8102() {
        return f8102;
    }

    public void setF8102(String f8102) {
        this.f8102 = f8102;
        notifyPropertyChanged(BR.f8102);
    }

    @Bindable
    public String getF8103() {
        return f8103;
    }

    public void setF8103(String f8103) {
        this.f8103 = f8103;
        notifyPropertyChanged(BR.f8103);
    }

    @Bindable
    public String getF8104() {
        return f8104;
    }

    public void setF8104(String f8104) {
        this.f8104 = f8104;
        notifyPropertyChanged(BR.f8104);
    }

    @Bindable
    public String getF8201() {
        return f8201;
    }

    public void setF8201(String f8201) {
        this.f8201 = f8201;
        notifyPropertyChanged(BR.f8201);
    }

    @Bindable
    public String getF8202() {
        return f8202;
    }

    public void setF8202(String f8202) {
        this.f8202 = f8202;
        notifyPropertyChanged(BR.f8202);
    }

    @Bindable
    public String getF8203() {
        return f8203;
    }

    public void setF8203(String f8203) {
        this.f8203 = f8203;
        notifyPropertyChanged(BR.f8203);
    }

    @Bindable
    public String getF8204() {
        return f8204;
    }

    public void setF8204(String f8204) {
        this.f8204 = f8204;
        notifyPropertyChanged(BR.f8204);
    }

    @Bindable
    public String getF8205() {
        return f8205;
    }

    public void setF8205(String f8205) {
        this.f8205 = f8205;
        notifyPropertyChanged(BR.f8205);
    }

    @Bindable
    public String getF8206() {
        return f8206;
    }

    public void setF8206(String f8206) {
        this.f8206 = f8206;
        notifyPropertyChanged(BR.f8206);
    }

    @Bindable
    public String getF8207() {
        return f8207;
    }

    public void setF8207(String f8207) {
        this.f8207 = f8207;
        notifyPropertyChanged(BR.f8207);
    }

    @Bindable
    public String getF8208() {
        return f8208;
    }

    public void setF8208(String f8208) {
        this.f8208 = f8208;
        notifyPropertyChanged(BR.f8208);
    }

    @Bindable
    public String getF8208a() {
        return f8208a;
    }

    public void setF8208a(String f8208a) {
        this.f8208a = f8208a;
        notifyPropertyChanged(BR.f8208a);
    }

    @Bindable
    public String getF8208b() {
        return f8208b;
    }

    public void setF8208b(String f8208b) {
        this.f8208b = f8208b;
        notifyPropertyChanged(BR.f8208b);
    }

    @Bindable
    public String getF8208c() {
        return f8208c;
    }

    public void setF8208c(String f8208c) {
        this.f8208c = f8208c;
        notifyPropertyChanged(BR.f8208c);
    }

    @Bindable
    public String getF8208d() {
        return f8208d;
    }

    public void setF8208d(String f8208d) {
        this.f8208d = f8208d;
        notifyPropertyChanged(BR.f8208d);
    }

    @Bindable
    public String getF8208e() {
        return f8208e;
    }

    public void setF8208e(String f8208e) {
        this.f8208e = f8208e;
        notifyPropertyChanged(BR.f8208e);
    }

    @Bindable
    public String getF8208f() {
        return f8208f;
    }

    public void setF8208f(String f8208f) {
        this.f8208f = f8208f;
        notifyPropertyChanged(BR.f8208f);
    }

    @Bindable
    public String getF820896() {
        return f820896;
    }

    public void setF820896(String f820896) {
        this.f820896 = f820896;
        notifyPropertyChanged(BR.f820896);
    }

    @Bindable
    public String getF820896x() {
        return f820896x;
    }

    public void setF820896x(String f820896x) {
        this.f820896x = f820896x;
        notifyPropertyChanged(BR.f820896x);
    }

    @Bindable
    public String getF8209() {
        return f8209;
    }

    public void setF8209(String f8209) {
        this.f8209 = f8209;
        notifyPropertyChanged(BR.f8209);
    }

    @Bindable
    public String getF8210h() {
        return f8210h;
    }

    public void setF8210h(String f8210h) {
        this.f8210h = f8210h;
        notifyPropertyChanged(BR.f8210h);
    }

    @Bindable
    public String getF8210m() {
        return f8210m;
    }

    public void setF8210m(String f8210m) {
        this.f8210m = f8210m;
        notifyPropertyChanged(BR.f8210m);
    }

    @Bindable
    public String getF8211() {
        return f8211;
    }

    public void setF8211(String f8211) {
        this.f8211 = f8211;
        notifyPropertyChanged(BR.f8211);
    }

    @Bindable
    public String getF8301() {
        return f8301;
    }

    public void setF8301(String f8301) {
        this.f8301 = f8301;
        notifyPropertyChanged(BR.f8301);
    }

    @Bindable
    public String getF8302() {
        return f8302;
    }

    public void setF8302(String f8302) {
        this.f8302 = f8302;
        notifyPropertyChanged(BR.f8302);
    }

    @Bindable
    public String getF8303() {
        return f8303;
    }

    public void setF8303(String f8303) {
        this.f8303 = f8303;
        notifyPropertyChanged(BR.f8303);
    }

    @Bindable
    public String getF8304() {
        return f8304;
    }

    public void setF8304(String f8304) {
        this.f8304 = f8304;
        notifyPropertyChanged(BR.f8304);
    }

    @Bindable
    public String getF8305() {
        return f8305;
    }

    public void setF8305(String f8305) {
        this.f8305 = f8305;
        notifyPropertyChanged(BR.f8305);
    }

    @Bindable
    public String getF8306() {
        return f8306;
    }

    public void setF8306(String f8306) {
        this.f8306 = f8306;
        notifyPropertyChanged(BR.f8306);
    }

    @Bindable
    public String getF8307() {
        return f8307;
    }

    public void setF8307(String f8307) {
        this.f8307 = f8307;
        notifyPropertyChanged(BR.f8307);
    }

    @Bindable
    public String getF8308() {
        return f8308;
    }

    public void setF8308(String f8308) {
        this.f8308 = f8308;
        notifyPropertyChanged(BR.f8308);
    }

    @Bindable
    public String getF8308a() {
        return f8308a;
    }

    public void setF8308a(String f8308a) {
        this.f8308a = f8308a;
        notifyPropertyChanged(BR.f8308a);
    }

    @Bindable
    public String getF8308b() {
        return f8308b;
    }

    public void setF8308b(String f8308b) {
        this.f8308b = f8308b;
        notifyPropertyChanged(BR.f8308b);
    }

    @Bindable
    public String getF8308c() {
        return f8308c;
    }

    public void setF8308c(String f8308c) {
        this.f8308c = f8308c;
        notifyPropertyChanged(BR.f8308c);
    }

    @Bindable
    public String getF8308d() {
        return f8308d;
    }

    public void setF8308d(String f8308d) {
        this.f8308d = f8308d;
        notifyPropertyChanged(BR.f8308d);
    }

    @Bindable
    public String getF8308e() {
        return f8308e;
    }

    public void setF8308e(String f8308e) {
        this.f8308e = f8308e;
        notifyPropertyChanged(BR.f8308e);
    }

    @Bindable
    public String getF8308f() {
        return f8308f;
    }

    public void setF8308f(String f8308f) {
        this.f8308f = f8308f;
        notifyPropertyChanged(BR.f8308f);
    }

    @Bindable
    public String getF830896() {
        return f830896;
    }

    public void setF830896(String f830896) {
        this.f830896 = f830896;
        notifyPropertyChanged(BR.f830896);
    }

    @Bindable
    public String getF830896x() {
        return f830896x;
    }

    public void setF830896x(String f830896x) {
        this.f830896x = f830896x;
        notifyPropertyChanged(BR.f830896x);
    }

    @Bindable
    public String getF8309() {
        return f8309;
    }

    public void setF8309(String f8309) {
        this.f8309 = f8309;
        notifyPropertyChanged(BR.f8309);
    }

    @Bindable
    public String getF8310h() {
        return f8310h;
    }

    public void setF8310h(String f8310h) {
        this.f8310h = f8310h;
        notifyPropertyChanged(BR.f8310h);
    }

    @Bindable
    public String getF8310m() {
        return f8310m;
    }

    public void setF8310m(String f8310m) {
        this.f8310m = f8310m;
        notifyPropertyChanged(BR.f8310m);
    }

    @Bindable
    public String getF8311() {
        return f8311;
    }

    public void setF8311(String f8311) {
        this.f8311 = f8311;
        notifyPropertyChanged(BR.f8311);
    }

    @Bindable
    public String getF8401() {
        return f8401;
    }

    public void setF8401(String f8401) {
        this.f8401 = f8401;
        notifyPropertyChanged(BR.f8401);
    }

    @Bindable
    public String getF8402() {
        return f8402;
    }

    public void setF8402(String f8402) {
        this.f8402 = f8402;
        notifyPropertyChanged(BR.f8402);
    }

    @Bindable
    public String getF8403() {
        return f8403;
    }

    public void setF8403(String f8403) {
        this.f8403 = f8403;
        notifyPropertyChanged(BR.f8403);
    }

    @Bindable
    public String getF8404() {
        return f8404;
    }

    public void setF8404(String f8404) {
        this.f8404 = f8404;
        notifyPropertyChanged(BR.f8404);
    }

    @Bindable
    public String getF8405() {
        return f8405;
    }

    public void setF8405(String f8405) {
        this.f8405 = f8405;
        notifyPropertyChanged(BR.f8405);
    }

    @Bindable
    public String getF8406() {
        return f8406;
    }

    public void setF8406(String f8406) {
        this.f8406 = f8406;
        notifyPropertyChanged(BR.f8406);
    }

    @Bindable
    public String getF8407() {
        return f8407;
    }

    public void setF8407(String f8407) {
        this.f8407 = f8407;
        notifyPropertyChanged(BR.f8407);
    }

    @Bindable
    public String getF8408() {
        return f8408;
    }

    public void setF8408(String f8408) {
        this.f8408 = f8408;
        notifyPropertyChanged(BR.f8408);
    }

    @Bindable
    public String getF8408a() {
        return f8408a;
    }

    public void setF8408a(String f8408a) {
        this.f8408a = f8408a;
        notifyPropertyChanged(BR.f8408a);
    }

    @Bindable
    public String getF8408b() {
        return f8408b;
    }

    public void setF8408b(String f8408b) {
        this.f8408b = f8408b;
        notifyPropertyChanged(BR.f8408b);
    }

    @Bindable
    public String getF8408c() {
        return f8408c;
    }

    public void setF8408c(String f8408c) {
        this.f8408c = f8408c;
        notifyPropertyChanged(BR.f8408c);
    }

    @Bindable
    public String getF8408d() {
        return f8408d;
    }

    public void setF8408d(String f8408d) {
        this.f8408d = f8408d;
        notifyPropertyChanged(BR.f8408d);
    }

    @Bindable
    public String getF8408e() {
        return f8408e;
    }

    public void setF8408e(String f8408e) {
        this.f8408e = f8408e;
        notifyPropertyChanged(BR.f8408e);
    }

    @Bindable
    public String getF8408f() {
        return f8408f;
    }

    public void setF8408f(String f8408f) {
        this.f8408f = f8408f;
        notifyPropertyChanged(BR.f8408f);
    }

    @Bindable
    public String getF840896() {
        return f840896;
    }

    public void setF840896(String f840896) {
        this.f840896 = f840896;
        notifyPropertyChanged(BR.f840896);
    }

    @Bindable
    public String getF840896x() {
        return f840896x;
    }

    public void setF840896x(String f840896x) {
        this.f840896x = f840896x;
        notifyPropertyChanged(BR.f840896x);
    }

    @Bindable
    public String getF8409() {
        return f8409;
    }

    public void setF8409(String f8409) {
        this.f8409 = f8409;
        notifyPropertyChanged(BR.f8409);
    }

    @Bindable
    public String getF8410h() {
        return f8410h;
    }

    public void setF8410h(String f8410h) {
        this.f8410h = f8410h;
        notifyPropertyChanged(BR.f8410h);
    }

    @Bindable
    public String getF8410m() {
        return f8410m;
    }

    public void setF8410m(String f8410m) {
        this.f8410m = f8410m;
        notifyPropertyChanged(BR.f8410m);
    }

    @Bindable
    public String getF8411() {
        return f8411;
    }

    public void setF8411(String f8411) {
        this.f8411 = f8411;
        notifyPropertyChanged(BR.f8411);
    }

    @Bindable
    public String getF8501() {
        return f8501;
    }

    public void setF8501(String f8501) {
        this.f8501 = f8501;
        notifyPropertyChanged(BR.f8501);
    }

    @Bindable
    public String getF8502() {
        return f8502;
    }

    public void setF8502(String f8502) {
        this.f8502 = f8502;
        notifyPropertyChanged(BR.f8502);
    }

    @Bindable
    public String getF8503() {
        return f8503;
    }

    public void setF8503(String f8503) {
        this.f8503 = f8503;
        notifyPropertyChanged(BR.f8503);
    }

    @Bindable
    public String getF8504() {
        return f8504;
    }

    public void setF8504(String f8504) {
        this.f8504 = f8504;
        notifyPropertyChanged(BR.f8504);
    }

    @Bindable
    public String getF8505() {
        return f8505;
    }

    public void setF8505(String f8505) {
        this.f8505 = f8505;
        notifyPropertyChanged(BR.f8505);
    }

    @Bindable
    public String getF8506() {
        return f8506;
    }

    public void setF8506(String f8506) {
        this.f8506 = f8506;
        notifyPropertyChanged(BR.f8506);
    }

    @Bindable
    public String getF8507() {
        return f8507;
    }

    public void setF8507(String f8507) {
        this.f8507 = f8507;
        notifyPropertyChanged(BR.f8507);
    }

    @Bindable
    public String getF8508() {
        return f8508;
    }

    public void setF8508(String f8508) {
        this.f8508 = f8508;
        notifyPropertyChanged(BR.f8508);
    }

    @Bindable
    public String getF8508a() {
        return f8508a;
    }

    public void setF8508a(String f8508a) {
        this.f8508a = f8508a;
        notifyPropertyChanged(BR.f8508a);
    }

    @Bindable
    public String getF8508b() {
        return f8508b;
    }

    public void setF8508b(String f8508b) {
        this.f8508b = f8508b;
        notifyPropertyChanged(BR.f8508b);
    }

    @Bindable
    public String getF8508c() {
        return f8508c;
    }

    public void setF8508c(String f8508c) {
        this.f8508c = f8508c;
        notifyPropertyChanged(BR.f8508c);
    }

    @Bindable
    public String getF8508d() {
        return f8508d;
    }

    public void setF8508d(String f8508d) {
        this.f8508d = f8508d;
        notifyPropertyChanged(BR.f8508d);
    }

    @Bindable
    public String getF8508e() {
        return f8508e;
    }

    public void setF8508e(String f8508e) {
        this.f8508e = f8508e;
        notifyPropertyChanged(BR.f8508e);
    }

    @Bindable
    public String getF8508f() {
        return f8508f;
    }

    public void setF8508f(String f8508f) {
        this.f8508f = f8508f;
        notifyPropertyChanged(BR.f8508f);
    }

    @Bindable
    public String getF850896() {
        return f850896;
    }

    public void setF850896(String f850896) {
        this.f850896 = f850896;
        notifyPropertyChanged(BR.f850896);
    }

    @Bindable
    public String getF850896x() {
        return f850896x;
    }

    public void setF850896x(String f850896x) {
        this.f850896x = f850896x;
        notifyPropertyChanged(BR.f850896x);
    }

    @Bindable
    public String getF8509() {
        return f8509;
    }

    public void setF8509(String f8509) {
        this.f8509 = f8509;
        notifyPropertyChanged(BR.f8509);
    }

    @Bindable
    public String getF8510h() {
        return f8510h;
    }

    public void setF8510h(String f8510h) {
        this.f8510h = f8510h;
        notifyPropertyChanged(BR.f8510h);
    }

    @Bindable
    public String getF8510m() {
        return f8510m;
    }

    public void setF8510m(String f8510m) {
        this.f8510m = f8510m;
        notifyPropertyChanged(BR.f8510m);
    }

    @Bindable
    public String getF8511() {
        return f8511;
    }

    public void setF8511(String f8511) {
        this.f8511 = f8511;
        notifyPropertyChanged(BR.f8511);
    }

    @Bindable
    public String getF8601() {
        return f8601;
    }

    public void setF8601(String f8601) {
        this.f8601 = f8601;
        notifyPropertyChanged(BR.f8601);
    }

    @Bindable
    public String getF8602() {
        return f8602;
    }

    public void setF8602(String f8602) {
        this.f8602 = f8602;
        notifyPropertyChanged(BR.f8602);
    }

    @Bindable
    public String getF8603() {
        return f8603;
    }

    public void setF8603(String f8603) {
        this.f8603 = f8603;
        notifyPropertyChanged(BR.f8603);
    }

    @Bindable
    public String getF8604() {
        return f8604;
    }

    public void setF8604(String f8604) {
        this.f8604 = f8604;
        notifyPropertyChanged(BR.f8604);
    }

    @Bindable
    public String getF8605() {
        return f8605;
    }

    public void setF8605(String f8605) {
        this.f8605 = f8605;
        notifyPropertyChanged(BR.f8605);
    }

    @Bindable
    public String getF8606() {
        return f8606;
    }

    public void setF8606(String f8606) {
        this.f8606 = f8606;
        notifyPropertyChanged(BR.f8606);
    }

    @Bindable
    public String getF8607() {
        return f8607;
    }

    public void setF8607(String f8607) {
        this.f8607 = f8607;
        notifyPropertyChanged(BR.f8607);
    }

    @Bindable
    public String getF8608() {
        return f8608;
    }

    public void setF8608(String f8608) {
        this.f8608 = f8608;
        notifyPropertyChanged(BR.f8608);
    }

    @Bindable
    public String getF8608a() {
        return f8608a;
    }

    public void setF8608a(String f8608a) {
        this.f8608a = f8608a;
        notifyPropertyChanged(BR.f8608a);
    }

    @Bindable
    public String getF8608b() {
        return f8608b;
    }

    public void setF8608b(String f8608b) {
        this.f8608b = f8608b;
        notifyPropertyChanged(BR.f8608b);
    }

    @Bindable
    public String getF8608c() {
        return f8608c;
    }

    public void setF8608c(String f8608c) {
        this.f8608c = f8608c;
        notifyPropertyChanged(BR.f8608c);
    }

    @Bindable
    public String getF8608d() {
        return f8608d;
    }

    public void setF8608d(String f8608d) {
        this.f8608d = f8608d;
        notifyPropertyChanged(BR.f8608d);
    }

    @Bindable
    public String getF8608e() {
        return f8608e;
    }

    public void setF8608e(String f8608e) {
        this.f8608e = f8608e;
        notifyPropertyChanged(BR.f8608e);
    }

    @Bindable
    public String getF8608f() {
        return f8608f;
    }

    public void setF8608f(String f8608f) {
        this.f8608f = f8608f;
        notifyPropertyChanged(BR.f8608f);
    }

    @Bindable
    public String getF860896() {
        return f860896;
    }

    public void setF860896(String f860896) {
        this.f860896 = f860896;
        notifyPropertyChanged(BR.f860896);
    }

    @Bindable
    public String getF860896x() {
        return f860896x;
    }

    public void setF860896x(String f860896x) {
        this.f860896x = f860896x;
        notifyPropertyChanged(BR.f860896x);
    }

    @Bindable
    public String getF8609() {
        return f8609;
    }

    public void setF8609(String f8609) {
        this.f8609 = f8609;
        notifyPropertyChanged(BR.f8609);
    }

    @Bindable
    public String getF8610h() {
        return f8610h;
    }

    public void setF8610h(String f8610h) {
        this.f8610h = f8610h;
        notifyPropertyChanged(BR.f8610h);
    }

    @Bindable
    public String getF8610m() {
        return f8610m;
    }

    public void setF8610m(String f8610m) {
        this.f8610m = f8610m;
        notifyPropertyChanged(BR.f8610m);
    }

    @Bindable
    public String getF8611() {
        return f8611;
    }

    public void setF8611(String f8611) {
        this.f8611 = f8611;
        notifyPropertyChanged(BR.f8611);
    }

    @Bindable
    public String getF8701() {
        return f8701;
    }

    public void setF8701(String f8701) {
        this.f8701 = f8701;
        notifyPropertyChanged(BR.f8701);
    }

    @Bindable
    public String getF8702() {
        return f8702;
    }

    public void setF8702(String f8702) {
        this.f8702 = f8702;
        notifyPropertyChanged(BR.f8702);
    }

    @Bindable
    public String getF8703() {
        return f8703;
    }

    public void setF8703(String f8703) {
        this.f8703 = f8703;
        notifyPropertyChanged(BR.f8703);
    }

    @Bindable
    public String getF8704() {
        return f8704;
    }

    public void setF8704(String f8704) {
        this.f8704 = f8704;
        notifyPropertyChanged(BR.f8704);
    }

    @Bindable
    public String getF8705() {
        return f8705;
    }

    public void setF8705(String f8705) {
        this.f8705 = f8705;
        notifyPropertyChanged(BR.f8705);
    }

    @Bindable
    public String getF8706() {
        return f8706;
    }

    public void setF8706(String f8706) {
        this.f8706 = f8706;
        notifyPropertyChanged(BR.f8706);
    }

    @Bindable
    public String getF8707() {
        return f8707;
    }

    public void setF8707(String f8707) {
        this.f8707 = f8707;
        notifyPropertyChanged(BR.f8707);
    }

    @Bindable
    public String getF8708() {
        return f8708;
    }

    public void setF8708(String f8708) {
        this.f8708 = f8708;
        notifyPropertyChanged(BR.f8708);
    }

    @Bindable
    public String getF8708a() {
        return f8708a;
    }

    public void setF8708a(String f8708a) {
        this.f8708a = f8708a;
        notifyPropertyChanged(BR.f8708a);
    }

    @Bindable
    public String getF8708b() {
        return f8708b;
    }

    public void setF8708b(String f8708b) {
        this.f8708b = f8708b;
        notifyPropertyChanged(BR.f8708b);
    }

    @Bindable
    public String getF8708c() {
        return f8708c;
    }

    public void setF8708c(String f8708c) {
        this.f8708c = f8708c;
        notifyPropertyChanged(BR.f8708c);
    }

    @Bindable
    public String getF8708d() {
        return f8708d;
    }

    public void setF8708d(String f8708d) {
        this.f8708d = f8708d;
        notifyPropertyChanged(BR.f8708d);
    }

    @Bindable
    public String getF8708e() {
        return f8708e;
    }

    public void setF8708e(String f8708e) {
        this.f8708e = f8708e;
        notifyPropertyChanged(BR.f8708e);
    }

    @Bindable
    public String getF8708f() {
        return f8708f;
    }

    public void setF8708f(String f8708f) {
        this.f8708f = f8708f;
        notifyPropertyChanged(BR.f8708f);
    }

    @Bindable
    public String getF870896() {
        return f870896;
    }

    public void setF870896(String f870896) {
        this.f870896 = f870896;
        notifyPropertyChanged(BR.f870896);
    }

    @Bindable
    public String getF870896x() {
        return f870896x;
    }

    public void setF870896x(String f870896x) {
        this.f870896x = f870896x;
        notifyPropertyChanged(BR.f870896x);
    }

    @Bindable
    public String getF8709() {
        return f8709;
    }

    public void setF8709(String f8709) {
        this.f8709 = f8709;
        notifyPropertyChanged(BR.f8709);
    }

    @Bindable
    public String getF8710h() {
        return f8710h;
    }

    public void setF8710h(String f8710h) {
        this.f8710h = f8710h;
        notifyPropertyChanged(BR.f8710h);
    }

    @Bindable
    public String getF8710m() {
        return f8710m;
    }

    public void setF8710m(String f8710m) {
        this.f8710m = f8710m;
        notifyPropertyChanged(BR.f8710m);
    }

    @Bindable
    public String getF8711() {
        return f8711;
    }

    public void setF8711(String f8711) {
        this.f8711 = f8711;
        notifyPropertyChanged(BR.f8711);
    }

    @Bindable
    public String getF9101() {
        return f9101;
    }

    public void setF9101(String f9101) {
        this.f9101 = f9101;
        notifyPropertyChanged(BR.f9101);
    }

    @Bindable
    public String getF9102() {
        return f9102;
    }

    public void setF9102(String f9102) {
        this.f9102 = f9102;
        notifyPropertyChanged(BR.f9102);
    }

    @Bindable
    public String getF9103() {
        return f9103;
    }

    public void setF9103(String f9103) {
        this.f9103 = f9103;
        notifyPropertyChanged(BR.f9103);
    }

    @Bindable
    public String getF9201() {
        return f9201;
    }

    public void setF9201(String f9201) {
        this.f9201 = f9201;
        notifyPropertyChanged(BR.f9201);
    }

    @Bindable
    public String getF9202() {
        return f9202;
    }

    public void setF9202(String f9202) {
        this.f9202 = f9202;
        notifyPropertyChanged(BR.f9202);
    }

    @Bindable
    public String getF9203() {
        return f9203;
    }

    public void setF9203(String f9203) {
        this.f9203 = f9203;
        notifyPropertyChanged(BR.f9203);
    }

    @Bindable
    public String getF9203a() {
        return f9203a;
    }

    public void setF9203a(String f9203a) {
        this.f9203a = f9203a;
        notifyPropertyChanged(BR.f9203a);
    }

    @Bindable
    public String getF9203b() {
        return f9203b;
    }

    public void setF9203b(String f9203b) {
        this.f9203b = f9203b;
        notifyPropertyChanged(BR.f9203b);
    }

    @Bindable
    public String getF9203c() {
        return f9203c;
    }

    public void setF9203c(String f9203c) {
        this.f9203c = f9203c;
        notifyPropertyChanged(BR.f9203c);
    }

    @Bindable
    public String getF9203d() {
        return f9203d;
    }

    public void setF9203d(String f9203d) {
        this.f9203d = f9203d;
        notifyPropertyChanged(BR.f9203d);
    }

    @Bindable
    public String getF9203e() {
        return f9203e;
    }

    public void setF9203e(String f9203e) {
        this.f9203e = f9203e;
        notifyPropertyChanged(BR.f9203e);
    }

    @Bindable
    public String getF9203f() {
        return f9203f;
    }

    public void setF9203f(String f9203f) {
        this.f9203f = f9203f;
        notifyPropertyChanged(BR.f9203f);
    }

    @Bindable
    public String getF9203g() {
        return f9203g;
    }

    public void setF9203g(String f9203g) {
        this.f9203g = f9203g;
        notifyPropertyChanged(BR.f9203g);
    }

    @Bindable
    public String getF9203h() {
        return f9203h;
    }

    public void setF9203h(String f9203h) {
        this.f9203h = f9203h;
        notifyPropertyChanged(BR.f9203h);
    }

    @Bindable
    public String getF9203i() {
        return f9203i;
    }

    public void setF9203i(String f9203i) {
        this.f9203i = f9203i;
        notifyPropertyChanged(BR.f9203i);
    }

    @Bindable
    public String getF920396() {
        return f920396;
    }

    public void setF920396(String f920396) {
        this.f920396 = f920396;
        notifyPropertyChanged(BR.f920396);
    }

    @Bindable
    public String getF920396x() {
        return f920396x;
    }

    public void setF920396x(String f920396x) {
        this.f920396x = f920396x;
        notifyPropertyChanged(BR.f920396x);
    }

    @Bindable
    public String getF9204() {
        return f9204;
    }

    public void setF9204(String f9204) {
        this.f9204 = f9204;
        notifyPropertyChanged(BR.f9204);
    }

    @Bindable
    public String getF9204hx() {
        return f9204hx;
    }

    public void setF9204hx(String f9204hx) {
        this.f9204hx = f9204hx;
        notifyPropertyChanged(BR.f9204hx);
    }

    @Bindable
    public String getF9204mx() {
        return f9204mx;
    }

    public void setF9204mx(String f9204mx) {
        this.f9204mx = f9204mx;
        notifyPropertyChanged(BR.f9204mx);
    }

    @Bindable
    public String getF9204dx() {
        return f9204dx;
    }

    public void setF9204dx(String f9204dx) {
        this.f9204dx = f9204dx;
        notifyPropertyChanged(BR.f9204dx);
    }

    @Bindable
    public String getF9301() {
        return f9301;
    }

    public void setF9301(String f9301) {
        this.f9301 = f9301;
        notifyPropertyChanged(BR.f9301);
    }

    @Bindable
    public String getF9302() {
        return f9302;
    }

    public void setF9302(String f9302) {
        this.f9302 = f9302;
        notifyPropertyChanged(BR.f9302);
    }

    @Bindable
    public String getF9303() {
        return f9303;
    }

    public void setF9303(String f9303) {
        this.f9303 = f9303;
        notifyPropertyChanged(BR.f9303);
    }

    @Bindable
    public String getF9304() {
        return f9304;
    }

    public void setF9304(String f9304) {
        this.f9304 = f9304;
        notifyPropertyChanged(BR.f9304);
    }

    @Bindable
    public String getF9305a() {
        return f9305a;
    }

    public void setF9305a(String f9305a) {
        this.f9305a = f9305a;
        notifyPropertyChanged(BR.f9305a);
    }

    @Bindable
    public String getF9305b() {
        return f9305b;
    }

    public void setF9305b(String f9305b) {
        this.f9305b = f9305b;
        notifyPropertyChanged(BR.f9305b);
    }

    @Bindable
    public String getF9306() {
        return f9306;
    }

    public void setF9306(String f9306) {
        this.f9306 = f9306;
        notifyPropertyChanged(BR.f9306);
    }

    @Bindable
    public String getF9307() {
        return f9307;
    }

    public void setF9307(String f9307) {
        this.f9307 = f9307;
        notifyPropertyChanged(BR.f9307);
    }

    @Bindable
    public String getF9308() {
        return f9308;
    }

    public void setF9308(String f9308) {
        this.f9308 = f9308;
        notifyPropertyChanged(BR.f9308);
    }

    @Bindable
    public String getF9309() {
        return f9309;
    }

    public void setF9309(String f9309) {
        this.f9309 = f9309;
        notifyPropertyChanged(BR.f9309);
    }

    @Bindable
    public String getF9310() {
        return f9310;
    }

    public void setF9310(String f9310) {
        this.f9310 = f9310;
        notifyPropertyChanged(BR.f9310);
    }

    @Bindable
    public String getF9311() {
        return f9311;
    }

    public void setF9311(String f9311) {
        this.f9311 = f9311;
        notifyPropertyChanged(BR.f9311);
    }

    @Bindable
    public String getF9312() {
        return f9312;
    }

    public void setF9312(String f9312) {
        this.f9312 = f9312;
        notifyPropertyChanged(BR.f9312);
    }

    @Bindable
    public String getF9313() {
        return f9313;
    }

    public void setF9313(String f9313) {
        this.f9313 = f9313;
        notifyPropertyChanged(BR.f9313);
    }

    @Bindable
    public String getF9313a() {
        return f9313a;
    }

    public void setF9313a(String f9313a) {
        this.f9313a = f9313a;
        notifyPropertyChanged(BR.f9313a);
    }

    @Bindable
    public String getF9313b() {
        return f9313b;
    }

    public void setF9313b(String f9313b) {
        this.f9313b = f9313b;
        notifyPropertyChanged(BR.f9313b);
    }

    @Bindable
    public String getF9313c() {
        return f9313c;
    }

    public void setF9313c(String f9313c) {
        this.f9313c = f9313c;
        notifyPropertyChanged(BR.f9313c);
    }

    @Bindable
    public String getF9313d() {
        return f9313d;
    }

    public void setF9313d(String f9313d) {
        this.f9313d = f9313d;
        notifyPropertyChanged(BR.f9313d);
    }

    @Bindable
    public String getF9313e() {
        return f9313e;
    }

    public void setF9313e(String f9313e) {
        this.f9313e = f9313e;
        notifyPropertyChanged(BR.f9313e);
    }

    @Bindable
    public String getF9314() {
        return f9314;
    }

    public void setF9314(String f9314) {
        this.f9314 = f9314;
        notifyPropertyChanged(BR.f9314);
    }

    @Bindable
    public String getF9315() {
        return f9315;
    }

    public void setF9315(String f9315) {
        this.f9315 = f9315;
        notifyPropertyChanged(BR.f9315);
    }

    @Bindable
    public String getF9316() {
        return f9316;
    }

    public void setF9316(String f9316) {
        this.f9316 = f9316;
        notifyPropertyChanged(BR.f9316);
    }

    @Bindable
    public String getF9317() {
        return f9317;
    }

    public void setF9317(String f9317) {
        this.f9317 = f9317;
        notifyPropertyChanged(BR.f9317);
    }

    @Bindable
    public String getF9318() {
        return f9318;
    }

    public void setF9318(String f9318) {
        this.f9318 = f9318;
        notifyPropertyChanged(BR.f9318);
    }

    @Bindable
    public String getF9319() {
        return f9319;
    }

    public void setF9319(String f9319) {
        this.f9319 = f9319;
        notifyPropertyChanged(BR.f9319);
    }

    @Bindable
    public String getF9320() {
        return f9320;
    }

    public void setF9320(String f9320) {
        this.f9320 = f9320;
        notifyPropertyChanged(BR.f9320);
    }

    @Bindable
    public String getF9321() {
        return f9321;
    }

    public void setF9321(String f9321) {
        this.f9321 = f9321;
        notifyPropertyChanged(BR.f9321);
    }

    @Bindable
    public String getF9322() {
        return f9322;
    }

    public void setF9322(String f9322) {
        this.f9322 = f9322;
        notifyPropertyChanged(BR.f9322);
    }

    @Bindable
    public String getF9401() {
        return f9401;
    }

    public void setF9401(String f9401) {
        this.f9401 = f9401;
        notifyPropertyChanged(BR.f9401);
    }

    @Bindable
    public String getF9402() {
        return f9402;
    }

    public void setF9402(String f9402) {
        this.f9402 = f9402;
        notifyPropertyChanged(BR.f9402);
    }

    @Bindable
    public String getF9402a() {
        return f9402a;
    }

    public void setF9402a(String f9402a) {
        this.f9402a = f9402a;
        notifyPropertyChanged(BR.f9402a);
    }

    @Bindable
    public String getF9402b() {
        return f9402b;
    }

    public void setF9402b(String f9402b) {
        this.f9402b = f9402b;
        notifyPropertyChanged(BR.f9402b);
    }

    @Bindable
    public String getF9402c() {
        return f9402c;
    }

    public void setF9402c(String f9402c) {
        this.f9402c = f9402c;
        notifyPropertyChanged(BR.f9402c);
    }

    @Bindable
    public String getF9402d() {
        return f9402d;
    }

    public void setF9402d(String f9402d) {
        this.f9402d = f9402d;
        notifyPropertyChanged(BR.f9402d);
    }

    @Bindable
    public String getF9402e() {
        return f9402e;
    }

    public void setF9402e(String f9402e) {
        this.f9402e = f9402e;
        notifyPropertyChanged(BR.f9402e);
    }

    @Bindable
    public String getF9402f() {
        return f9402f;
    }

    public void setF9402f(String f9402f) {
        this.f9402f = f9402f;
        notifyPropertyChanged(BR.f9402f);
    }

    @Bindable
    public String getF9402g() {
        return f9402g;
    }

    public void setF9402g(String f9402g) {
        this.f9402g = f9402g;
        notifyPropertyChanged(BR.f9402g);
    }

    @Bindable
    public String getF9402h() {
        return f9402h;
    }

    public void setF9402h(String f9402h) {
        this.f9402h = f9402h;
        notifyPropertyChanged(BR.f9402h);
    }

    @Bindable
    public String getF9402i() {
        return f9402i;
    }

    public void setF9402i(String f9402i) {
        this.f9402i = f9402i;
        notifyPropertyChanged(BR.f9402i);
    }

    @Bindable
    public String getF9402j() {
        return f9402j;
    }

    public void setF9402j(String f9402j) {
        this.f9402j = f9402j;
        notifyPropertyChanged(BR.f9402j);
    }

    @Bindable
    public String getF9402k() {
        return f9402k;
    }

    public void setF9402k(String f9402k) {
        this.f9402k = f9402k;
        notifyPropertyChanged(BR.f9402k);
    }

    @Bindable
    public String getF940296() {
        return f940296;
    }

    public void setF940296(String f940296) {
        this.f940296 = f940296;
        notifyPropertyChanged(BR.f940296);
    }

    @Bindable
    public String getF940296x() {
        return f940296x;
    }

    public void setF940296x(String f940296x) {
        this.f940296x = f940296x;
        notifyPropertyChanged(BR.f940296x);
    }

    @Bindable
    public String getF9403() {
        return f9403;
    }

    public void setF9403(String f9403) {
        this.f9403 = f9403;
        notifyPropertyChanged(BR.f9403);
    }

    @Bindable
    public String getF9404() {
        return f9404;
    }

    public void setF9404(String f9404) {
        this.f9404 = f9404;
        notifyPropertyChanged(BR.f9404);
    }

    @Bindable
    public String getF9405() {
        return f9405;
    }

    public void setF9405(String f9405) {
        this.f9405 = f9405;
        notifyPropertyChanged(BR.f9405);
    }

    @Bindable
    public String getF940596x() {
        return f940596x;
    }

    public void setF940596x(String f940596x) {
        this.f940596x = f940596x;
        notifyPropertyChanged(BR.f940596x);
    }

    @Bindable
    public String getF9406() {
        return f9406;
    }

    public void setF9406(String f9406) {
        this.f9406 = f9406;
        notifyPropertyChanged(BR.f9406);
    }

    @Bindable
    public String getF9406mx() {
        return f9406mx;
    }

    public void setF9406mx(String f9406mx) {
        this.f9406mx = f9406mx;
        notifyPropertyChanged(BR.f9406mx);
    }

    @Bindable
    public String getF9406hx() {
        return f9406hx;
    }

    public void setF9406hx(String f9406hx) {
        this.f9406hx = f9406hx;
        notifyPropertyChanged(BR.f9406hx);
    }

    @Bindable
    public String getF9406dx() {
        return f9406dx;
    }

    public void setF9406dx(String f9406dx) {
        this.f9406dx = f9406dx;
        notifyPropertyChanged(BR.f9406dx);
    }

    @Bindable
    public String getF9407() {
        return f9407;
    }

    public void setF9407(String f9407) {
        this.f9407 = f9407;
        notifyPropertyChanged(BR.f9407);
    }

    @Bindable
    public String getF9408() {
        return f9408;
    }

    public void setF9408(String f9408) {
        this.f9408 = f9408;
        notifyPropertyChanged(BR.f9408);
    }

    @Bindable
    public String getF9409() {
        return f9409;
    }

    public void setF9409(String f9409) {
        this.f9409 = f9409;
        notifyPropertyChanged(BR.f9409);
    }

    @Bindable
    public String getF9410() {
        return f9410;
    }

    public void setF9410(String f9410) {
        this.f9410 = f9410;
        notifyPropertyChanged(BR.f9410);
    }

    @Bindable
    public String getF9410a() {
        return f9410a;
    }

    public void setF9410a(String f9410a) {
        this.f9410a = f9410a;
        notifyPropertyChanged(BR.f9410a);
    }

    @Bindable
    public String getF9410b() {
        return f9410b;
    }

    public void setF9410b(String f9410b) {
        this.f9410b = f9410b;
        notifyPropertyChanged(BR.f9410b);
    }

    @Bindable
    public String getF9410c() {
        return f9410c;
    }

    public void setF9410c(String f9410c) {
        this.f9410c = f9410c;
        notifyPropertyChanged(BR.f9410c);
    }

    @Bindable
    public String getF941096() {
        return f941096;
    }

    public void setF941096(String f941096) {
        this.f941096 = f941096;
        notifyPropertyChanged(BR.f941096);
    }

    @Bindable
    public String getF941096x() {
        return f941096x;
    }

    public void setF941096x(String f941096x) {
        this.f941096x = f941096x;
        notifyPropertyChanged(BR.f941096x);
    }

    @Bindable
    public String getF9411() {
        return f9411;
    }

    public void setF9411(String f9411) {
        this.f9411 = f9411;
        notifyPropertyChanged(BR.f9411);
    }

    @Bindable
    public String getF9412() {
        return f9412;
    }

    public void setF9412(String f9412) {
        this.f9412 = f9412;
        notifyPropertyChanged(BR.f9412);
    }

    @Bindable
    public String getF9412hx() {
        return f9412hx;
    }

    public void setF9412hx(String f9412hx) {
        this.f9412hx = f9412hx;
        notifyPropertyChanged(BR.f9412hx);
    }

    @Bindable
    public String getF9412dx() {
        return f9412dx;
    }

    public void setF9412dx(String f9412dx) {
        this.f9412dx = f9412dx;
        notifyPropertyChanged(BR.f9412dx);
    }

    @Bindable
    public String getF9413() {
        return f9413;
    }

    public void setF9413(String f9413) {
        this.f9413 = f9413;
        notifyPropertyChanged(BR.f9413);
    }

    @Bindable
    public String getF9413a() {
        return f9413a;
    }

    public void setF9413a(String f9413a) {
        this.f9413a = f9413a;
        notifyPropertyChanged(BR.f9413a);
    }

    @Bindable
    public String getF9413b() {
        return f9413b;
    }

    public void setF9413b(String f9413b) {
        this.f9413b = f9413b;
        notifyPropertyChanged(BR.f9413b);
    }

    @Bindable
    public String getF9413c() {
        return f9413c;
    }

    public void setF9413c(String f9413c) {
        this.f9413c = f9413c;
        notifyPropertyChanged(BR.f9413c);
    }

    @Bindable
    public String getF9413d() {
        return f9413d;
    }

    public void setF9413d(String f9413d) {
        this.f9413d = f9413d;
        notifyPropertyChanged(BR.f9413d);
    }

    @Bindable
    public String getF9413e() {
        return f9413e;
    }

    public void setF9413e(String f9413e) {
        this.f9413e = f9413e;
        notifyPropertyChanged(BR.f9413e);
    }

    @Bindable
    public String getF9413f() {
        return f9413f;
    }

    public void setF9413f(String f9413f) {
        this.f9413f = f9413f;
        notifyPropertyChanged(BR.f9413f);
    }

    @Bindable
    public String getF9413g() {
        return f9413g;
    }

    public void setF9413g(String f9413g) {
        this.f9413g = f9413g;
        notifyPropertyChanged(BR.f9413g);
    }

    @Bindable
    public String getF9413h() {
        return f9413h;
    }

    public void setF9413h(String f9413h) {
        this.f9413h = f9413h;
        notifyPropertyChanged(BR.f9413h);
    }

    @Bindable
    public String getF941396() {
        return f941396;
    }

    public void setF941396(String f941396) {
        this.f941396 = f941396;
        notifyPropertyChanged(BR.f941396);
    }

    @Bindable
    public String getF941396x() {
        return f941396x;
    }

    public void setF941396x(String f941396x) {
        this.f941396x = f941396x;
        notifyPropertyChanged(BR.f941396x);
    }

    @Bindable
    public String getF9501() {
        return f9501;
    }

    public void setF9501(String f9501) {
        this.f9501 = f9501;
        notifyPropertyChanged(BR.f9501);
    }

    @Bindable
    public String getF950196x() {
        return f950196x;
    }

    public void setF950196x(String f950196x) {
        this.f950196x = f950196x;
        notifyPropertyChanged(BR.f950196x);
    }

    @Bindable
    public String getF9502() {
        return f9502;
    }

    public void setF9502(String f9502) {
        this.f9502 = f9502;
        notifyPropertyChanged(BR.f9502);
    }

    @Bindable
    public String getF9503() {
        return f9503;
    }

    public void setF9503(String f9503) {
        this.f9503 = f9503;
        notifyPropertyChanged(BR.f9503);
    }

    @Bindable
    public String getF950396x() {
        return f950396x;
    }

    public void setF950396x(String f950396x) {
        this.f950396x = f950396x;
        notifyPropertyChanged(BR.f950396x);
    }

    @Bindable
    public String getF9504() {
        return f9504;
    }

    public void setF9504(String f9504) {
        this.f9504 = f9504;
        notifyPropertyChanged(BR.f9504);
    }

    @Bindable
    public String getF9505() {
        return f9505;
    }

    public void setF9505(String f9505) {
        this.f9505 = f9505;
        notifyPropertyChanged(BR.f9505);
    }

    @Bindable
    public String getF9505a() {
        return f9505a;
    }

    public void setF9505a(String f9505a) {
        this.f9505a = f9505a;
        notifyPropertyChanged(BR.f9505a);
    }

    @Bindable
    public String getF9505b() {
        return f9505b;
    }

    public void setF9505b(String f9505b) {
        this.f9505b = f9505b;
        notifyPropertyChanged(BR.f9505b);
    }

    @Bindable
    public String getF9505c() {
        return f9505c;
    }

    public void setF9505c(String f9505c) {
        this.f9505c = f9505c;
        notifyPropertyChanged(BR.f9505c);
    }

    @Bindable
    public String getF950596() {
        return f950596;
    }

    public void setF950596(String f950596) {
        this.f950596 = f950596;
        notifyPropertyChanged(BR.f950596);
    }

    @Bindable
    public String getF950596x() {
        return f950596x;
    }

    public void setF950596x(String f950596x) {
        this.f950596x = f950596x;
        notifyPropertyChanged(BR.f950596x);
    }

    @Bindable
    public String getF9601() {
        return f9601;
    }

    public void setF9601(String f9601) {
        this.f9601 = f9601;
        notifyPropertyChanged(BR.f9601);
    }

    @Bindable
    public String getF9602() {
        return f9602;
    }

    public void setF9602(String f9602) {
        this.f9602 = f9602;
        notifyPropertyChanged(BR.f9602);
    }

    @Bindable
    public String getF9602a() {
        return f9602a;
    }

    public void setF9602a(String f9602a) {
        this.f9602a = f9602a;
        notifyPropertyChanged(BR.f9602a);
    }

    @Bindable
    public String getF9602b() {
        return f9602b;
    }

    public void setF9602b(String f9602b) {
        this.f9602b = f9602b;
        notifyPropertyChanged(BR.f9602b);
    }

    @Bindable
    public String getF9602c() {
        return f9602c;
    }

    public void setF9602c(String f9602c) {
        this.f9602c = f9602c;
        notifyPropertyChanged(BR.f9602c);
    }

    @Bindable
    public String getF9602d() {
        return f9602d;
    }

    public void setF9602d(String f9602d) {
        this.f9602d = f9602d;
        notifyPropertyChanged(BR.f9602d);
    }

    @Bindable
    public String getF9602e() {
        return f9602e;
    }

    public void setF9602e(String f9602e) {
        this.f9602e = f9602e;
        notifyPropertyChanged(BR.f9602e);
    }

    @Bindable
    public String getF9602f() {
        return f9602f;
    }

    public void setF9602f(String f9602f) {
        this.f9602f = f9602f;
        notifyPropertyChanged(BR.f9602f);
    }

    @Bindable
    public String getF960296() {
        return f960296;
    }

    public void setF960296(String f960296) {
        this.f960296 = f960296;
        notifyPropertyChanged(BR.f960296);
    }

    @Bindable
    public String getF960296x() {
        return f960296x;
    }

    public void setF960296x(String f960296x) {
        this.f960296x = f960296x;
        notifyPropertyChanged(BR.f960296x);
    }

    @Bindable
    public String getF9603() {
        return f9603;
    }

    public void setF9603(String f9603) {
        this.f9603 = f9603;
        notifyPropertyChanged(BR.f9603);
    }

    @Bindable
    public String getF9604d() {
        return f9604d;
    }

    public void setF9604d(String f9604d) {
        this.f9604d = f9604d;
        notifyPropertyChanged(BR.f9604d);
    }

    @Bindable
    public String getF9604h() {
        return f9604h;
    }

    public void setF9604h(String f9604h) {
        this.f9604h = f9604h;
        notifyPropertyChanged(BR.f9604h);
    }

    @Bindable
    public String getF9604m() {
        return f9604m;
    }

    public void setF9604m(String f9604m) {
        this.f9604m = f9604m;
        notifyPropertyChanged(BR.f9604m);
    }

    @Bindable
    public String getF9605() {
        return f9605;
    }

    public void setF9605(String f9605) {
        this.f9605 = f9605;
        notifyPropertyChanged(BR.f9605);
    }

    @Bindable
    public String getF9606() {
        return f9606;
    }

    public void setF9606(String f9606) {
        this.f9606 = f9606;
        notifyPropertyChanged(BR.f9606);
    }

    @Bindable
    public String getF9606a() {
        return f9606a;
    }

    public void setF9606a(String f9606a) {
        this.f9606a = f9606a;
        notifyPropertyChanged(BR.f9606a);
    }

    @Bindable
    public String getF9606b() {
        return f9606b;
    }

    public void setF9606b(String f9606b) {
        this.f9606b = f9606b;
        notifyPropertyChanged(BR.f9606b);
    }

    @Bindable
    public String getF9606c() {
        return f9606c;
    }

    public void setF9606c(String f9606c) {
        this.f9606c = f9606c;
        notifyPropertyChanged(BR.f9606c);
    }

    @Bindable
    public String getF9606d() {
        return f9606d;
    }

    public void setF9606d(String f9606d) {
        this.f9606d = f9606d;
        notifyPropertyChanged(BR.f9606d);
    }

    @Bindable
    public String getF960696() {
        return f960696;
    }

    public void setF960696(String f960696) {
        this.f960696 = f960696;
        notifyPropertyChanged(BR.f960696);
    }

    @Bindable
    public String getF960696x() {
        return f960696x;
    }

    public void setF960696x(String f960696x) {
        this.f960696x = f960696x;
        notifyPropertyChanged(BR.f960696x);
    }

    @Bindable
    public String getF9607() {
        return f9607;
    }

    public void setF9607(String f9607) {
        this.f9607 = f9607;
        notifyPropertyChanged(BR.f9607);
    }

    @Bindable
    public String getF9608() {
        return f9608;
    }

    public void setF9608(String f9608) {
        this.f9608 = f9608;
        notifyPropertyChanged(BR.f9608);
    }

    @Bindable
    public String getF9609() {
        return f9609;
    }

    public void setF9609(String f9609) {
        this.f9609 = f9609;
        notifyPropertyChanged(BR.f9609);
    }

    @Bindable
    public String getF9610() {
        return f9610;
    }

    public void setF9610(String f9610) {
        this.f9610 = f9610;
        notifyPropertyChanged(BR.f9610);
    }

    @Bindable
    public String getF9610a() {
        return f9610a;
    }

    public void setF9610a(String f9610a) {
        this.f9610a = f9610a;
        notifyPropertyChanged(BR.f9610a);
    }

    @Bindable
    public String getF9610b() {
        return f9610b;
    }

    public void setF9610b(String f9610b) {
        this.f9610b = f9610b;
        notifyPropertyChanged(BR.f9610b);
    }

    @Bindable
    public String getF9610c() {
        return f9610c;
    }

    public void setF9610c(String f9610c) {
        this.f9610c = f9610c;
        notifyPropertyChanged(BR.f9610c);
    }

    @Bindable
    public String getF9610d() {
        return f9610d;
    }

    public void setF9610d(String f9610d) {
        this.f9610d = f9610d;
        notifyPropertyChanged(BR.f9610d);
    }

    @Bindable
    public String getF9610e() {
        return f9610e;
    }

    public void setF9610e(String f9610e) {
        this.f9610e = f9610e;
        notifyPropertyChanged(BR.f9610e);
    }

    @Bindable
    public String getF9610f() {
        return f9610f;
    }

    public void setF9610f(String f9610f) {
        this.f9610f = f9610f;
        notifyPropertyChanged(BR.f9610f);
    }

    @Bindable
    public String getF961096() {
        return f961096;
    }

    public void setF961096(String f961096) {
        this.f961096 = f961096;
        notifyPropertyChanged(BR.f961096);
    }

    @Bindable
    public String getF961096x() {
        return f961096x;
    }

    public void setF961096x(String f961096x) {
        this.f961096x = f961096x;
        notifyPropertyChanged(BR.f961096x);
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

        sF2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF2)));
        sF3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF3)));
        sF5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF5)));
        sF6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF6)));
        sF7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF7)));
        sF8Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF8)));
        sF9Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SF9)));


        return this;
    }

    public void sF2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f2101 = json.getString("f2101");
            this.f2102 = json.getString("f2102");
            this.f2103 = json.getString("f2103");
            this.f2104 = json.getString("f2104");
            this.f2105 = json.getString("f2105");
            this.f2106 = json.getString("f2106");
            this.f2107 = json.getString("f2107");
            this.f2108 = json.getString("f2108");
            this.f2201 = json.getString("f2201");
            this.f2202 = json.getString("f2202");
            this.f2203 = json.getString("f2203");
            this.f2301 = json.getString("f2301");
            this.f2302a = json.getString("f2302a");
            this.f2302b = json.getString("f2302b");
            this.f2302c = json.getString("f2302c");
            this.f2302d = json.getString("f2302d");
            this.f2302e = json.getString("f2302e");
            this.f2302f = json.getString("f2302f");
            this.f2302g = json.getString("f2302g");
            this.f2302h = json.getString("f2302h");
            this.f2303 = json.getString("f2303");
            this.f2304 = json.getString("f2304");
            this.f2401 = json.getString("f2401");
            this.f2402 = json.getString("f2402");
            this.f240296x = json.getString("f240296x");
            this.f2403 = json.getString("f2403");
        }
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
            this.f3106 = json.getString("f3106");
            this.f3107 = json.getString("f3107");
            this.f3108 = json.getString("f3108");
            this.f3201 = json.getString("f3201");
            this.f3202 = json.getString("f3202");
            this.f3301 = json.getString("f3301");
            this.f3302a = json.getString("f3302a");
            this.f3302b = json.getString("f3302b");
            this.f3302c = json.getString("f3302c");
            this.f3302d = json.getString("f3302d");
            this.f3302e = json.getString("f3302e");
            this.f3302f = json.getString("f3302f");
            this.f3302g = json.getString("f3302g");
            this.f3302h = json.getString("f3302h");
            this.f3302i = json.getString("f3302i");
            this.f3303 = json.getString("f3303");
            this.f3304 = json.getString("f3304");
            this.f3401 = json.getString("f3401");
            this.f3402 = json.getString("f3402");
            this.f340296x = json.getString("f340296x");
            this.f3403 = json.getString("f3403");
            this.f3404 = json.getString("f3404");
        }
    }

    public void sF5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f5101 = json.getString("f5101");
            this.f5102 = json.getString("f5102");
            this.f5103 = json.getString("f5103");
            this.f5104 = json.getString("f5104");
            this.f5105 = json.getString("f5105");
            this.f5106 = json.getString("f5106");
            this.f5107 = json.getString("f5107");
            this.f5108 = json.getString("f5108");
            this.f5109 = json.getString("f5109");
            this.f5110 = json.getString("f5110");
            this.f5111 = json.getString("f5111");
            this.f5112 = json.getString("f5112");
            this.f5113 = json.getString("f5113");
            this.f5201 = json.getString("f5201");
            this.f5202 = json.getString("f5202");
            this.f5203d = json.getString("f5203d");
            this.f5203m = json.getString("f5203m");
            this.f5203y = json.getString("f5203y");
            this.f5204h = json.getString("f5204h");
            this.f5204m = json.getString("f5204m");
            this.f5205 = json.getString("f5205");
            this.f5206 = json.getString("f5206");
            this.f5207 = json.getString("f5207");
            this.f5208 = json.getString("f5208");
            this.f5209 = json.getString("f5209");
            this.f5210 = json.getString("f5210");
            this.f5211 = json.getString("f5211");
            this.f5212 = json.getString("f5212");
            this.f5213 = json.getString("f5213");
            this.f5214 = json.getString("f5214");
            this.f5215a = json.getString("f5215a");
            this.f5215b = json.getString("f5215b");
            this.f5215c = json.getString("f5215c");
            this.f5215d = json.getString("f5215d");
            this.f5215e = json.getString("f5215e");
            this.f5215f = json.getString("f5215f");
            this.f5215g = json.getString("f5215g");
            this.f5215h = json.getString("f5215h");
            this.f5215i = json.getString("f5215i");
            this.f5215j = json.getString("f5215j");
            this.f521596 = json.getString("f521596");
            this.f5216 = json.getString("f5216");
            this.f5217 = json.getString("f5217");
            this.f5218 = json.getString("f5218");
            this.f5219 = json.getString("f5219");
            this.f5220 = json.getString("f5220");
            this.f5221 = json.getString("f5221");
            this.f5221wx = json.getString("f5221wx");
            this.f5221dx = json.getString("f5221dx");
            this.f5222w = json.getString("f5222w");
            this.f5222d = json.getString("f5222d");
            this.f5301 = json.getString("f5301");
            this.f5302 = json.getString("f5302");
            this.f5303 = json.getString("f5303");
            this.f5304 = json.getString("f5304");
            this.f5305 = json.getString("f5305");
            this.f5306 = json.getString("f5306");
            this.f5307 = json.getString("f5307");
            this.f530796x = json.getString("f530796x");
            this.f5308 = json.getString("f5308");
            this.f5309 = json.getString("f5309");
            this.f5310 = json.getString("f5310");
            this.f5311 = json.getString("f5311");
            this.f5312 = json.getString("f5312");
            this.f5313 = json.getString("f5313");
            this.f531396x = json.getString("f531396x");
            this.f5314 = json.getString("f5314");
            this.f5315a = json.getString("f5315a");
            this.f5315b = json.getString("f5315b");
            this.f5315c = json.getString("f5315c");
            this.f5315d = json.getString("f5315d");
            this.f5315e = json.getString("f5315e");
            this.f5315f = json.getString("f5315f");
            this.f531598 = json.getString("f531598");
            this.f531596 = json.getString("f531596");
            this.f531596x = json.getString("f531596x");
            this.f5316 = json.getString("f5316");
            this.f5317 = json.getString("f5317");
            this.f531796x = json.getString("f531796x");
            this.f5318 = json.getString("f5318");
            this.f5319a = json.getString("f5319a");
            this.f5319b = json.getString("f5319b");
            this.f5319c = json.getString("f5319c");
            this.f5319d = json.getString("f5319d");
            this.f531996 = json.getString("f531996");
            this.f531996x = json.getString("f531996x");
            this.f5320 = json.getString("f5320");
            this.f532096x = json.getString("f532096x");
            this.f5321a = json.getString("f5321a");
            this.f5321b = json.getString("f5321b");
            this.f5321c = json.getString("f5321c");
            this.f5321d = json.getString("f5321d");
            this.f5321e = json.getString("f5321e");
            this.f532196 = json.getString("f532196");
            this.f532196x = json.getString("f532196x");
            this.f5322 = json.getString("f5322");
            this.f5323 = json.getString("f5323");
            this.f5401 = json.getString("f5401");
            this.f5402 = json.getString("f5402");
            this.f5403 = json.getString("f5403");
            this.f5404 = json.getString("f5404");
            this.f5405 = json.getString("f5405");
            this.f5406 = json.getString("f5406");
            this.f5407 = json.getString("f5407");
            this.f5408 = json.getString("f5408");
            this.f5409 = json.getString("f5409");
            this.f540996x = json.getString("f540996x");
            this.f5410a = json.getString("f5410a");
            this.f5410b = json.getString("f5410b");
            this.f5411 = json.getString("f5411");
            this.f541196x = json.getString("f541196x");
            this.f5412 = json.getString("f5412");
            this.f5413 = json.getString("f5413");
            this.f5414a = json.getString("f5414a");
            this.f5414b = json.getString("f5414b");
            this.f5415 = json.getString("f5415");
            this.f5416 = json.getString("f5416");
            this.f5417 = json.getString("f5417");
        }
    }

    public void sF6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f6101 = json.getString("f6101");
            this.f6102 = json.getString("f6102");
            this.f6103 = json.getString("f6103");
            this.f4104 = json.getString("f4104");
            this.f6105 = json.getString("f6105");
            this.f6106 = json.getString("f6106");
            this.f6201 = json.getString("f6201");
            this.f6202 = json.getString("f6202");
            this.f6203 = json.getString("f6203");
            this.f6204 = json.getString("f6204");
            this.f6205 = json.getString("f6205");
            this.f6206a = json.getString("f6206a");
            this.f6206b = json.getString("f6206b");
            this.f6206c = json.getString("f6206c");
            this.f6206d = json.getString("f6206d");
            this.f6206e = json.getString("f6206e");
            this.f6206f = json.getString("f6206f");
            this.f6206g = json.getString("f6206g");
            this.f6206h = json.getString("f6206h");
            this.f6206i = json.getString("f6206i");
            this.f620696 = json.getString("f620696");
            this.f6207 = json.getString("f6207");
            this.f6301 = json.getString("f6301");
            this.f6302 = json.getString("f6302");
            this.f6303 = json.getString("f6303");
            this.f6304 = json.getString("f6304");
            this.f6305 = json.getString("f6305");
            this.f64011 = json.getString("f64011");
            this.f64012 = json.getString("f64012");
            this.f6402 = json.getString("f6402");
            this.f6403 = json.getString("f6403");
            this.f6404 = json.getString("f6404");
            this.f6405 = json.getString("f6405");
            this.f6406 = json.getString("f6406");
            this.f6407 = json.getString("f6407");
            this.f6408 = json.getString("f6408");
            this.f6409 = json.getString("f6409");
            this.f6410 = json.getString("f6410");
            this.f6411 = json.getString("f6411");
            this.f6412 = json.getString("f6412");
            this.f6413 = json.getString("f6413");
            this.f6414 = json.getString("f6414");
            this.f6415 = json.getString("f6415");
            this.f6416 = json.getString("f6416");
            this.f6417 = json.getString("f6417");
            this.f6501 = json.getString("f6501");
            this.f650196x = json.getString("f650196x");
            this.f6502 = json.getString("f6502");
            this.f6503a = json.getString("f6503a");
            this.f6503b = json.getString("f6503b");
            this.f6503c = json.getString("f6503c");
            this.f6503d = json.getString("f6503d");
            this.f650396 = json.getString("f650396");
            this.f650396x = json.getString("f650396x");
            this.f6504 = json.getString("f6504");
            this.f650496x = json.getString("f650496x");
            this.f6505a = json.getString("f6505a");
            this.f6505b = json.getString("f6505b");
            this.f6505c = json.getString("f6505c");
            this.f6505d = json.getString("f6505d");
            this.f6505e = json.getString("f6505e");
            this.f650596 = json.getString("f650596");
            this.f650596x = json.getString("f650596x");
            this.f6506 = json.getString("f6506");
            this.f6507 = json.getString("f6507");
            this.f650796x = json.getString("f650796x");
            this.f6508 = json.getString("f6508");
            this.f6509 = json.getString("f6509");
            this.f6510 = json.getString("f6510");
            this.f651096x = json.getString("f651096x");
            this.f6511a = json.getString("f6511a");
            this.f6511b = json.getString("f6511b");
            this.f6511c = json.getString("f6511c");
            this.f6511d = json.getString("f6511d");
            this.f6511e = json.getString("f6511e");
            this.f6511f = json.getString("f6511f");
            this.f6511g = json.getString("f6511g");
            this.f6511h = json.getString("f6511h");
            this.f6511i = json.getString("f6511i");
            this.f6511j = json.getString("f6511j");
            this.f6511k = json.getString("f6511k");
            this.f651196 = json.getString("f651196");
            this.f651196x = json.getString("f651196x");
            this.f6512 = json.getString("f6512");
            this.f6513 = json.getString("f6513");
            this.f6514 = json.getString("f6514");
            this.f6515 = json.getString("f6515");
            this.f6515hx = json.getString("f6515hx");
            this.f6515dx = json.getString("f6515dx");
            this.f6516a = json.getString("f6516a");
            this.f6516b = json.getString("f6516b");
            this.f6516c = json.getString("f6516c");
            this.f6516d = json.getString("f6516d");
            this.f6516e = json.getString("f6516e");
            this.f651696 = json.getString("f651696");
            this.f651696x = json.getString("f651696x");
            this.f6517 = json.getString("f6517");
            this.f6518a = json.getString("f6518a");
            this.f6518b = json.getString("f6518b");
            this.f6518c = json.getString("f6518c");
            this.f6518d = json.getString("f6518d");
            this.f6518e = json.getString("f6518e");
            this.f6518f = json.getString("f6518f");
            this.f6518g = json.getString("f6518g");
            this.f651896 = json.getString("f651896");
            this.f651896x = json.getString("f651896x");
            this.f6519 = json.getString("f6519");
            this.f6520 = json.getString("f6520");
            this.f6520dx = json.getString("f6520dx");
            this.f6521a = json.getString("f6521a");
            this.f6521b = json.getString("f6521b");
            this.f6521c = json.getString("f6521c");
            this.f6521d = json.getString("f6521d");
            this.f6521e = json.getString("f6521e");
            this.f6521f = json.getString("f6521f");
            this.f6521g = json.getString("f6521g");
            this.f6521h = json.getString("f6521h");
            this.f6521i = json.getString("f6521i");
            this.f6521j = json.getString("f6521j");
            this.f652198 = json.getString("f652198");
            this.f652196 = json.getString("f652196");
            this.f652196x = json.getString("f652196x");
            this.f6522 = json.getString("f6522");
            this.f652296x = json.getString("f652296x");
            this.f6523 = json.getString("f6523");
            this.f6524 = json.getString("f6524");
            this.f6524dx = json.getString("f6524dx");
            this.f6525 = json.getString("f6525");
            this.f652596x = json.getString("f652596x");
            this.f6601 = json.getString("f6601");
            this.f6602a = json.getString("f6602a");
            this.f6602b = json.getString("f6602b");
            this.f6602c = json.getString("f6602c");
            this.f6602d = json.getString("f6602d");
            this.f6602e = json.getString("f6602e");
            this.f660296 = json.getString("f660296");
            this.f660296x = json.getString("f660296x");
            this.f6603 = json.getString("f6603");
            this.f6604 = json.getString("f6604");
            this.f660496x = json.getString("f660496x");
            this.f6605a = json.getString("f6605a");
            this.f6605b = json.getString("f6605b");
            this.f6605c = json.getString("f6605c");
            this.f660596 = json.getString("f660596");
            this.f660596x = json.getString("f660596x");
            this.f6606 = json.getString("f6606");
            this.f6701 = json.getString("f6701");
            this.f6702 = json.getString("f6702");
            this.f670296x = json.getString("f670296x");
            this.f6703 = json.getString("f6703");
            this.f6704 = json.getString("f6704");
            this.f6705a = json.getString("f6705a");
            this.f6705b = json.getString("f6705b");
            this.f6705c = json.getString("f6705c");
            this.f6705d = json.getString("f6705d");
            this.f6705e = json.getString("f6705e");
            this.f6705f = json.getString("f6705f");
            this.f6705g = json.getString("f6705g");
            this.f670596 = json.getString("f670596");
            this.f670596x = json.getString("f670596x");
            this.f6706 = json.getString("f6706");
            this.f6707d = json.getString("f6707d");
            this.f6707h = json.getString("f6707h");
            this.f6707m = json.getString("f6707m");
            this.f6708 = json.getString("f6708");
            this.f6709a = json.getString("f6709a");
            this.f6709b = json.getString("f6709b");
            this.f6709c = json.getString("f6709c");
            this.f6709d = json.getString("f6709d");
            this.f6709e = json.getString("f6709e");
            this.f670996 = json.getString("f670996");
            this.f670996x = json.getString("f670996x");
            this.f6710 = json.getString("f6710");
            this.f671096x = json.getString("f671096x");
            this.f6711 = json.getString("f6711");
            this.f6712h = json.getString("f6712h");
            this.f6712n = json.getString("f6712n");
            this.f6713 = json.getString("f6713");
            this.f671396x = json.getString("f671396x");
            this.f6714d = json.getString("f6714d");
            this.f6714h = json.getString("f6714h");
            this.f6714m = json.getString("f6714m");
            this.f6715 = json.getString("f6715");
            this.f6716 = json.getString("f6716");
            this.f6717 = json.getString("f6717");
            this.f6718 = json.getString("f6718");
            this.f6719a = json.getString("f6719a");
            this.f6719b = json.getString("f6719b");
            this.f6719c = json.getString("f6719c");
            this.f671996 = json.getString("f671996");
            this.f671996x = json.getString("f671996x");
            this.f6720 = json.getString("f6720");
            this.f6721a = json.getString("f6721a");
            this.f6721b = json.getString("f6721b");
            this.f6721c = json.getString("f6721c");
            this.f6721d = json.getString("f6721d");
            this.f6721e = json.getString("f6721e");
            this.f6721f = json.getString("f6721f");
            this.f672196 = json.getString("f672196");
            this.f672196x = json.getString("f672196x");
            this.f6722 = json.getString("f6722");
            this.f6723a = json.getString("f6723a");
            this.f6723b = json.getString("f6723b");
            this.f6723c = json.getString("f6723c");
            this.f6723d = json.getString("f6723d");
            this.f6723e = json.getString("f6723e");
            this.f672396 = json.getString("f672396");

        }
    }

    public void sF7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f7101 = json.getString("f7101");
            this.f7102 = json.getString("f7102");
            this.f7103 = json.getString("f7103");
            this.f7201 = json.getString("f7201");
            this.f7202 = json.getString("f7202");
            this.f7203a = json.getString("f7203a");
            this.f7203b = json.getString("f7203b");
            this.f7203c = json.getString("f7203c");
            this.f7203d = json.getString("f7203d");
            this.f7203e = json.getString("f7203e");
            this.f7203f = json.getString("f7203f");
            this.f7203g = json.getString("f7203g");
            this.f7203h = json.getString("f7203h");
            this.f7203i = json.getString("f7203i");
            this.f720396 = json.getString("f720396");
            this.f720396x = json.getString("f720396x");
            this.f7204 = json.getString("f7204");
            this.f7204hx = json.getString("f7204hx");
            this.f7204mx = json.getString("f7204mx");
            this.f7301 = json.getString("f7301");
            this.f7302 = json.getString("f7302");
            this.f7303a = json.getString("f7303a");
            this.f7303b = json.getString("f7303b");
            this.f7304 = json.getString("f7304");
            this.f7305 = json.getString("f7305");
            this.f7306 = json.getString("f7306");
            this.f7307 = json.getString("f7307");
            this.f7308 = json.getString("f7308");
            this.f7309 = json.getString("f7309");
            this.f7310 = json.getString("f7310");
            this.f7311 = json.getString("f7311");
            this.f7312 = json.getString("f7312");
            this.f7312t = json.getString("f7312t");
            this.f7313 = json.getString("f7313");
            this.f7314 = json.getString("f7314");
            this.f7315 = json.getString("f7315");
            this.f7316 = json.getString("f7316");
            this.f7317 = json.getString("f7317");
            this.f7318 = json.getString("f7318");
            this.f7319 = json.getString("f7319");
            this.f7401 = json.getString("f7401");
            this.f7402a = json.getString("f7402a");
            this.f7402b = json.getString("f7402b");
            this.f7402c = json.getString("f7402c");
            this.f7402d = json.getString("f7402d");
            this.f7402e = json.getString("f7402e");
            this.f7402f = json.getString("f7402f");
            this.f7402g = json.getString("f7402g");
            this.f7402h = json.getString("f7402h");
            this.f7402i = json.getString("f7402i");
            this.f7402j = json.getString("f7402j");
            this.f7402k = json.getString("f7402k");
            this.f740296 = json.getString("f740296");
            this.f740296x = json.getString("f740296x");
            this.f7403 = json.getString("f7403");
            this.f7404 = json.getString("f7404");
            this.f7405 = json.getString("f7405");
            this.f740596x = json.getString("f740596x");
            this.f7406 = json.getString("f7406");
            this.f7406mx = json.getString("f7406mx");
            this.f7406hx = json.getString("f7406hx");
            this.f7407 = json.getString("f7407");
            this.f7408 = json.getString("f7408");
            this.f7409 = json.getString("f7409");
            this.f7410a = json.getString("f7410a");
            this.f7410b = json.getString("f7410b");
            this.f7410c = json.getString("f7410c");
            this.f741096 = json.getString("f741096");
            this.f741096x = json.getString("f741096x");
            this.f7411 = json.getString("f7411");
            this.f7412 = json.getString("f7412");
            this.f7413a = json.getString("f7413a");
            this.f7413b = json.getString("f7413b");
            this.f7413c = json.getString("f7413c");
            this.f7413d = json.getString("f7413d");
            this.f7413e = json.getString("f7413e");
            this.f7413f = json.getString("f7413f");
            this.f7413g = json.getString("f7413g");
            this.f7413h = json.getString("f7413h");
            this.f741396 = json.getString("f741396");
            this.f741396x = json.getString("f741396x");
            this.f7501 = json.getString("f7501");
            this.f7502a = json.getString("f7502a");
            this.f7502b = json.getString("f7502b");
            this.f7502c = json.getString("f7502c");
            this.f7502d = json.getString("f7502d");
            this.f7502e = json.getString("f7502e");
            this.f7502f = json.getString("f7502f");
            this.f7502g = json.getString("f7502g");
            this.f750296 = json.getString("f750296");
            this.f750296x = json.getString("f750296x");
            this.f7503 = json.getString("f7503");
            this.f7504d = json.getString("f7504d");
            this.f7504h = json.getString("f7504h");
            this.f7504m = json.getString("f7504m");
            this.f7505 = json.getString("f7505");
            this.f7506a = json.getString("f7506a");
            this.f7506b = json.getString("f7506b");
            this.f7506c = json.getString("f7506c");
            this.f7506d = json.getString("f7506d");
            this.f750696 = json.getString("f750696");
            this.f750696x = json.getString("f750696x");
            this.f7507 = json.getString("f7507");
            this.f750796x = json.getString("f750796x");
            this.f7508 = json.getString("f7508");
            this.f7509 = json.getString("f7509");

        }
    }

    public void sF8Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF8Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f8101 = json.getString("f8101");
            this.f8102 = json.getString("f8102");
            this.f8103 = json.getString("f8103");
            this.f8104 = json.getString("f8104");
            this.f8201 = json.getString("f8201");
            this.f8202 = json.getString("f8202");
            this.f8203 = json.getString("f8203");
            this.f8204 = json.getString("f8204");
            this.f8205 = json.getString("f8205");
            this.f8206 = json.getString("f8206");
            this.f8207 = json.getString("f8207");
            this.f8208a = json.getString("f8208a");
            this.f8208b = json.getString("f8208b");
            this.f8208c = json.getString("f8208c");
            this.f8208d = json.getString("f8208d");
            this.f8208e = json.getString("f8208e");
            this.f8208f = json.getString("f8208f");
            this.f820896 = json.getString("f820896");
            this.f820896x = json.getString("f820896x");
            this.f8209 = json.getString("f8209");
            this.f8210h = json.getString("f8210h");
            this.f8210m = json.getString("f8210m");
            this.f8211 = json.getString("f8211");
            this.f8301 = json.getString("f8301");
            this.f8302 = json.getString("f8302");
            this.f8303 = json.getString("f8303");
            this.f8304 = json.getString("f8304");
            this.f8305 = json.getString("f8305");
            this.f8306 = json.getString("f8306");
            this.f8307 = json.getString("f8307");
            this.f8308a = json.getString("f8308a");
            this.f8308b = json.getString("f8308b");
            this.f8308c = json.getString("f8308c");
            this.f8308d = json.getString("f8308d");
            this.f8308e = json.getString("f8308e");
            this.f8308f = json.getString("f8308f");
            this.f830896 = json.getString("f830896");
            this.f830896x = json.getString("f830896x");
            this.f8309 = json.getString("f8309");
            this.f8310h = json.getString("f8310h");
            this.f8310m = json.getString("f8310m");
            this.f8311 = json.getString("f8311");
            this.f8401 = json.getString("f8401");
            this.f8402 = json.getString("f8402");
            this.f8403 = json.getString("f8403");
            this.f8404 = json.getString("f8404");
            this.f8405 = json.getString("f8405");
            this.f8406 = json.getString("f8406");
            this.f8407 = json.getString("f8407");
            this.f8408a = json.getString("f8408a");
            this.f8408b = json.getString("f8408b");
            this.f8408c = json.getString("f8408c");
            this.f8408d = json.getString("f8408d");
            this.f8408e = json.getString("f8408e");
            this.f8408f = json.getString("f8408f");
            this.f840896 = json.getString("f840896");
            this.f840896x = json.getString("f840896x");
            this.f8409 = json.getString("f8409");
            this.f8410h = json.getString("f8410h");
            this.f8410m = json.getString("f8410m");
            this.f8411 = json.getString("f8411");
            this.f8501 = json.getString("f8501");
            this.f8502 = json.getString("f8502");
            this.f8503 = json.getString("f8503");
            this.f8504 = json.getString("f8504");
            this.f8505 = json.getString("f8505");
            this.f8506 = json.getString("f8506");
            this.f8507 = json.getString("f8507");
            this.f8508a = json.getString("f8508a");
            this.f8508b = json.getString("f8508b");
            this.f8508c = json.getString("f8508c");
            this.f8508d = json.getString("f8508d");
            this.f8508e = json.getString("f8508e");
            this.f8508f = json.getString("f8508f");
            this.f850896 = json.getString("f850896");
            this.f850896x = json.getString("f850896x");
            this.f8509 = json.getString("f8509");
            this.f8510h = json.getString("f8510h");
            this.f8510m = json.getString("f8510m");
            this.f8511 = json.getString("f8511");
            this.f8601 = json.getString("f8601");
            this.f8602 = json.getString("f8602");
            this.f8603 = json.getString("f8603");
            this.f8604 = json.getString("f8604");
            this.f8605 = json.getString("f8605");
            this.f8606 = json.getString("f8606");
            this.f8607 = json.getString("f8607");
            this.f8608a = json.getString("f8608a");
            this.f8608b = json.getString("f8608b");
            this.f8608c = json.getString("f8608c");
            this.f8608d = json.getString("f8608d");
            this.f8608e = json.getString("f8608e");
            this.f8608f = json.getString("f8608f");
            this.f860896 = json.getString("f860896");
            this.f860896x = json.getString("f860896x");
            this.f8609 = json.getString("f8609");
            this.f8610h = json.getString("f8610h");
            this.f8610m = json.getString("f8610m");
            this.f8611 = json.getString("f8611");
            this.f8701 = json.getString("f8701");
            this.f8702 = json.getString("f8702");
            this.f8703 = json.getString("f8703");
            this.f8704 = json.getString("f8704");
            this.f8705 = json.getString("f8705");
            this.f8706 = json.getString("f8706");
            this.f8707 = json.getString("f8707");
            this.f8708a = json.getString("f8708a");
            this.f8708b = json.getString("f8708b");
            this.f8708c = json.getString("f8708c");
            this.f8708d = json.getString("f8708d");
            this.f8708e = json.getString("f8708e");
            this.f8708f = json.getString("f8708f");
            this.f870896 = json.getString("f870896");
            this.f870896x = json.getString("f870896x");
            this.f8709 = json.getString("f8709");
            this.f8710h = json.getString("f8710h");
            this.f8710m = json.getString("f8710m");
            this.f8711 = json.getString("f8711");

        }
    }

    public void sF9Hydrate(String string) throws JSONException {
        Log.d(TAG, "sF9Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f9101 = json.getString("f9101");
            this.f9102 = json.getString("f9102");
            this.f9103 = json.getString("f9103");
            this.f9201 = json.getString("f9201");
            this.f9202 = json.getString("f9202");
            this.f9203a = json.getString("f9203a");
            this.f9203b = json.getString("f9203b");
            this.f9203c = json.getString("f9203c");
            this.f9203d = json.getString("f9203d");
            this.f9203e = json.getString("f9203e");
            this.f9203f = json.getString("f9203f");
            this.f9203g = json.getString("f9203g");
            this.f9203h = json.getString("f9203h");
            this.f9203i = json.getString("f9203i");
            this.f920396 = json.getString("f920396");
            this.f920396x = json.getString("f920396x");
            this.f9204 = json.getString("f9204");
            this.f9204hx = json.getString("f9204hx");
            this.f9204mx = json.getString("f9204mx");
            this.f9204dx = json.getString("f9204dx");
            this.f9301 = json.getString("f9301");
            this.f9302 = json.getString("f9302");
            this.f9303 = json.getString("f9303");
            this.f9304 = json.getString("f9304");
            this.f9305a = json.getString("f9305a");
            this.f9305b = json.getString("f9305b");
            this.f9306 = json.getString("f9306");
            this.f9307 = json.getString("f9307");
            this.f9308 = json.getString("f9308");
            this.f9309 = json.getString("f9309");
            this.f9310 = json.getString("f9310");
            this.f9311 = json.getString("f9311");
            this.f9312 = json.getString("f9312");
            this.f9313a = json.getString("f9313a");
            this.f9313b = json.getString("f9313b");
            this.f9313c = json.getString("f9313c");
            this.f9313d = json.getString("f9313d");
            this.f9313e = json.getString("f9313e");
            this.f9314 = json.getString("f9314");
            this.f9315 = json.getString("f9315");
            this.f9316 = json.getString("f9316");
            this.f9317 = json.getString("f9317");
            this.f9318 = json.getString("f9318");
            this.f9319 = json.getString("f9319");
            this.f9320 = json.getString("f9320");
            this.f9321 = json.getString("f9321");
            this.f9322 = json.getString("f9322");
            this.f9401 = json.getString("f9401");
            this.f9402a = json.getString("f9402a");
            this.f9402b = json.getString("f9402b");
            this.f9402c = json.getString("f9402c");
            this.f9402d = json.getString("f9402d");
            this.f9402e = json.getString("f9402e");
            this.f9402f = json.getString("f9402f");
            this.f9402g = json.getString("f9402g");
            this.f9402h = json.getString("f9402h");
            this.f9402i = json.getString("f9402i");
            this.f9402j = json.getString("f9402j");
            this.f9402k = json.getString("f9402k");
            this.f940296 = json.getString("f940296");
            this.f940296x = json.getString("f940296x");
            this.f9403 = json.getString("f9403");
            this.f9404 = json.getString("f9404");
            this.f9405 = json.getString("f9405");
            this.f940596x = json.getString("f940596x");
            this.f9406 = json.getString("f9406");
            this.f9406mx = json.getString("f9406mx");
            this.f9406hx = json.getString("f9406hx");
            this.f9406dx = json.getString("f9406dx");
            this.f9407 = json.getString("f9407");
            this.f9408 = json.getString("f9408");
            this.f9409 = json.getString("f9409");
            this.f9410a = json.getString("f9410a");
            this.f9410b = json.getString("f9410b");
            this.f9410c = json.getString("f9410c");
            this.f941096 = json.getString("f941096");
            this.f941096x = json.getString("f941096x");
            this.f9411 = json.getString("f9411");
            this.f9412 = json.getString("f9412");
            this.f9412hx = json.getString("f9412hx");
            this.f9412dx = json.getString("f9412dx");
            this.f9413a = json.getString("f9413a");
            this.f9413b = json.getString("f9413b");
            this.f9413c = json.getString("f9413c");
            this.f9413d = json.getString("f9413d");
            this.f9413e = json.getString("f9413e");
            this.f9413f = json.getString("f9413f");
            this.f9413g = json.getString("f9413g");
            this.f9413h = json.getString("f9413h");
            this.f941396 = json.getString("f941396");
            this.f941396x = json.getString("f941396x");
            this.f9501 = json.getString("f9501");
            this.f950196x = json.getString("f950196x");
            this.f9502 = json.getString("f9502");
            this.f9503 = json.getString("f9503");
            this.f950396x = json.getString("f950396x");
            this.f9504 = json.getString("f9504");
            this.f9505a = json.getString("f9505a");
            this.f9505b = json.getString("f9505b");
            this.f9505c = json.getString("f9505c");
            this.f950596 = json.getString("f950596");
            this.f950596x = json.getString("f950596x");
            this.f9601 = json.getString("f9601");
            this.f9602a = json.getString("f9602a");
            this.f9602b = json.getString("f9602b");
            this.f9602c = json.getString("f9602c");
            this.f9602d = json.getString("f9602d");
            this.f9602e = json.getString("f9602e");
            this.f9602f = json.getString("f9602f");
            this.f960296 = json.getString("f960296");
            this.f960296x = json.getString("f960296x");
            this.f9603 = json.getString("f9603");
            this.f9604d = json.getString("f9604d");
            this.f9604h = json.getString("f9604h");
            this.f9604m = json.getString("f9604m");
            this.f9605 = json.getString("f9605");
            this.f9606a = json.getString("f9606a");
            this.f9606b = json.getString("f9606b");
            this.f9606c = json.getString("f9606c");
            this.f9606d = json.getString("f9606d");
            this.f960696 = json.getString("f960696");
            this.f960696x = json.getString("f960696x");
            this.f9607 = json.getString("f9607");
            this.f9608 = json.getString("f9608");
            this.f9609 = json.getString("f9609");
            this.f9610a = json.getString("f9610a");
            this.f9610b = json.getString("f9610b");
            this.f9610c = json.getString("f9610c");
            this.f9610d = json.getString("f9610d");
            this.f9610e = json.getString("f9610e");
            this.f9610f = json.getString("f9610f");
            this.f961096 = json.getString("f961096");
            this.f961096x = json.getString("f961096x");

        }
    }


    public String sF2toString() throws JSONException {
        Log.d(TAG, "sF2toString: ");
        JSONObject json = new JSONObject();
        json.put("f2101", f2101)
                .put("f2102", f2102)
                .put("f2103", f2103)
                .put("f2104", f2104)
                .put("f2105", f2105)
                .put("f2106", f2106)
                .put("f2107", f2107)
                .put("f2108", f2108)
                .put("f2201", f2201)
                .put("f2202", f2202)
                .put("f2203", f2203)
                .put("f2301", f2301)
                .put("f2302a", f2302a)
                .put("f2302b", f2302b)
                .put("f2302c", f2302c)
                .put("f2302d", f2302d)
                .put("f2302e", f2302e)
                .put("f2302f", f2302f)
                .put("f2302g", f2302g)
                .put("f2302h", f2302h)
                .put("f2303", f2303)
                .put("f2304", f2304)
                .put("f2401", f2401)
                .put("f2402", f2402)
                .put("f240296x", f240296x)
                .put("f2403", f2403);

        return json.toString();
    }

    public String sF3toString() throws JSONException {
        Log.d(TAG, "sF3toString: ");
        JSONObject json = new JSONObject();
        json.put("f3101", f3101)
                .put("f3102", f3102)
                .put("f3103", f3103)
                .put("f3104", f3104)
                .put("f3105", f3105)
                .put("f3106", f3106)
                .put("f3107", f3107)
                .put("f3108", f3108)
                .put("f3201", f3201)
                .put("f3202", f3202)
                .put("f3301", f3301)
                .put("f3302a", f3302a)
                .put("f3302b", f3302b)
                .put("f3302c", f3302c)
                .put("f3302d", f3302d)
                .put("f3302e", f3302e)
                .put("f3302f", f3302f)
                .put("f3302g", f3302g)
                .put("f3302h", f3302h)
                .put("f3302i", f3302i)
                .put("f3303", f3303)
                .put("f3304", f3304)
                .put("f3401", f3401)
                .put("f3402", f3402)
                .put("f340296x", f340296x)
                .put("f3403", f3403)
                .put("f3404", f3404);
        return json.toString();
    }

    public String sF5toString() throws JSONException {
        Log.d(TAG, "sF5toString: ");
        JSONObject json = new JSONObject();

        json.put("f5101", f5101)
                .put("f5102", f5102)
                .put("f5103", f5103)
                .put("f5104", f5104)
                .put("f5105", f5105)
                .put("f5106", f5106)
                .put("f5107", f5107)
                .put("f5108", f5108)
                .put("f5109", f5109)
                .put("f5110", f5110)
                .put("f5111", f5111)
                .put("f5112", f5112)
                .put("f5113", f5113)
                .put("f5201", f5201)
                .put("f5202", f5202)
                .put("f5203d", f5203d)
                .put("f5203m", f5203m)
                .put("f5203y", f5203y)
                .put("f5204h", f5204h)
                .put("f5204m", f5204m)
                .put("f5205", f5205)
                .put("f5206", f5206)
                .put("f5207", f5207)
                .put("f5208", f5208)
                .put("f5209", f5209)
                .put("f5210", f5210)
                .put("f5211", f5211)
                .put("f5212", f5212)
                .put("f5213", f5213)
                .put("f5214", f5214)
                .put("f5215a", f5215a)
                .put("f5215b", f5215b)
                .put("f5215c", f5215c)
                .put("f5215d", f5215d)
                .put("f5215e", f5215e)
                .put("f5215f", f5215f)
                .put("f5215g", f5215g)
                .put("f5215h", f5215h)
                .put("f5215i", f5215i)
                .put("f5215j", f5215j)
                .put("f521596", f521596)
                .put("f5216", f5216)
                .put("f5217", f5217)
                .put("f5218", f5218)
                .put("f5219", f5219)
                .put("f5220", f5220)
                .put("f5221", f5221)
                .put("f5221wx", f5221wx)
                .put("f5221dx", f5221dx)
                .put("f5222w", f5222w)
                .put("f5222d", f5222d)
                .put("f5301", f5301)
                .put("f5302", f5302)
                .put("f5303", f5303)
                .put("f5304", f5304)
                .put("f5305", f5305)
                .put("f5306", f5306)
                .put("f5307", f5307)
                .put("f530796x", f530796x)
                .put("f5308", f5308)
                .put("f5309", f5309)
                .put("f5310", f5310)
                .put("f5311", f5311)
                .put("f5312", f5312)
                .put("f5313", f5313)
                .put("f531396x", f531396x)
                .put("f5314", f5314)
                .put("f5315a", f5315a)
                .put("f5315b", f5315b)
                .put("f5315c", f5315c)
                .put("f5315d", f5315d)
                .put("f5315e", f5315e)
                .put("f5315f", f5315f)
                .put("f531598", f531598)
                .put("f531596", f531596)
                .put("f531596x", f531596x)
                .put("f5316", f5316)
                .put("f5317", f5317)
                .put("f531796x", f531796x)
                .put("f5318", f5318)
                .put("f5319a", f5319a)
                .put("f5319b", f5319b)
                .put("f5319c", f5319c)
                .put("f5319d", f5319d)
                .put("f531996", f531996)
                .put("f531996x", f531996x)
                .put("f5320", f5320)
                .put("f532096x", f532096x)
                .put("f5321a", f5321a)
                .put("f5321b", f5321b)
                .put("f5321c", f5321c)
                .put("f5321d", f5321d)
                .put("f5321e", f5321e)
                .put("f532196", f532196)
                .put("f532196x", f532196x)
                .put("f5322", f5322)
                .put("f5323", f5323)
                .put("f5401", f5401)
                .put("f5402", f5402)
                .put("f5403", f5403)
                .put("f5404", f5404)
                .put("f5405", f5405)
                .put("f5406", f5406)
                .put("f5407", f5407)
                .put("f5408", f5408)
                .put("f5409", f5409)
                .put("f540996x", f540996x)
                .put("f5410a", f5410a)
                .put("f5410b", f5410b)
                .put("f5411", f5411)
                .put("f541196x", f541196x)
                .put("f5412", f5412)
                .put("f5413", f5413)
                .put("f5414a", f5414a)
                .put("f5414b", f5414b)
                .put("f5415", f5415)
                .put("f5416", f5416)
                .put("f5417", f5417);

        return json.toString();
    }

    public String sF6toString() throws JSONException {
        Log.d(TAG, "sF6toString: ");
        JSONObject json = new JSONObject();

        json.put("f6101", f6101)
                .put("f6102", f6102)
                .put("f6103", f6103)
                .put("f4104", f4104)
                .put("f6105", f6105)
                .put("f6106", f6106)
                .put("f6201", f6201)
                .put("f6202", f6202)
                .put("f6203", f6203)
                .put("f6204", f6204)
                .put("f6205", f6205)
                .put("f6206a", f6206a)
                .put("f6206b", f6206b)
                .put("f6206c", f6206c)
                .put("f6206d", f6206d)
                .put("f6206e", f6206e)
                .put("f6206f", f6206f)
                .put("f6206g", f6206g)
                .put("f6206h", f6206h)
                .put("f6206i", f6206i)
                .put("f620696", f620696)
                .put("f6207", f6207)
                .put("f6301", f6301)
                .put("f6302", f6302)
                .put("f6303", f6303)
                .put("f6304", f6304)
                .put("f6305", f6305)
                .put("f64011", f64011)
                .put("f64012", f64012)
                .put("f6402", f6402)
                .put("f6403", f6403)
                .put("f6404", f6404)
                .put("f6405", f6405)
                .put("f6406", f6406)
                .put("f6407", f6407)
                .put("f6408", f6408)
                .put("f6409", f6409)
                .put("f6410", f6410)
                .put("f6411", f6411)
                .put("f6412", f6412)
                .put("f6413", f6413)
                .put("f6414", f6414)
                .put("f6415", f6415)
                .put("f6416", f6416)
                .put("f6417", f6417)
                .put("f6501", f6501)
                .put("f650196x", f650196x)
                .put("f6502", f6502)
                .put("f6503a", f6503a)
                .put("f6503b", f6503b)
                .put("f6503c", f6503c)
                .put("f6503d", f6503d)
                .put("f650396", f650396)
                .put("f650396x", f650396x)
                .put("f6504", f6504)
                .put("f650496x", f650496x)
                .put("f6505a", f6505a)
                .put("f6505b", f6505b)
                .put("f6505c", f6505c)
                .put("f6505d", f6505d)
                .put("f6505e", f6505e)
                .put("f650596", f650596)
                .put("f650596x", f650596x)
                .put("f6506", f6506)
                .put("f6507", f6507)
                .put("f650796x", f650796x)
                .put("f6508", f6508)
                .put("f6509", f6509)
                .put("f6510", f6510)
                .put("f651096x", f651096x)
                .put("f6511a", f6511a)
                .put("f6511b", f6511b)
                .put("f6511c", f6511c)
                .put("f6511d", f6511d)
                .put("f6511e", f6511e)
                .put("f6511f", f6511f)
                .put("f6511g", f6511g)
                .put("f6511h", f6511h)
                .put("f6511i", f6511i)
                .put("f6511j", f6511j)
                .put("f6511k", f6511k)
                .put("f651196", f651196)
                .put("f651196x", f651196x)
                .put("f6512", f6512)
                .put("f6513", f6513)
                .put("f6514", f6514)
                .put("f6515", f6515)
                .put("f6515hx", f6515hx)
                .put("f6515dx", f6515dx)
                .put("f6516a", f6516a)
                .put("f6516b", f6516b)
                .put("f6516c", f6516c)
                .put("f6516d", f6516d)
                .put("f6516e", f6516e)
                .put("f651696", f651696)
                .put("f651696x", f651696x)
                .put("f6517", f6517)
                .put("f6518a", f6518a)
                .put("f6518b", f6518b)
                .put("f6518c", f6518c)
                .put("f6518d", f6518d)
                .put("f6518e", f6518e)
                .put("f6518f", f6518f)
                .put("f6518g", f6518g)
                .put("f651896", f651896)
                .put("f651896x", f651896x)
                .put("f6519", f6519)
                .put("f6520", f6520)
                .put("f6520dx", f6520dx)
                .put("f6521a", f6521a)
                .put("f6521b", f6521b)
                .put("f6521c", f6521c)
                .put("f6521d", f6521d)
                .put("f6521e", f6521e)
                .put("f6521f", f6521f)
                .put("f6521g", f6521g)
                .put("f6521h", f6521h)
                .put("f6521i", f6521i)
                .put("f6521j", f6521j)
                .put("f652198", f652198)
                .put("f652196", f652196)
                .put("f652196x", f652196x)
                .put("f6522", f6522)
                .put("f652296x", f652296x)
                .put("f6523", f6523)
                .put("f6524", f6524)
                .put("f6524dx", f6524dx)
                .put("f6525", f6525)
                .put("f652596x", f652596x)
                .put("f6601", f6601)
                .put("f6602a", f6602a)
                .put("f6602b", f6602b)
                .put("f6602c", f6602c)
                .put("f6602d", f6602d)
                .put("f6602e", f6602e)
                .put("f660296", f660296)
                .put("f660296x", f660296x)
                .put("f6603", f6603)
                .put("f6604", f6604)
                .put("f660496x", f660496x)
                .put("f6605a", f6605a)
                .put("f6605b", f6605b)
                .put("f6605c", f6605c)
                .put("f660596", f660596)
                .put("f660596x", f660596x)
                .put("f6606", f6606)
                .put("f6701", f6701)
                .put("f6702", f6702)
                .put("f670296x", f670296x)
                .put("f6703", f6703)
                .put("f6704", f6704)
                .put("f6705a", f6705a)
                .put("f6705b", f6705b)
                .put("f6705c", f6705c)
                .put("f6705d", f6705d)
                .put("f6705e", f6705e)
                .put("f6705f", f6705f)
                .put("f6705g", f6705g)
                .put("f670596", f670596)
                .put("f670596x", f670596x)
                .put("f6706", f6706)
                .put("f6707d", f6707d)
                .put("f6707h", f6707h)
                .put("f6707m", f6707m)
                .put("f6708", f6708)
                .put("f6709a", f6709a)
                .put("f6709b", f6709b)
                .put("f6709c", f6709c)
                .put("f6709d", f6709d)
                .put("f6709e", f6709e)
                .put("f670996", f670996)
                .put("f670996x", f670996x)
                .put("f6710", f6710)
                .put("f671096x", f671096x)
                .put("f6711", f6711)
                .put("f6712h", f6712h)
                .put("f6712n", f6712n)
                .put("f6713", f6713)
                .put("f671396x", f671396x)
                .put("f6714d", f6714d)
                .put("f6714h", f6714h)
                .put("f6714m", f6714m)
                .put("f6715", f6715)
                .put("f6716", f6716)
                .put("f6717", f6717)
                .put("f6718", f6718)
                .put("f6719a", f6719a)
                .put("f6719b", f6719b)
                .put("f6719c", f6719c)
                .put("f671996", f671996)
                .put("f671996x", f671996x)
                .put("f6720", f6720)
                .put("f6721a", f6721a)
                .put("f6721b", f6721b)
                .put("f6721c", f6721c)
                .put("f6721d", f6721d)
                .put("f6721e", f6721e)
                .put("f6721f", f6721f)
                .put("f672196", f672196)
                .put("f672196x", f672196x)
                .put("f6722", f6722)
                .put("f6723a", f6723a)
                .put("f6723b", f6723b)
                .put("f6723c", f6723c)
                .put("f6723d", f6723d)
                .put("f6723e", f6723e)
                .put("f672396", f672396);

        return json.toString();
    }

    public String sF7toString() throws JSONException {
        Log.d(TAG, "sF7toString: ");
        JSONObject json = new JSONObject();

        json.put("f7101", f7101)
                .put("f7102", f7102)
                .put("f7103", f7103)
                .put("f7201", f7201)
                .put("f7202", f7202)
                .put("f7203a", f7203a)
                .put("f7203b", f7203b)
                .put("f7203c", f7203c)
                .put("f7203d", f7203d)
                .put("f7203e", f7203e)
                .put("f7203f", f7203f)
                .put("f7203g", f7203g)
                .put("f7203h", f7203h)
                .put("f7203i", f7203i)
                .put("f720396", f720396)
                .put("f720396x", f720396x)
                .put("f7204", f7204)
                .put("f7204hx", f7204hx)
                .put("f7204mx", f7204mx)
                .put("f7301", f7301)
                .put("f7302", f7302)
                .put("f7303a", f7303a)
                .put("f7303b", f7303b)
                .put("f7304", f7304)
                .put("f7305", f7305)
                .put("f7306", f7306)
                .put("f7307", f7307)
                .put("f7308", f7308)
                .put("f7309", f7309)
                .put("f7310", f7310)
                .put("f7311", f7311)
                .put("f7312", f7312)
                .put("f7312t", f7312t)
                .put("f7313", f7313)
                .put("f7314", f7314)
                .put("f7315", f7315)
                .put("f7316", f7316)
                .put("f7317", f7317)
                .put("f7318", f7318)
                .put("f7319", f7319)
                .put("f7401", f7401)
                .put("f7402a", f7402a)
                .put("f7402b", f7402b)
                .put("f7402c", f7402c)
                .put("f7402d", f7402d)
                .put("f7402e", f7402e)
                .put("f7402f", f7402f)
                .put("f7402g", f7402g)
                .put("f7402h", f7402h)
                .put("f7402i", f7402i)
                .put("f7402j", f7402j)
                .put("f7402k", f7402k)
                .put("f740296", f740296)
                .put("f740296x", f740296x)
                .put("f7403", f7403)
                .put("f7404", f7404)
                .put("f7405", f7405)
                .put("f740596x", f740596x)
                .put("f7406", f7406)
                .put("f7406mx", f7406mx)
                .put("f7406hx", f7406hx)
                .put("f7407", f7407)
                .put("f7408", f7408)
                .put("f7409", f7409)
                .put("f7410a", f7410a)
                .put("f7410b", f7410b)
                .put("f7410c", f7410c)
                .put("f741096", f741096)
                .put("f741096x", f741096x)
                .put("f7411", f7411)
                .put("f7412", f7412)
                .put("f7413a", f7413a)
                .put("f7413b", f7413b)
                .put("f7413c", f7413c)
                .put("f7413d", f7413d)
                .put("f7413e", f7413e)
                .put("f7413f", f7413f)
                .put("f7413g", f7413g)
                .put("f7413h", f7413h)
                .put("f741396", f741396)
                .put("f741396x", f741396x)
                .put("f7501", f7501)
                .put("f7502a", f7502a)
                .put("f7502b", f7502b)
                .put("f7502c", f7502c)
                .put("f7502d", f7502d)
                .put("f7502e", f7502e)
                .put("f7502f", f7502f)
                .put("f7502g", f7502g)
                .put("f750296", f750296)
                .put("f750296x", f750296x)
                .put("f7503", f7503)
                .put("f7504d", f7504d)
                .put("f7504h", f7504h)
                .put("f7504m", f7504m)
                .put("f7505", f7505)
                .put("f7506a", f7506a)
                .put("f7506b", f7506b)
                .put("f7506c", f7506c)
                .put("f7506d", f7506d)
                .put("f750696", f750696)
                .put("f750696x", f750696x)
                .put("f7507", f7507)
                .put("f750796x", f750796x)
                .put("f7508", f7508)
                .put("f7509", f7509);

        return json.toString();
    }

    public String sF8toString() throws JSONException {
        Log.d(TAG, "sF8toString: ");
        JSONObject json = new JSONObject();

        json.put("f8101", f8101)
                .put("f8102", f8102)
                .put("f8103", f8103)
                .put("f8104", f8104)
                .put("f8201", f8201)
                .put("f8202", f8202)
                .put("f8203", f8203)
                .put("f8204", f8204)
                .put("f8205", f8205)
                .put("f8206", f8206)
                .put("f8207", f8207)
                .put("f8208a", f8208a)
                .put("f8208b", f8208b)
                .put("f8208c", f8208c)
                .put("f8208d", f8208d)
                .put("f8208e", f8208e)
                .put("f8208f", f8208f)
                .put("f820896", f820896)
                .put("f820896x", f820896x)
                .put("f8209", f8209)
                .put("f8210h", f8210h)
                .put("f8210m", f8210m)
                .put("f8211", f8211)
                .put("f8301", f8301)
                .put("f8302", f8302)
                .put("f8303", f8303)
                .put("f8304", f8304)
                .put("f8305", f8305)
                .put("f8306", f8306)
                .put("f8307", f8307)
                .put("f8308a", f8308a)
                .put("f8308b", f8308b)
                .put("f8308c", f8308c)
                .put("f8308d", f8308d)
                .put("f8308e", f8308e)
                .put("f8308f", f8308f)
                .put("f830896", f830896)
                .put("f830896x", f830896x)
                .put("f8309", f8309)
                .put("f8310h", f8310h)
                .put("f8310m", f8310m)
                .put("f8311", f8311)
                .put("f8401", f8401)
                .put("f8402", f8402)
                .put("f8403", f8403)
                .put("f8404", f8404)
                .put("f8405", f8405)
                .put("f8406", f8406)
                .put("f8407", f8407)
                .put("f8408a", f8408a)
                .put("f8408b", f8408b)
                .put("f8408c", f8408c)
                .put("f8408d", f8408d)
                .put("f8408e", f8408e)
                .put("f8408f", f8408f)
                .put("f840896", f840896)
                .put("f840896x", f840896x)
                .put("f8409", f8409)
                .put("f8410h", f8410h)
                .put("f8410m", f8410m)
                .put("f8411", f8411)
                .put("f8501", f8501)
                .put("f8502", f8502)
                .put("f8503", f8503)
                .put("f8504", f8504)
                .put("f8505", f8505)
                .put("f8506", f8506)
                .put("f8507", f8507)
                .put("f8508a", f8508a)
                .put("f8508b", f8508b)
                .put("f8508c", f8508c)
                .put("f8508d", f8508d)
                .put("f8508e", f8508e)
                .put("f8508f", f8508f)
                .put("f850896", f850896)
                .put("f850896x", f850896x)
                .put("f8509", f8509)
                .put("f8510h", f8510h)
                .put("f8510m", f8510m)
                .put("f8511", f8511)
                .put("f8601", f8601)
                .put("f8602", f8602)
                .put("f8603", f8603)
                .put("f8604", f8604)
                .put("f8605", f8605)
                .put("f8606", f8606)
                .put("f8607", f8607)
                .put("f8608a", f8608a)
                .put("f8608b", f8608b)
                .put("f8608c", f8608c)
                .put("f8608d", f8608d)
                .put("f8608e", f8608e)
                .put("f8608f", f8608f)
                .put("f860896", f860896)
                .put("f860896x", f860896x)
                .put("f8609", f8609)
                .put("f8610h", f8610h)
                .put("f8610m", f8610m)
                .put("f8611", f8611)
                .put("f8701", f8701)
                .put("f8702", f8702)
                .put("f8703", f8703)
                .put("f8704", f8704)
                .put("f8705", f8705)
                .put("f8706", f8706)
                .put("f8707", f8707)
                .put("f8708a", f8708a)
                .put("f8708b", f8708b)
                .put("f8708c", f8708c)
                .put("f8708d", f8708d)
                .put("f8708e", f8708e)
                .put("f8708f", f8708f)
                .put("f870896", f870896)
                .put("f870896x", f870896x)
                .put("f8709", f8709)
                .put("f8710h", f8710h)
                .put("f8710m", f8710m)
                .put("f8711", f8711);

        return json.toString();
    }

    public String sF9toString() throws JSONException {
        Log.d(TAG, "sF9toString: ");
        JSONObject json = new JSONObject();

        json.put("f9101", f9101)
                .put("f9102", f9102)
                .put("f9103", f9103)
                .put("f9201", f9201)
                .put("f9202", f9202)
                .put("f9203a", f9203a)
                .put("f9203b", f9203b)
                .put("f9203c", f9203c)
                .put("f9203d", f9203d)
                .put("f9203e", f9203e)
                .put("f9203f", f9203f)
                .put("f9203g", f9203g)
                .put("f9203h", f9203h)
                .put("f9203i", f9203i)
                .put("f920396", f920396)
                .put("f920396x", f920396x)
                .put("f9204", f9204)
                .put("f9204hx", f9204hx)
                .put("f9204mx", f9204mx)
                .put("f9204dx", f9204dx)
                .put("f9301", f9301)
                .put("f9302", f9302)
                .put("f9303", f9303)
                .put("f9304", f9304)
                .put("f9305a", f9305a)
                .put("f9305b", f9305b)
                .put("f9306", f9306)
                .put("f9307", f9307)
                .put("f9308", f9308)
                .put("f9309", f9309)
                .put("f9310", f9310)
                .put("f9311", f9311)
                .put("f9312", f9312)
                .put("f9313a", f9313a)
                .put("f9313b", f9313b)
                .put("f9313c", f9313c)
                .put("f9313d", f9313d)
                .put("f9313e", f9313e)
                .put("f9314", f9314)
                .put("f9315", f9315)
                .put("f9316", f9316)
                .put("f9317", f9317)
                .put("f9318", f9318)
                .put("f9319", f9319)
                .put("f9320", f9320)
                .put("f9321", f9321)
                .put("f9322", f9322)
                .put("f9401", f9401)
                .put("f9402a", f9402a)
                .put("f9402b", f9402b)
                .put("f9402c", f9402c)
                .put("f9402d", f9402d)
                .put("f9402e", f9402e)
                .put("f9402f", f9402f)
                .put("f9402g", f9402g)
                .put("f9402h", f9402h)
                .put("f9402i", f9402i)
                .put("f9402j", f9402j)
                .put("f9402k", f9402k)
                .put("f940296", f940296)
                .put("f940296x", f940296x)
                .put("f9403", f9403)
                .put("f9404", f9404)
                .put("f9405", f9405)
                .put("f940596x", f940596x)
                .put("f9406", f9406)
                .put("f9406mx", f9406mx)
                .put("f9406hx", f9406hx)
                .put("f9406dx", f9406dx)
                .put("f9407", f9407)
                .put("f9408", f9408)
                .put("f9409", f9409)
                .put("f9410a", f9410a)
                .put("f9410b", f9410b)
                .put("f9410c", f9410c)
                .put("f941096", f941096)
                .put("f941096x", f941096x)
                .put("f9411", f9411)
                .put("f9412", f9412)
                .put("f9412hx", f9412hx)
                .put("f9412dx", f9412dx)
                .put("f9413a", f9413a)
                .put("f9413b", f9413b)
                .put("f9413c", f9413c)
                .put("f9413d", f9413d)
                .put("f9413e", f9413e)
                .put("f9413f", f9413f)
                .put("f9413g", f9413g)
                .put("f9413h", f9413h)
                .put("f941396", f941396)
                .put("f941396x", f941396x)
                .put("f9501", f9501)
                .put("f950196x", f950196x)
                .put("f9502", f9502)
                .put("f9503", f9503)
                .put("f950396x", f950396x)
                .put("f9504", f9504)
                .put("f9505a", f9505a)
                .put("f9505b", f9505b)
                .put("f9505c", f9505c)
                .put("f950596", f950596)
                .put("f950596x", f950596x)
                .put("f9601", f9601)
                .put("f9602a", f9602a)
                .put("f9602b", f9602b)
                .put("f9602c", f9602c)
                .put("f9602d", f9602d)
                .put("f9602e", f9602e)
                .put("f9602f", f9602f)
                .put("f960296", f960296)
                .put("f960296x", f960296x)
                .put("f9603", f9603)
                .put("f9604d", f9604d)
                .put("f9604h", f9604h)
                .put("f9604m", f9604m)
                .put("f9605", f9605)
                .put("f9606a", f9606a)
                .put("f9606b", f9606b)
                .put("f9606c", f9606c)
                .put("f9606d", f9606d)
                .put("f960696", f960696)
                .put("f960696x", f960696x)
                .put("f9607", f9607)
                .put("f9608", f9608)
                .put("f9609", f9609)
                .put("f9610a", f9610a)
                .put("f9610b", f9610b)
                .put("f9610c", f9610c)
                .put("f9610d", f9610d)
                .put("f9610e", f9610e)
                .put("f9610f", f9610f)
                .put("f961096", f961096)
                .put("f961096x", f961096x);

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
        json.put(FormsTable.COLUMN_SF2, new JSONObject(sF2toString()));
        json.put(FormsTable.COLUMN_SF3, new JSONObject(sF3toString()));
        json.put(FormsTable.COLUMN_SF5, new JSONObject(sF5toString()));
        json.put(FormsTable.COLUMN_SF6, new JSONObject(sF6toString()));
        json.put(FormsTable.COLUMN_SF7, new JSONObject(sF7toString()));
        json.put(FormsTable.COLUMN_SF8, new JSONObject(sF8toString()));
        json.put(FormsTable.COLUMN_SF9, new JSONObject(sF9toString()));

        return json;
    }


}
