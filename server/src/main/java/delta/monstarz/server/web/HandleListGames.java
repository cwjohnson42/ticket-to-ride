package delta.monstarz.server.web;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;

import delta.monstarz.shared.Args;
import delta.monstarz.shared.Result;
import delta.monstarz.shared.SerDes;
import delta.monstarz.shared.commands.GameListCommand;

/**
 * Created by oliphaun on 2/10/17.
 */

public class HandleListGames extends ServerHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            if (exchange.getRequestMethod().toLowerCase().equals("get")) {

                Headers reqHeaders = exchange.getRequestHeaders();
                if (reqHeaders.containsKey("Authorization")) {
                    String auth = reqHeaders.getFirst("Authorization");
                    Map<String, String> query = QueryParser.parseQuery(exchange.getRequestURI().getRawQuery());

                    GameListCommand command = ServerCommunicator.listGames(auth, query.get("username"));
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0); //200

                    String ser = SerDes.serialize(command);

                    OutputStream respBody = exchange.getResponseBody();
                    writeString(ser, respBody);
                    respBody.close();
                    System.out.println("returned game list");
                }
            }
        }
        catch (Exception e) {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_INTERNAL_ERROR, 0);
            e.printStackTrace();
        }
    }
}