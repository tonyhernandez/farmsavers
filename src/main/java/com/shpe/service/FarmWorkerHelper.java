package com.shpe.service;

import java.util.ArrayList;

/**
 * Created by teresamartinez on 11/3/16.
 */
public class FarmWorkerHelper {
    public static ArrayList<FarmWorker> WorkersList = new ArrayList<FarmWorker>();
    public static ArrayList<FarmWorker> makeWorkers() {
            FarmWorker FarmWorker1 = new FarmWorker(21, "David", 299990,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            FarmWorker FarmWorker2 = new FarmWorker(18, "Karen", 299991,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            FarmWorker FarmWorker3 = new FarmWorker(35, "Monica", 299992,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            FarmWorker FarmWorker4 = new FarmWorker(25, "Jorge", 299993,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            FarmWorker FarmWorker5 = new FarmWorker(22, "Eduardo", 299994,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            FarmWorker FarmWorker6 = new FarmWorker(17, "Maria", 299995,
                    FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK, FarmWorker.Status.OFF_TRACK);
            WorkersList.add(FarmWorker1);
            WorkersList.add(FarmWorker2);
            WorkersList.add(FarmWorker3);
            WorkersList.add(FarmWorker4);
            WorkersList.add(FarmWorker5);
            WorkersList.add(FarmWorker6);
            return WorkersList;
        }
}