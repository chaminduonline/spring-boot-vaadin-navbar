package com.ourmind.hrm.ui;

import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

public class Dashboard extends Composite implements View {
        public Dashboard(){
            setCompositionRoot(new Label("this is the dashboard."));
        }
}
