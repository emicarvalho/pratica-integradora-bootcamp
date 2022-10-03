package com.emily.Spring.II.exemploConteudo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exemplo01 {
    // multiplos parametros
    @GetMapping(path =  "{name}/{lastname}/{age}")
    public  String sayHello (@PathVariable String name, //pathvariable permite extrair infos que fazem parte da URL
                             @PathVariable String lastname,
                             @PathVariable Integer age) {
        return ("Olá, " + name + " " + lastname + ". Sua idade é: " + age);
    }
//    @GetMapping("/user/{userId}")
//    public User getUser(@PathVariable("userId") String userId) {
//     Codigo ...
//        return new User(userId);
//    }

//    @GetMapping(path = "/student/")
//    public Student findStudent (@RequestParam String name,//receber parametros pela rota, são divididos por ? e &
//                                @RequestParam String lastname) {
//        return findStudent(name, lastname);
//    }
}
