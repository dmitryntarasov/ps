package com.company.dock.view.person;

import com.company.dock.entity.Person;
import com.company.dock.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "persons/:id", layout = MainView.class)
@ViewController("dock_Person.detail")
@ViewDescriptor("person-detail-view.xml")
@EditedEntityContainer("personDc")
public class PersonDetailView extends StandardDetailView<Person> {
}