$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Java/Prakash/SurenCucumber/src/test/resources/Feature_File/Amazon.feature");
formatter.feature({
  "name": "Automate Amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate and in Search Amazon",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter into Amazon Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_into_Amazon_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search in Amazon search",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.search_in_Amazon_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print all the result and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.print_all_the_result_and_quit()"
});
formatter.result({
  "status": "passed"
});
});