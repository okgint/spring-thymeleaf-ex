package org.ogin.dao;

import org.ogin.model.Customers;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Types;
import java.util.List;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class CustomersDaoImpl implements CustomersDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Customers> getAllCustomers() {
        String SQL = "SELECT * FROM CUSTOMERS";
        return jdbcTemplate.query(SQL, new CustomersRowMapper());
    }

    @Override
    public void addCustomer(Customers customers) {
        String SQL = "INSERT INTO CUSTOMERS(CUST_ID, CUST_FIRST_NAME" + "CUST_LAST_NAME" +
                "CUST_GENDER" +
                "CUST_YEAR_OF_BIRTH" +
                "CUST_MARITAL_STATUS" +
                "CUST_STREET_ADDRESS" +
                "CUST_POSTAL_CODE" +
                "CUST_CITY" +
                "CUST_CITY_ID" +
                "CUST_STATE_PROVINCE"  +
                "CUST_STATE_PROVINCE_ID" +
                 "COUNTRY_ID" +
                "CUST_MAIN_PHONE_NUMBER" +
                "CUST_INCOME_LEVEL" +
                "CUST_CREDIT_LIMIT" +
                "CUST_EMAIL" +
                "CUST_TOTAL" +
                "CUST_TOTAL_ID" +
                "CUST_SRC_ID" +
                "CUST_EFF_FROM" +
                "CUST_EFF_TO" +
                "CUST_VALID" +") " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        Object params[] = new Object[] {
                "name_of_sequence.nextval",
                customers.getFirstName(), customers.getLastName(), customers.getGender(), customers.getYearOfBirth(), customers.getMaritalStatus(), customers.getStreetAddress(),
                customers.getPostalCode(), customers.getCity(), customers.getCityId(), customers.getStateProvince(), customers.getStateProvinceId(),
                customers.getCountryId(), customers.getMainPhoneNumber(), customers.getIncomeLevel(), customers.getCreditLimit(),
                customers.getEmail(), customers.getTotal(), customers.getTotalId(), customers.getSrcId(), customers.getEffFrom(), customers.getEffTo(), customers.getValid()
        };

        int[] types = new int[]{ Types.NUMERIC,
                Types.VARCHAR, Types.VARCHAR, Types.CHAR, Types.NUMERIC, Types.VARCHAR,Types.VARCHAR,
                Types.VARCHAR, Types.VARCHAR, Types.NUMERIC, Types.VARCHAR, Types.NUMERIC,
                Types.NUMERIC, Types.VARCHAR, Types.VARCHAR, Types.NUMERIC,
                Types.VARCHAR, Types.VARCHAR, Types.NUMERIC, Types.NUMERIC, Types.DATE, Types.DATE, Types.VARCHAR
        };
        jdbcTemplate.update(SQL, params, types);
    }
}

