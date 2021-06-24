package com.example.webviewtest;

import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JSInterface {

    /**
     * 注意这里的@JavascriptInterface注解， target是4.2以上都需要添加这个注解，否则无法调用
     * @param text
     */
    @JavascriptInterface
    public String showToast(String text){
        return "111";
    }

}
