package com.shpyrna.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Юра on 14.07.2017.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Ticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tickerId;
    private int id;
    private double last;
    private double lowestAsk;
    private double highestBid;
    private double percentChange;
    private double baseVolume;
    private double quoteVolume;
    private boolean isFrozen;
    private double high24hr;
    private double low24hr;

}
