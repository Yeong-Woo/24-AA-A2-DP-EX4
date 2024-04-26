package hiroshi.state.problem;

public class UrgentState implements State {
    private static UrgentState singleton = new UrgentState();

    private UrgentState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상:UrgentState 금고사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(UrgentState)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반통화(UrgentState)");
    }

    public String toString() {
        return "[비상]";
    }

}
