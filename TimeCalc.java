public class TimeCalc {
    public static void main(String[] args) {
        
        String currentTime = args[0];
        int minutesAsked = Integer.parseInt(args[1]);

        // calculate the minutes and hours need to add
        int hoursToAdd = (minutesAsked / 60) % 24;
        int minutesToAdd = minutesAsked % 60;

        // gets the current hours and minutes
        int currentHours = Integer.parseInt("" + currentTime.charAt(0) + currentTime.charAt(1));
        int currentMinutes = Integer.parseInt("" + currentTime.charAt(3) + currentTime.charAt(4));
        
        // add extra hour if minutesToAdd + currentMinutes is more than 60
        hoursToAdd = (minutesToAdd + currentMinutes) >= 60 ? hoursToAdd + 1 : hoursToAdd;

        // calculate the new hours and minutes
        int newHours = (currentHours + hoursToAdd) % 24;
        int newMiuntes = (currentMinutes + minutesToAdd) % 60;

        // build new string to print
        String newTime = newHours < 10 ? "0" + Integer.toString(newHours) : "" + Integer.toString(newHours);
        newTime = newMiuntes < 10 ? newTime + ":0" + Integer.toString(newMiuntes) : newTime + ":" + Integer.toString(newMiuntes);

        System.out.println(newTime);
    }
}
