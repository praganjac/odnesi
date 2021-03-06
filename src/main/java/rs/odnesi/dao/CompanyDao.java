package rs.odnesi.dao;

import rs.odnesi.model.Company;

import java.util.List;

/**
 * Created by Milan on 26/09/2016.
 */
public interface CompanyDao {
    List<Company> getCompanyList();
    Company getCompanyById(int id);
    void addCompany(Company company);
    void editCompany(Company company);
    void deleteCompany(Company company);
}
