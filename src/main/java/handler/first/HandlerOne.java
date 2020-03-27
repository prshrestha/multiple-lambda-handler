package handler.first;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerOne implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        return "Hello from lambda 1 + " + input;
    }
}
