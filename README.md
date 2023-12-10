# WishingWell

> An application that lets you manage an independent wishing list for your family and friends.
> Come together in a group and share your wishes with each other.
> 
> (c) [Archilios](http://archilios.be), 2023   
> Inception: 10 december 2023   
> Contributors: Nick Bauters

## Application description

This application is a web application that lets you manage an independent wishing list for your family and friends.

### Version

| Version  | Date       | Status        | new functions           |
|----------|------------|---------------|-------------------------|
| v0.0.1   | 10/12/2023 | configuration | - Project configuration |

### License and property rights

This project is licensed under the [MIT License](LICENSE).

The application is developed by Nick Bauters [Archilios](archilios.be/), and is being developed as a learning project.

### Project Contributors

| Name         | Role          | Started    | Stopped        |
|--------------|---------------|------------|----------------|
| Nick Bauters | Project Owner | 10/12/2023 | not applicable |

## Project Current Version

Currently the software is in development at version 0.0.1.
This version is not production ready, and is only used for configuration of the project.

The current features are:
- Project configuration
  - Database: PostgreSQL

## Project Management

The project is generally managed and documented via GitHub projects.

If you want to contribute to this project, you can contact the project owner via GitHub.
Before contributing, please read the [contribution guidelines](documentation/contributing.md).

## Development

### Before you start

#### Java

Via SDKMan
[Install SDKMan](https://sdkman.io)

```bash
sdk install java 21.ea.35-open
sdk use java 21.ea.35-open
```

#### Environment Variables

To be able to run the project, the following local variables should be set.
Every value states if the user can choose this for local development, or should be asked to the project owner.

```yml
# Database
DATABASE_DB: {USER_CHOICE}
DATABASE_USER: {USER_CHOICE}
DATABASE_PSW: {USER_CHOICE}
DATABASE_URL: jdbc:postgresql://localhost:5432/${DATABASE_DB}
```

This can be copied from the following step, if asked to the project owner.

#### Docker

For the docker compose file, you need to set up the .env file in the root of the project.
This file may not be persisted to the repository, as it contains sensitive information.
This should contain:

```
DATABASE_DB={YOUR_DATABASE_NAME}
DATABASE_USER={YOUR_USER}
DATABASE_PSW={YOUR_PASSWORD}
DATABASE_URL=jdbc:postgresql://localhost:5432/${DATABASE_DB}
```

Make sure these are the same as the Database environment variables.
This file can be requested with the project owner.

Running the application can than be done with the following command.

```bash
docker-compose up -d
```

Tearing everything down, can be done with the following command.

```bash
docker-compose down -v
```

The database contains scripts for hard resets with dummy values.

## Deployment

### Running the application

</Should be updated>

The project is a standard Maven project. To run it from the command line,
type `mvnw` (Windows), or `./mvnw` (Mac & Linux), then open
http://localhost:8080 in your browser.

You can also import the project to your IDE of choice as you would with any
Maven project. Read more on [how to import Vaadin projects to different IDEs](https://vaadin.com/docs/latest/guide/step-by-step/importing) (Eclipse, IntelliJ IDEA, NetBeans, and VS Code).

### Deploying to Production

</Should be updated>

To create a production build, call `mvnw clean package -Pproduction` (Windows),
or `./mvnw clean package -Pproduction` (Mac & Linux).
This will build a JAR file with all the dependencies and front-end resources,
ready to be deployed. The file can be found in the `target` folder after the build completes.

Once the JAR file is built, you can run it using
`java -jar target/wishing-well-1.0-SNAPSHOT.jar`

## Documentation

All documentation that is not provided in this file, can be found in the documentation folder of the project.
Next to the general documentation for contributing to this project, this folder contains 2 types of documentation.

### Cooperative

These are the guidelines on how to work together on this project.

### Architecture

This is the documentation on the architecture of the project.

## Useful links

- Read the documentation at [vaadin.com/docs](https://vaadin.com/docs).
- Follow the tutorial at [vaadin.com/docs/latest/tutorial/overview](https://vaadin.com/docs/latest/tutorial/overview).
- Create new projects at [start.vaadin.com](https://start.vaadin.com/).
- Search UI components and their usage examples at [vaadin.com/docs/latest/components](https://vaadin.com/docs/latest/components).
- View use case applications that demonstrate Vaadin capabilities at [vaadin.com/examples-and-demos](https://vaadin.com/examples-and-demos).
- Build any UI without custom CSS by discovering Vaadin's set of [CSS utility classes](https://vaadin.com/docs/styling/lumo/utility-classes). 
- Find a collection of solutions to common use cases at [cookbook.vaadin.com](https://cookbook.vaadin.com/).
- Find add-ons at [vaadin.com/directory](https://vaadin.com/directory).
- Ask questions on [Stack Overflow](https://stackoverflow.com/questions/tagged/vaadin) or join our [Discord channel](https://discord.gg/MYFq5RTbBn).
- Report issues, create pull requests in [GitHub](https://github.com/vaadin).
