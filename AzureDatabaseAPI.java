
/*
 * The AzureDatabaseAPI interface is the provided interface for the DatabaseAdapter class..
 *
 * @author (Suchismita Hoare)
 * @version (05/02/2020)
 */
public interface AzureDatabaseAPI
{
    public void CreateItemAsync(String item, String partitionKey);
}
