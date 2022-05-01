package oslomet.webprog.sulten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class SultenController {
    /*
     * oppgave 2
     */
    @GetMapping("sjekk")
    public String sjekk() {
        return "OK";
    }

    /*
     * oppgave 5
     */
    @Autowired
    SultenRepository repo;

    /*
    @PostMapping("bestilling")
    public void bestilling(Bestilling bestilling, HttpServletResponse response) throws IOException {
        if (!repo.leggInnBestilling(bestilling)) {
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                    "Det skjedde en feil ved innlegging av bestilling. Prøv igjen om litt.");
        }
    }
    */

    /*
     * oppgave 9
     */
    @PostMapping("bestilling")
    public void bestilling(Bestilling bestilling, HttpServletResponse response) throws IOException {
        if(sjekkInnlogging()) {
            if (!repo.leggInnBestilling(bestilling)) {
                response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "Det skjedde en feil ved innlegging av bestilling. Prøv igjen om litt.");
            }
        } else {
            response.sendError(HttpStatus.FORBIDDEN.value(),
                    "Du må først logge inn for å legge inn en ny bestilling.");
        }
    }

    /*
     * dette endepunktet er ikke noe krav i løsningen - kun lagt inn for testing av oppgave 9
     */
    @GetMapping("innlogget")
    public String innlogget() {
        if(sjekkInnlogging()) {
            return ":-)";
        } else {
            return ":-(";
        }
    }

    /*
     * oppgave 7
     */
    @PostMapping("kunde")
    public void kunde(Kunde kunde) {
        repo.leggInnKunde(kunde);
    }

    /*
     * oppgave 8
     */
    @Autowired
    HttpSession session;

    @PostMapping("logginn")
    public void logginn(Kunde kunde) {
        if(repo.sjekkMobilogPassord(kunde)) {
            session.setAttribute("innlogget", kunde);
        }
    }

    public boolean sjekkInnlogging() {
        if(session.getAttribute("innlogget") != null) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("loggut")
    public void loggut() {
        session.removeAttribute("innlogget");
    }
}
