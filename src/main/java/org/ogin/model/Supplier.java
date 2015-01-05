package org.ogin.model;

import java.math.BigDecimal;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class Supplier {
    private BigDecimal id;
    private String name;
    private String webSite;

    public Supplier() {
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

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
