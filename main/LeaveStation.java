class LeaveStationTask implements Runnable {
    private final FuelStation fuelStation;

    public LeaveStationTask(FuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    @Override
    public void run() {
        fuelStation.leaveStation();
    }
}

