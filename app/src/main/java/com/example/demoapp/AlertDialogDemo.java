package com.example.demoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AlertDialogDemo extends AppCompatActivity {
    AlertDialog.Builder ad_builder;
    Button btn_confirm;
    private ArrayList<ModelAlert> modelAlerts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_demo);

        ad_builder = new AlertDialog.Builder(AlertDialogDemo.this);
        btn_confirm = findViewById(R.id.bt_check);
        for (int i = 0; i < 10; i++) {
            modelAlerts.add(new ModelAlert(i + "", i % 3 == 0));
        }
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ad_builder.setTitle("Title");
//                ad_builder.setMessage("Do you want to confirm");
                ad_builder.setCancelable(true);

                String[] s = new String[modelAlerts.size()];
                boolean[] b = new boolean[modelAlerts.size()];
                for (int i = 0; i < modelAlerts.size(); i++) {
                    s[i] = modelAlerts.get(i).getDisplayVal();
                    b[i] = modelAlerts.get(i).isChecked();
                }
                /*ad_builder.setSingleChoiceItems(s, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });*/
                ad_builder.setMultiChoiceItems(s,b, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                    }
                });
               /* ad_builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogDemo.this,"You pressed Yes!",Toast.LENGTH_SHORT).show();
                    }
                });
                ad_builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogDemo.this,"You pressed No!",Toast.LENGTH_SHORT).show();
                        Snackbar.make(btn_confirm,"You pressed No!",Snackbar.LENGTH_SHORT).show();
                    }
                });*/

                AlertDialog alert = ad_builder.create();
                alert.show();
            }
        });

    }
}
