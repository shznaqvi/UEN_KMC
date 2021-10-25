package edu.aku.hassannaqvi.uen_kmc.models

import android.database.Cursor
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.VersionTable
import org.json.JSONException
import org.json.JSONObject

class VersionApp {
    var versioncode: String = ""
    var versionname: String = ""
    var pathname: String = ""

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): VersionApp {
        versioncode = jsonObject.getString(VersionTable.COLUMN_VERSION_CODE)
        pathname = jsonObject.getString(VersionTable.COLUMN_PATH_NAME)
        versionname = jsonObject.getString(VersionTable.COLUMN_VERSION_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): VersionApp {
        versioncode =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_CODE))
        pathname = cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_PATH_NAME))
        versionname =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionTable.COLUMN_VERSION_NAME))
        return this
    }


}