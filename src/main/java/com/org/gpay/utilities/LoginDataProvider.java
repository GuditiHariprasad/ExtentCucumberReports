package com.org.gpay.utilities;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "dp")
    public Object[][] loginData()
    {
        return new Object[][] {
            {"admin", "admin123"},
            {"user", "user123"},
            {"manager", "manager123"}
        };
    }
}
