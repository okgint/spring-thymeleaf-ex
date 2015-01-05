package org.ogin.dao;

import org.ogin.model.Customers;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class CustomersExtrator implements ResultSetExtractor<Customers> {
    @Override
    public Customers extractData(ResultSet rs) throws SQLException, DataAccessException {
        Customers customers = new Customers();
        customers.setId(rs.getBigDecimal("CUST_ID"));
        customers.setFirstName(rs.getString("CUST_FIRST_NAME"));
        customers.setLastName(rs.getString("CUST_LAST_NAME"));
        customers.setGender(rs.getString("CUST_GENDER").charAt(0));
        customers.setYearOfBirth(rs.getBigDecimal("CUST_YEAR_OF_BIRTH"));
        customers.setMaritalStatus(rs.getString("CUST_MARITAL_STATUS"));
        customers.setStreetAddress(rs.getString("CUST_STREET_ADDRESS"));
        customers.setPostalCode(rs.getString("CUST_POSTAL_CODE"));
        customers.setCity(rs.getString("CUST_CITY"));
        customers.setCityId(rs.getBigDecimal("CUST_CITY_ID"));
        customers.setStateProvince(rs.getString("CUST_STATE_PROVINCE"));
        customers.setStateProvinceId(rs.getBigDecimal("CUST_STATE_PROVINCE_ID"));
        customers.setCountryId(rs.getBigDecimal("COUNTRY_ID"));
        customers.setMainPhoneNumber(rs.getString("CUST_MAIN_PHONE_NUMBER"));
        customers.setIncomeLevel(rs.getString("CUST_INCOME_LEVEL"));
        customers.setCreditLimit(rs.getBigDecimal("CUST_CREDIT_LIMIT"));
        customers.setEmail(rs.getString("CUST_EMAIL"));
        customers.setTotal(rs.getString("CUST_TOTAL"));
        customers.setTotalId(rs.getBigDecimal("CUST_TOTAL_ID"));
        customers.setSrcId(rs.getBigDecimal("CUST_SRC_ID"));
        customers.setEffFrom(rs.getDate("CUST_EFF_FROM"));
        customers.setEffTo(rs.getDate("CUST_EFF_TO"));
        customers.setValid(rs.getString("CUST_VALID"));

        return customers;
    }
}
