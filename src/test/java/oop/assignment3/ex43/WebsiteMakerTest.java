package oop.assignment3.ex43;

import oop.assignment3.ex42.PrintThings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteMakerTest {

    @Test
    void showWebsite() {
        WebsiteMaker detector = new WebsiteMaker();
        String actual = detector.showWebsite("awesomeco");
        String expected = ("Created ./website/awesomeco\n" + "Created ./website/awesomeco/index.html\n");
        assertEquals(expected, actual);
    }

    @Test
    void showJava() {
        WebsiteMaker detector = new WebsiteMaker();
        String actual = detector.showJava("awesomeco");
        String expected = ("Created ./website/awesomeco/java/\n");
        assertEquals(expected, actual);
    }

    @Test
    void showCSS() {
        WebsiteMaker detector = new WebsiteMaker();
        String actual = detector.showCSS("awesomeco");
        String expected = ("Created ./website/awesomeco/css/\n");
        assertEquals(expected, actual);
    }
}