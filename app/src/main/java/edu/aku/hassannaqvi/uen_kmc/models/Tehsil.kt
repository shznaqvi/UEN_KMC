package edu.aku.hassannaqvi.lhwevaluation.models

import android.database.Cursor
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts.TableTehsil
import edu.aku.hassannaqvi.uen_kmc.core.MainApp._EMPTY_
import org.json.JSONObject

/**
 * Created by hussain.siddiqui on 01/06/2021.
 */

class Tehsil {
    var tehsilCode: String = _EMPTY_
    var tehsilName: String = _EMPTY_
    var dist_id: String = _EMPTY_

    fun sync(jsonObject: JSONObject): Tehsil {
        tehsilCode = jsonObject.getString(TableTehsil.COLUMN_TEHSIL_CODE)
        tehsilName = jsonObject.getString(TableTehsil.COLUMN_TEHSIL_NAME)
        dist_id = jsonObject.getString(TableTehsil.COLUMN_DIST_ID)
        return this
    }

    fun hydrate(cursor: Cursor): Tehsil {
        tehsilCode = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_TEHSIL_CODE))
        tehsilName = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_TEHSIL_NAME))
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(TableTehsil.COLUMN_DIST_ID))
        return this
    }


}