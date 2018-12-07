package application;

import application.controller.AdderController;
import application.service.AdderService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import net.serenitybdd.jbehave.SerenityStory;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
public class AdderIntegrationTest extends SerenityStory {
    @Autowired
    private AdderService adderService;

    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }
}