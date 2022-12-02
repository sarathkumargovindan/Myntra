$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myntra.feature");
formatter.feature({
  "line": 1,
  "name": "Myntra project",
  "description": "",
  "id": "myntra-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "go To The Myntra Homepage",
  "description": "",
  "id": "myntra-project;go-to-the-myntra-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "move To Men And Tshirt Tab",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "get No Of Products",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "move To Kids And Tshirt Tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "get The Minimum Price Of The Products",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Print the Brand Of Minimum Product Price",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.launch_The_Url()"
});
formatter.result({
  "duration": 4209699400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.move_To_Men_And_Tshirt_Tab()"
});
formatter.result({
  "duration": 6628024800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.get_No_Of_Products()"
});
formatter.result({
  "duration": 82102700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Stepdefinition.get_The_Minimum_Price_Of_The_Products()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.print_the_Brand_Of_Minimum_Product_Price()"
});
formatter.result({
  "status": "skipped"
});
});