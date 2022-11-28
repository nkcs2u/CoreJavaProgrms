import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sd = new SimpleDateFormat("mm/dd/yyyy");
        System.out.println(sd.format(d));

        SimpleDateFormat sd1 = new SimpleDateFormat("m/d/yyyy hh:mm:ss");
        System.out.println(sd1.format(d));
    }
}
