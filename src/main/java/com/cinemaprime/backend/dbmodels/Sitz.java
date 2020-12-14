package com.cinemaprime.backend.dbmodels;

import com.cinemaprime.backend.enums.Sound;
import com.cinemaprime.backend.enums.Video;
import com.cinemaprime.backend.dbmodels.Vorstellung;

public class Sitz {
    private char Sitzreihe;
    private Sound Sound;
    private Video Video;

    private long getFreiePlätze (Vorstellung vorstellung){
        return 0;
    }
}
