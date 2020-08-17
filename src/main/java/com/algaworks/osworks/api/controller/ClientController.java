package com.algaworks.osworks.api.controller;

import com.algaworks.osworks.domain.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public List<Client> list() {
        var c1 = new Client();
        c1.setId(1L);
        c1.setName("Davi Silva");
        c1.setEmail("davi@gmail.com");
        c1.setPhone("88 98888 7777");

        var c2 = new Client();
        c2.setId(1L);
        c2.setName("Sarah Emilly");
        c2.setEmail("sarah@gmail.com");
        c2.setPhone("88 98888 7777");

        return Arrays.asList(c1,c2);
    }

}
