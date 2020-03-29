package handler.second;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SecondHandler implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        return "Hello from handler 2 + " + input;
    }
}
