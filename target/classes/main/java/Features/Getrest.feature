Feature: verify Get operation from REST API

	Scenario: Verify the GET response
		Given I should perform GET operation for "/auth/logintest"
		Then  I should see response "logged in"
	
	Scenario: Check the response with Params
		Given Have to pass the params "getAllProducts/{type}"
		|type|
		|fruits|
		Then  I can check the response "10"