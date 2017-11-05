package com.crypto.currency.model;

/**
 * Created by tonyk on 10/30/2017.
 */

public class Price {


    public String TYPE;
    public String MARKET;
    public String FROMSYMBOL;
    public String TOSYMBOL;
    public String FLAGS;
    public Double PRICE;
    public Integer LASTUPDATE;
    public Double LASTVOLUME;
    public Double LASTVOLUMETO;
    public String LASTTRADEID;
    public Double VOLUMEDAY;
    public Double VOLUMEDAYTO;
    public Double VOLUME24HOUR;
    public Double VOLUME24HOURTO;
    public Double OPENDAY;
    public Double HIGHDAY;
    public Double LOWDAY;
    public Double OPEN24HOUR;
    public Double HIGH24HOUR;
    public Double LOW24HOUR;
    public String LASTMARKET;
    public Double CHANGE24HOUR;
    public Double CHANGEPCT24HOUR;
    public Double CHANGEDAY;
    public Double CHANGEPCTDAY;
    public Double SUPPLY;
    public Double MKTCAP;
    public String TOTALVOLUME24H;
    public Double TOTALVOLUME24HTO;

    public Price (String tYPE, String mARKET, String fROMSYMBOL, String tOSYMBOL, String fLAGS, Double pRICE, Integer lASTUPDATE, Double lASTVOLUME, Double lASTVOLUMETO, String lASTTRADEID, Double vOLUMEDAY, Double vOLUMEDAYTO, Double vOLUME24HOUR, Double vOLUME24HOURTO, Double oPENDAY, Double hIGHDAY, Double lOWDAY, Double oPEN24HOUR, Double hIGH24HOUR, Double lOW24HOUR, String lASTMARKET, Double cHANGE24HOUR, Double cHANGEPCT24HOUR, Double cHANGEDAY, Double cHANGEPCTDAY, Double sUPPLY, Double mKTCAP, String tOTALVOLUME24H, Double tOTALVOLUME24HTO) {
        super();
        this.TYPE = tYPE;
        this.MARKET = mARKET;
        this.FROMSYMBOL = fROMSYMBOL;
        this.TOSYMBOL = tOSYMBOL;
        this.FLAGS = fLAGS;
        this.PRICE = pRICE;
        this.LASTUPDATE = lASTUPDATE;
        this.LASTVOLUME = lASTVOLUME;
        this.LASTVOLUMETO = lASTVOLUMETO;
        this.LASTTRADEID = lASTTRADEID;
        this.VOLUMEDAY = vOLUMEDAY;
        this.VOLUMEDAYTO = vOLUMEDAYTO;
        this.VOLUME24HOUR = vOLUME24HOUR;
        this.VOLUME24HOURTO = vOLUME24HOURTO;
        this.OPENDAY = oPENDAY;
        this.HIGHDAY = hIGHDAY;
        this.LOWDAY = lOWDAY;
        this.OPEN24HOUR = oPEN24HOUR;
        this.HIGH24HOUR = hIGH24HOUR;
        this.LOW24HOUR = lOW24HOUR;
        this.LASTMARKET = lASTMARKET;
        this.CHANGE24HOUR = cHANGE24HOUR;
        this.CHANGEPCT24HOUR = cHANGEPCT24HOUR;
        this.CHANGEDAY = cHANGEDAY;
        this.CHANGEPCTDAY = cHANGEPCTDAY;
        this.SUPPLY = sUPPLY;
        this.MKTCAP = mKTCAP;
        this.TOTALVOLUME24H = tOTALVOLUME24H;
        this.TOTALVOLUME24HTO = tOTALVOLUME24HTO;
    }

}
