package com.ourmind.hrm.ui;

import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

public class CreateEmployee extends Composite implements View {
    public CreateEmployee() {
        setCompositionRoot(new Label("this is a add new employee form"));
    }
}
