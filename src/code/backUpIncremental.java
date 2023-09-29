package code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class backUpIncremental {
    public static void createCopy() {
        SimpleDateFormat formateo= new SimpleDateFormat("yyyyMMdd'_'HH-mm-ss");
        Date fecha =new Date(System.currentTimeMillis());
    }
}
