// Ikke spurt etter i eksamensoppgaven, kun for å teste serverkoden for oppgave 8

function logginn() {
    kunde = {
        "mobil": $("#mobil").val(),
        "passord": $("#passord").val()
    };

    if(validerMobil(kunde.mobil)) {
        $.post("logginn", kunde, function() {
            $("#melding").html("Innloggingsforsøk utført!");

            $("#mobil").val("");
            $("#passord").val("");
        }).fail(function(jqXHR) {
            const json = $.parseJSON(jqXHR.responseText);
            $("#melding").html(json.message);
        });
    } else {
        $("#melding").html("Fyll ut alle felter og rett alle feil i skjemaet før innsending");
    }
}