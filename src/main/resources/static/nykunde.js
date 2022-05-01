// Ikke spurt etter i eksamensoppgaven, kun for å teste serverkoden for oppgave 7

function validerKunde(kunde) {
    navnOK = validerNavn(kunde.navn);
    mobilOK = validerMobil(kunde.mobil);
    epostOK = validerEpost(kunde.epost);

    if(navnOK && mobilOK && epostOK) {
        return true;
    } else {
        return false;
    }
}

function leggInnKunde() {
    kunde = {
        "navn": $("#navn").val(),
        "mobil": $("#mobil").val(),
        "epost": $("#epost").val(),
        "passord": $("#passord").val()
    };

    if(validerKunde(kunde)) {
        $.post("kunde", kunde, function() {
            $("#melding").html("Kunde lagt inn!");

            $("#navn").val("");
            $("#mobil").val("");
            $("#epost").val("");
            $("#passord").val("");
        }).fail(function(jqXHR) {
            const json = $.parseJSON(jqXHR.responseText);
            $("#melding").html(json.message);
        });
    } else {
        $("#melding").html("Fyll ut alle felter og rett alle feil i skjemaet før innsending");
    }
}