package com.gf.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.gf.testBase.*;
import com.gf.parameters.*;
import com.gf.restClient.*;
import com.gf.util.*;
import static com.gf.util.TestUtil.dtt;

public class TestCase1{
	
    RestClient restClient;
    String testCaseExcel;
    @BeforeClass
    public void setUp(){    	
        
        restClient = new RestClient();     
        
        //testCaseExcel=prop.getProperty("postdata");
        
    }
 
    @DataProvider(name = "postData")
    public Object[][] post() throws IOException {
        return dtt(testCaseExcel,0); 
    }
 
    @Test(dataProvider = "postData")
    public void login(String loginUrl,String username, String passWord) throws Exception {
        //ʹ�ù��캯����������û��������ʼ���ɵ�¼�������
        Parameters loginParameters = new Parameters();
    }
    
}
