package br.com.bankool.bankool.models;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "user_model")
public class UserModel implements UserDetails{
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
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }
    @Override
    public String getPassword() {
        return this.USUPASSWORD;
    }
    @Override
    public String getUsername() {
        return this.USUNAME;
    }
    @Override
    public boolean isAccountNonExpired() {
       return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }

  
}
