package de.drebesdev.keywordreplace;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class KeywordCompletionProvider extends CompletionProvider<CompletionParameters> {
    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
        String prefix = result.getPrefixMatcher().getPrefix();
        if (prefix.isEmpty()) {
            return;
        }

        // check prefix in dictionary and return results
        String[] keywordResults = getKeywordResults(prefix);
        for (String keywordResult : keywordResults) {
            // todo: strip prefix and add the rest as completion
            result.addElement(LookupElementBuilder.create(keywordResult).withCaseSensitivity(true));
        }

        // for all keywords available:
    }

    private String[] getKeywordResults(String prefix) {
        return new String[]{"{key.test}"}; // todo: implement
    }
}
