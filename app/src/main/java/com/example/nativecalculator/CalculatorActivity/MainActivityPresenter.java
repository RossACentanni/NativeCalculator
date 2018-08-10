package com.example.nativecalculator.CalculatorActivity;

import android.support.annotation.NonNull;

public class MainActivityPresenter implements CalculatorContract.UserActionsListener{

    private final Calculator calc;

    private final CalculatorContract.View mainActivityView;

    public MainActivityPresenter(@NonNull Calculator calc, @NonNull CalculatorContract.View mainActivityView){
        this.calc = calc;
        this.mainActivityView = mainActivityView;
    }

    @Override
    public void add(int opr1, int opr2) {
        calc.setOpr1(opr1);
        calc.setOpr2(opr2);
        int solution = calc.add();
        mainActivityView.updateSolution(solution);
    }

    @Override
    public void subtract(int opr1, int opr2) {
        calc.setOpr1(opr1);
        calc.setOpr2(opr2 * -1);
        int solution = calc.add();
        mainActivityView.updateSolution(solution);
    }
}
