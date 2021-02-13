package fun.liwudi.graduatedesignverifyservice.helper;

import org.springframework.stereotype.Component;

/**
 * @author 李武第
 */
@Component
public class GpsHelper {

    private  double EARTH_RADIUS = 6371.393;

    private  double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 计算两个经纬度之间的距离
     *
     * @param lat1
     * @param lng1
     * @param lat2
     * @param lng2
     * @return
     */
    public  double getDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.abs(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2))));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 1000);
        return s;
    }


    public static void main(String[] args) {
        System.out.println(new GpsHelper().getDistance(22.934277299999998, 113.2119658, 22.934277299999998, 113.2119658));
    }

}







