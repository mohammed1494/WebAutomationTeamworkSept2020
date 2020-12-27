package search;

import BaseTeamwork.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonTestSearchTeamwork extends CommonAPI {
    @Test
    public void test() {
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Christmas Lights", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Christmas wrapping paper", Keys.ENTER);

    }



}
