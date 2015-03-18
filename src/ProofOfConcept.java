import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class ProofOfConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// or use a connection string
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://albatross:albatross@ds063870.mongolab.com:63870/albatross"));
		MongoDatabase database = mongoClient.getDatabase("albatross");
		MongoCollection users = database.getCollection("Users");
		
		System.out.println("nb elements == "+users.count());
		FindIterable resultatSelectAll = users.find();
		for (Object object : resultatSelectAll) {
			System.out.println(object.toString());
		}
	}

}
