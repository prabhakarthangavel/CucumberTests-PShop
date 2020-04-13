package main.java.stepDefinition;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class GetAPIsteps {

	public static ResponseOptions<Response> response;

	@Given("^I should perform GET operation for \"([^\"]*)\"$")
	public void i_should_perform_GET_operation_for(String url) {
		response = CucumberTest.GetApi(url);
	}

	@Then("^I should see response \"([^\"]*)\"$")
	public void i_should_see_response(String arg1) {
		assertThat(response.getBody().jsonPath().getString("status"), is(arg1));
	}

	@Given("^Have to pass the params \"([^\"]*)\"$")
	public void have_to_pass_the_params(String url, DataTable table) {
		List<List<String>> data = table.raw();
		HashMap<String,String> params = new HashMap();
		params.put(data.get(0).get(0), data.get(1).get(0));
		response = CucumberTest.GetApiwithParams(url, params);
	}

	@Then("^I can check the response \"([^\"]*)\"$")
	public void i_can_check_the_response(int value) throws Throwable {
		List<Object> res = response.getBody().jsonPath().get();
		assertThat(res.size(),is(value));
	}

}
