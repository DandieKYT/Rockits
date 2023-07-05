package tests;

import org.junit.jupiter.api.Test;

public class PrivacyPoliceTest extends TestBase {
    @Test
    public void PrivacyPolice() {
        basePage.openPage();
        privacyPolicepage.privacyPolicePage();
        privacyPolicepage.privacyPoliceTitle();
    }
}
