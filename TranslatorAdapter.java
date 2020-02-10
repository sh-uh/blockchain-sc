
/*
 * The class TranslatorAdapter provides an implementation of the Required (TranslateAPI - client) interface and wraps the Provided (GoogleTranslateAPI) interface.
 *
 * @author (Suchismita Hoare)
 * @version (2.0 - 2020 Google LLC)
 */

class TranslatorAdapter implements TranslateAPI {
    
    // The Adapter class needs a GoogleTranslateAPI object as a constructor parameter. The object is kept in a private field for use in the methods of the adapter, so that it can be used in the methods.
    private GoogleTranslateAPI gtrans;  
    
    public TranslatorAdapter(GoogleTranslateAPI gtrans) {
        this.gtrans = gtrans;
    }
    
    @Override
    public void getLanguages(String subsKey) {
        System.out.println("Implementation of Method1");
    }
    @Override
    public void detectLanguage(String inputText) {
        System.out.println("Implementation of Method2");
    }

    @Override
     public void translateText(String projId, String targetLang, String text) {
         // Initialising client to be used to send requests (reused for multiple requests) 
         try (TranslateAPI client = TranslateAPI.create()) {
             // Supported locations: 'global' - glossary or model location
             LocationName parent = LocationName.of(projId, "global");
             
             TranslateTextRequest req = TranslateTextRequest.newBuilder()
                .setParent(parent.toString())
                .setMimeType("text/plain")
                .setTargetLanguageCode(targetLanguage)
                .addContents(text)
                .build();
                
             TranslateTextResponse res = client.translateText(req);
             
             //Display trans for provided input text
             for(Translation trans : res.getTranslationsList()) {
                 System.out.printf("Translated text: %s\n", trans.getTranslatedText());
                }
            }
        }
    }