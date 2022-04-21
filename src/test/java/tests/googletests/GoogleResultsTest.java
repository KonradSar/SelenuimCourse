package tests.googletests;

import org.junit.Test;
import pageobjects.google.GoogleResultsPage;
import tests.Base;

public class GoogleResultsTest extends Base {

    private final GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        openPage("https://www.google.pl/search?q=BMW&source=hp&ei=-59JYtneAZjukgWomoqIAg&iflsig=AHkkrS4AAAAAYkmuC_o1nmnmoej1t8UJ9ikmBNdItkPa&ved=0ahUKEwiZyPDq_vf2AhUYt6QKHSiNAiEQ4dUDCAc&uact=5&oq=BMW&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBEKMCMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBOgsILhCABBCxAxCDAToICC4QsQMQgwE6CwguELEDEIMBENQCOhEILhCABBCxAxCDARDHARDRAzoICAAQsQMQgwFQAFjVA2DiBmgAcAB4AIABgAKIAbYEkgEFMC4xLjKYAQCgAQE&sclient=gws-wiz");
        closeCookiesBtn(googleResultsPage.closeCookiesBtn);
        googleResultsPage.clickOnGraphicsLinkText();
    }

    @Test
    public void switchToNextResultsPage() {
        openPage("https://www.google.pl/search?q=BMW&source=hp&ei=-59JYtneAZjukgWomoqIAg&iflsig=AHkkrS4AAAAAYkmuC_o1nmnmoej1t8UJ9ikmBNdItkPa&ved=0ahUKEwiZyPDq_vf2AhUYt6QKHSiNAiEQ4dUDCAc&uact=5&oq=BMW&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBEKMCMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBOgsILhCABBCxAxCDAToICC4QsQMQgwE6CwguELEDEIMBENQCOhEILhCABBCxAxCDARDHARDRAzoICAAQsQMQgwFQAFjVA2DiBmgAcAB4AIABgAKIAbYEkgEFMC4xLjKYAQCgAQE&sclient=gws-wiz");
        closeCookiesBtn(googleResultsPage.closeCookiesBtn);
        googleResultsPage.clickOnNextPageLinkText();

    }

}
