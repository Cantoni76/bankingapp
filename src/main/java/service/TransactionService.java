package service;

import model.Transaction;

public class TransactionService {
    public void sendMoney(Transaction transaction) {

        if(!validateSenderBalance(transaction)){
            return;
        }
        if(!validateReceiverNumber(transaction)){
            return;
        }
        if(!validateCurrency(transaction)){
            return;
        }

    }

    private boolean validateSenderBalance(Transaction transaction) {
        return true;
    }

    private boolean validateReceiverNumber(Transaction transaction) {
        return true;
    }
    private boolean validateCurrency(Transaction  transaction) {
        return true;
    }

}
