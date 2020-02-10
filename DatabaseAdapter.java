
/*
 * The class DatabaseAdapter provides an implementation of the Required (DatatbaseAPI - client) interface and wraps the Provided (AzureDatabaseAPI) interface.
 *
 * @author (Suchismita Hoare)
 * @version (05/02/2020)
 */
public class DatabaseAdapter implements DatabaseAPI
{
    private AzureDatabaseAPI db;  
    
    public DatabaseAdapter(AzureDatabaseAPI db) {
        this.db = db;
    }
    
    // abstract method
    @Override
    public void insertTrans(String outputText, String Translation) {
        System.out.println("Implementation of Method1");
    }
    @Override
    public void retrieveTrans(String queryParam) {
        System.out.println("Implementation of Method2");
    }
    @Override
    public void deleteRec(String id) {
        System.out.println("Implementation of Method3");
    }
}
