package com.dev;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.xml.XmlMapper;

@Service
public class ServiceHelper {

	@SuppressWarnings("unchecked")
	public static String convertjsonToXMl(String json){
		ObjectMapper jsonMapper = new ObjectMapper();

	    List<Employe> employees;
	    String employeeAsXml = null;
		try {
			employees = jsonMapper.readValue(json, List.class);
			XmlMapper xmlMapper = new XmlMapper();

		    employeeAsXml = xmlMapper.writeValueAsString(employees);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    //logger.info(browsersAsXml);
		return employeeAsXml;
		
	}
		
	}