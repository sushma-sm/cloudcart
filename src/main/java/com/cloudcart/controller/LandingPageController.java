package com.cloudcart.controller;

// Import Controller annotation
// This tells Spring Boot that this class will handle HTTP requests.
import org.springframework.stereotype.Controller;

// Import GetMapping annotation
// Used to map HTTP GET requests to Java methods.
import org.springframework.web.bind.annotation.GetMapping;

/*
 * ============================================================
 * LandingPageController
 * ============================================================
 *
 * Purpose:
 * Handles browser requests for the CloudCart landing page.
 *
 * Example:
 * User opens:
 * http://localhost:8080
 *
 * This controller receives the request and returns index.html.
 *
 * ============================================================
 */

@Controller
public class LandingPageController {

    /*
     * ------------------------------------------------------------
     * Home Page
     * ------------------------------------------------------------
     *
     * @GetMapping("/")
     *
     * "/" represents the application's home URL.
     *
     * When a user visits:
     * http://localhost:8080
     *
     * this method is executed.
     */

    @GetMapping("/")
    public String home() {

        /*
         * Returning "index"
         *
         * Spring Boot automatically searches inside:
         *
         * src/main/resources/templates/
         *
         * for a file named:
         *
         * index.html
         *
         * and sends that page back to the browser.
         */

        return "index";
    }
}