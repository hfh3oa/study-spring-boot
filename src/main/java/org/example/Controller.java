package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        DataEntity dataEntity = new DataEntity();
        dataEntity.setId("0001");

        return "\n" + dataEntity.getId();
    }
}
