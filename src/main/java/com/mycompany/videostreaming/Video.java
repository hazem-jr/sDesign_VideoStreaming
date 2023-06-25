package com.mycompany.videostreaming;

public class Video {

    String ID;
    Frame[] frames;
    String MetaData;

    // return a fram of a particuler timestamp
    public Frame getFrame(int timeStamp) {
        for (int i = 0; i < frames.length; i++) {
            if (frames[i].startTimeStamp <= timeStamp
                    && frames[i].endTimeStamp >= timeStamp) {
                return frames[i];
            }
        }
        throw new IndexOutOfBoundsException();

    }
}
