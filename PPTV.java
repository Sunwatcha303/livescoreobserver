public class PPTV implements MyObserver {

    @Override
    public void update(Source s) {
        System.out.println("PPTV live result: " + ((SourceLiveScore) s).getLiveScore());
    }

}
