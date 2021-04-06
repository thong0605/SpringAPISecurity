package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/invoice")
public class InvoiceRestController {
	
	@RequestMapping(value="demo1",method= RequestMethod.GET,produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> demo1(){
		try {
			return new ResponseEntity<String>("Demo1",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="demo2",method= RequestMethod.GET,produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> demo2(){
		try {
			return new ResponseEntity<String>("Demo2",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="demo3",method= RequestMethod.GET,produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> demo3(){
		try {
			return new ResponseEntity<String>("Demo3",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="demo4",method= RequestMethod.GET,produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> demo4(){
		try {
			return new ResponseEntity<String>("Demo4",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
}
