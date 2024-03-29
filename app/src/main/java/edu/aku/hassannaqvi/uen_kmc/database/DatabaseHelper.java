package edu.aku.hassannaqvi.uen_kmc.database;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.IBAHC;
import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uen_kmc.core.UserAuth.checkPassword;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_ALTER_FOLLOWUPS_ADD_ENDIME;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_ALTER_FOLLOWUPS_ADD_ISTATUS_96x;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_ALTER_FORMS_ADD_ENDTIME;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_ALTER_FORMS_ADD_ISTATUS_96x;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_DISCHARGE;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_DISTRICT;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_ENTRYLOGS;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_FAMILY_MEMBERS;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_FOLLOWUPS;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_FOLLOWUPS_SCHE;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_FORMS;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_LHW_HF;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_TEHSIL;
import static edu.aku.hassannaqvi.uen_kmc.database.CreateTable.SQL_CREATE_USERS;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.util.Log;
import android.widget.Toast;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.lhwevaluation.models.Districts;
import edu.aku.hassannaqvi.lhwevaluation.models.HealthFacilities;
import edu.aku.hassannaqvi.lhwevaluation.models.Tehsil;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.DischargeTable;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.EntryLogTable;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.FollowUpTable;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.FollowupsScheTable;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.TableDistricts;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.TableHealthFacilities;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.TableTehsil;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.UsersTable;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.models.Discharge;
import edu.aku.hassannaqvi.uen_kmc.models.EntryLog;
import edu.aku.hassannaqvi.uen_kmc.models.FollowUp;
import edu.aku.hassannaqvi.uen_kmc.models.FollowUpsSche;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.models.Users;



/*import edu.aku.hassannaqvi.naunehal.models.Immunization;*/

