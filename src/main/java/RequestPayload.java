import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.util.Iterator;

public class RequestPayload {
    public void run(Constants.Ship shipName) throws Exception
    {
        String url = "http://starcitizendb.com/static/ships/loadouts/" + shipName.stringValue();
        System.out.println("URL requested: " + url);
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = null;
        String json = null;

        try
        {
            response = client.execute(request);
            json = IOUtils.toString(response.getEntity().getContent());
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }

//        System.out.println("Response code : " + response.getStatusLine().getStatusCode());

        try
        {
            JSONArray jsonArray = new JSONArray(json);
            System.out.println("Ship: " + shipName.name());
            for(int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject obj = jsonArray.getJSONObject(i);
                Iterator iter = obj.keys();
                while(iter.hasNext())
                {
                    String key = iter.next().toString();
                    if(key.equals("attached"))
                    {
                        System.out.print("  " + key + ": ");
                        JSONArray jsonArray2 = new JSONArray(obj.get(key).toString());
                        for(int j = 0; j < jsonArray2.length(); j++)
                        {
                            JSONObject obj2 = jsonArray2.getJSONObject(j);
                            Iterator iter2 = obj2.keys();
                            while(iter2.hasNext())
                            {
                                String key2 = iter2.next().toString();
                                System.out.println(key2 + " : " + obj2.get(key2));
                            }
                        }
                    }
                    else
                    {
                        System.out.println(key + " : " + obj.get(key));
                    }

                }
            }
        }
        catch(JSONException e)
        {
            System.out.println(e);
        }
        System.out.println();
    }

}
