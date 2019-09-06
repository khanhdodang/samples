require 'rubygems'
require 'selenium-webdriver'

# Input capabilities
caps = Selenium::WebDriver::Remote::Capabilities.new
caps['deviceName'] = '*'
caps['platformName'] = 'Android'
caps['browserName'] = 'Chrome'
caps['deviceGroup'] = 'KOBITON'


driver = Selenium::WebDriver.for(:remote,
  :url => "https://khanhdo:9e92684c-68a1-4882-a499-8894f8715bd0@api-test.kobiton.com/wd/hub",
  :desired_capabilities => caps)
puts driver.capabilities['kobitonSessionId']
driver.navigate.to "http://www.google.com"
element = driver.find_element(:name, 'q')
element.send_keys "BrowserStack"
element.submit
puts driver.title
driver.quit