package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("idTeam")
    private String IdTeam;

    @SerializedName("strTeam")
    private String StrTeam;

    public String getIdTeam() {
        return IdTeam;
    }

    public void setIdTeam(String idTeam) {
        IdTeam = idTeam;
    }

    public String getStrTeam() {
        return StrTeam;
    }

    public void setStrTeam(String strTeam) {
        StrTeam = strTeam;
    }
}
