Feature: Myntra project
Scenario: go To The Myntra Homepage
Given launch The Url
When move To Men And Tshirt Tab
And get No Of Products
And move To Kids And Tshirt Tab
And get The Minimum Price Of The Products 
Then Print the Brand Of Minimum Product Price
