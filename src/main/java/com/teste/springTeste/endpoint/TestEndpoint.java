package com.teste.springTeste.endpoint;

import com.teste.springTeste.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("test")
public class TestEndpoint {

    Logger logger = LoggerFactory.getLogger(TestEndpoint.class);

    @RequestMapping(method = RequestMethod.GET, path = "/listAlfabeto")
    public List<String> listAlfabeto(){
        String a[] = new String[] {"A", "B", "C", "D", "E"};
        return asList(a);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/listAll")
    public List<Student> listAll() {
        return asList(new Student("deku"), new Student("Caio"), new Student("Joao"));
    }
    @RequestMapping(method = RequestMethod.GET, path = "/log")
    public void logInfo() {
        logger.info("Ola log");
    }
}
