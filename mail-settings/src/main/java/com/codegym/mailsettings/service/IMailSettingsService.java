package com.codegym.mailsettings.service;

import com.codegym.mailsettings.model.MailSettings;

public interface IMailSettingsService {
        MailSettings getSettings();
        void updateSettings(MailSettings settings);
    }

