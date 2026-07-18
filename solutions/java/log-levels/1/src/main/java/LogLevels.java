public class LogLevels {
    
    public static String message(String logLine) {
        int position = logLine.indexOf(":");
        String message = logLine.substring(position + 1);
        message = message.trim();
        return message ; 
        
    }
    

    public static String logLevel(String logLine) {
        int onePosition = logLine.indexOf("[");
        int twoPosition = logLine.indexOf("]");
        String message = logLine.substring(onePosition + 1, twoPosition);
        message = message.toLowerCase();
        return message;
        
        
    }

    public static String reformat(String logLine) {
        String msg = message(logLine);
        String level = logLevel(logLine);
        String newMessage = msg + (" (") + level +(")");
        return newMessage;
        
    }
}
