package com.example.webviewtest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.example.webviewtest.util.GetRequestResult;

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

//    dev-my-cloud-music-api-rails.ixuea.com/v1/sheets
    @JavascriptInterface
    public String getMusics() {
        String url = "http://dev-my-cloud-music-api-rails.ixuea.com/v1/sheets";
        String result = GetRequestResult.result(url, null);
        System.out.println(result);


        return result;
    }

    @JavascriptInterface
    public String getVideos() {
        String url = "http://dev-my-cloud-music-api-rails.ixuea.com/v1/videos";
        String result = GetRequestResult.result(url, null);
        System.out.println(result);


        return result;
    }

    @JavascriptInterface
    public String getComments() {
        String url = "http://dev-my-cloud-music-api-rails.ixuea.com/v1/comments?page=1&size=10";
        String result = GetRequestResult.result(url, null);
        System.out.println(result);


        return result;
    }

}
