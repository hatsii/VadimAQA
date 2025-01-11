package uiTest;

import PageObject.GoogleSearch;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static utils.Source.GOOGLE_URL;



public class GoogleSearchTest {
    private GoogleSearch googleSearch;



    @BeforeEach
    public void setup() {
        googleSearch = new GoogleSearch();
        Selenide.open(GOOGLE_URL);
    }


    @ParameterizedTest
    @ValueSource(strings = {"qa", "aqa", "cars"})
    public void testSearchResults(String query) {
        googleSearch.search(query);
        googleSearch.verifyResultsMoreThan(5);
    }


}
