package com.example.webviewtest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaInterface {
    private Context mContext;
    JavaInterface(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public String showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();

        return "哈哈哈";
    }
}
