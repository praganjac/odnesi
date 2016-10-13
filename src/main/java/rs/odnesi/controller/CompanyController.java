package rs.odnesi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rs.odnesi.model.Company;
import rs.odnesi.services.CompanyService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Milan on 12/10/2016.
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @RequestMapping("/companyList")
    public
    @ResponseBody
    List<Company> getCompanyList(Model model) {
        List<Company> companyList = companyService.getCompanyList();
        model.addAttribute("companyList", companyList);
        return companyList;

    }

    @RequestMapping("/company/{companyId}")
    public String viewCompany(@PathVariable int companyId, Model model) {
        Company company = companyService.getCompanyById(companyId);
        model.addAttribute("company", company);
        return "company";
    }

    @RequestMapping("/company/addCompany")
    public String addCompany(Model model) {
        Company company = new Company();
        model.addAttribute("company", company);
        return "addCompany";
    }

    @RequestMapping(value = "/company/addCompany", method = RequestMethod.POST)
    public String addCompanyPost(@ModelAttribute("company") Company company, BindingResult result
            , HttpServletRequest request) {
        if (result.hasErrors()) {
            return "addCompany";
        }
        companyService.addCompany(company);
        return "redirect:company/companyList";
    }
}
