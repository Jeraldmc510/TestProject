package test;

import java.util.regex.Pattern;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//import com.microsoft.playwright.Playwright;

public class App1 {
	public static void main(String[] args) {
		  try (Playwright playwright = Playwright.create()) {
	            Browser browser = playwright.chromium().launch();
	            Page page = browser.newPage();
	            page.navigate("http://playwright.dev");

	            // Expect a title "to contain" a substring.
	            assertThat(page).hasTitle(Pattern.compile("Playwright"));

	            // create a locator
	            Locator getStarted = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Get Started"));

	            // Expect an attribute "to be strictly equal" to the value.
	            assertThat(getStarted).hasAttribute("href", "/docs/intro");

	            // Click the get started link.
	            getStarted.click();

	            // Expects page to have a heading with the name of Installation.
	            assertThat(page.getByRole(AriaRole.HEADING,
	               new Page.GetByRoleOptions().setName("Installation"))).isVisible();
	        }
	}

}