/**
 * @author hassan.naqvi on 11/30/2016.
 * @update ali azaz on 01/07/21
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = PROJECT_NAME + ".db";
    public static final String DATABASE_COPY = PROJECT_NAME + "_copy.db";
    private final String TAG = "DatabaseHelper";
    private static final int DATABASE_VERSION = 2;
    public static final String DATABASE_PASSWORD = IBAHC;
    private final Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_DISCHARGE);
        db.execSQL(SQL_CREATE_FOLLOWUPS);
        db.execSQL(SQL_CREATE_FAMILY_MEMBERS);
        db.execSQL(SQL_CREATE_DISTRICT);
        db.execSQL(SQL_CREATE_TEHSIL);
        db.execSQL(SQL_CREATE_LHW_HF);
        db.execSQL(SQL_CREATE_ENTRYLOGS);
        db.execSQL(SQL_CREATE_FOLLOWUPS_SCHE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
                db.execSQL(SQL_ALTER_FORMS_ADD_ISTATUS_96x);
                db.execSQL(SQL_ALTER_FORMS_ADD_ENDTIME);
                db.execSQL(SQL_ALTER_FOLLOWUPS_ADD_ISTATUS_96x);
                db.execSQL(SQL_ALTER_FOLLOWUPS_ADD_ENDIME);
            case 2:
        }
    }

    //ADDITION in DB
    public Long addForm(Form form) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.getUid());
        values.put(FormsTable.COLUMN_UUID, form.getUuid());
        values.put(FormsTable.COLUMN_ENUM_BLOCK, form.getEbCode());
        values.put(FormsTable.COLUMN_HHID, form.getHhid());
        values.put(FormsTable.COLUMN_SNO, form.getSno());
        values.put(FormsTable.COLUMN_STUDY_NO, form.getStudyNo());
        values.put(FormsTable.COLUMN_SYNCED, form.getSynced());
        values.put(FormsTable.COLUMN_SYNCED_DATE, form.getSyncDate());
        values.put(FormsTable.COLUMN_FORM_COMPLETE, form.getFormComplete());
        values.put(FormsTable.COLUMN_USERNAME, form.getUserName());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysDate());
        values.put(FormsTable.COLUMN_ISTATUS, form.getiStatus());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDeviceTag());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceId());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppver());
        values.put(FormsTable.COLUMN_SF1, form.sF1toString());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public Long addDischarge(Discharge discharge) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(DischargeTable.COLUMN_PROJECT_NAME, discharge.getProjectName());
        values.put(DischargeTable.COLUMN_UID, discharge.getUid());
        values.put(DischargeTable.COLUMN_UUID, discharge.getUuid());
        values.put(DischargeTable.COLUMN_ENUM_BLOCK, discharge.getEbCode());
        values.put(DischargeTable.COLUMN_HHID, discharge.getHhid());
        values.put(DischargeTable.COLUMN_SNO, discharge.getSno());
        values.put(DischargeTable.COLUMN_STUDY_NO, discharge.getStudyNo());
        values.put(DischargeTable.COLUMN_SYNCED, discharge.getSynced());
        values.put(DischargeTable.COLUMN_SYNCED_DATE, discharge.getSyncDate());
        values.put(DischargeTable.COLUMN_FORM_COMPLETE, discharge.getFormComplete());
        values.put(DischargeTable.COLUMN_USERNAME, discharge.getUserName());
        values.put(DischargeTable.COLUMN_SYSDATE, discharge.getSysDate());
        values.put(DischargeTable.COLUMN_ISTATUS, discharge.getiStatus());
        values.put(DischargeTable.COLUMN_DEVICETAGID, discharge.getDeviceTag());
        values.put(DischargeTable.COLUMN_DEVICEID, discharge.getDeviceId());
        values.put(DischargeTable.COLUMN_APPVERSION, discharge.getAppver());
        values.put(DischargeTable.COLUMN_SF2, discharge.sF2toString());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                DischargeTable.TABLE_NAME,
                DischargeTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addFollowUps(FollowUp followUp) throws JSONException {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FollowUpTable.COLUMN_PROJECT_NAME, followUp.getProjectName());
        values.put(FollowUpTable.COLUMN_UID, followUp.getUid());
        values.put(FollowUpTable.COLUMN_ENUM_BLOCK, followUp.getEbCode());
        values.put(FollowUpTable.COLUMN_HHID, followUp.getHhid());
        values.put(FollowUpTable.COLUMN_SNO, followUp.getSno());
        values.put(FollowUpTable.COLUMN_SYNCED, followUp.getSynced());
        values.put(FollowUpTable.COLUMN_SYNCED_DATE, followUp.getSyncDate());
        values.put(FollowUpTable.COLUMN_FORM_COMPLETE, followUp.getFormComplete());
        values.put(FollowUpTable.COLUMN_USERNAME, followUp.getUserName());
        values.put(FollowUpTable.COLUMN_SYSDATE, followUp.getSysDate());
        values.put(FollowUpTable.COLUMN_ISTATUS, followUp.getiStatus());
        values.put(FollowUpTable.COLUMN_DEVICETAGID, followUp.getDeviceTag());
        values.put(FollowUpTable.COLUMN_DEVICEID, followUp.getDeviceId());
        values.put(FollowUpTable.COLUMN_APPVERSION, followUp.getAppver());
        values.put(FollowUpTable.COLUMN_SF3, followUp.sF3toString());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FollowUpTable.TABLE_NAME,
                FollowUpTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    public Long addEntryLog(EntryLog entryLog) throws SQLiteException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_PROJECT_NAME, entryLog.getProjectName());
        values.put(EntryLogTable.COLUMN_UUID, entryLog.getUuid());
        values.put(EntryLogTable.COLUMN_PSU_CODE, entryLog.getPsuCode());
        values.put(EntryLogTable.COLUMN_HHID, entryLog.getHhid());
        values.put(EntryLogTable.COLUMN_USERNAME, entryLog.getUserName());
        values.put(EntryLogTable.COLUMN_SYSDATE, entryLog.getSysDate());
        values.put(EntryLogTable.COLUMN_ISTATUS, entryLog.getiStatus());
        values.put(EntryLogTable.COLUMN_ISTATUS96x, entryLog.getiStatus96x());
        values.put(EntryLogTable.COLUMN_ENTRY_TYPE, entryLog.getEntryType());
        values.put(EntryLogTable.COLUMN_ENTRY_DATE, entryLog.getEntryDate());
        values.put(EntryLogTable.COLUMN_DEVICEID, entryLog.getDeviceId());
        values.put(EntryLogTable.COLUMN_SYNCED, entryLog.getSynced());
        values.put(EntryLogTable.COLUMN_SYNC_DATE, entryLog.getSyncDate());
        values.put(EntryLogTable.COLUMN_APPVERSION, entryLog.getAppver());

        long newRowId;
        newRowId = db.insertOrThrow(
                EntryLogTable.TABLE_NAME,
                EntryLogTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }


    //UPDATE in DB
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesDischargeColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = DischargeTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.discharge.getId())};

        return db.update(DischargeTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesFollupColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FollowUpTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.followup.getId())};

        return db.update(FollowUpTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesEntryLogColumn(String column, String value, String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = EntryLogTable._ID + " =? ";
        String[] selectionArgs = {id};

        return db.update(EntryLogTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getiStatus());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};

        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

    /*
     * Functions that dealing with table data
     * */
    //Functions that dealing with table data
    public boolean doLogin(String username, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = UsersTable.COLUMN_USERNAME + "=? ";
        String[] whereArgs = {username};
        String groupBy = null;
        String having = null;
        String orderBy = UsersTable.COLUMN_ID + " ASC";

        Users loggedInUser = new Users();
        c = db.query(
                UsersTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            loggedInUser = new Users().hydrate(c);

        }

        c.close();
        if (loggedInUser.getPassword().equals("")) {
            Toast.makeText(mContext, "Stored password is invalid", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (checkPassword(password, loggedInUser.getPassword())) {
            MainApp.user = loggedInUser;
            //  MainApp.selectedDistrict = loggedInUser.getDist_id();
            return c.getCount() > 0;
        } else {
            return false;
        }
    }


    public ArrayList<Form> getFormsByDate(String sysdate) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {
                FormsTable._ID,
                FormsTable.COLUMN_UID,
                FormsTable.COLUMN_SYSDATE,
                FormsTable.COLUMN_USERNAME,
                FormsTable.COLUMN_ISTATUS,
                FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form forms = new Form();
                forms.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                forms.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                forms.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                forms.setUserName(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME)));
                allForms.add(forms);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allForms;
    }


    // istatus examples: (1) or (1,9) or (1,3,5)
    public Form getFormByAssessNo(String uid, String istatus) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_UID + "=? AND " +
                FormsTable.COLUMN_ISTATUS + " in " + istatus;

        String[] whereArgs = {uid};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form allFC = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }


    public ArrayList<Cursor> getDatabaseManagerData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public int syncversionApp(JSONArray VersionList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        long count = 0;

        JSONObject jsonObjectVersion = ((JSONArray) VersionList.getJSONObject(0).get("elements")).getJSONObject(0);

        String appPath = jsonObjectVersion.getString("outputFile");
        String versionCode = jsonObjectVersion.getString("versionCode");

        MainApp.editor.putString("outputFile", jsonObjectVersion.getString("outputFile"));
        MainApp.editor.putString("versionCode", jsonObjectVersion.getString("versionCode"));
        MainApp.editor.putString("versionName", jsonObjectVersion.getString("versionName") + ".");
        MainApp.editor.apply();
        count++;
          /*  VersionApp Vc = new VersionApp();
            Vc.sync(jsonObjectVersion);

            ContentValues values = new ContentValues();

            values.put(VersionTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }*/

        return (int) count;
    }


    public int syncAppUser(JSONArray userList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < userList.length(); i++) {

            JSONObject jsonObjectUser = userList.getJSONObject(i);

            Users user = new Users();
            user.sync(jsonObjectUser);
            ContentValues values = new ContentValues();

            values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
            values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
            values.put(UsersTable.COLUMN_FULLNAME, user.getFullname());
            values.put(UsersTable.COLUMN_ENABLED, user.getEnabled());
            values.put(UsersTable.COLUMN_ISNEW_USER, user.getNewUser());
            values.put(UsersTable.COLUMN_PWD_EXPIRY, user.getPwdExpiry());
            values.put(UsersTable.COLUMN_DESIGNATION, user.getDesignation());
            values.put(UsersTable.COLUMN_DIST_ID, user.getDist_id());
            long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    // Sync Districts
    public int syncdistrict(JSONArray Districtslist) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableDistricts.TABLE_NAME, null, null);
        int insertCount = 0;
        for (int i = 0; i < Districtslist.length(); i++) {
            JSONObject jsonObjectDistrict = Districtslist.getJSONObject(i);
            Districts District = new Districts();
            District.sync(jsonObjectDistrict);
            ContentValues values = new ContentValues();

            values.put(TableDistricts.COLUMN_DISTRICT_CODE, District.getDistrictCode());
            values.put(TableDistricts.COLUMN_DISTRICT_NAME, District.getDistrictName());
            long rowID = db.insert(TableDistricts.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    //    Sync Tehsil
    public int synctehsil(JSONArray tehsilList) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableTehsil.TABLE_NAME, null, null);
        int insertCount = 0;


        for (int i = 0; i < tehsilList.length(); i++) {
            JSONObject json = tehsilList.getJSONObject(i);
            Tehsil tehsil = new Tehsil();
            tehsil.sync(json);
            ContentValues values = new ContentValues();

            values.put(TableTehsil.COLUMN_DIST_ID, tehsil.getDist_id());
            values.put(TableTehsil.COLUMN_TEHSIL_NAME, tehsil.getTehsilName());
            values.put(TableTehsil.COLUMN_TEHSIL_CODE, tehsil.getTehsilCode());

            long rowID = db.insert(TableTehsil.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    //    Sync LHWHF
    public int syncHealthFacility(JSONArray healthfacilities) throws JSONException {
        SQLiteDatabase db = this.getWritableDatabase(DATABASE_PASSWORD);
        db.delete(TableHealthFacilities.TABLE_NAME, null, null);
        int insertCount = 0;

        for (int i = 0; i < healthfacilities.length(); i++) {
            JSONObject json = healthfacilities.getJSONObject(i);
            HealthFacilities lhwHF = new HealthFacilities();
            lhwHF.sync(json);
            ContentValues values = new ContentValues();

            values.put(TableHealthFacilities.COLUMN_HF_CODE, lhwHF.getHfCode());
            values.put(TableHealthFacilities.COLUMN_HF_NAME, lhwHF.getHfName());
            values.put(TableHealthFacilities.COLUMN_DIST_ID, lhwHF.getDist_id());

            long rowID = db.insert(TableHealthFacilities.TABLE_NAME, null, values);
            if (rowID != -1) insertCount++;
        }
        return insertCount;
    }


    //get UnSyncedTables
    public JSONArray getUnsyncedForms() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FormsTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        JSONArray allForms = new JSONArray();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedForms: " + c.getCount());
            Form form = new Form().Hydrate(c);
            allForms.put(form.toJSONObject());


        }
        c.close();
        Log.d(TAG, "getUnsyncedForms: " + allForms.toString().length());
        Log.d(TAG, "getUnsyncedForms: " + allForms);
        return allForms;
    }


    public JSONArray getUnsyncedDischarge() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = DischargeTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = DischargeTable.COLUMN_ID + " ASC";

        JSONArray allDischarge = new JSONArray();
        c = db.query(
                DischargeTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedDischarge: " + c.getCount());
            Discharge discharge = new Discharge().Hydrate(c);
            allDischarge.put(discharge.toJSONObject());


        }
        c.close();

        Log.d(TAG, "getUnsyncedDischarge: " + allDischarge.toString().length());
        Log.d(TAG, "getUnsyncedDischarge: " + allDischarge);
        return allDischarge;
    }


    public JSONArray getUnsyncedFollowup() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        //whereClause = null;
        whereClause = FollowUpTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;

        String groupBy = null;
        String having = null;

        String orderBy = FollowUpTable.COLUMN_ID + " ASC";

        JSONArray allFollowup = new JSONArray();
        c = db.query(
                FollowUpTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            /** WorkManager Upload
             /*Form fc = new Form();
             allFC.add(fc.Hydrate(c));*/
            Log.d(TAG, "getUnsyncedFollowups: " + c.getCount());
            FollowUp followUp = new FollowUp().Hydrate(c);
            allFollowup.put(followUp.toJSONObject());


        }
        c.close();
        Log.d(TAG, "getUnsyncedFollowups: " + allFollowup.toString().length());
        Log.d(TAG, "getUnsyncedFollowups: " + allFollowup);
        return allFollowup;
    }


    public JSONArray getUnsyncedEntryLog() throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause;
        whereClause = EntryLogTable.COLUMN_SYNCED + " = '' ";

        String[] whereArgs = null;
        String groupBy = null;
        String having = null;
        String orderBy = EntryLogTable.COLUMN_ID + " ASC";

        JSONArray all = new JSONArray();
        c = db.query(
                EntryLogTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            Log.d(TAG, "getUnsyncedEntryLog: " + c.getCount());
            EntryLog entryLog = new EntryLog();
            all.put(entryLog.Hydrate(c).toJSONObject());
        }
        Log.d(TAG, "getUnsyncedEntryLog: " + all.toString().length());
        Log.d(TAG, "getUnsyncedEntryLog: " + all);
        return all;
    }

    //update SyncedTables
    public void updateSyncedKMCforms(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public void updateSyncedKMCdischarge(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(DischargeTable.COLUMN_SYNCED, true);
        values.put(DischargeTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = DischargeTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                DischargeTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public void updateSyncedKMCfollowUps(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FollowUpTable.COLUMN_SYNCED, true);
        values.put(FollowUpTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FollowUpTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FollowUpTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase(DATABASE_PASSWORD);
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {
            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public Form getFormByClusterHHNo(String enumblock, String hh_no) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = FormsTable.COLUMN_ENUM_BLOCK + "=? AND " +
                FormsTable.COLUMN_HHID + " =? ";

        String[] whereArgs = {enumblock, hh_no};

        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Form form = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                form = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return form;
    }


    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ENUM_BLOCK + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }


    public Collection<Form> getTodayForms(String sysdate) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }


    public Collection<Form> getPendingForms() {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ?";
        String[] whereArgs = new String[]{""};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        Collection<Form> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form fc = new Form();
                fc.setId(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ID)));
                fc.setUid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_UID)));
                fc.setSysDate(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE)));
                fc.setEbCode(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ENUM_BLOCK)));
                fc.setHhid(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_HHID)));
                fc.setSno(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SNO)));
                fc.setiStatus(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return allFC;
    }


    public Collection<HealthFacilities> getHealthFacilityByDist(String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableHealthFacilities.COLUMN_DIST_ID + " = ? ";

        String[] whereArgs = {distCode};

        String groupBy = null;
        String having = null;

        String orderBy = TableHealthFacilities.COLUMN_ID + " ASC";

        List<HealthFacilities> healthFacilities = new ArrayList<>();

        c = db.query(
                TableHealthFacilities.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {

            healthFacilities.add(new HealthFacilities().hydrate(c));


        }

        return healthFacilities;
    }


    public Collection<Districts> getAllDistricts() {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = {TableDistricts.COLUMN_DISTRICT_CODE, TableDistricts.COLUMN_DISTRICT_NAME};

        String orderBy = TableDistricts.COLUMN_DISTRICT_NAME + " ASC";

        Collection<Districts> allDistricts = new ArrayList<>();
        c = db.query(
                true,
                TableDistricts.TABLE_NAME,  // The table to query
                columns,
                null,
                null,
                null,
                null,
                orderBy,
                "5000"

                // The sort order
        );
        while (c.moveToNext()) {


            Log.d(TAG, "getUnsyncedPreg: " + c.getCount());
            Districts cluster = new Districts();
            cluster.setDistrictCode(c.getString(c.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_CODE)));
            cluster.setDistrictName(c.getString(c.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_NAME)));
            allDistricts.add(cluster);

        }

        return allDistricts;
    }


    public Collection<Tehsil> getTehsilByDist(String distCode) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;

        String whereClause;
        whereClause = TableTehsil.COLUMN_DIST_ID + " = ? ";

        String[] whereArgs = {distCode};

        String groupBy = null;
        String having = null;

        String orderBy = TableTehsil.COLUMN_ID + " ASC";

        List<Tehsil> tehsils = new ArrayList<>();

        c = db.query(
                TableTehsil.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {

            tehsils.add(new Tehsil().hydrate(c));


        }

        return tehsils;
    }


    public void updateSyncedEntryLog(String id) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(EntryLogTable.COLUMN_SYNCED, true);
        values.put(EntryLogTable.COLUMN_SYNC_DATE, new Date().toString());
        String where = EntryLogTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};
        int count = db.update(
                EntryLogTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public int updatePassword(String hashedPassword) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(UsersTable.COLUMN_PASSWORD, hashedPassword);
        values.put(UsersTable.COLUMN_ISNEW_USER, "");

        String selection = UsersTable.COLUMN_USERNAME + " =? ";
        String[] selectionArgs = {MainApp.user.getUserName()};

        return db.update(UsersTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updatesFollowupsScheColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = TableContracts.FollowupsScheTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.followupsSche.getId())};

        return db.update(TableContracts.FollowupsScheTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public List<FollowUpsSche> getAllFollowUpsSche() throws JSONException {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy = TableContracts.FollowupsScheTable.COLUMN_FP_DATE + " ASC";

        List<FollowUpsSche> allFollowupsSche = new ArrayList<>();
        c = db.query(
                TableContracts.FollowupsScheTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            allFollowupsSche.add(new FollowUpsSche().Hydrate(c));
        }

        c.close();

        return allFollowupsSche;
    }


    public List<FollowUpsSche> getFollowUpsScheByMemberID(String memberid) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = FormsTable.COLUMN_UUID + "=? ";
        String[] whereArgs = {MainApp.form.getUid()};
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " DESC";

        List<FollowUpsSche> allFollowupsSche = new ArrayList<>();
        c = db.query(
                FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            allFollowupsSche.add(new FollowUpsSche().Hydrate(c));
        }

        c.close();
        return allFollowupsSche;
    }


    public List<FollowUpsSche> getFollowUpsScheByRound(int round) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c = null;
        String[] columns = null;
        String whereClause = FollowupsScheTable.COLUMN_FP_CODE + " = ? ";
        String[] whereArgs = {String.valueOf(round)};
        String groupBy = null;
        String having = null;

        String orderBy = FollowupsScheTable.COLUMN_FP_DATE + " ASC";

        List<FollowUpsSche> allFollowupsSche = new ArrayList<>();
        c = db.query(
                FollowupsScheTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            allFollowupsSche.add(new FollowUpsSche().Hydrate(c));
        }

        c.close();

        return allFollowupsSche;
    }


    public List<Form> getAllForms() {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = FormsTable.COLUMN_ID + " ASC";
        List<Form> allForm = new ArrayList<>();

        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            try {
                Form form = new Form().Hydrate(c);
                if (form.getF1201().equals("1") && form.getF1203().equals("1")) {
                    Discharge discharge = getDiscFormByStudyNo(form.getStudyNo());
                    if (discharge != null && discharge.getF2305().equals("")) {
                        allForm.add(form);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        c.close();
        return allForm;
    }


    public List<Form> getAllFollowup(String studyNo) {

        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;

        String whereClause = FormsTable.COLUMN_STUDY_NO + " = ? ";
        String[] whereArgs = new String[]{studyNo};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        List<Form> allForm = new ArrayList<>();
        c = db.query(
                TableContracts.FormsTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            try {
                Form form = new Form().Hydrate(c);
                if (form.getF1201().equals("1") && form.getF1203().equals("1"))
                    allForm.add(form);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        c.close();
        return allForm;
    }


    //GET FormBy STUDYNO
    public Discharge getDiscFormByStudyNo(String studyNo) throws JSONException {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        Cursor c;
        String[] columns = null;
        String whereClause;
        whereClause = DischargeTable.COLUMN_STUDY_NO + "=? ";
        String[] whereArgs = {studyNo};
        String groupBy = null;
        String having = null;
        String orderBy = DischargeTable.COLUMN_ID + " ASC";
        Discharge disc = new Discharge();
        c = db.query(
                DischargeTable.TABLE_NAME,  // The table to query
                columns,                   // The columns to return
                whereClause,               // The columns for the WHERE clause
                whereArgs,                 // The values for the WHERE clause
                groupBy,                   // don't group the rows
                having,                    // don't filter by row groups
                orderBy                    // The sort order
        );
        while (c.moveToNext()) {
            disc = new Discharge().Hydrate(c);
        }
        return disc;
    }

    public int updateEndingForm(String status, String status96x, String endTime) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, status);
        values.put(FormsTable.COLUMN_ISTATUS96x, status96x);
        values.put(FormsTable.COLUMN_ENDTIME, endTime);
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.getId())};
        return db.update(FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }


    public int updateEndingFollowUp(String status, String status96x, String endTime) {
        SQLiteDatabase db = this.getReadableDatabase(DATABASE_PASSWORD);
        ContentValues values = new ContentValues();
        values.put(FollowUpTable.COLUMN_ISTATUS, status);
        values.put(FollowUpTable.COLUMN_ISTATUS96x, status96x);
        values.put(FollowUpTable.COLUMN_ENDTIME, endTime);
        String selection = FollowUpTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.followup.getId())};
        return db.update(FollowUpTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
    }

}
