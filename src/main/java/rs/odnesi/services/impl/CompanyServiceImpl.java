package rs.odnesi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.odnesi.dao.CompanyDao;
import rs.odnesi.model.Company;
import rs.odnesi.services.CompanyService;

import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyDao companyDao;

    @Override
    public List<Company> getCompanyList() {
        return companyDao.getCompanyList();
    }

    @Override
    public Company getCompanyById(int id) {
        return companyDao.getCompanyById(id);
    }

    @Override
    public void addCompany(Company company) {
        companyDao.addCompany(company);

    }

    @Override
    public void editCompany(Company company) {
        companyDao.editCompany(company);

    }

    @Override
    public void deleteCompany(Company company) {
        companyDao.deleteCompany(company);

    }
}
