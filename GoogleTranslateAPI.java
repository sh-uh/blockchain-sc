
/*
 * The GoogleTranslateAPI interface is the provided interface for the TranslatorAdapter class.
 *
 * @author (Suchismita Hoare)
 * @version (05/02/2020)
 */
public interface GoogleTranslateAPI
{

    public void listLanguages(String subsKey, String Text);
    public void getSupportedLanguages(String languageCode, String Text);
    public void translateText(String Text, String Language);  
}
