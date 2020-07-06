package pl.wsb.students.api.handlers;

import org.apache.commons.lang3.StringUtils;
import pl.wsb.students.api.model.Error;


public class ErrorHandler {


    public static Error getErrorResponse(Exception ex) {
        if (ex == null) {
            return new Error().message("Error occurred");
        }
        return new Error().message(ex.getMessage());
    }


    public static Error getErrorResponse(String message) {
        if (StringUtils.isBlank(message)) {
            return new Error().message("Error occurred");
        }
        return new Error().message(message);
    }
}
