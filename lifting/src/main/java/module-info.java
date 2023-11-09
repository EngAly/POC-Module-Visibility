open module lifting.module {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.web;
    requires spring.core;
    requires spring.beans;

    requires housing.module;
    requires food.module;

}