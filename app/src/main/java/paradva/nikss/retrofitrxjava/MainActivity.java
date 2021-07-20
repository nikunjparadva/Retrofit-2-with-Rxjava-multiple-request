package paradva.nikss.retrofitrxjava;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import paradva.nikss.retrofitrxjava.model.GenderResponce;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.genderize.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        List<Observable<GenderResponce>> requests = new ArrayList<>();
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Beverly"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Philip"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Henry"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Russell"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Ann"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Jason"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Billy"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Stephanie"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Douglas"));
        requests.add(retrofit.create(ListingApiService.class).findCheapDates("Nikunj"));
        Log.e("onSubscribe", "START: ");
        Observable.zip(
                requests,
                new Function<Object[], List<GenderResponce>>() {
                    @Override
                    public List<GenderResponce> apply(Object[] objects) throws Exception {
                        Log.e("onSubscribe", "apply: " + objects.length);
                        List<GenderResponce> genderResponces = new ArrayList<>();
                        for (Object o : objects) {
                            genderResponces.add((GenderResponce) o);
                        }
                        return genderResponces;
                    }
                }).subscribeOn(Schedulers.io())
                .subscribe(
                        new Consumer<List<GenderResponce>>() {
                            @Override
                            public void accept(List<GenderResponce> dataaResponses) throws Exception {
                                Log.e("onSubscribe", "YOUR DATA IS HERE: " + dataaResponses);
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

    public interface ListingApiService {
        @GET(".")
        Observable<GenderResponce> findCheapDates(@Query("name") String name);
    }
}
