import com.pm.spring.ioc.modules.SimpleIOC;
import com.pm.spring.ioc.pojo.Car;
import com.pm.spring.ioc.pojo.Wheel;
import org.junit.Test;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 18:06
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
