package com.example.springlazyaspectjissue;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class TransactionalComponent {

    @Transactional
    public boolean runTx() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }
}
