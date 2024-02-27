package aryan.jairath.nbaapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface NbaApiService {
    @GET("scores/json/PlayersActiveBasic")
    Call<List<Player>> getActivePlayers(@Query("key") String apiKey);

    @GET("scores/json/NewsByPlayerID/{playerId}")
    Call<List<PlayerNews>> getPlayerNews(@Path("playerId") int playerId, @Query("key") String apiKey);

}
