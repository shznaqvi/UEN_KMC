package edu.aku.hassannaqvi.uen_kmc.database

import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.*
import edu.aku.hassannaqvi.uen_kmc.core.MainApp.PROJECT_NAME

object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_ENUM_BLOCK + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_FORM_COMPLETE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SF1 + " TEXT,"
            + FormsTable.COLUMN_SF2 + " TEXT,"
            + FormsTable.COLUMN_SF3 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )

    const val SQL_CREATE_FAMILY_MEMBERS = ("CREATE TABLE "
            + FamilyMemberListTable.TABLE_NAME + "("
            + FamilyMemberListTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMemberListTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMemberListTable.COLUMN_UID + " TEXT,"
            + FamilyMemberListTable.COLUMN_UUID + " TEXT,"
            + FamilyMemberListTable.COLUMN_EB_CODE + " TEXT,"
            + FamilyMemberListTable.COLUMN_HHID + " TEXT,"
            + FamilyMemberListTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMemberListTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMemberListTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMemberListTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMemberListTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMemberListTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyMemberListTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMemberListTable.COLUMN_SA2 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )

    const val SQL_CREATE_LHW_HF = ("CREATE TABLE " + TableHealthFacilities.TABLE_NAME + "("
            + TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableHealthFacilities.COLUMN_HF_CODE + " TEXT,"
            + TableHealthFacilities.COLUMN_HF_NAME + " TEXT,"
            + TableHealthFacilities.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_CREATE_TEHSIL = ("CREATE TABLE " + TableTehsil.TABLE_NAME + "("
            + TableTehsil.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableTehsil.COLUMN_DIST_ID + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_NAME + " TEXT,"
            + TableTehsil.COLUMN_TEHSIL_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_DISTRICT = ("CREATE TABLE " + TableDistricts.TABLE_NAME + "("
            + TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")


}