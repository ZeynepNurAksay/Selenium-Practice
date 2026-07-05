package com.demoqa.pages.alerts_frames_windows;

import com.utilities.SwitchToUtility;
import org.openqa.selenium.By;

public class FramesPage extends Alerts_Frames_WindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBoxId = "frame1";
    private By title = By.xpath("//div[@id='root']//h1[text()='Frames']");

    public String getTextInBigFrame() {
        SwitchToUtility.switchToFrame(iFrameBigBoxId);
        String text = find(textInFrame).getText();
        SwitchToUtility.switchToDefaultContent();
        return text;
    }

    public String getTextInSmallFrame() {
        SwitchToUtility.switchToFrame(1);
        String text = find(textInFrame).getText();
        SwitchToUtility.switchToDefaultContent();
        return text;
    }

    public String getTitle(){
        return find(title).getText();
    }

}
