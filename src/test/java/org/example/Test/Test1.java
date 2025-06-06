package org.example.Test;

import org.example.Base.Base;
import org.example.LogInPage.login;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.example.Util.Excel.getCellData;

public class Test1 extends Base {

    login log;

//    @Test(priority = 1)
//    public void ValidLogin() throws IOException {
//        log = new login(driver);
//            String user = getCellData("valid",0,0);
//            String pass = getCellData("Valid",0,1);
//            log.setLogin(user, pass);
//    }
//
//    @Test(priority = 2)
//    public void InvalidLogin() throws IOException {
//        log = new login(driver);
//        String user = getCellData("invalid",0,0);
//        String pass = getCellData("inValid",0,1);
//        log.setLogin(user, pass);
//
//    }


    @Test
    public void fortest() throws IOException {
        log = new login(driver);
        int temp1= Integer.parseInt(getCellData("valid",0,0));
        for(int i=1; i<=temp1; i++){
                String user = getCellData("valid",i,0);
                String pass = getCellData("Valid",i,1);
                log.setLogin(user, pass);
        }
    }
}
