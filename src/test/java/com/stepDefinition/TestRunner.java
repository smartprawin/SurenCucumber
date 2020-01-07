package com.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java\\Prakash\\SurenCucumber\\src\\test\\resources\\Feature_File\\", 
tags = {}, 
monochrome = true, 
glue = "com.stepDefinition", 
dryRun = false, 
plugin = {"html:target" })
public class TestRunner {

}
