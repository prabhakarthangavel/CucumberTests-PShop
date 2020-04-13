$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Getrest.feature");
formatter.feature({
  "line": 1,
  "name": "verify Get operation from REST API",
  "description": "",
  "id": "verify-get-operation-from-rest-api",
  "keyword": "Feature"
});
formatter.before({
  "duration": 866998279,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the GET response",
  "description": "",
  "id": "verify-get-operation-from-rest-api;verify-the-get-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I should perform GET operation for \"/auth/logintest\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should see response \"logged in\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "/auth/logintest",
      "offset": 36
    }
  ],
  "location": "GetAPIsteps.i_should_perform_GET_operation_for(String)"
});
formatter.result({
  "duration": 1481303748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "logged in",
      "offset": 23
    }
  ],
  "location": "GetAPIsteps.i_should_see_response(String)"
});
formatter.result({
  "duration": 560293014,
  "status": "passed"
});
formatter.before({
  "duration": 5492944,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check the response with Params",
  "description": "",
  "id": "verify-get-operation-from-rest-api;check-the-response-with-params",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Have to pass the params \"getAllProducts/{type}\"",
  "rows": [
    {
      "cells": [
        "type"
      ],
      "line": 9
    },
    {
      "cells": [
        "fruits"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I can check the response \"10\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "getAllProducts/{type}",
      "offset": 25
    }
  ],
  "location": "GetAPIsteps.have_to_pass_the_params(String,DataTable)"
});
formatter.result({
  "duration": 95656855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 26
    }
  ],
  "location": "GetAPIsteps.i_can_check_the_response(int)"
});
formatter.result({
  "duration": 49998545,
  "status": "passed"
});
});