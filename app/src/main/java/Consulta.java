import android.view.View;
import android.widget.EditText;

import com.loopj.android.http.*;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by gloaiza on 30/11/2017.
 */

public class Consulta {
    public void consultar(){

        String url = "http://echo.jsontest.com/nombre/Gustavo/id/116220511";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                // Root JSON in response is an dictionary i.e { "data : [ ... ] }
                // Handle resulting parsed JSON response here
                try {
                    response.getString("nombre");

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t) {
                // called when response HTTP status is "4XX" (eg. 401, 403, 404)
            }
        });
    }

    public void cargarDatos(Persona persona){

    }
}
