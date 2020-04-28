package com.uca.capas.formulario.formulario_estudiante.controller;

import java.util.Calendar;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MainController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hora",Calendar.getInstance().getTime().toString());
		mav.setViewName("commons/index");
		return mav;
	}
	
	
	@RequestMapping("/ingresar")
	public ModelAndView formulario(@RequestParam String nombre, @RequestParam String apellido,
			@RequestParam String fecha,
			@RequestParam String lugar,
			@RequestParam String colegio,
			@RequestParam String telFijo,
			@RequestParam String telMovil) {
		
		ModelAndView mav = new ModelAndView();
		/*
		mav.addObject("nombre", nombre);
		mav.addObject("apellido", apellido);
		mav.addObject("fecha", fecha);
		mav.addObject("lugar", lugar);
		mav.addObject("colegio", colegio);
		mav.addObject("telFijo", telFijo);
		mav.addObject("telMovil", telMovil);
		*/
		
		if(nombre.length() > 1 && nombre.length()<=25 
		  && apellido.length() > 1 && apellido.length()<=25
		  && lugar.length() > 1 && lugar.length()<=25
		  && colegio.length() > 1 && colegio.length()<=25
		  && telFijo.length() > 1 && telFijo.length()==8
		  && telMovil.length() >1 && telMovil.length()==8) {
			mav.setViewName("commons/exito");
			return mav;
		}else {
			mav.setViewName("commons/fallo");
			return mav;
		}		
		
	}
	
}
