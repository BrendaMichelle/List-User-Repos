import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;

public class Repos{
	
  public static void main (String [] args) throws IOException, JSONException{
    String username = "brendamichelle"; //this is my GitHub username; may replace with your own
    URL url = new URL ("https://api.github.com/users/" + username + "/repos");

    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
      Scanner scan = new Scanner (url.openStream());
      String jsonStr = new String();

      while(scan.hasNext()){
        jsonStr += scan.nextLine();
      }
      scan.close();

      JSONArray jsonArr = new JSONArray(jsonStr);
      for(int i = 0; i < jsonArr.length(); i++){
        System.out.println(jsonArr.getJSONObject(i).getString("name") );
      }
    }
    else {
      System.out.println("REQUEST FAILURE");
    }
  }

}
