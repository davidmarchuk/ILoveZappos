package david.myapplication;

import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import david.myapplication.adapters.ItemAdapter;
import david.myapplication.databinding.ActivityMainBinding;
import david.myapplication.models.Item;
import david.myapplication.models.SearchResult;
import david.myapplication.rest.ResultsService;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    String API = "https://api.zappos.com";
    String term = "";
    ActivityMainBinding binding;
    RecyclerView rvItem;
    List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }
    public void ibSearchOnClick(View v) {
        EditText etSearch = (EditText) findViewById(R.id.etSearch);
        term = etSearch.getText().toString();
        init();
    }

    private void init() {
        items = new ArrayList<Item>();
        Picasso.with(getApplicationContext()).setIndicatorsEnabled(true);

        this.setContentView(R.layout.activity_main);
        rvItem = (RecyclerView) findViewById(R.id.rvItem);
        rvItem.setLayoutManager(new LinearLayoutManager(this));

        fetchSearchResult();
    }



    private void fetchSearchResult() {
        RestAdapter restAdapter = new
                RestAdapter.Builder()
                .setEndpoint(API).build();
        ResultsService resultsService = restAdapter.create(ResultsService.class);
        Map<String, String> params = new HashMap<String, String>();
        params.put("term", term);
        resultsService.getSearchResults(params, new Callback<SearchResult>() {
            @Override
            public void success(SearchResult searchResult, Response response) {
                System.err.println(searchResult.getTerm());
                items = searchResult.getResults();
                ItemAdapter adapter = new ItemAdapter(items);
                rvItem.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(getApplicationContext(),
                        "Unexpected error occured", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }


}
