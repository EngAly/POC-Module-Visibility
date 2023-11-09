/**
 * open keyword open current module packages for the other modules to use by reflection
 * note current module not need to import package with open
 * other modules not need to require module in its module
 * other modules can call public methods only
 * no problem to use open with (export + requires)
 *
 * can use open keyword with single package not all module
 * when use exports it by default open package
 *
 *
 * open != export <=> export = open
  */

  //open module food.module{
module food.module{

    requires housing.module;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    exports com.example.food.facade;

  opens com.example.food.service;

}