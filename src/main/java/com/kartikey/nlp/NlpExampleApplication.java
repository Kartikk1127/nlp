package com.kartikey.nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class NlpExampleApplication {

	public static void main(String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

		String text = "Hey! This is Kartikey Srivastava";

		CoreDocument coreDocument = new CoreDocument(text);

		stanfordCoreNLP.annotate(coreDocument);

		List<CoreLabel> coreLabelList =coreDocument.tokens();

		for (CoreLabel coreLabel: coreLabelList){
			System.out.println(coreLabel.originalText());
		}

	}

}
