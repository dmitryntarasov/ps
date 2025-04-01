package com.company.dock.view.person;

import com.company.dock.entity.Person;
import com.company.dock.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "persons", layout = MainView.class)
@ViewController("dock_Person.list")
@ViewDescriptor("person-list-view.xml")
@LookupComponent("personsDataGrid")
@DialogMode(width = "64em")
public class PersonListView extends StandardListView<Person> {
}