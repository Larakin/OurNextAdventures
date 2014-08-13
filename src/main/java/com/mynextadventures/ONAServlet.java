package com.mynextadventures;

import java.io.IOException;
import javax.servlet.http.*;

public class ONAServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
    }
}
