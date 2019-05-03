package paradva.nikss.retrofitrxjava.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class DataaResponse {
    public DataaResponse() {
    }

    @SerializedName("Carriers")
    private List<CarriersItem> carriers;

    @SerializedName("Dates")
    private Dates dates;

    @SerializedName("Quotes")
    private List<QuotesItem> quotes;

    @SerializedName("Currencies")
    private List<CurrenciesItem> currencies;

    @SerializedName("Places")
    private List<PlacesItem> places;

    public void setCarriers(List<CarriersItem> carriers) {
        this.carriers = carriers;
    }

    public List<CarriersItem> getCarriers() {
        return carriers;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Dates getDates() {
        return dates;
    }

    public void setQuotes(List<QuotesItem> quotes) {
        this.quotes = quotes;
    }

    public List<QuotesItem> getQuotes() {
        return quotes;
    }

    public void setCurrencies(List<CurrenciesItem> currencies) {
        this.currencies = currencies;
    }

    public List<CurrenciesItem> getCurrencies() {
        return currencies;
    }

    public void setPlaces(List<PlacesItem> places) {
        this.places = places;
    }

    public List<PlacesItem> getPlaces() {
        return places;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}