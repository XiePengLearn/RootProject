package com.xiaoanjujia.home;

import java.util.ArrayList;
import java.util.Collections;

import okhttp3.FormBody;

/**
 * @Auther: xp
 * @Date: 2020/7/23 14:59
 * @Description:
 */
public class Api {
    private static String[] getSignByForm(String token, FormBody formBody) {
        String[] ret = new String[2];
        ret[0] = System.currentTimeMillis() + "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(token);
        stringBuilder.append(ret[0]);
        ArrayList<String> params = new ArrayList<>();
        for (int i = 0; i < formBody.size(); i++) {
            params.add(formBody.name(i) + "=" + formBody.value(i));
        }
        StringBuilder extraBuilder = new StringBuilder();
//        addCommonParam(extraBuilder);
        for (String s : extraBuilder.toString().split("&")) {
            params.add(s);
        }
        Collections.sort(params);
        for (int i = 0; i < params.size(); i++) {
            stringBuilder.append(params.get(i)).append("&");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        stringBuilder.append(Utils.md5Encode(""));
//        ret[1] = Utils.md5Encode(stringBuilder.toString());
        return ret;
    }
}
