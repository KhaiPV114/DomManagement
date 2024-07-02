package Controller.General;

import Utils.AppConfig;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@WebServlet("/google-callback")
public class GoogleCallback extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("code");
        String accessToken = getToken(code);
        String email = getEmailOfUser(accessToken);
        // to do
        // xu ly chuyen man
        response.sendRedirect(request.getContextPath() + "/index.jsp");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private String getToken(String code) throws IOException {
        // call api to get token

        String params = "code=" + code +
                "&client_id=" + AppConfig.getProperty("gg.id") +
                "&client_secret=" +  AppConfig.getProperty("gg.secret") +
                "&redirect_uri=" +  AppConfig.getProperty("gg.uri") +
                "&grant_type=authorization_code";

        URL url = new URL( AppConfig.getProperty("gg.token"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.getOutputStream().write(params.getBytes());
        conn.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        JSONObject jsonResponse = new JSONObject(response.toString());
        String accessToken = jsonResponse.getString("access_token");
        conn.disconnect();
        return accessToken;
    }


    private static String getEmailOfUser(String accessToken) throws IOException {

        URL urlUserInfo = new URL( AppConfig.getProperty("gg.user"));
        HttpURLConnection connUserInfo = (HttpURLConnection) urlUserInfo.openConnection();
        connUserInfo.setRequestProperty("Authorization", "Bearer " + accessToken);
        connUserInfo.connect();
        BufferedReader readerUserInfo = new BufferedReader(new InputStreamReader(connUserInfo.getInputStream()));
        StringBuilder userInfoResponse = new StringBuilder();
        String lineUserInfo;
        while ((lineUserInfo = readerUserInfo.readLine()) != null) {
            userInfoResponse.append(lineUserInfo);
        }
        readerUserInfo.close();

        JSONObject jsonUserInfo = new JSONObject(userInfoResponse.toString());
        String userEmail = jsonUserInfo.getString("email");
        connUserInfo.disconnect();
        return userEmail;
    }

}
