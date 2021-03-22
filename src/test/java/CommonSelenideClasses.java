import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CommonSelenideClasses {

    @BeforeAll
    public static void setup() {
        // Окно браузера на весь экран
        Configuration.startMaximized = true;
    }

    @Test
    void CommonSelenideClassesReview() {

    }
}