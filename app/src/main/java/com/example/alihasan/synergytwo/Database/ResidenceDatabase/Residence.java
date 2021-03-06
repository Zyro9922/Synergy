package com.example.alihasan.synergytwo.Database.ResidenceDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "residence_table")
public class Residence {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "residence")
    private String RESIDENCE;

    private String CASENO;
    private String ADDRESS;
    private String EASELOCATE;
    private String AGE;
    private String LOCALITYTYPE;
    private String HOUSETYPE;
    private String HOUSECONDITION;
    private String OWNERSHIP;
    private String LIVINGSTANDARD;
    private String LANDMARK;
    private String STAYINGSINCE;
    private String APPLSTAYATADDRESS;
    private String PERSONCONTACTED;
    private String RELATIONSHIP;
    private String ACCOMODATIONTYPE;
    private String EXTERIOR;
    private String NOOFFAMILY;
    private String WORKING;
    private String DEPENDENTADULTS;
    private String DEPENDENTCHILDREN;
    private String RETIREDMEMBER;
    private String SPOUSEEARNING;
    private String SPOUSEDETAILS;
    private String MARITALSTATUS;
    private String EDUQUAL;
    private String NEIGHBOURNAME1;
    private String ADDRESS1;
    private String NEIGHBOURNAME2;
    private String ADDRESS2;
    private String NEIGHBOURFEEDBACK;
    private String PROOFDETAILS;
    private String VEHICLESEEN;
    private String POLITICALLINK;
    private String OVERALLSTATUS;
    private String REASONNEGATIVEFI;
    private String LATITUDE;
    private String LONGITUDE;
    private String REMARKS;

    public Residence(@NonNull String RESIDENCE, String CASENO, String ADDRESS, String EASELOCATE, String AGE, String LOCALITYTYPE, String HOUSETYPE, String HOUSECONDITION, String OWNERSHIP, String LIVINGSTANDARD, String LANDMARK, String STAYINGSINCE, String APPLSTAYATADDRESS, String PERSONCONTACTED, String RELATIONSHIP, String ACCOMODATIONTYPE, String EXTERIOR, String NOOFFAMILY, String WORKING, String DEPENDENTADULTS, String DEPENDENTCHILDREN, String RETIREDMEMBER, String SPOUSEEARNING, String SPOUSEDETAILS, String MARITALSTATUS, String EDUQUAL, String NEIGHBOURNAME1, String ADDRESS1, String NEIGHBOURNAME2, String ADDRESS2, String NEIGHBOURFEEDBACK, String PROOFDETAILS, String VEHICLESEEN, String POLITICALLINK, String OVERALLSTATUS, String REASONNEGATIVEFI, String LATITUDE, String LONGITUDE, String REMARKS) {
        this.RESIDENCE = RESIDENCE;
        this.CASENO = CASENO;
        this.ADDRESS = ADDRESS;
        this.EASELOCATE = EASELOCATE;
        this.AGE = AGE;
        this.LOCALITYTYPE = LOCALITYTYPE;
        this.HOUSETYPE = HOUSETYPE;
        this.HOUSECONDITION = HOUSECONDITION;
        this.OWNERSHIP = OWNERSHIP;
        this.LIVINGSTANDARD = LIVINGSTANDARD;
        this.LANDMARK = LANDMARK;
        this.STAYINGSINCE = STAYINGSINCE;
        this.APPLSTAYATADDRESS = APPLSTAYATADDRESS;
        this.PERSONCONTACTED = PERSONCONTACTED;
        this.RELATIONSHIP = RELATIONSHIP;
        this.ACCOMODATIONTYPE = ACCOMODATIONTYPE;
        this.EXTERIOR = EXTERIOR;
        this.NOOFFAMILY = NOOFFAMILY;
        this.WORKING = WORKING;
        this.DEPENDENTADULTS = DEPENDENTADULTS;
        this.DEPENDENTCHILDREN = DEPENDENTCHILDREN;
        this.RETIREDMEMBER = RETIREDMEMBER;
        this.SPOUSEEARNING = SPOUSEEARNING;
        this.SPOUSEDETAILS = SPOUSEDETAILS;
        this.MARITALSTATUS = MARITALSTATUS;
        this.EDUQUAL = EDUQUAL;
        this.NEIGHBOURNAME1 = NEIGHBOURNAME1;
        this.ADDRESS1 = ADDRESS1;
        this.NEIGHBOURNAME2 = NEIGHBOURNAME2;
        this.ADDRESS2 = ADDRESS2;
        this.NEIGHBOURFEEDBACK = NEIGHBOURFEEDBACK;
        this.PROOFDETAILS = PROOFDETAILS;
        this.VEHICLESEEN = VEHICLESEEN;
        this.POLITICALLINK = POLITICALLINK;
        this.OVERALLSTATUS = OVERALLSTATUS;
        this.REASONNEGATIVEFI = REASONNEGATIVEFI;
        this.LATITUDE = LATITUDE;
        this.LONGITUDE = LONGITUDE;
        this.REMARKS = REMARKS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getRESIDENCE() {
        return RESIDENCE;
    }

    public String getCASENO() {
        return CASENO;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getEASELOCATE() {
        return EASELOCATE;
    }

    public String getAGE() {
        return AGE;
    }

    public String getLOCALITYTYPE() {
        return LOCALITYTYPE;
    }

    public String getHOUSETYPE() {
        return HOUSETYPE;
    }

    public String getHOUSECONDITION() {
        return HOUSECONDITION;
    }

    public String getOWNERSHIP() {
        return OWNERSHIP;
    }

    public String getLIVINGSTANDARD() {
        return LIVINGSTANDARD;
    }

    public String getLANDMARK() {
        return LANDMARK;
    }

    public String getSTAYINGSINCE() {
        return STAYINGSINCE;
    }

    public String getAPPLSTAYATADDRESS() {
        return APPLSTAYATADDRESS;
    }

    public String getPERSONCONTACTED() {
        return PERSONCONTACTED;
    }

    public String getRELATIONSHIP() {
        return RELATIONSHIP;
    }

    public String getACCOMODATIONTYPE() {
        return ACCOMODATIONTYPE;
    }

    public String getEXTERIOR() {
        return EXTERIOR;
    }

    public String getNOOFFAMILY() {
        return NOOFFAMILY;
    }

    public String getWORKING() {
        return WORKING;
    }

    public String getDEPENDENTADULTS() {
        return DEPENDENTADULTS;
    }

    public String getDEPENDENTCHILDREN() {
        return DEPENDENTCHILDREN;
    }

    public String getRETIREDMEMBER() {
        return RETIREDMEMBER;
    }

    public String getSPOUSEEARNING() {
        return SPOUSEEARNING;
    }

    public String getSPOUSEDETAILS() {
        return SPOUSEDETAILS;
    }

    public String getMARITALSTATUS() {
        return MARITALSTATUS;
    }

    public String getEDUQUAL() {
        return EDUQUAL;
    }

    public String getNEIGHBOURNAME1() {
        return NEIGHBOURNAME1;
    }

    public String getADDRESS1() {
        return ADDRESS1;
    }

    public String getNEIGHBOURNAME2() {
        return NEIGHBOURNAME2;
    }

    public String getADDRESS2() {
        return ADDRESS2;
    }

    public String getNEIGHBOURFEEDBACK() {
        return NEIGHBOURFEEDBACK;
    }

    public String getPROOFDETAILS() {
        return PROOFDETAILS;
    }

    public String getVEHICLESEEN() {
        return VEHICLESEEN;
    }

    public String getPOLITICALLINK() {
        return POLITICALLINK;
    }

    public String getOVERALLSTATUS() {
        return OVERALLSTATUS;
    }

    public String getREASONNEGATIVEFI() {
        return REASONNEGATIVEFI;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public String getREMARKS() {
        return REMARKS;
    }
}
