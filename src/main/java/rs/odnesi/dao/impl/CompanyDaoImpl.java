package rs.odnesi.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import rs.odnesi.dao.CompanyDao;
import rs.odnesi.model.Company;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Company> getCompanyList() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Company");
        List<Company> companyList=query.list();
        session.flush();
        return companyList;
    }

    @Override
    public Company getCompanyById(int id) {
        Session session=sessionFactory.getCurrentSession();
        Company company=(Company)session.get(Company.class,id);
        session.flush();
        return company;

    }

    @Override
    public void addCompany(Company company) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(company);
        session.flush();


    }

    @Override
    public void editCompany(Company company) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(company);
        session.flush();
    }

    @Override
    public void deleteCompany(Company company) {
        Session session=sessionFactory.getCurrentSession();
        session.delete(company);
        session.flush();
    }
}
