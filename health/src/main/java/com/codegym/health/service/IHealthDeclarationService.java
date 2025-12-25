package com.codegym.health.service;

import com.codegym.health.model.HealthDeclaration;

public interface IHealthDeclarationService {
    HealthDeclaration get();
    void save(HealthDeclaration declaration);
}
