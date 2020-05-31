package steps;

import com.sun.org.apache.xalan.internal.xslt.Process;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import definition.Processo;
import definition.User;
import support.RESTSupport;

public class ProcessSteps {
    private String url = "";
    @Given("^user user has an existent id equal \"([^\"]*)\"$")
    public void userUserHasAnExistentIdEqual(String id) throws Throwable {
        Processo.setLast(id);
    }

    @When("^the user clicks on read process button$")
    public void theUserClicksOnReadProcessButton() {
        String url =  Processo.getUrl() + "/" + Processo.getLastId();
        RESTSupport.executeGet(url);
    }

    @Given("^: the user access site http://agapito-server\\.herokuapp\\.com/processos$")
    public void theUserAccessSiteHttpAgapitoServerHerokuappComProcessos() {
        url = User.getEndPoint();
    }

    @And("^The user clicks on btn-novo$")
    public void theUserClicksOnBtnNovo() {
        RESTSupport.executeGet(User.getEndPoint());
    }

    @And("^The user fill \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void theUserFillWithValue(String field, String value) throws Throwable {
        User.addFields(field, value);
    }

    @When("^The user clicks on btn-save$")
    public void theUserClicksOnBtnSave() throws Throwable {
        RESTSupport.executePost(User.getEndPoint(),User.getFields());
        User.setLastUser(RESTSupport.key("id").toString());
        User.clearFields();
    }

    @When("^The user clicks on btn-update$")
    public void theUserClicksOnBtnUpdate() {
        String url = User.getEndPoint() + "/" + User.getLastUser();
        RESTSupport.executePut(url, User.getFields());
    }

    @When("^The user clicks on btn-delete$")
    public void theUserClicksOnBtnDelete() {
        String url = User.getEndPoint() + "/" + User.getLastUser();
        RESTSupport.executeDelete(url);
    }
}
