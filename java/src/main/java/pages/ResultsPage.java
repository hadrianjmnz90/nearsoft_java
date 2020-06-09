package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage {

    @FindBy(id = "sortDropdown")
    private WebElement sortDropdownButton;

    @FindBy(xpath = "//span[@data-test-id='listing-price-dollars']")
    private List<WebElement> flightPrices;

    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getSortDropdownButton() {
        return sortDropdownButton;
    }

    public List<WebElement> getFlightPrices() {
        return flightPrices;
    }

    public List<Integer> getPrices() {
        List<Integer> priceList = new ArrayList<>();
        for (WebElement list : flightPrices) {
            String p = list.getText();
            p = p.replaceAll("[^\\d.]", "");
            priceList.add(Integer.valueOf(p));
        }
        return priceList;
    }
}
