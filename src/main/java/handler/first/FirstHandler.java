package handler.first;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class FirstHandler implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        return "Hello from handler 1 + " + input;
    }
}
