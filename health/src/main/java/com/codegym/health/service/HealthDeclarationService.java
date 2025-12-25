package com.codegym.health.service;

import com.codegym.health.model.HealthDeclaration;

public class HealthDeclarationService implements IHealthDeclarationService {
    private HealthDeclaration declaration;

    @Override
    public HealthDeclaration get() {
        if (declaration == null) {
            declaration = new HealthDeclaration();
        }
        return declaration;
    }

    @Override
    public void save(HealthDeclaration declaration) {
        this.declaration = declaration;
    }
}
