public class SourceLiveScore extends Source{
    private String liveScore;

    public SourceLiveScore(){
        liveScore = "";
    }

    public String getLiveScore(){
        return liveScore;
    }

    public void setLiveScore(String s){
        liveScore = s;
        notifyObservers();
    }
}
