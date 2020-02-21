class SpamAnalyzer extends KeywordAnalyzer {
    String[] keywords;
    SpamAnalyzer (String [] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
   /*

    @Override
    public Label processText(String text) {
        for (int i = 0; i < keywords.length; i++) {
            if (text.contains(keywords[i]))
                return Label.SPAM;
        }
        return Label.OK;
    }

    @Override
    protected String getKeywords() {
        return null;
    }

    @Override
    protected String getLabel() {
        return null;
    }
*/