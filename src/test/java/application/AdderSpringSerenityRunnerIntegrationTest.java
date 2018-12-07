package application;

import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;

@RunWith(SpringIntegrationSerenityRunner.class)
public class AdderSpringSerenityRunnerIntegrationTest {
    @Steps
    private AdderServiceSteps adderSteps;
    @Value("#{props['adder']}")
    private int adder;

    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenNumber();
        adderSteps.whenAdd(adder);
        adderSteps.thenSummedUp();
    }
}