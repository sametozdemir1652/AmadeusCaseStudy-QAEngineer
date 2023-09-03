package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static int removeNunNumeric(String input){

        int result = Integer.parseInt(input.replaceAll("[^0-9]",""));
        return result;
    }

    public static void takeScreenShot() {
        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String path = "TestOutput/screenshot/screenshot" + date + ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
