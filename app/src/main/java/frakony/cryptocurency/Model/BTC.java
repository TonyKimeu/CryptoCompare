package frakony.cryptocurency.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTC {

    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("EUR")
    @Expose
    private Double eUR;
    @SerializedName("NGN")
    @Expose
    private Double nGN;
    @SerializedName("KES")
    @Expose
    private Double kES;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("EGP")
    @Expose
    private Double eGP;
    @SerializedName("ILS")
    @Expose
    private Double iLS;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("ZAR")
    @Expose
    private Double zAR;
    @SerializedName("ARS")
    @Expose
    private Double aRS;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("SEK")
    @Expose
    private Double sEK;
    @SerializedName("SAR")
    @Expose
    private Double sAR;
    @SerializedName("QAR")
    @Expose
    private Double qAR;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BTC() {
    }

    /**
     * 
     * @param uSD
     * @param aUD
     * @param cHF
     * @param eUR
     * @param iNR
     * @param rUB
     * @param sAR
     * @param kES
     * @param zAR
     * @param iLS
     * @param cNY
     * @param sEK
     * @param gBP
     * @param nGN
     * @param jPY
     * @param cAD
     * @param hKD
     * @param qAR
     * @param aRS
     * @param bRL
     * @param eGP
     */
    public BTC(Double uSD, Double eUR, Double nGN, Double kES, Double gBP, Double jPY, Double cHF, Double cAD, Double aUD, Double hKD, Double iNR, Double cNY, Double eGP, Double iLS, Double rUB, Double zAR, Double aRS, Double bRL, Double sEK, Double sAR, Double qAR) {
        super();
        this.uSD = uSD;
        this.eUR = eUR;
        this.nGN = nGN;
        this.kES = kES;
        this.gBP = gBP;
        this.jPY = jPY;
        this.cHF = cHF;
        this.cAD = cAD;
        this.aUD = aUD;
        this.hKD = hKD;
        this.iNR = iNR;
        this.cNY = cNY;
        this.eGP = eGP;
        this.iLS = iLS;
        this.rUB = rUB;
        this.zAR = zAR;
        this.aRS = aRS;
        this.bRL = bRL;
        this.sEK = sEK;
        this.sAR = sAR;
        this.qAR = qAR;
    }

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getEUR() {
        return eUR;
    }

    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

    public Double getNGN() {
        return nGN;
    }

    public void setNGN(Double nGN) {
        this.nGN = nGN;
    }

    public Double getKES() {
        return kES;
    }

    public void setKES(Double kES) {
        this.kES = kES;
    }

    public Double getGBP() {
        return gBP;
    }

    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getEGP() {
        return eGP;
    }

    public void setEGP(Double eGP) {
        this.eGP = eGP;
    }

    public Double getILS() {
        return iLS;
    }

    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getZAR() {
        return zAR;
    }

    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    public Double getARS() {
        return aRS;
    }

    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    public Double getBRL() {
        return bRL;
    }

    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getSEK() {
        return sEK;
    }

    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getSAR() {
        return sAR;
    }

    public void setSAR(Double sAR) {
        this.sAR = sAR;
    }

    public Double getQAR() {
        return qAR;
    }

    public void setQAR(Double qAR) {
        this.qAR = qAR;
    }

}
