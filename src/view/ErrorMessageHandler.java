package view;

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
    void showErrorMessage(String msg){
        StringBuilder errorMsgBuild = new StringBuilder();
        errorMsgBuild.append(createTime());
        errorMsgBuild.append(", ERROR MSG:");
        errorMsgBuild.append(msg);
        System.out.println(errorMsgBuild);
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
