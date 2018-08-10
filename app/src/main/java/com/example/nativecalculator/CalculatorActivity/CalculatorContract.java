package com.example.nativecalculator.CalculatorActivity;

public interface CalculatorContract {

    interface View {

        void updateSolution(int solution);
    }

    interface UserActionsListener {

        void add(int opr1, int opr2);

        void subtract(int opr1, int opr2);
    }
}
