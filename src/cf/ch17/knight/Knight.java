package cf.ch17.knight;

public class Knight implements IKnight, Runnable {

    private final String name;

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.println(getName());
        mission.setStatus(MissionStatus.STARTED);
        mission.embark();
    }

    //When we make thread start then this method is executed
    @Override
    public void run() {
        synchronized (IKnight.missions) {
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }//sync

    }//run
}
