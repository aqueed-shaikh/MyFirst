package com.example.demoapp;

public class ModelAlert {
    private String displayVal;
    private boolean isChecked;

    public ModelAlert(String displayVal, boolean isChecked) {
        this.displayVal = displayVal;
        this.isChecked = isChecked;
    }

    public String getDisplayVal() {
        return displayVal;
    }

    public void setDisplayVal(String displayVal) {
        this.displayVal = displayVal;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
