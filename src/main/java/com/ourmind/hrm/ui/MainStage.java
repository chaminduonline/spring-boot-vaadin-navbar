package com.ourmind.hrm.ui;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.PushStateNavigation;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/dashboard")
@PushStateNavigation
public class MainStage extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label title = new Label("Life HRM");
        Button empCreate = new Button("employee",e->getNavigator().navigateTo("employee"));
        empCreate.addStyleNames(ValoTheme.BUTTON_LINK,ValoTheme.MENU_ITEM);
        title.setStyleName(ValoTheme.MENU_TITLE);

        CssLayout menu = new CssLayout(title,empCreate);
        menu.setStyleName(ValoTheme.MENU_ROOT);

        CssLayout viewContainer = new CssLayout();

        HorizontalLayout mainLayout = new HorizontalLayout(menu,viewContainer);
        mainLayout.setSizeFull();
        setContent(mainLayout);

        Navigator navigator = new Navigator(this,viewContainer);
        navigator.addView("",Dashboard.class);
        navigator.addView("employee",CreateEmployee.class);



    }
}
