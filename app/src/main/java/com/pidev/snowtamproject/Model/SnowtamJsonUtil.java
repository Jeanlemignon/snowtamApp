package com.pidev.snowtamproject.Model;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.pidev.snowtamproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import androidx.appcompat.app.AppCompatActivity;

public class SnowtamJsonUtil {



    public SnowtamJsonUtil() {
    }

    public Snowtam  extractNoTam(int i, Context context) {
       /* String JSON_URL =  "https://applications.icao.int/dataservices/api/notams-realtime-list?api_key=9b7a3620-3940-11eb-a895-efbf1120ac66&format=" +
                "json" +
                "&criticality=1" +
                "&locations="+ airoport;
        */
       // String JSON_URL =  "http://starlord.hackerearth.com/studio";

       // RequestQueue queue = Volley.newRequestQueue(context);
        final Snowtam snowtam = new Snowtam();
        /*JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //for (int i = 0; i < response.length(); i++) {
                */
            try {

                    // JSONObject snowObject = response.getJSONObject(0);
                    String jsonText = readText(context, R.raw.snowtam);
                   // JSONObject snowObject = new JSONObject(jsonText);
                JSONArray snowArray = new JSONArray(jsonText);
                JSONObject snowObject = snowArray.getJSONObject(i);

                    String id = snowObject.getString("id");
                    String entity = snowObject.getString("entity");
                    String status = snowObject.getString("status");
                    String qcode = snowObject.getString("Qcode");
                    String area = snowObject.getString("Area");
                    String SubArea = snowObject.getString("SubArea");
                    String Condition = snowObject.getString("Condition");
                    String Subject = snowObject.getString("Subject");
                    String Modifier = snowObject.getString("Modifier");
                    //String message = snowObject.getString("messsage");
                    String startdate = snowObject.getString("startdate");
                    String enddate = snowObject.getString("enddate");
                    String all = snowObject.getString("all");
                    String location = snowObject.getString("location");
                    Boolean isICAO = snowObject.getBoolean("isICAO");
                    String Created = snowObject.getString("Created");
                    String key = snowObject.getString("key");
                    String type = snowObject.getString("type");
                    String StateCode = snowObject.getString("StateCode");
                    String StateName = snowObject.getString("StateName");





                    //Text.setText(id +"ayay" +entity +"ayay" + status);
                   // Text.setText(StateCode);



                    snowtam.setId(id);
                    snowtam.setEntity(entity);
                    snowtam.setStatus(status);
                    snowtam.setQcode(qcode);
                    snowtam.setArea(area);
                    snowtam.setSubArea(SubArea);
                    snowtam.setCondition(Condition);
                    snowtam.setSubject(Subject);
                    snowtam.setModifier(Modifier);
                    //snowtam.setMessage(message);
                    snowtam.setStartdate(startdate);
                    snowtam.setEnddate(enddate);
                    snowtam.setAll(all);
                    snowtam.setLocation(location);
                    snowtam.setIsICAO(isICAO);
                    snowtam.setCreated(Created);
                    snowtam.setKey(key);
                    snowtam.setType(type);
                    snowtam.setStateCode(StateCode);
                    snowtam.setStateName(StateName);



                    //Text.setText(snowtam.getModifier());
                    // Text.setText(song.getId() +"ayay" +song.getEntity() +"ayay" + song.getStatus());


                } catch (JSONException | IOException e) {
                    e.printStackTrace();
                }
       /*
            }
            //}
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
                //Text.setText("somethingwrong"+error.getMessage());
            }
        });*/

        //queue.add(jsonArrayRequest);

        return snowtam;
    }

    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        StringBuilder sb= new StringBuilder();
        String s= null;
        while((  s = br.readLine())!=null) {
            sb.append(s);

            sb.append("\n");
        }
        return sb.toString();
    }

}
