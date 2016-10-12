package rs.odnesi.services;

import rs.odnesi.model.Company;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
public interface CompanyService {
    List<Company> getCompanyList();
    Company getCompanyById(int id);
    void addCompany(Company company);
    void editCompany(Company company);
    void deleteCompany(Company company);
}
