package view;

import controller.OperationFailureException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


/**
 * Responsible for showing the error message to the user and log the error message to the developer.
 */
public class ErrorMessageHandler {

    /**
     * Shows an error message to the user.
     *
     * @param msg The message to print.
     */
    void showUsrErrorMsg(String msg){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", USR ERROR MSG:");
        errorMsgBuild.append(msg);
        System.out.println(errorMsgBuild);
    }

    /**
     * Logs an error message to the developer.
     *
     * @param e The exception to log.
     */
    public void logDevErrorMsg(OperationFailureException e){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", DEV ERROR MSG:");
        errorMsgBuild.append(e.getMessage());
        errorMsgBuild.append(errorMsgBuild);
        e.printStackTrace();
    }

    /**
     * Creating the current time.
     *
     * @return The current time.
     */
    private String createTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return time.format(dtf);
    }
}
