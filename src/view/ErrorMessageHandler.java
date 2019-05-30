package view;

import controller.OperationFailureException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


/**
 * Responsible for showing the user the error messages.
 */
public class ErrorMessageHandler {

    /**
     *
     * @param msg
     */
    void showErrorMsg(String msg){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", USR ERROR MSG:");
        errorMsgBuild.append(msg);
        System.out.println(errorMsgBuild);
    }

    /**
     *
     * @param ofe
     */
    public void logErrorMsg(OperationFailureException ofe){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", DEV ERROR MSG:");
        errorMsgBuild.append(ofe.getMessage());
        errorMsgBuild.append(errorMsgBuild);
        ofe.printStackTrace();
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
