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
     *
     * @param msg
     */
    void showUsrErrorMsg(String msg){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", USR ERROR MSG:");
        errorMsgBuild.append(msg);
        System.out.println(errorMsgBuild);
    }

    /**
     *
     * @param e
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
     *
     * @return
     */
    private String createTime(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return time.format(dtf);
    }
}
