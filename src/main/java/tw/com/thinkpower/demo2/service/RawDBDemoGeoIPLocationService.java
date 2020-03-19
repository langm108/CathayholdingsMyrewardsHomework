package tw.com.thinkpower.demo2.service;

import java.io.IOException;

import com.maxmind.geoip2.exception.GeoIp2Exception;

import tw.com.thinkpower.demo2.model.GeoIP;

public interface RawDBDemoGeoIPLocationService {

	GeoIP getLocation(String ipAddress) throws IOException, GeoIp2Exception;

}
