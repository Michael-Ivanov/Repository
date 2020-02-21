abstract class KeywordAnalyzer implements TextAnalyzer {

     protected abstract String[] getKeywords ();

     protected abstract Label getLabel ();

     @Override
     public Label processText(String text) {
          for (int i = 0; i < getKeywords().length; i++) {
               if (text.contains(getKeywords()[i]))
                    return getLabel();
          }
          return Label.OK;
     }
}
