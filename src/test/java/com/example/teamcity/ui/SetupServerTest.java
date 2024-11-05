package com.example.teamcity.ui;

import com.example.teamcity.ui.setup.FirstStartPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Setup")
public class SetupServerTest extends BaseUiTest {
    @Test(groups = {"Setup"})
    public void setupTeamCityServerTest(){
        FirstStartPage.open().setupFirstStart();
    }
}
