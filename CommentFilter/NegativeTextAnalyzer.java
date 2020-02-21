class NegativeTextAnalyzer extends KeywordAnalyzer {

    @Override
    public String[] getKeywords() {
        return new String[] {":(", "=(", ":|"};
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
    //String negativeText;

   /* @Override
    public Label processText (String text) {
        if (text.contains(":(") || text.contains("=(") || text.contains(":|"))
            return Label.NEGATIVE_TEXT;
        else
            return Label.OK;
    }

    @Override
    protected String getKeywords() {
        String[] negWords = {":(", "=(", ":|"};
        return negWords.toString();
    }

    @Override
    public String getLabel() {
        return "NEGATIVE_TEXT";
    }
}*/
