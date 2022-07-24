package de.drebesdev.keywordreplace;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixture4TestCase;
import org.junit.Assert;
import org.junit.Test;

public class KeywordCompletionContributorTest extends LightPlatformCodeInsightFixture4TestCase {
    @Test
    public void noEmptyPrefix() {

        myFixture.configureByText("test.html", "");
        Assert.assertEquals("expect no completion for empty file",
                0, myFixture.completeBasic().length);


        myFixture.configureByText("test.html", "foo");
        myFixture.type(" ");
        Assert.assertEquals("expect no completion after space",
                0, myFixture.completeBasic().length);
    }

    @Test
    public void completions() {
        myFixture.configureByText("test.html", "");

        myFixture.type("{key");
        Assert.assertTrue(myFixture.completeBasic().length > 0);
    }
}
