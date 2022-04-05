#Author: selvam -24-03-2022
@Login
Feature: validate the login for Django page
Background:
Given check the network
Given verify the excel

@ValidLogin
Scenario: validate login feature of Django with proper credentials

Given open the browser "chrome"
When enter the url "https://djangovinoth.pythonanywhere.com/labhome/"
And click the login link 
When enter the username "SELVAAMOJO"
And enter the password "SELVAM@1995"
And click the login button 
Then verify login success or not 


@InValidLogin
Scenario: validate login feature of Django with inproper credentials

Given open the browser "chrome"
When enter the url "https://djangovinoth.pythonanywhere.com/labhome/"
And click the login link 
When enter the username "SELVAAMOJO"
And enter the password "SELVAM@1995"
And click the login button 
Then verify login success or not 


