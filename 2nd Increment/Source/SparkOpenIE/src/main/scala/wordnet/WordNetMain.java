package wordnet;

import rita.RiWordNet;


public class WordNetMain {
    public static void main(String args[])
    {

        RiWordNet wordnet = new RiWordNet("C:\\Users\\npdar\\Desktop\\Acads\\KDM\\WordNet-3.0");
        String word;

       // Demo finding parts of speech
        word = "page";
        System.out.println("\nFinding parts of speech for " + word + ".");
        String[] partsofspeech = wordnet.getPos(word);
        for (int i = 0; i < partsofspeech.length; i++) {
            System.out.print(word);
            System.out.println(partsofspeech[i]);
        }

        word = "patent";
        String pos = wordnet.getBestPos(word);
        System.out.println("\n\nDefinitions for " + word + ":");
        // Get an array of glosses for a word
        String[] glosses = wordnet.getAllGlosses(word, pos);
        // Display all definitions
        for (int i = 0; i < glosses.length; i++) {
            System.out.print(word);
            System.out.println(glosses[i]);
        }

        // Demo finding a list of related words (synonyms)
        word = "next";
        String[] poss = wordnet.getPos(word);
        for (int j = 0; j < poss.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "page";
        String[] poss1 = wordnet.getPos(word);
        for (int j = 0; j < poss1.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss1[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss1[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "doctor";
        String[] poss2 = wordnet.getPos(word);
        for (int j = 0; j < poss2.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss2[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss2[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "currently";
        String[] poss3 = wordnet.getPos(word);
        for (int j = 0; j < poss3.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss3[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss3[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "change";
        String[] poss4 = wordnet.getPos(word);
        for (int j = 0; j < poss4.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss4[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss4[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "rising";
        String[] poss5 = wordnet.getPos(word);
        for (int j = 0; j < poss5.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss5[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss5[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "brand";
        String[] poss6 = wordnet.getPos(word);
        for (int j = 0; j < poss6.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss6[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss6[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "mg";
        String[] poss7 = wordnet.getPos(word);
        for (int j = 0; j < poss7.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss7[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss7[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }

        word = "percentage";
        String[] poss8 = wordnet.getPos(word);
        for (int j = 0; j < poss8.length; j++) {
            System.out.println("\n\nSynonyms for " + word + " (pos: " + poss8[j] + ")");
            String[] synonyms = wordnet.getAllSynonyms(word,poss8[j],10);
            for (int i = 0; i < synonyms.length; i++) {
                System.out.print(word + "  - ");
                System.out.println(synonyms[i]);
            }
        }


        // Demo finding a list of related words
        // X is Hypernym of Y if every Y is of type X
        // Hyponym is the inverse
        word = "million";
        pos = wordnet.getBestPos(word);
        System.out.println("\n\nHyponyms for " + word + ":");
        String[] hyponyms = wordnet.getAllHyponyms(word, pos);
        for (int i = 0; i < hyponyms.length; i++) {
            System.out.println(hyponyms[i]);
        }

        System.out.println("\n\nHypernyms for " + word + ":");
        String[] hypernyms = wordnet.getAllHypernyms(word, pos);
        for (int i = 0; i < hypernyms.length; i++) {
            System.out.println(hypernyms[i]);
        }


        String start = "medicine";
        String end = "drug";
        pos = wordnet.getBestPos(start);

        // Wordnet can find relationships between words
        System.out.println("\n\nRelationship between: " + start + " and " + end);
        float dist = wordnet.getDistance(start,end,pos);
        String[] parents = wordnet.getCommonParents(start, end, pos);
        System.out.println(start + " and " + end + " are related by a distance of: " + dist);

        // These words have common parents (hyponyms in this case)
        System.out.println("Common parents: ");
        if (parents != null) {
            for (int i = 0; i < parents.length; i++) {
                System.out.println(parents[i]);
            }
        }

        //System.out.println("\n\nHypernym Tree for " + start);
        //int[] ids = wordnet.getSenseIds(start,wordnet.NOUN);
        //wordnet.printHypernymTree(ids[0]);

    }
}
