public class StepTracker{
    private int requiredSteps;
    private int activeDays;
    private int days;
    private int currentSteps;
    private int totalSteps;
    public StepTracker(int requiredSteps){
        this.requiredSteps = requiredSteps;
        activeDays = 0;
        days = 0;
        currentSteps = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps){
        currentSteps += steps;
        totalSteps = currentSteps;
        if(currentSteps >= requiredSteps){
            activeDays++;
        }
        currentSteps = 0;
        days++;
    }
    
    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        return totalSteps/days;
    }
}