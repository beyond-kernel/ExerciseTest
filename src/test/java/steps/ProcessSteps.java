package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import definition.Processo;
import support.RESTSupport;


public class ProcessSteps {
    @Given("^user user has an existent id equal \"([^\"]*)\"$")
    public void userUserHasAnExistentIdEqual(String id) throws Throwable {
        Processo.setLast(id);
    }

    @When("^the user clicks on read process button$")
    public void theUserClicksOnReadProcessButton() {
        String url =  Processo.getUrl() + "/820";
        RESTSupport.executeGet(url);
    }
}
