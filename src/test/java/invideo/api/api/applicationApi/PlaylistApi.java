package invideo.api.api.applicationApi;

import invideo.api.api.RestResource;
import invideo.api.pojo.Playlist;
import invideo.api.utils.ConfigLoader;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static invideo.api.api.Route.PLAYLISTS;
import static invideo.api.api.Route.USERS;
import static invideo.api.api.TokenManager.getToken;

public class PlaylistApi {

    @Step
    public static Response post(Playlist requestPlaylist){
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUser()
                + PLAYLISTS, getToken(), requestPlaylist);
    }

    public static Response post(String token, Playlist requestPlaylist){
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUser()
                + PLAYLISTS, token, requestPlaylist);
    }

    public static Response get(String playlistId){
        return RestResource.get(PLAYLISTS + "/" + playlistId, getToken());
    }

    public static Response update(String playlistId, Playlist requestPlaylist){
        return RestResource.update(PLAYLISTS + "/" + playlistId, getToken(), requestPlaylist);
    }
}
