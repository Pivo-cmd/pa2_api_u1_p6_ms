package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;

    @Inject
    private NotificadorSMS sms;

    @Inject
    private NotificadorWhatsApp whatsApp;

    public Notificador seleccionar(double total) {
        if (total >= 120) {
            // mail
            return mail;
        } else if (total >= 50) {
            // sms
            return sms;
        } else {
            // whatsapp
            return whatsApp;
        }
    }
}
