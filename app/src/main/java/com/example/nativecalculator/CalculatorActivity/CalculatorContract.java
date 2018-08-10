package com.example.nativecalculator.CalculatorActivity;

public interface CalculatorContract {

    interface View {

        void updateSolution(int solution);
    }

    interface UserActionsListener {

        int add();

        int subtract();
    }
}
