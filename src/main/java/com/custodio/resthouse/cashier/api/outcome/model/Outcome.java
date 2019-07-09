package com.custodio.resthouse.cashier.api.outcome.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Representation of a outcome created whether a outcome is generated.
 *
 * @author williamcustodio
 */
@Data
public class Outcome {

    private String id;

    private Long value;

    private LocalDateTime creationTime;
}