package com.mycompany.videostreaming;

public class VideoConsumingService {

    private DataBase database;

    public int seekTime(String userID, String videoID) {
        PlayedVideo playedVideo = database.getPlayedVideo(userID, videoID);
        return playedVideo.getSeekTime();
    }

}
