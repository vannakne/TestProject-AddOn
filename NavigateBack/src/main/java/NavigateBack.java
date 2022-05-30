import io.testproject.java.annotations.v2.Action;
import io.testproject.java.sdk.v2.addons.WebAction;
import io.testproject.java.sdk.v2.addons.helpers.WebAddonHelper;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Action(name = "Navigate Back - VNK")
public class NavigateBack implements WebAction {
    @Override
    public ExecutionResult execute(WebAddonHelper helper) throws FailureException {
        WebDriver driver = helper.getDriver();
        driver.navigate().back();
        return ExecutionResult.PASSED;
    }
}
