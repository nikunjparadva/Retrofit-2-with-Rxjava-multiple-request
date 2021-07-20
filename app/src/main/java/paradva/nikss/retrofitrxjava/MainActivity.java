package paradva.nikss.retrofitrxjava;

import android.os.Bundle;
import android.os.StrictMode;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import paradva.nikss.retrofitrxjava.model.DataaResponse;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsedates/v1.0/IN/INR/en-US/STV-sky/JAI-sky/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        List<Observable<DataaResponse>> requests = new ArrayList<>();
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-05"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-06"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-07"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-08"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-09"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-10"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-11"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2019-12"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2020-01"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2020-02"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2020-03"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("2020-04"));
        Log.e("onSubscribe", "START: ");
        Observable.zip(
                requests,
                new Function<Object[], List<DataaResponse>>() {
                    @Override
                    public List<DataaResponse> apply(Object[] objects) throws Exception {
                        Log.e("onSubscribe", "apply: " + objects.length);
                        List<DataaResponse> dataaResponses = new ArrayList<>();
                        for (Object o : objects) {
                            dataaResponses.add((DataaResponse) o);
                        }
                        return dataaResponses;
                    }
                })
                .subscribe(
                        new Consumer<List<DataaResponse>>() {
                            @Override
                            public void accept(List<DataaResponse> dataaResponses) throws Exception {
//                                String s1 = dataaResponses.toString();
//                                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
//                                ClipData clip = ClipData.newPlainText("label", s1);
//                                clipboard.setPrimaryClip(clip);
                                Log.e("onSubscribe", "YOUR DATA IS HERE: "+dataaResponses);
                            }
                        },

                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable e) throws Exception {
                                Log.e("onSubscribe", "Throwable: " + e);
                            }
                        }
                );
    }

    public static final String X_RAPIDAPI_HOST = "X-RapidAPI-Host";
    public static final String X_RAPIDAPI_HOST_VALUE = "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com";
    public static final String X_RAPIDAPI_API = "X-RapidAPI-Key";
    public static final String X_RAPIDAPI_API_VALUE = "f22f26d595msh4dd6f6793cedee2p111709jsnb273fbb253cc";

    public interface ListingApiService {
        @Headers({X_RAPIDAPI_HOST + ": " + X_RAPIDAPI_HOST_VALUE,
                X_RAPIDAPI_API + ": " + X_RAPIDAPI_API_VALUE})
        @GET("{id}")
        Observable<DataaResponse> findCheapDates(@Path("id") String id);
    }
}
