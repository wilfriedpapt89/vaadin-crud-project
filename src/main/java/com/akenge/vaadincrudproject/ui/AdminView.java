package com.akenge.vaadincrudproject.ui;

import com.akenge.vaadincrudproject.domain.Book;
import com.akenge.vaadincrudproject.service.BookService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("admin")
@RolesAllowed("ADMIN")
public class AdminView extends VerticalLayout {

    public AdminView(BookService bookService) {

        //CRUD ELEMENT
        var crud = new GridCrud<>(Book.class, bookService);
        crud.getGrid().setColumns("title","published", "rating");
        crud.getCrudFormFactory().setVisibleProperties("title","published", "rating");
        add(
                new H1("Admin View"),
                crud
        );
    }
}
