package com.test.SpringJdbcTask;

import java.util.List;

public interface CustomerDao {
       void save(Customer customer);
       List<Customer> FindAll();
       List<Customer> FetchData(int id);
       void update(Customer customer);
       void delete(int id);
}
