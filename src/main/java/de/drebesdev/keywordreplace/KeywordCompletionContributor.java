package de.drebesdev.keywordreplace;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;

import static com.intellij.patterns.PlatformPatterns.psiElement;

public class KeywordCompletionContributor extends CompletionContributor {

    public KeywordCompletionContributor() {
//        extend(CompletionType.BASIC, psiElement().inside(xmlText()), new KeywordCompletionProvider());
        extend(CompletionType.BASIC, psiElement(), new KeywordCompletionProvider());

        // todo: define grammar and parser for html files => https://plugins.jetbrains.com/docs/intellij/grammar-and-parser.html#define-the-grammar

    }


}
