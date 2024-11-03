package com.furkanarslan.controller.ımpl;

import com.furkanarslan.controller.IHomeController;
import com.furkanarslan.dto.DtoHome;
import com.furkanarslan.services.impl.HomeServices;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home")
public class HomeController implements IHomeController {
  @Autowired
    HomeServices homeServices;


   @GetMapping(path = "/list/{id}")
    @Override
    public DtoHome findHomeById(long id) {
        return homeServices.findHomeByid(id);
    }
}
