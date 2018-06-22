package com.problems.levelOne;

public class ClockHandAngle {
    public static void main(String[] args) {
        if (args.length > 0 && args[0] != null && args[1] != null) {
            try {
                System.out.println("Angle between hour and minute hand is "
                        + (ClockHandAngle.getAngle(Integer.parseInt(args[0]), Integer.parseInt(args[1])))
                        + " degrees!");
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            System.out.println("Sorry.... No input passed!");
        }
    }

    private static double getAngle(int hour, int minutes) throws Exception {
        double angle;

        if (hour >= 0 && minutes >= 0) {
            // (360 / 60) * minutes
            double minuteHandAngle = 6.0 * minutes;

            // ((360 / 12) * hour) + ((360 / 12) * (minutes / 60))
            double hourHandAngle = (30 * hour) + (30 * (minutes / 60.0)) ;

            angle = minuteHandAngle - hourHandAngle;
        } else {
            throw new Exception("Incorrect value for hour and minutes passed");
        }

        return angle;
    }

}