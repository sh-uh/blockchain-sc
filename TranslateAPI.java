
/*
 * TranslateAPI is the required interface for text translation service.
 *
 * @author (Suchismita Hoare)
 * @version (05/02/2020)
 */

public interface TranslateAPI
{
    /*
     * abstract Methods (have no body - are public abstract by default)
     */
    public void getLanguages(String subsKey);
    public void detectLanguage(String inputText);
    public void translateText(String AuthUser, String targetLanguage, String inputText);
}

