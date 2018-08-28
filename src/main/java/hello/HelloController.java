package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/") // TODO Usar @GetMapping.
    public String index() {
        return "Treinamento Technocorp!";
    }

}

// TODO as classes de controle devem estar no módulo Contract.

/* @RestController é a anotação que indica onde mapeamos os CRUDs da aplicação.
   @RequestMapping define a URL que quando for requisitada chamará o método. */