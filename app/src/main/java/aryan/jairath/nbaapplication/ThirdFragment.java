package aryan.jairath.nbaapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.List;

import aryan.jairath.nbaapplication.databinding.FragmentSecondBinding;
import aryan.jairath.nbaapplication.databinding.FragmentThirdBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ThirdFragment extends Fragment {
    private FragmentThirdBinding binding;
    private String news;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        super.onCreate(savedInstanceState);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonThird.setOnClickListener(v -> {
            String inputText = binding.playerInput.getText().toString().trim();
            System.out.println(MainActivity.playertoid);
            int playerid = MainActivity.playertoid.get(inputText);
            System.out.println(playerid);
            fetchNewsByPlayer(playerid);
        });

    }
    public void fetchNewsByPlayer(int playerid){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.sportsdata.io/v3/nba/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NbaApiService service = retrofit.create(NbaApiService.class);
        service.getPlayerNews(playerid, "2f200886beb4466b8a8902c0ab74bc41").enqueue(new Callback<List<PlayerNews>>() {
            @Override
            public void onResponse(Call<List<PlayerNews>> call, Response<List<PlayerNews>> response) {
                if (response.isSuccessful()) {
                    List<PlayerNews> playerNew = response.body();
                    binding.results.setText(playerNew.get(0).getContent());
                } else {
                    // Handle request errors, possibly log the error or show a user-friendly message
                    Log.e("API Error", "Error Code: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<PlayerNews>> call, Throwable t) {
                // Handle failure, e.g., no internet connection, log the error, or notify the user
                Log.e("NetworkError", "Failed to fetch player news", t);
            }
        });
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}