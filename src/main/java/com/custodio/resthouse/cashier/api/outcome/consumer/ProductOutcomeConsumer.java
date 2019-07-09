package com.custodio.resthouse.cashier.api.outcome.consumer;

import com.custodio.resthouse.cashier.api.common.annotation.Consumer;
import com.custodio.resthouse.cashier.api.outcome.model.Outcome;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.transaction.annotation.Transactional;

/**
 * Consumer responsible for handling events associated to a bought of a product.
 *
 * @author i505483
 */
@Slf4j
@Consumer
public class ProductOutcomeConsumer {

    @Transactional
    @JmsListener(destination = "outcome.product")
    public void receive(final Outcome outcome) {
        log.info("Creating outcome. [OUTCOME={}].", outcome);
    }
}