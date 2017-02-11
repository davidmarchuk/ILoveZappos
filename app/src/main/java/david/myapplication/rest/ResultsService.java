package david.myapplication.rest;

import java.util.Map;

import david.myapplication.models.SearchResult;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.QueryMap;

public interface ResultsService {
    @GET("/Search?key=b743e26728e16b81da139182bb2094357c31d331")
    public void getSearchResults(@QueryMap Map<String, String> params, Callback<SearchResult> items);
}