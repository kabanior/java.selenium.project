package com.example.saucedemo;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/example/shop/features", glue = "com.example.saucedemo")
public class RunCucumberTest {
}
