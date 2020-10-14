package org.aplas.basicappx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Distance dist = new Distance();
    private Temperature temp = new Temperature();
    private Weight weight = new Weight();
    private Button convertBtn;
    private EditText inputTxt, outputTxt;
    private Spinner unitOri, unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox, formBox;
    private ImageView imgView;
    private ImageView imgFormula;

    protected double convertUnit(String type, String oriUnit, String convUnit, double value){
        if (type.equals("Temperature")) {
            return temp.convert(oriUnit,convUnit,value);
        } else if (type.equals("Distance")) {
            return dist.convert(oriUnit,convUnit,value);
        }else {
            return weight.convert(oriUnit,convUnit,value);
        }
    }

    protected String strResult(double val, boolean rounded){
        DecimalFormat f = new DecimalFormat("#.##");
        DecimalFormat f2 = new DecimalFormat("#.#####");
        if(rounded==true){
            return f.format(val);
        }else {
            return f2.format(val);
        }
    }
}