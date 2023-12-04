# Spring Boot Custom Starter

A simple demo project to show the advantages of custom spring boot starters with Spring Boot 3.2.0

## Sub projects

- client: Application which has the starter as dependency
- productservice-starter: Module which has the autoconfigure module as dependency
- productservice-autoconfigure: Module which contains some basic autoconfiguration that offers a strong default and
  options to customize the behaviour
- productservice-app: Module which contains the business logic

## Scenario

A library which offers the options to create, persist and read product stocks and prices. The app offers an
implementation for an H2 (in memory) database. A client application simply needs to add the
starter as a dependency. A default configuration and database implementation will be configured automatically.
The H2 database is set as default database by the autoconfiguration module
but can be replaced by adding an own implementation
of `com.typosaurus.productserviceapp.persistence.ProductPersistenceService`.
