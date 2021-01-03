package CVSSearch;

import BaseTeamwork.CommonAPI;
import org.testng.annotations.Test;

public class CVSEngine extends CommonAPI {


    @Test
    public void searchMenu(){

        typeOnElementEntry("#searchbox","Tylenol");

        typeOnElementEntry("#search-box", "Poptart");

        //navigateBack();
        typeOnElementEntry("#search-box", "Snickers");

        //navigateBack();

        typeOnElementEntry("#search-box", "Ginger-Ale");

        //navigateBack();

        typeOnElementEntry("#searchbox", "Doritos");

       // navigateBack();
  }


}
