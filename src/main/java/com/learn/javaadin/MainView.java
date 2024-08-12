package com.learn.javaadin;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("home")
public class MainView extends VerticalLayout {

    public MainView() {
        add(
            new H1("Home ground!")
        );
    }
}
