package com.kartikey.nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentenceRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hey! I am Kartikey Srivastava I am a Software Developer";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence: sentences){
            System.out.println(sentence.toString());
        }
    }
}
