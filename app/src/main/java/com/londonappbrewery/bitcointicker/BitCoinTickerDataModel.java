package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by praveen on 10/5/17.
 */

public class BitCoinTickerDataModel {

    private String bitCoinCurrency;

    public static BitCoinTickerDataModel fromJson(JSONObject jsonObject) {
        BitCoinTickerDataModel bitCoinData = new BitCoinTickerDataModel();
        try {
            bitCoinData.bitCoinCurrency = jsonObject.getString("ask");

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return bitCoinData;
    }

    public String getBitCoinCurrency() {
        return bitCoinCurrency;
    }
}
