$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Amazonstudy.feature");
formatter.feature({
  "line": 1,
  "name": "Customer can Purchase Products",
  "description": "",
  "id": "customer-can-purchase-products",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "HomePage",
  "description": "",
  "id": "customer-can-purchase-products;homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user To Launch The Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Can Select From The DropDown Categories",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Can Enter The Products",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "compare The DropDown Suggestion Select",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_To_Launch_The_Application_Url()"
});
formatter.result({
  "duration": 4540317400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_can_select_from_the_drop_down_categories()"
});
formatter.result({
  "duration": 1748780700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_can_enter_the_products()"
});
formatter.result({
  "duration": 3482466400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.compare_the_drop_down_suggestion_select()"
});
formatter.result({
  "duration": 9987226500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Search_ResultPage",
  "description": "",
  "id": "customer-can-purchase-products;search-resultpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "counting The Results.",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "count The Number Of More Results.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.counting_The_Results()"
});
formatter.result({
  "duration": 121851900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.count_The_Number_Of_More_Results()"
});
formatter.result({
  "duration": 163853600,
  "status": "passed"
});
});