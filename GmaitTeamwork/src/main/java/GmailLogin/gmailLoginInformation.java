package GmailLogin;

import BaseTeamwork.CommonAPI;
import org.testng.annotations.Test;

public class gmailLoginInformation extends CommonAPI {

    @Test
    public void emailAddress(){

        clickOnWebElement("#gb_70");

        typeOnElementEntry("#identifierId","mohammed81494");

    }
}
