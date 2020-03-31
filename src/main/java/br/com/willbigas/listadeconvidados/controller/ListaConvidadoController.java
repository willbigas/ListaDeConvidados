package br.com.willbigas.listadeconvidados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListaConvidadoController {

    @RequestMapping(method = RequestMethod.GET, value = "/listaconvidados")
    public String index() {

        return "listaConvidados";
    }

}
