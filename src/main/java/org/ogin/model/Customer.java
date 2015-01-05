package org.ogin.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class Customer implements Serializable {
    private BigDecimal id;
    private String name;
    private String status;
    private String webSite;

    public Customer() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
