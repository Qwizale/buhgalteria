package com.company;

public class Transaction {
    private int numberAccountDebit;
    private int numberAccountCredit;
    private int sum;
    private String comment;
    Transaction(int numberAccountDebit, int numberAccountCredit, int sum, String comment) {
        this.numberAccountDebit = numberAccountDebit;
        this.numberAccountCredit = numberAccountCredit;
        this.sum = sum;
        this.comment = comment;
    }
    @Override
    public String  toString() {
        String strNumberAccountDebit = Integer.toString(numberAccountDebit);
        String strNumberAccountCredit = Integer.toString(numberAccountCredit);
        String strSum = Integer.toString(sum);
        return  "Дебет: " + strNumberAccountDebit + " Кредит: " + strNumberAccountCredit + " Сумма: " + strSum + " Комментарий:  " + comment;
    }

}
