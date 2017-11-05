package frakony.cryptocurency.Model;

/**
 * Created by tonyk on 10/26/2017.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    public Data(String id) {
        this.id = id;
    }

    @SerializedName("Id")
    private String id;

    @SerializedName("Url")
    private String url;

    @SerializedName("ImageUrl")
    private String imageUrl;

    @SerializedName("Name")
    private String name;

    @SerializedName("Symbol")
    private String symbol;

    @SerializedName("CoinName")
    private String coinName;

    @SerializedName("FullName")
    private String fullName;

    @SerializedName("Algorithm")
    private String algorithm;

    @SerializedName("ProofType")
    private String proofType;

    @SerializedName("FullyPremined")
    private String fullyPremined;

    @SerializedName("TotalCoinSupply")
    private String totalCoinSupply;

    @SerializedName("PreMinedValue")
    private String preMinedValue;

    @SerializedName("TotalCoinsFreeFloat")
    private String totalCoinsFreeFloat;

    @SerializedName("SortOrder")
    private String sortOrder;

    @SerializedName("Sponsored")
    private Boolean sponsored;

    public Data(String id, String url, String imageUrl, String name, String symbol, String coinName, String fullName, String algorithm, String proofType, String fullyPremined, String totalCoinSupply, String preMinedValue, String totalCoinsFreeFloat, String sortOrder, Boolean sponsored) {
        this.id = id;
        this.url = url;
        this.imageUrl = imageUrl;
        this.name = name;
        this.symbol = symbol;
        this.coinName = coinName;
        this.fullName = fullName;
        this.algorithm = algorithm;
        this.proofType = proofType;
        this.fullyPremined = fullyPremined;
        this.totalCoinSupply = totalCoinSupply;
        this.preMinedValue = preMinedValue;
        this.totalCoinsFreeFloat = totalCoinsFreeFloat;
        this.sortOrder = sortOrder;
        this.sponsored = sponsored;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public String getFullyPremined() {
        return fullyPremined;
    }

    public void setFullyPremined(String fullyPremined) {
        this.fullyPremined = fullyPremined;
    }

    public String getTotalCoinSupply() {
        return totalCoinSupply;
    }

    public void setTotalCoinSupply(String totalCoinSupply) {
        this.totalCoinSupply = totalCoinSupply;
    }

    public String getPreMinedValue() {
        return preMinedValue;
    }

    public void setPreMinedValue(String preMinedValue) {
        this.preMinedValue = preMinedValue;
    }

    public String getTotalCoinsFreeFloat() {
        return totalCoinsFreeFloat;
    }

    public void setTotalCoinsFreeFloat(String totalCoinsFreeFloat) {
        this.totalCoinsFreeFloat = totalCoinsFreeFloat;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

}