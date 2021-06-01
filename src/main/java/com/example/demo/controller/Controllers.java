package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.ResponseBuilder;
//import javax.ws.rs.core.StreamingOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TableTopic;
import com.example.demo.service.Services;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import dto.InputDataDto;

@RestController  
public class Controllers {   

	    
	    @Autowired
	    Services service;
	    
	   
	    @GetMapping("/*")
	    public String createUser()
	    { 
	    	return "<h1>Welcome</h1>";
	    }
	    
	    //**************************CART SESSION ENTRY************************************
//	    @PostMapping("/getpdffortopic")
//	    @Produces(MediaType.APPLICATION_PDF_VALUE)
//	    public ResponseEntity<InputStreamResource> getPdfForTopic(@RequestBody InputDataDto inputDataDto)
//	    {
//	    	Document document = new Document();
//	    	TableTopic tableTopic = service.getPdfForTopic(inputDataDto);
//	    	if(tableTopic != null)
//	    	{
//		    	 PdfWriter writer = null;
//		    	 ByteArrayOutputStream out = new ByteArrayOutputStream();
//		    	
//		    	try
//		        {
//		    	   writer = PdfWriter.getInstance(document, out);
//		           document.open();
//		           Paragraph paragraph = new Paragraph();
//		           paragraph.add(tableTopic.getTableTopicData());
//		           document.add(paragraph);
//		           document.close();
//		           writer.close();
//		    		
//		        } catch (DocumentException e)
//		        {
//		           e.printStackTrace();
//		        }
//		    	
//		    	ByteArrayInputStream  bis = new ByteArrayInputStream(out.toByteArray());
//		    	
//		    	
//		    	HttpHeaders headers = new HttpHeaders();
//		        headers.add("Content-Disposition", "inline; filename=assignment.pdf");
//	
//		        return ResponseEntity
//		                .ok()
//		                .headers(headers)
//		                .contentType(MediaType.APPLICATION_PDF)
//		                .body(new InputStreamResource(bis));
//		    }
//	    	
//	    	return null;
//	    }
	    
}
