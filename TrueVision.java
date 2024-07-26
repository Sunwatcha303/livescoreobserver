public class TrueVision implements MyObserver {

    @Override
    public void update(Source s) {
        System.out.println("TrueVision live result: " + ((SourceLiveScore) s).getLiveScore());
    }

}
