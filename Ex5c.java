
// 3. Design a class named StopWatch.
// The class contains:
// Private data fields startTime and endTime with getter methods.
// A no-arg constructor that initializes startTime with the current time.
// A method named start() that resets the startTime to the current time.
// A method named stop() that sets the endTime to the current time.
// A method named getElapsedTime() that returns the elapsed time for the
// stopwatch in milliseconds.

import java.time.Instant;
import java.time.Duration;

public class Ex5c {
    static class StopWatch {
        private Instant startTime, endTime;

        // getter methods
        public Instant getStartTime() {
            return startTime;
        }

        public Instant getEndTime() {
            return endTime;
        }

        // No-arg constructor
        StopWatch() {
            startTime = Instant.now();
        }

        // Start method
        public void start() {
            startTime = Instant.now();
        }

        // Stop method
        public void stop() {
            endTime = Instant.now();
        }

        public long getElapsedTime() {
            return (Duration.between(startTime, endTime).toMillis());
        }
    }

    public static void main(String[] args) {

        // Object
        StopWatch myObj = new StopWatch();
        long finalElapsed;

        myObj.start();
        System.out.println(myObj.getStartTime());

        // Just for extending Time
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                int a = 1;
            }
        }
        myObj.stop();
        System.out.println(myObj.getEndTime());
        finalElapsed = myObj.getElapsedTime();
        System.out.println("Total Elapsed Time = " + finalElapsed + " " + "milliseconds");
    }
}