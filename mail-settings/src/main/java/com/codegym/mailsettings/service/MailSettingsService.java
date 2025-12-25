package com.codegym.mailsettings.service;

import com.codegym.mailsettings.model.MailSettings;
import org.springframework.stereotype.Service;

@Service
public class MailSettingsService implements IMailSettingsService {

    private MailSettings settings = new MailSettings(
            "English",
            25,
            false,
            "Thor\nKing, Asgard"
    );

    @Override
    public MailSettings getSettings() {
        return settings;
    }

    @Override
    public void updateSettings(MailSettings settings) {
        this.settings = settings;
    }
}
