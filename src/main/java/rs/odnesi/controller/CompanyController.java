package rs.odnesi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rs.odnesi.model.Company;
import rs.odnesi.services.CompanyService;

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
    public @ResponseBody List<Company> getCompanyList(Model model){
        List<Company> companyList=companyService.getCompanyList();
        model.addAttribute("companyList",companyList);
        return companyList;

    }


}
