package com.uca.capas.formulario.formulario_estudiante.controller;

import java.util.ArrayList;
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
		mav.add("nombre", nombre);
		mav.add("apellido", apellido);
		mav.add("lugar", lugar);
		mav.add("colegio", colegio);
		mav.add("telFijo", telFijo);
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
			ArrayList<String> e = new ArrayList<>();
			String TAG="Error al ingresar datos en :";
			if(nombre.length()<1 || nombre.length()>25) {
				e.add(TAG +"nombre");
			}
			if(apellido.length()<1 || apellido.length()>25) {
				e.add(TAG +"apellido");
			}
			if(lugar.length()<1 || lugar.length()>25) {
				e.add(TAG +"lugar");
			}
			if(colegio.length()<1 || colegio.length()>25) {
				e.add(TAG +"colegio");
			}
			if(telFijo.length()!=8) {
				e.add(TAG +"telefono Fijo. Deben ser exactamente 8 digitos");
			}
			if(telMovil.length()!=8) {
				e.add(TAG +"telefono Movil. Deben ser exactamente 8 digitos");
			}
			
			mav.addObject("errores", e);
			mav.setViewName("commons/fallo");
			return mav;
		}		
		
	}
	
}
