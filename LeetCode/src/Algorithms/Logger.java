package Algorithms;

import java.util.HashMap;

/**
 * Created by kreenamehta on 6/28/16.
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if
 * and only if it is not printed in the last 10 seconds.

 Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given
 timestamp, otherwise returns false.

 It is possible that several messages arrive roughly at the same time.
 */
public class Logger {

    private HashMap<String, Integer> logMap;

    /** Initialize your data structure here. */
    public Logger() {
        logMap = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(logMap.containsKey(message)){
            Integer previousTimestamp = logMap.get(message);
            if(timestamp - previousTimestamp >= 10) {
                logMap.put(message, timestamp);
                return true;
            }
        }else{
            logMap.put(message, timestamp);
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Logger logger = new Logger();
        System.out.println(logger.shouldPrintMessage(1, "foo"));
        System.out.println(logger.shouldPrintMessage(2,"bar"));
        System.out.println(logger.shouldPrintMessage(3,"foo"));
        System.out.println(logger.shouldPrintMessage(8,"bar"));
        System.out.println(logger.shouldPrintMessage(10,"foo"));
        System.out.println(logger.shouldPrintMessage(11,"foo"));

    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */