package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InicioControlador {

	 @RequestMapping(path="/inicio", method = RequestMethod.GET)
	    public String Inicio(){
	        return "inicio";
	    }
}
