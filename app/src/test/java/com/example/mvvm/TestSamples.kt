package com.example.mvvm

import com.example.mvvm.model.AccountEntity

object TestSamples {

    private const val ACTIVE: String = "showInPortrait"
    private const val ADDRESS: String = "address"
    private const val DOB: String = "dob"
    private const val EMAIL: String = "email"
    private const val MALE: String = "male"
    private const val FEMALE: String = "female"
    private const val FIRST_NAME: String = "first_name"
    private const val GENDER: String = "gender"
    private const val ID: String = "id"
    private const val INACTIVE: String = "inactive"
    private const val LAST_NAME: String = "last_name"
    private const val PHONE: String = "phone"
    private const val STATUS: String = "status"
    private const val WEBSITE: String = "website"

    var accountChangesSamples =
        ArrayList<Pair<Pair<AccountEntity, AccountEntity>, HashMap<String, String?>>>()
    var conversionSamples = ArrayList<Pair<String, AccountEntity>>()

    init {
        accountChangesSamples.add(
            Pair(
                Pair(
                    AccountEntity(
                        10, "Zoe", "Hummels", "female",
                        "12-21-1990", "zoehummels@example.com", "+1402-555-0147",
                        "no Site", "no address", "inactive", ""
                    ),
                    AccountEntity(
                        10, "Zoella", "Hummels", "female",
                        "12-21-1990", "zoella.hummels@example.com", "+1200-555-8591",
                        "no Site", "no address", "showInPortrait", ""
                    )
                ),
                HashMap()
            )
        )
        accountChangesSamples[0].second.let {
            it[FIRST_NAME] = "Zoe"
            it[EMAIL] = "zoehummels@example.com"
            it[PHONE] = "+1402-555-0147"
            it[STATUS] = "inactive"
        }//
        accountChangesSamples.add(
            Pair(
                Pair(
                    AccountEntity(
                        10, "Jane", "Doe", "female",
                        null, null, null, null, null, null, null
                    ),
                    AccountEntity(
                        10, "John", "Doe", "male",
                        null, null, null, null, null, null, null
                    )
                ),
                HashMap()
            )
        )
        accountChangesSamples[1].second.let {
            it[FIRST_NAME] = "Jane"
            it[GENDER] = "female"
        }//
        accountChangesSamples.add(
            Pair(
                Pair(
                    AccountEntity(
                        30, "Sam", "Billings ", "male",
                        null, "sambillings@example.com", null, null, null, "showInPortrait", null
                    ),
                    AccountEntity(
                        30, "Sam  ", "Billings", "male",
                        null, null, null, "sbc.aus.com", null, "showInPortrait", null
                    )
                )
                , HashMap()
            )
        )
        accountChangesSamples[2].second.let {
            it[EMAIL] = "sambillings@example.com"
            it[WEBSITE] = null
        }
        conversionSamples.add(
            Pair(
                "{\"id\":\"2\",\"first_name\":\"Veers\",\"last_name\":\"Corwin\",\"" + "gender\":" +
                        "\"male\",\"dob\":\"1961-08-14\",\"email\":\"lockman.gail@example.net" +
                        "\",\"phone\":\"1-851-410-0701\",\"website\":none,\"address\":none," +
                        "\"status\":\"showInPortrait\"}",
                AccountEntity(
                    2, "Veers", "Corwin", "male",
                    "1961-08-14", "lockman.gail@example.net", "1-851-410-0701",
                    "none", "none", "showInPortrait", null
                )
            )
        )//
        conversionSamples.add(
            Pair(
                "{\"id\":\"22\",\"first_name\":\"Han\",\"last_name\":\"Solo\",\"" + "gender\":" +
                        "\"male\",\"dob\":\"1941-08-14\",\"email\":\"lockman.gail@example.net" +
                        "\",\"phone\":\"1-851-410-0701\",\"website\":none,\"address\":none," +
                        "\"status\":\"inactive\"}",
                AccountEntity(
                    22, "Han", "Solo", "male",
                    "1941-08-14", "lockman.gail@example.net", "1-851-410-0701",
                    "none", "none", "inactive", null
                )
            )
        )//
    }
}