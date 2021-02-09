package com.example.springlazyaspectjissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("default")
class NonLazyTest {

    @Autowired
    private TransactionalComponent transactionalComponent;

    @Test
    void getTransactionStatus() {
        boolean txStatus = transactionalComponent.runTx();
        assertTrue(txStatus);
    }
}
