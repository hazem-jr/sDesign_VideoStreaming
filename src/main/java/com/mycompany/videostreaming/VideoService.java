
package com.mycompany.videostreaming;
public class VideoService {

    private FileSystem fileSystem ;
    
    public Frame getFrame( String videoID , int timeStamp){
        Video video = fileSystem.getVideo(videoID) ;
        return video.getFrame(timeStamp) ;
        
    }
    
}
