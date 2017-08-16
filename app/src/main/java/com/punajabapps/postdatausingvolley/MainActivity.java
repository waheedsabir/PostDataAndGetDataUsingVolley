package com.punajabapps.postdatausingvolley;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText title_edit,detail_edit  ;



    TextView txt;


    private static final String url = "http://android.apnitaleem.com/concepts/sendhealth.php";
    public static final String KEY_TITLE = "title";
    public static final String KEY_DETAIL = "detail";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_edit = (EditText) findViewById(R.id.title);
        detail_edit = (EditText) findViewById(R.id.detail);
///load data when
load();

    }

    public void submit(View view) {

        load();
       final String title = title_edit.getText().toString();
       final String detail = detail_edit.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
                    }
                },


                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                })


        {
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put(KEY_TITLE,title);

                params.put(KEY_DETAIL,detail);



                return params;
            }
        };





        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);





    }

    public void load (){
        StringRequest stringRequest1 = new StringRequest("http://android.apnitaleem.com/concepts/recivehealth.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {



                        for (int i=0 ; i<response.length();i++ ){


                            try {
                                JSONArray jsonArray = new JSONArray(response);


                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                String title = jsonObject.getString("title");
                                String detail = jsonObject.getString("detail");



                                TextView textView = (TextView) findViewById(R.id.value);


                                textView.append("Title : " + title +" \n \n Detail :\n" + detail);


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });



        RequestQueue requestQueue1 = Volley.newRequestQueue(this);
        requestQueue1.add(stringRequest1);



    }


}
