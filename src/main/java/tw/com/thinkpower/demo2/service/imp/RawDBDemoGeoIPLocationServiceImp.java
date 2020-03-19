package tw.com.thinkpower.demo2.service.imp;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.springframework.stereotype.Service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

import tw.com.thinkpower.demo2.model.GeoIP;
import tw.com.thinkpower.demo2.service.RawDBDemoGeoIPLocationService;

//@Service
public class RawDBDemoGeoIPLocationServiceImp implements RawDBDemoGeoIPLocationService {

//	/Users/ed/ThinkPower/demo2/GeoLite2-City_20200211/GeoLite2-City.mmdb
	private DatabaseReader dbReader;

    public RawDBDemoGeoIPLocationServiceImp() throws IOException {
        File database = new File("/Users/ed/ThinkPower/demo2/GeoLite2-City_20200211/GeoLite2-City.mmdb");
        dbReader = new DatabaseReader.Builder(database).build();
    }

    public GeoIP getLocation(String ip) throws IOException, GeoIp2Exception {
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);

        String cityName = response.getCity().getName();
        String latitude = response.getLocation().getLatitude().toString();
        String longitude = response.getLocation().getLongitude().toString();
        return new GeoIP(ip, cityName, latitude, longitude);
    }

}
