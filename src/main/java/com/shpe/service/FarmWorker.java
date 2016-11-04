package com.shpe.service;

import java.util.*;

/**
 * Created by teresamartinez on 11/3/16.
 */
public class FarmWorker {
    int age;
    String nameWorker;
    public int userID;
    public enum Status {ON_TRACK, OFF_TRACK};

    public Status breakStatus;
    public Status waterStatus;
    public Status bathroomStatus;

    public Status getBreakStatus() {
        return breakStatus;
    }
    public void setBreakStatus(Status breakStatus) {
        this.breakStatus = breakStatus;
    }
    public Status getWaterStatus() {
        return waterStatus;
    }
    public void setWaterStatus(Status waterStatus) {
        this.waterStatus = waterStatus;

    }
    public Status getBathroomStatus() {
        return bathroomStatus;
    }
    public void setBathroomStatus(Status bathroomStatus) {
        this.bathroomStatus = bathroomStatus;
    }

    public FarmWorker(int age, String TheName, int id, Status bcuurent, Status bathcurrent, Status wcurrent) {
        this.age = age;
        nameWorker = TheName;
        userID = id;
        breakStatus = bcuurent;
        bathroomStatus = bathcurrent;
        waterStatus = wcurrent;
    }

    public int getAge() {
        return age;
    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
