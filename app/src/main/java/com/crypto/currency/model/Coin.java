package com.crypto.currency.model;

import java.net.URL;

/**
 * Created by francis on 27/10/2017.
 */

public class Coin {
    public String Id,Name, CoinName, FullName, Algorithm, ProofType, PreMinedValue, TotalCoinsFreeFloat;
    public URL Url, ImageUrl;
    public int SortOrder, Symbol, FullyPremined, TotalCoinSupply;

    public Coin(String id, String name, String coinName, String fullName, String algorithm, String prooftype, URL url, URL imageUrl, int sortOrder) {
        this.Id = id;
        this.Name = name;
        this.CoinName = coinName;
        this.FullName = fullName;
        this.Algorithm = algorithm;
        this.ProofType = prooftype;
        this.Url = url;
        this.ImageUrl = imageUrl;
        this.SortOrder = sortOrder;
    }
}
