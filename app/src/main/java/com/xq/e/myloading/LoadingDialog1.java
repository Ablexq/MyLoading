package com.xq.e.myloading;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;

public class LoadingDialog1 extends AlertDialog {

    public LoadingDialog1(@NonNull Context context) {
        super(context, R.style.custom_dialog_style);
        setCancelable(false);
        setCanceledOnTouchOutside(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.dialog_loading1);
    }
}