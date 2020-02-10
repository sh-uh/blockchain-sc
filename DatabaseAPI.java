
/*
 * DatabaseAPI is the required interface for database service.
 *
 * @author (Suchismita Hoare)
 * @version (05/02/2020)
 */
public interface DatabaseAPI
{
    // abstract method
    public void insertTrans(String outputText, String Translation);
    public void retrieveTrans(String queryParam);
    public void deleteRec(String id);
}
