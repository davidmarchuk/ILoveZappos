package david.myapplication.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {
    @SerializedName("originalTerm")
    private Object originalTerm;
    @SerializedName("currentResultCount")
    private String currentResultCount;
    @SerializedName("totalResultCount")
    private String totalResultCount;
    @SerializedName("term")
    private String term;
    @SerializedName("results")
    private List<Item> results;
    @SerializedName("statusCode")
    private String statusCode;

    public Object getOriginalTerm() {
        return originalTerm;
    }
    public void setOriginalTerm(Object originalTerm) {
        this.originalTerm = originalTerm;
    }
    public String getCurrentResultCount() {
        return currentResultCount;
    }
    public void setCurrentResultCount(String currentResultCount) {
        this.currentResultCount = currentResultCount;
    }
    public String getTotalResultCount() {
        return totalResultCount;
    }
    public void setTotalResultCount(String totalResultCount) {
        this.totalResultCount = totalResultCount;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term) {
        this.term = term;
    }
    public List<Item> getResults() {
        return results;
    }
    public void setResults(List<Item> results) {
        this.results = results;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

}
