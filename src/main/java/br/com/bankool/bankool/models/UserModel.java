package br.com.bankool.bankool.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "user_model")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    private String USUEMAIL;
    public String getUSUEMAIL() {
        return USUEMAIL;
    }
    public void setUSUEMAIL(String uSUEMAIL) {
        USUEMAIL = uSUEMAIL;
    }
    private String USUPASSWORD;
    public String getUSUPASSWORD() {
        return USUPASSWORD;
    }
    public void setUSUPASSWORD(String uSUPASSWORD) {
        USUPASSWORD = uSUPASSWORD;
    }
    private String USUNAME;
    public String getUSUNAME() {
        return USUNAME;
    }
    public void setUSUNAME(String uSUNAME) {
        USUNAME = uSUNAME;
    }

  
}
