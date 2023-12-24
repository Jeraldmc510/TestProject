package test;


import com.microsoft.playwright.*;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class App {
	
	public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
        	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
            System.out.println("test_playwright");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
            
        //    try (Playwright playwright = Playwright.create()) {
        //        Browser browser = playwright.webkit().launch();
        //        Page page = browser.newPage();
        //        page.navigate("https://playwright.dev/");       
                       
              
              }
        }
    }


