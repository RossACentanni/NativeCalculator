package com.example.nativecalculator.CalculatorActivity;

class Calculator {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("add-lib");
    }

    public static native int CAdd(Calculator obj);

    private int operand1 = 0;
    private int operand2 = 0;

    public void setOpr1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOpr2(int operand2) {
        this.operand2 = operand2;
    }

    public int add(){
        return CAdd(this);
    }



}
