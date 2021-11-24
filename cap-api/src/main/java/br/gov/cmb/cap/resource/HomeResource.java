package br.gov.cmb.cap.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@RequestMapping("/")
	public String index() {		
		return "<html><h1>cap-api-v2.0.0</h1></html>";
	}

}
