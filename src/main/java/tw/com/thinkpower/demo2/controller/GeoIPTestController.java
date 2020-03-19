package tw.com.thinkpower.demo2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tw.com.thinkpower.demo2.model.GeoIP;
import tw.com.thinkpower.demo2.service.RawDBDemoGeoIPLocationService;
import tw.com.thinkpower.demo2.service.imp.RawDBDemoGeoIPLocationServiceImp;

@RestController
public class GeoIPTestController {


	// Download GeoIP2 and GeoIP Legacy Databases
	// https://www.maxmind.com/en/accounts/217291/geoip/downloads
	
//	@Autowired
//	private RawDBDemoGeoIPLocationService locationService;

//    public GeoIPTestController() throws IOException {
//        locationService = new RawDBDemoGeoIPLocationServiceImp();
//    }
    
    
//    @GetMapping("/GeoIPTest/{ipAddress}")
//    public GeoIP getLocation(@PathVariable String ipAddress) throws Exception{
//    	return locationService.getLocation(ipAddress);
//    }
//    
}
