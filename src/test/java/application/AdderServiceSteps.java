package application;

import application.service.AdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@ContextConfiguration(classes = AdderService.class)
public class AdderServiceSteps {
    @Autowired
    private AdderService adderService;
    private int givenNumber;
    private int base;
    private int sum;

    public void givenBaseAndAdder(int base, int adder) {
        this.base = base;
        adderService.baseNum(base);
        this.givenNumber = adder;
    }

    public void whenAdd(int adder) {
        sum = adderService.add(adder);
    }

    public void setGivenNumber(int n){
        this.givenNumber = n;
    }

    public void whenAdd() {
        sum = adderService.add(givenNumber);
    }

    public void thenSummedUp() {
        assertEquals(base + givenNumber, sum);
    }

    public void sumWrong() {
        assertNotEquals(base + givenNumber, sum);
    }
    public void givenNumber() {
        sum = adderService.accumulate(givenNumber);
    }
}
