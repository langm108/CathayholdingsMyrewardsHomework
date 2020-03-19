package tw.com.thinkpower.demo2.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public ImageController() {
		// TODO Auto-generated constructor stub
	}
	

    @Autowired
    private ServletContext servletContext;


	@GetMapping(value = "/image", produces = MediaType.IMAGE_JPEG_VALUE)
	public void getImageAsByteArray(HttpServletResponse response) throws IOException {
		
		logger.info("==================================");
		logger.info("path:" + servletContext.getResourcePaths("/resources/images/TMviDaA7Lt.jpeg"));
		logger.info("path:" + servletContext.getRealPath("/images"));
		logger.info("path:" + servletContext.getContextPath());
	    InputStream in = servletContext.getResourceAsStream("/images/TMviDaA7Lt.jpeg");
	    
	    logger.info("in =>" + in.available());
	    response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	    IOUtils.copy(in, response.getOutputStream());
	}

	
}
