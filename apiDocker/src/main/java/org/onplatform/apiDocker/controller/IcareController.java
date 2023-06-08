package org.onplatform.apiDocker.controller;

import org.onplatform.apiDocker.model.IcareEntity;
import org.onplatform.apiDocker.service.IcareEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/icare")
//@CrossOrigin(maxAge = 3600)
//@CrossOrigin(origins="*", allowedHeaders="*")
public class IcareController {
        @Autowired
        private IcareEntityService icareService;

        @PostMapping("/add")
        // @CrossOrigin(origins = "*")
        // @RequestMapping(method = RequestMethod.POST, path = "/add")
        public String add(@RequestBody IcareEntity icareMember){
            icareService.insertIcareMember(icareMember);
            return "New icare member is added";
        }

        @GetMapping("/showAll")
        // @CrossOrigin(origins = "*")
        // @RequestMapping(method = RequestMethod.GET, path = "/showAll")
        public List<IcareEntity> list(){
            return icareService.getAllIcareMembers();
//            System.out.println("Get all icare members");
//            return List.of();
        }
}
